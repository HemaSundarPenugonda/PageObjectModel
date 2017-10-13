package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class NonResidentialEndUserConnectionPage extends NonResidentialOrderPage {

	// Locators for ARI field

	public NonResidentialEndUserConnectionPage(WebDriver driver) {
		super(driver);
	}

	private final By ARILabel = By.xpath("//label[@data-qa='ari_header_label']");
	protected final By ARITextBox = By.xpath("//input[@data-qa='ari_input']");

	// Locators for Feasibility check
	private final By mandatoryFieldLabel = By.xpath("//span[text()='Mandatory Fields']");
	private final By feasibiltyChk = By.xpath("//span[text()='Feasibility Check']");
	private final By postalCodeLabel = By.xpath("//label[@data-qa='postal_code_label']");
	protected final By postalCodeTextBox = By.xpath(".//*[@id='postalcode']");
	protected final By unitNumberTextBox = By.xpath(".//*[@id='unitnumber']");
	private final By unitNumberLabel = By.xpath("//label[@data-qa='unit_number_label']");
	private final By installationOptionLabel = By.xpath("//label[@data-qa='installation_option_label']");
	private final By expressServicelabel = By.xpath("//label[@data-qa='express_label']");
	protected final By feasibiltyChkButton = By.xpath("//button[@data-qa='submit_btn']");
	private final By expressService_RequiredRadiobutton = By.xpath("//input[@data-qa='express_service_reuired']");
	private final By expressService_NotRequiredRadiobutton = By
			.xpath("//input[@data-qa='express_service_not_required']");
	// Technical detail locator
	private final By splitRatioDropdown = By.xpath(".//*[@id='splitratio']");

	// Nonresidentail user detail
	private final By nonResiUserDetailLabel = By.xpath("//span[text()='Non-Residential User Details']");
	private final By coverageStausLabel = By.xpath("//label[@data-qa='coverage_status_label']");
	private final By buildingNumLabel = By.xpath("//label[@data-qa='building_number_label']");
	private final By buildingNameLabel = By.xpath("//label[@data-qa='building_name_label']");
	private final By streetNameLabel = By.xpath("//label[@data-qa='street_name_label']");
	private final By buidlingTypeLabel = By.xpath("//label[@data-qa='building_type_label']");
	private final By installationChargeLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By salutationLabel = By.xpath("//label[@data-qa='salutation_label']");
	private final By coverageStausValue = By.xpath("//span[text()='Home Passed']");
	private final By installationChargeValue = By.xpath("//span[text()='$ 220.00']");
	private final By buildingTypeDropdown = By.xpath("//select[@data-qa='building_type']");
	private final By installatonChargeTooltip = By.xpath(".//*[@id='resUserForm']/div[6]/label[2]/span[2]");
	private final By buildingTypeTooltip = By.xpath(".//*[@id='resUserForm']/div[5]/div/span");
	private final By confirmationHeader = By.xpath("//h1[@data-qa='confirmation_header']");

	// Feasibility Method
	public String getInstalltionOptionLabel() {
		return ElementUtils.getText(driver, installationOptionLabel);
	}

	public String getDefaultValueForInstalltionOptionDropDown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, installationOptionDropdown);
	}

	public int getInstallationOptionDropdownValuesCount() {
		Select listBox = new Select(ElementUtils.getElement(driver, installationOptionDropdown));
		return listBox.getOptions().size();
	}

	public String getSplitRatioDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, splitRatioDropdown);
	}

	public boolean verifyActionWhenUserSelectOeAsTechnology() throws InterruptedException {
		Select selectDropdown = new Select(ElementUtils.getElement(driver, tecnologyDropdown));
		selectDropdown.selectByIndex(1);
		boolean isSplitRatioCorrect = getSplitRatioDropdownDefaultValue().equals("1:16");
		boolean isDropDownEnabled = !ElementUtils.getElement(driver, splitRatioDropdown).isEnabled();
		return isSplitRatioCorrect && isDropDownEnabled;
	}

	public String VerifyConfirmationMessage() {
		String confirmation_Message = ElementUtils.getElement(driver, confirmationHeader).getText();
		return confirmation_Message;
	}

	public String getExpressServiceLabel() {
		return ElementUtils.getText(driver, expressServicelabel);
	}

	public boolean isNotRequiredRadiobuttonForExpressServiceIsDefaultChecked() {
		return ElementUtils.getElement(driver, expressService_NotRequiredRadiobutton).isSelected();
	}

	public boolean isRequiredRadiobuttonForExpressServiceSelected() {
		return ElementUtils.getElement(driver, expressService_RequiredRadiobutton).isSelected();
	}
}
