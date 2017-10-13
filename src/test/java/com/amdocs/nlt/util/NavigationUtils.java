package com.amdocs.nlt.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NavigationUtils {
	public static void navigateTo(WebDriver driver, String targetUrl) throws InterruptedException{
		Thread.sleep(700);
        driver.navigate().to(targetUrl);
		WebDriverWait wait = new WebDriverWait(driver,PropertiesReader.getInstance().waitForSecondsHigh());
		wait.until(ExpectedConditions.urlContains(targetUrl));
		driver.manage().timeouts().pageLoadTimeout(PropertiesReader.getInstance().waitForSecondsHigh(), TimeUnit.SECONDS);
	}

	public static void navigateToExtn(WebDriver driver, String extnUrl) throws InterruptedException{
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(PropertiesReader.getInstance().waitForSecondsHigh(), TimeUnit.SECONDS);
		driver.navigate().to(driver.getCurrentUrl() + extnUrl);
		WebDriverWait wait = new WebDriverWait(driver,PropertiesReader.getInstance().waitForSecondsHigh());
		wait.until(ExpectedConditions.urlContains(extnUrl));
		driver.manage().timeouts().pageLoadTimeout(PropertiesReader.getInstance().waitForSecondsHigh(), TimeUnit.SECONDS);
	}
}
