package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.page.ResidentailOrderPage;
import com.amdocs.nlt.util.ElementUtils;

public class ResidentialEndUserConnectionViewPage extends ResidentailOrderPage {

	public ResidentialEndUserConnectionViewPage(WebDriver driver) {
		super(driver);

	}

	private final By OriLabel = By.xpath("//label[@data-qa='appDetails_ORI_label']");
	private final By OriValue = By.xpath("//label[@data-qa='appDetails_ORI_value']");
	private final By AriLabel = By.xpath("//label[@data-qa='appDetails_ORI_value']");
	private final By AriTextbox = By.xpath("//label[@data-qa='ari_input']");

	public String getOriLabel() {

		return ElementUtils.getText(driver, OriLabel);
	}

	public String getOriLabelValue() {

		return ElementUtils.getText(driver, OriValue);
	}

	public String getAriLabel() {

		return ElementUtils.getText(driver, AriLabel);
	}

	public String getAriTextboxValue() {

		return ElementUtils.getText(driver, AriTextbox);
	}

	public String getPostalCodeLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);

	}

	public boolean isPostalCodeTextBoxIsDisabledAndIsNotEmpty() {
		String postalCodeValue = ElementUtils.getElement(driver, postalCodeTextBox).getAttribute("value");
		return (!ElementUtils.getElement(driver, postalCodeTextBox).isEnabled() && !postalCodeValue.equals(""));

	}

	public boolean isUnitNumTextBoxIsDisabledAndIsNotEmpty() {
		return (!ElementUtils.getElement(driver, unitNumberTextBox).isEnabled());

	}

	public boolean isFirstNameTextBoxIsDisabledAndIsNotEmpty() {
		String unitNumberValue = ElementUtils.getElement(driver, firstNameTextBox).getAttribute("value");
		return (!ElementUtils.getElement(driver, firstNameTextBox).isEnabled() && !unitNumberValue.equals(""));

	}

	public boolean isLastNameTextBoxIsDisabled() {
		return (!ElementUtils.getElement(driver, lastNameTextBox).isEnabled());
	}

	public boolean isContactTextBoxIsDisabled() {
		return (!ElementUtils.getElement(driver, contactNumberTextBox).isEnabled());

	}

	public boolean isAlternateContactTextBoxIsDisabled() {
		return (!ElementUtils.getElement(driver, altcontactNumTextBox).isEnabled());

	}

	public boolean isEmailAddTextBoxIsDisabled() {
		return (!ElementUtils.getElement(driver, emailAddTextBox).isEnabled());

	}

	public boolean isSalutationDropdownIsDisabled() {
		return (!ElementUtils.getElement(driver, salutationDropdown).isEnabled());

	}

	public boolean isNormalSlotRadioButtonIsdisbaled() {

		return (!ElementUtils.getElement(driver, radioButton_normalSlot).isEnabled());
	}

	public boolean isSeasonalSlotRadioButtonIsdisbaled() {

		return (!ElementUtils.getElement(driver, radioButton_SeasonalSlot).isEnabled());
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
}
