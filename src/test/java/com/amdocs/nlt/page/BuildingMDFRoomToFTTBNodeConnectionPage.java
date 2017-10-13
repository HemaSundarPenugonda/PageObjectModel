package com.amdocs.nlt.page;

import org.openqa.selenium.WebDriver;
import com.amdocs.nlt.util.ElementUtils;


public class BuildingMDFRoomToFTTBNodeConnectionPage extends CommonComponentPage {

	public BuildingMDFRoomToFTTBNodeConnectionPage(WebDriver driver) {
		super(driver);
	}

	public void populateForm() throws InterruptedException {
		ElementUtils.getElement(driver, ARITextBox).sendKeys("123");
		submitFeasibility();
		selectCalendarDate();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

	public void submitFeasibility() throws InterruptedException {
		ElementUtils.getElement(driver, postalCodeTextBox).sendKeys("111111");
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();
	}
}
