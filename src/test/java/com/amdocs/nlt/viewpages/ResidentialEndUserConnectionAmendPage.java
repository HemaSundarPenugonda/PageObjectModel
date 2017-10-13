package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class ResidentialEndUserConnectionAmendPage extends ResidentialEndUserConnectionViewPage {

	public ResidentialEndUserConnectionAmendPage(WebDriver driver) {
		super(driver);
	}

	protected final By newARILabel = By.xpath("//form[@id='ariForm']//label[@data-qa='ari_header_label']");
	protected final By existingARILabel = By
			.xpath("//form[@id='applicationDetailsForm']//label[@data-qa='ari_header_label']");
	protected final By newARITextbox = By.xpath("//form[@id='ariForm']//input[@data-qa='ari_input']");
	protected final By existingARITextbox = By
			.xpath("//form[@id='applicationDetailsForm']//input[@data-qa='ari_input']");
	protected final By amendButton = By.xpath("//button[@data-qa='modify_button']");

	public boolean isPostalCodeTextBoxIsDisabledAndIsNotEmpty() {
		String postalCodeValue = ElementUtils.getElement(driver, postalCodeTextBox).getAttribute("value");
		return (!ElementUtils.getElement(driver, postalCodeTextBox).isEnabled()
				&& postalCodeValue.equals("118000"));

	}

	public boolean isUnitNumTextBoxIsDisabledAndIsNotEmpty() {
		return (!ElementUtils.getElement(driver, unitNumberTextBox).isEnabled());

	}

	public boolean isFirstNameTextBoxIsEnabledAndIsNotEmpty() {
		String unitNumberValue = ElementUtils.getElement(driver, firstNameTextBox).getAttribute("value");
		return (ElementUtils.getElement(driver, firstNameTextBox).isEnabled()
				&& unitNumberValue.equals("John"));

	}

	public boolean isLastNameTextBoxIsEnabled() {
		return (ElementUtils.getElement(driver, lastNameTextBox).isEnabled());

	}

	public boolean isContactTextBoxIsEnabled() {
		return (ElementUtils.getElement(driver, contactNumberTextBox).isEnabled());

	}

	public boolean isAlternateContactTextBoxIsEnabled() {
		return (ElementUtils.getElement(driver, altcontactNumTextBox).isEnabled());

	}

	public boolean isEmailAddTextBoxIsEnabled() {
		return (ElementUtils.getElement(driver, emailAddTextBox).isEnabled());

	}

	public boolean isSalutationDropdownIsEnabled() {
		return (ElementUtils.getElement(driver, salutationDropdown).isEnabled());

	}

	public boolean isNormalSlotRadioButtonIsEnabled() {

		return (ElementUtils.getElement(driver, radioButton_normalSlot).isEnabled());
	}

	public boolean isSeasonalSlotRadioButtonIsEnabled() {

		return (ElementUtils.getElement(driver, radioButton_SeasonalSlot).isEnabled());
	}

	public boolean isPreferredInstallationSessionDropdownEnabled() {
		return (ElementUtils.getElement(driver, prefInstallSessionDropdown).isEnabled());

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

	public String getNewAriLabel() {

		return ElementUtils.getText(driver, newARILabel);

	}

	public boolean isOldAritextBoxIsEnabled() {
		return ElementUtils.getElement(driver, existingARITextbox).isEnabled();

	}

	public void submitResiAmendForm() throws InterruptedException {

		ElementUtils.getElement(driver, newARITextbox).sendKeys("12345");
		ElementUtils.getElement(driver, amendButton).click();

	}
}
