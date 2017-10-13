package com.amdocs.nlt.viewpages;

import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.page.NonResidentialOrderPage;
import com.amdocs.nlt.util.ElementUtils;

public class NonResidentailEndUserConnectionViewPage extends NonResidentialOrderPage {

	public NonResidentailEndUserConnectionViewPage(WebDriver driver) {
		super(driver);
	}

	// private final By postalCodeAndUnitNumHeading =
	// By.xpath("//span[text()='Postal Code and Unit Number']");

	public boolean iSFirstNameBoxIsDisabledForAuthRep() {
		return (!ElementUtils.getElement(driver, firstNametextbox_AR).isEnabled());
	}

	public boolean iSLastNameBoxIsDisabledForAuthRep() {
		return (!ElementUtils.getElement(driver, lastNametextbox_AR).isEnabled());
	}

	public boolean iSSalutationDropdownDisabled() {
		return (!ElementUtils.getElement(driver, salutationDropdown).isEnabled());

	}

	public boolean iSContactNumTextboxDisabledForAuthRep() {
		return (!ElementUtils.getElement(driver, ContactNumtextbox_AR).isEnabled());

	}

	public boolean iSFirstNameBoxIsDisabledForPrimaryConact() {
		return (!ElementUtils.getElement(driver, firstNametextbox_PC).isEnabled());
	}

	public boolean iSLastNameBoxIsDisabledForPrimaryContact() {
		return (!ElementUtils.getElement(driver, lastNametextbox_PC).isEnabled());
	}

	public boolean iSContactNumTextboxDisabledForPrimaryContact() {
		return (!ElementUtils.getElement(driver, contatcNumtextbox_PC).isEnabled());

	}

	public boolean iSFirstNameBoxIsDisabledForSecondaryConact() {
		return (!ElementUtils.getElement(driver, firstNametextbox_SC).isEnabled());
	}

	public boolean iSLastNameBoxIsDisabledForSecondaryContact() {
		return (!ElementUtils.getElement(driver, lastNametextbox_SC).isEnabled());
	}

	public boolean iSContactNumTextboxDisabledForSecondaryContact() {
		return (!ElementUtils.getElement(driver, contatcNumtextbox_SC).isEnabled());

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

	public boolean isSpiltDropdownIsDisabled() {
		return (!ElementUtils.getElement(driver, splitRatioDropdown).isEnabled());

	}

	public boolean isContractTermDropdownIsdisabled() {
		return (!ElementUtils.getElement(driver, contractTermDropdown).isEnabled());

	}

	public boolean isInstallationOptionDropdownIsdisabled() {
		return (!ElementUtils.getElement(driver, installationOptionDropdown).isEnabled());

	}

	public boolean isExternalDataRCnoTextboxDisabled() {
		return (!ElementUtils.getElement(driver, externalDCRNTextbox).isEnabled());
	}

}
