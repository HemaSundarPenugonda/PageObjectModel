package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.AddressObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class ResidentialEndUserConnectionPage extends ResidentailOrderPage {

	public ResidentialEndUserConnectionPage(WebDriver driver) {
		super(driver);
	}

	// below locato are for technical details

	protected final By tecnologyDropdown = By.xpath(".//*[@id='technology']");
	protected final By splitRatioDropdown = By.xpath(".//*[@id='splitratio']");
	protected final By splitRatioLabel = By.xpath("//label[@data-qa='split_ratio_label']");
	protected final By requriedRadioButton = By.xpath("//input[@data-qa='redundancy_required']");

	// below locator are for Requested Date & Time Slot

	private final By timeSlotOptionLabel = By.xpath("//label[@data-qa='time_slot_label']");
	private final By radioButton_normalSlot = By.xpath("//input[@data-qa='normal']");
	private final By radioButton_SeasonalSlot = By.xpath("//input[@data-qa='seasonal']");
	private final By changeTechnologyButton = By.xpath("//*[@data-qa='changeTech_button']");
	private final By manageTPButton = By.xpath("//*[@data-qa='manageTp_button']");
	private final By email = By.xpath("//select[@id='formHorizontalEmail']");

	public boolean isInstallationDropdownSelectable() {
		WebElement selectElement = ElementUtils.getElement(driver, email);
		Select select = new Select(selectElement);
		String defaultValue = select.getFirstSelectedOption().getText();
		select.selectByIndex(1);
		String selectedValue = select.getFirstSelectedOption().getText();
		return (!(defaultValue.equals(selectedValue)));
	}

	public boolean isRequiredRadioButtonPresent() {
		return ElementUtils.isDisplayed(driver, requriedRadioButton);
	}

	public boolean isSplitRatioDropdownDisabled() throws InterruptedException {
		WebElement selectElement = ElementUtils.getElement(driver, tecnologyDropdown);
		Select select = new Select(selectElement);
		select.selectByIndex(1);
		return ElementUtils.getElement(driver, splitRatioDropdown).getAttribute("disabled") != null;
	}

	public String getTechnologyDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, tecnologyDropdown);
	}

	public String getSplitRatioDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, splitRatioDropdown);
	}

	public String getSplitRatioLabel() {
		return ElementUtils.getText(driver, splitRatioLabel);
	}

	// Theses methods belongs to requested date and time slot component

	public String getTimeSlotOptionLabel() {

		return ElementUtils.getText(driver, timeSlotOptionLabel);
	}

	public boolean isNormalSlotRadioButtonDefaultSelected() {
		return (ElementUtils.getElement(driver, radioButton_normalSlot).isSelected());
	}

	public boolean isSeasonalSlotRadioButtonSelected() {
		return (ElementUtils.getElement(driver, radioButton_SeasonalSlot).isSelected());
	}

	public String getDefaulPlaceholderForCalendarTextbox() throws InterruptedException {
		return ElementUtils.getElement(driver, reqDateOfActTextbox).getAttribute("value");
	}

	public String getDefaultValueForPreferedInstallationDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, prefInstallSessionDropdown);

	}

	public boolean verifyResetOpeartionForNoramalAndSeasonalslot() throws InterruptedException {
		if (isNormalSlotRadioButtonDefaultSelected()) {
			selectCalendarDate();
			ElementUtils.findElementForClick(driver, radioButton_SeasonalSlot).click();
			return (getDefaulPlaceholderForCalendarTextbox().equals("DD/MM/YYYY")

					&& getDefaultValueForPreferedInstallationDropdown()
							.equals(ResidentialEndUserConnectionPage.PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE));
		}
		return false;
	}

	public boolean verifyActionWhenUserSelectOeAsTechnology() throws InterruptedException {
		Select selectDropdown = new Select(ElementUtils.getElement(driver, tecnologyDropdown));
		selectDropdown.selectByIndex(1);
		boolean isSplitRatioCorrect = getSplitRatioDropdownDefaultValue().equals("1:24");
		boolean isDropDownEnabled = !ElementUtils.getElement(driver, splitRatioDropdown).isEnabled();
		return isSplitRatioCorrect && isDropDownEnabled;
	}

	public void submitFeasibility(AddressObject addressObject) {
		ElementUtils.sendKeys(driver, postalCodeTextBox, addressObject.getPostalCode());
		ElementUtils.sendKeys(driver, unitNumberTextBox, addressObject.getUnitNumber());
		ElementUtils.clickObject(driver, feasibiltyChkButton);
		//Check for reclassify
		if (addressObject.isReclassify()){
			clickReclassifyOnPopup();
			ElementUtils.clickObject(driver, feasibiltyChkButton);
		}
	}
}
