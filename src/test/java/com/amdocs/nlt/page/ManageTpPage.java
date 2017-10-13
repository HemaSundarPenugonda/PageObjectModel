package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class ManageTpPage extends CommonComponentPage {

	private final By appDetailsORILabel = By.xpath("//label[@data-qa='appDetails_ORI_label']");
	private final By applicationReferenceIdentifierLabel = By.xpath("//*[@data-qa='ari_header_label']/span");
	private final By applicationReferenceIdentifierTextBox = By
			.xpath("//*[@id='newAriForm']/div/label/following-sibling::div/input[@data-qa='ari_input']");
	private final By appDetailsORIValueLabel = By.xpath("//*[@data-qa='appDetails_ORI_value']");

	private final By postalCodeLabel = By.xpath("//label[@data-qa='postal_code_label']");
	private final By unitNumberLabel = By.xpath("//label[@data-qa='unit_number_label']");
	private final By buildingNumberlabel = By.xpath("//label[@data-qa='option_label']");
	private final By buildingNameLabel = By.xpath("//label[@data-qa='building_name_label']");
	private final By streetNameLabel = By.xpath("//label[@data-qa='street_name_label']");
	private final By copifTypeLabel = By.xpath("//label[@data-qa='copif_type_label']");

	private final By postalCodeLabelTextBox = By.xpath("//*[@data-qa='postal_code']");
	private final By unitNumberLabelTextBox = By.xpath("//*[@id='unitnumber']");
	private final By buildingNumberDropdown = By.xpath("//*[@data-qa='option']");
	private final By buildingNameTextBox = By.xpath("//*[@data-qa='building_name']");
	private final By streetNameTextBox = By.xpath("//*[@data-qa='street_name']");
	private final By copifTypeTextBox = By.xpath("//*[@data-qa='copif_type']");
	
	private final By ariLabel = By.xpath("//*[@data-qa='ari_label']");
	private final By ariLabelInputTextBox = By.xpath("(//*[@data-qa='ari_input'])[3]");
	private final By operationToBePerformedLabel = By.xpath("//*[@data-qa='operation_to_be_performed_label']");
	private final By operationToBePerformedDropDown = By.xpath("//*[@data-qa='opearation_to_be_performed_select']");

	public ManageTpPage(WebDriver driver) {
		super(driver);
	}

	public ManageTpPage enterARIInputValue(){
		ElementUtils.getElement(driver, ariLabelInputTextBox).sendKeys("Test ARI");
		return this;
	}
	
	public ManageTpPage selectValueFromOperationToBePerformedDropDown(){
		Select selectDropdown = new Select(ElementUtils.getElement(driver, operationToBePerformedDropDown));
		selectDropdown.selectByIndex(1);
		return this;
	}
	
	public String getAriLabelTextBoxLabel() {
		return ElementUtils.getText(driver, ariLabel);
	}
	
	public String getOperationToBePerformedLabel() {
		return ElementUtils.getText(driver, operationToBePerformedLabel);
	}
	
	public boolean isPostalCodeLabelTextBoxDisable() {
		return (!ElementUtils.getElement(driver, postalCodeLabelTextBox).isEnabled());
	}

	public boolean isUnitNumberLabelTextBoxDisable() {
		return (!ElementUtils.getElement(driver, unitNumberLabelTextBox).isEnabled());
	}

	public boolean isBuildingNumberDropdownDisable() {
		return (!ElementUtils.getElement(driver, buildingNumberDropdown).isEnabled());
	}

	public boolean isBuildingNameTextBoxDisable() {
		return (!ElementUtils.getElement(driver, buildingNameTextBox).isEnabled());
	}

	public boolean isStreetNameTextBoxDisable() {
		return (!ElementUtils.getElement(driver, streetNameTextBox).isEnabled());
	}

	public boolean isCopifTypeTextBoxDisable() {
		return (!ElementUtils.getElement(driver, copifTypeTextBox).isEnabled());
	}

	public String getPostalCodeLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);
	}

	public String getUnitNumberLabel() {
		return ElementUtils.getText(driver, unitNumberLabel);
	}

	public String getBuildingNumberLabel() {
		return ElementUtils.getText(driver, buildingNumberlabel);
	}

	public String getBuildingNameLabel() {
		return ElementUtils.getText(driver, buildingNameLabel);
	}

	public String getStreetNameLabel() {
		return ElementUtils.getText(driver, streetNameLabel);
	}

	public String getCopifTypeLabel() {
		return ElementUtils.getText(driver, copifTypeLabel);
	}

	public String getAppDetailsORILabel() {
		return ElementUtils.getText(driver, appDetailsORILabel);
	}

	public String getApplicationReferenceIdentifierLabel() {
		return ElementUtils.getText(driver, applicationReferenceIdentifierLabel);
	}

	public boolean isAppDetailsORIValueLabelPresent() {
		return ElementUtils.getElement(driver, appDetailsORIValueLabel).isDisplayed();
	}

	public boolean isApplicationReferenceIdentifierTextBoxDisable() {
		return (!ElementUtils.getElement(driver, applicationReferenceIdentifierTextBox).isEnabled());
	}
}
