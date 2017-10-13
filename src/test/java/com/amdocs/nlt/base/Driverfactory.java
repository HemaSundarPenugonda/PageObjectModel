package com.amdocs.nlt.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import com.amdocs.nlt.util.ActiveNodeFinder;
import com.amdocs.nlt.util.PropertiesReader;

public class Driverfactory {
	private static final String CHROME_DRIVER = "chrome";
	private static final String FIREFOX_DRIVER = "firefox";
	private static final String IE_DRIVE = "ie";
	private static PropertiesReader config = PropertiesReader.getInstance();
	
	public static WebDriver getDriver(){
		WebDriver driver = null;
		switch(config.getDriver()){
			case FIREFOX_DRIVER:
				driver = getFirefoxDriver();
				break;
			case IE_DRIVE:
				driver = getIEDriver();
				break;
			case CHROME_DRIVER:
				driver = getChromeDriver();
				break;
			default:
				driver = getRemoteChromeDriver();
		}
		return driver;
	}

	private static WebDriver getRemoteChromeDriver() {
		ActiveNodeFinder activeNodeFinder = new ActiveNodeFinder(config.getHostName(),4444);
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//options.addArguments("disable-gpu");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		//Proxy proxy = new Proxy();
		//proxy.setHttpProxy("genproxy.amdocs.com:8080");
		//proxy.setAutodetect(false);
		//proxy.setProxyType(ProxyType.DIRECT);
		//dc.setCapability("proxy", proxy);
		//dc.setCapability("pageLoadStrategy", "none");
		dc.setCapability("takesHeapSnapshot", false);
		dc.setCapability(CapabilityType.HAS_TOUCHSCREEN, false);
		dc.setCapability(CapabilityType.SUPPORTS_LOCATION_CONTEXT, false);
		dc.setCapability(CapabilityType.SUPPORTS_WEB_STORAGE, false);
		dc.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		//dc.setCapability("webdriver.remote.quietExceptions", true);
		dc.setCapability("seleniumProtocol", "WebDriver");
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		RemoteWebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://" + config.getHostName() + ":4444/wd/hub"), dc);
			SessionId  sessionId = driver.getSessionId();
			//Get the test executor node details
			activeNodeFinder.getNodeInfoForSession(sessionId);
			driver.manage().window().maximize();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return driver;
	}

	private static WebDriver getChromeDriver() {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//options.addArguments("disable-gpu");
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		//Proxy proxy = new Proxy();
		//proxy.setHttpProxy("genproxy.amdocs.com:8080");
		//proxy.setAutodetect(false);
		//proxy.setProxyType(ProxyType.DIRECT);
		//dc.setCapability("proxy", proxy);
		//dc.setCapability("pageLoadStrategy", "none");
		dc.setCapability("takesHeapSnapshot", false);
		dc.setCapability(CapabilityType.HAS_TOUCHSCREEN, false);
		dc.setCapability(CapabilityType.SUPPORTS_LOCATION_CONTEXT, false);
		dc.setCapability(CapabilityType.SUPPORTS_WEB_STORAGE, false);
		dc.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		//dc.setCapability("webdriver.remote.quietExceptions", true);
		dc.setCapability("seleniumProtocol", "WebDriver");
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		System.setProperty("webdriver.chrome.driver", PageTest.class.getResource(config.getChromeDriverPath()).getFile());
		WebDriver driver = new ChromeDriver(dc);
		driver.manage().window().maximize();
		return driver;
	}

	private static WebDriver getIEDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	private static WebDriver getFirefoxDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
