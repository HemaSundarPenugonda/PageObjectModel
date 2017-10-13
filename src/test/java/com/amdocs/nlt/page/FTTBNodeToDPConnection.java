package com.amdocs.nlt.page;

import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class FTTBNodeToDPConnection extends CommonComponentPage {

	public FTTBNodeToDPConnection(WebDriver driver) {
		super(driver);
	}

	public void populateForm() throws InterruptedException {
		//driver.findElement(ARITextBox).sendKeys("123");
		ElementUtils.getElement(driver, ARITextBox).sendKeys("123");
		submitFeasibility();
		selectCalendarDate();
		//driver.findElement(submitRequestButton).click();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}
}
