package com.amdocs.nlt.viewpages;

import com.amdocs.nlt.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageTpViewPage extends CommonViewPage{

	protected final By postalCodeLabel = By.xpath("//*[@data-qa='postal_code_label']");
	protected final By unitNumberLabel = By.xpath("//*[@data-qa='unit_number_label']");
	protected final By optionLabel = By.xpath("//*[@data-qa='option_label']");
	protected final By buildingNameLabel = By.xpath("//*[@data-qa='building_name_label']");
	protected final By streetNameLabel = By.xpath("//*[@data-qa='street_name_label']");
	protected final By copifTypeLabel = By.xpath("//*[@data-qa='copif_type_label']");
	protected final By postalCodeTextBox = By.xpath("//*[@data-qa='postal_code']");
	protected final By unitNumberTextBox = By.xpath("//*[@data-qa='unit_number']");
	protected final By buildingNumberOptionDropdown = By.xpath("//*[@data-qa='option']");
	protected final By 	buildingNameTextBox = By.xpath("//*[@data-qa='building_name']");
	protected final By 	copifTypeTextBox = By.xpath("//*[@data-qa='copif_type']");
	protected final By 	operationToBePerformedLabel = By.xpath("//*[@data-qa='operation_to_be_performed_label']");
	protected final By 	operationToBePerformedDropdown = By.xpath("//*[@data-qa='opearation_to_be_performed_select']");
	protected final By 	netAttrOrderTypeLabel = By.xpath("//*[@data-qa='netAttr_orderType_label']");
	
	
	
	
	public ManageTpViewPage(WebDriver driver) {
		super(driver);
	}
	
	public String getnetAttrOrderTypeLabel() {
		return ElementUtils.getText(driver, netAttrOrderTypeLabel);
	}
	
	public boolean isoperationToBePerformedDropdownDisable() {
		return isDisabled(operationToBePerformedDropdown);
	}
	
	public String getOperationToBePerformedLabel() {
		return ElementUtils.getText(driver, operationToBePerformedLabel);
	}
	
	public boolean isCopifTypeTextBoxDisable() {
		return isDisabled(copifTypeTextBox);
	}
	
	public boolean isBuildingNameTextBoxDisable() {
		return isDisabled(buildingNameTextBox);
	}
	
	public boolean buildingNumberOptionDropdown() {
		return isDisabled(buildingNumberOptionDropdown);
	}

	public boolean isUnitNumberTextBoxDisable() {
		return isDisabled(unitNumberTextBox);
	}
	
	public boolean isPostalCodeTextBoxDisable() {
		return isDisabled(postalCodeTextBox);
	}
	
	public String getPostalLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);
	}
	
	public String getOptionLabel() {
		return ElementUtils.getText(driver, optionLabel);
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

}
