package com.amdocs.nlt.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.amdocs.nlt.page.StartPage;
import com.amdocs.nlt.util.ActiveNodeFinder;
import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.PropertiesReader;

public class PageTest {	
	
	protected WebDriver driver;
	private PropertiesReader config = PropertiesReader.getInstance();
	private static final By logoutButton = By.xpath("//a[@data-qa='logout_btn']");
	protected StartPage dashboardPage;
	ActiveNodeFinder activeNodeFinder = new ActiveNodeFinder(config.getHostName(),4444);
    	
    @BeforeTest()
	public void init() throws IOException, InterruptedException {
		driver = Driverfactory.getDriver();
		//Don't increase this wait time
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(config.getAppUrl());
		dashboardPage = new StartPage(driver).login();
	}
    
    @AfterMethod
    public void testEnd(ITestResult result) throws IOException, InterruptedException{
    	if(!result.isSuccess()){
    		logNodeInfo();
    		captureScreenshot(result);    		
    		Reporter.log(driver.getCurrentUrl(), 0);
    	}
    }

	@AfterTest (alwaysRun=true)
	public void destroy() {
		try {
			logNodeInfo();
			ElementUtils.findElementForClick(driver, logoutButton).click();			
		} finally {
			driver.quit();
		}
	}
	
	private void logNodeInfo(){
		if(!(driver instanceof ChromeDriver)
				&& !(driver instanceof FirefoxDriver)
				&& !(driver instanceof InternetExplorerDriver)){
			SessionId  sessionId = ((RemoteWebDriver) driver).getSessionId();
			activeNodeFinder.getNodeInfoForSession(sessionId);
			Reporter.log(driver.getCurrentUrl() + " on " + activeNodeFinder.getNodeInfoForSession(sessionId), 1);
    		//System.out.println(driver.getCurrentUrl() + " on " + activeNodeFinder.getNodeInfoForSession(sessionId));
		}
	}
	
	private void captureScreenshot(ITestResult result) throws IOException{
	    try{
	    	String actualTest = result.getTestClass().getName().replace(".", "_")+"_"+result.getMethod().getMethodName();
			String screenShotFolder = System.getProperty("user.dir") + "test-output/screenshots/";
			new File(screenShotFolder).mkdirs();
	    	
	    	JavascriptExecutor jexec = (JavascriptExecutor)driver;
	        jexec.executeScript("window.scrollTo(0,0)"); // will scroll to (0,0) position 
	        boolean isScrollBarPresent = (boolean)jexec.executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight");
	        long scrollHeight = (long)jexec.executeScript("return document.documentElement.scrollHeight");
	        long clientHeight = (long)jexec.executeScript("return document.documentElement.clientHeight");
	        int fileIndex = 1;
	        //if(driver instanceof ChromeDriver){
	            if(isScrollBarPresent){
	                while(scrollHeight > 0){
	                    File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	                    if(fileIndex == 1) {
	                    } else {
	                    	FileUtils.copyFile(screenShot, new File("test-output/screenshots/"+actualTest/*+" - "+fileIndex*/+".png"));
	                    }
	                     
	                    //org.apache.commons.io.FileUtils.copyFile(srcFile, new File("F://MyFile"+ fileIndex+".jpg"));
	                    jexec.executeScript("window.scrollTo(0,"+clientHeight*fileIndex++ +")");
	                    scrollHeight = scrollHeight - clientHeight;
	                }
	            }else{
	            	 File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            	 FileUtils.copyFile(screenShot, new File("test-output/screenshots/"+actualTest+".png"));
	            }
	        //}else{
	        //    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //    org.apache.commons.io.FileUtils.copyFile(srcFile, new File("F://MyFile"+ fileIndex+".jpg"));
	        //}
	    	
	    	/*Screenshot screenshot = new AShot()
	    	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	    	  .takeScreenshot(driver);
	    	
	    	ImageIO.write(screenshot.getImage(), "PNG", new File("target/screenshots/"+actualTest));*/
	    	
	    	//File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //FileUtils.copyFile(screenShot, new File("target/screenshots/"+actualTest)); 
	    	
	        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("target/teststream.txt", true)));
            out.println("{\"metodo\":\""+result.getMethod().getMethodName()+"\", \"status\":\""+result.getStatus()+"\", "
       + "\"classe\":\""+result.getTestClass().getName()+"\", \"descricao\":\""+result.getMethod().getMethodName()+"\"}");
            out.close();
	    }
	    catch (Exception e){
	        System.out.println("Failed to capture screenshot");
	   }

	}
}