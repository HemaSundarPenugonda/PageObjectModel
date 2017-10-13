package com.amdocs.nlt.viewpages;

import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.page.NBAPConnectionPage;
import com.amdocs.nlt.util.ElementUtils;

public class RequestForNBAPConnectionViewPage extends NBAPConnectionPage {

	public RequestForNBAPConnectionViewPage(WebDriver driver) {
		super(driver);
	}

	public boolean iSOptionDropdownDisabled() {
		//return (!driver.findElement(optionDropdown).isEnabled());
		return (!ElementUtils.getElement(driver, optionDropdown).isEnabled());

	}

	public boolean iSPostalCodeTextDisabled() {
		return (!ElementUtils.getElement(driver, NearestPostalCodeTextbox).isEnabled());

	}

	public boolean iSLandMarkTextDisabled() {
		return (!ElementUtils.getElement(driver, landmarkTextbox).isEnabled());

	}

	public boolean iSCordinateSystemDropdownDisabled() {
		return (!ElementUtils.getElement(driver, coordinateSysDropDpown).isEnabled());

	}

	public boolean iSXCordinateTextDisabled() {
		return (!ElementUtils.getElement(driver, xCoordinateTextbox).isEnabled());

	}

	public boolean iSYCordinateTextDisabled() {
		return (!ElementUtils.getElement(driver, yCoordinateTextbox).isEnabled());

	}

	public boolean iSHeightTextDisabled() {
		return (!ElementUtils.getElement(driver, heightTextbox).isEnabled());

	}

	public boolean isPreferredInstallationSessionDropdowndisabled() {
		return (!ElementUtils.getElement(driver, prefInstallSessionDropdown).isEnabled());

	}

	public boolean isCalendarTextboxdisabled() {
		return (!ElementUtils.getElement(driver, reqDateOfActTextbox).isEnabled());

	}

	public boolean isTechnologyDropdownIsDisabled() {
		return (!ElementUtils.getElement(driver, tecnologyDropdown).isEnabled());

	}

}
