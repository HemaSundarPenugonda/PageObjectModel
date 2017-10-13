package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class ManageTpByAddressPage extends CommonComponentPage {

	private final By scheduleNameLabel = By.xpath("//*[@data-qa='scheduleName_label']");
	private final By postalCodeLabel = By.xpath("//*[@data-qa='postal_code_label']");
	private final By unitNumberLabel = By.xpath("//*[@data-qa='unit_number_label']");
	private final By postalCodeTextBox = By.xpath("//*[@data-qa='postal_code']");
	private final By unitNumberTextBox = By.xpath("//*[@data-qa='unit_number']");
	private final By scheduleNameValueDropdown = By.xpath("//*[@data-qa='scheduleName_value']");
	private final By checkFeasibilityButton = By.xpath("//*[@data-qa='submit_btn']");
	private final By coverageStatusLabel = By.xpath("//*[@data-qa='coverage_status_label']");
	private final By buildingNameLabel = By.xpath("//*[@data-qa='building_name_label']");
	private final By streetNameLabel = By.xpath("//*[@data-qa='street_name_label']");
	private final By buildingTypeLabel = By.xpath("//*[@data-qa='building_type_label']");
	private final By copifTypeLabel = By.xpath("//*[@data-qa='copif_type_label']");
	private final By salutationLabel = By.xpath("//*[@data-qa='salutation_label']");
	private final By firstNameLabel = By.xpath("//*[@data-qa='first_name_label']");
	private final By lastNameLabel = By.xpath("//*[@data-qa='last_name_label']");
	private final By contactNumberLabel = By.xpath("//*[@data-qa='contact_number_label']");
	private final By altNumberLabel = By.xpath("//*[@data-qa='alt_number_label']");
	private final By emailAddressLabel = By.xpath("//*[@data-qa='email_address_label']");
	private final By idTypeLabel = By.xpath("//*[@data-qa='idType_label']");
	private final By idNumberLabel = By.xpath("//*[@data-qa='id_number_label']");
	private final By csValueLabel = By.xpath("//*[@data-qa='cs_value_label']");
	private final By ariInputTextBox = By.xpath("//*[@data-qa='ari_input']");
	private final By buildingNumberDropdown = By.xpath("//*[@data-qa='building_number']");
	
	private final By copifTypeInputBox = By.xpath("//*[@data-qa='copif_type']");
	private final By buildingNameInputBox = By.xpath("//*[@data-qa='building_name']");
	private final By streetNameInputBox = By.xpath("//*[@data-qa='street_name']");
	private final By buildingTypeInputBox = By.xpath("//*[@data-qa='building_type']");
	
	private final By chargesValueLabel = By.xpath("//*[@data-qa='charges_value_label']");
	private final By salutationDropdown = By.xpath("//*[@data-qa='salutation']");
	private final By firstNameTextBox = By.xpath("//*[@data-qa='first_name']");
	private final By lastNameTextBox = By.xpath("//*[@data-qa='last_name']");
	private final By contactNumberTextBox = By.xpath("//*[@data-qa='contact_number']");
	private final By altNumberTextBox = By.xpath("//*[@data-qa='alt_number']");
	
	private final By emailAddressTextBox = By.xpath("//*[@data-qa='email_address']");
	private final By idTypeDropDown = By.xpath("//*[@data-qa='idType']");
	private final By idNumberTextBox = By.xpath("//*[@data-qa='id_number']");
	private final By operationValueDropdown = By.xpath("//*[@data-qa='operation_value']");
	private final By opearaionLabel= By.xpath("//*[@data-qa='opearaion_label']");

	public ManageTpByAddressPage(WebDriver driver) {
		super(driver);
	}
	
	public String getOpearaionLabel() {
		return ElementUtils.getText(driver, opearaionLabel);
	}
	
	public ManageTpByAddressPage selectOperationValueDropdown() {
		Select selectSalutationDropdown = new Select(ElementUtils.getElement(driver, operationValueDropdown));
		selectSalutationDropdown.selectByIndex(1);
		return this;
	}
	
	public ManageTpByAddressPage enterIdNumber(){
		ElementUtils.getElement(driver, idNumberTextBox).sendKeys("1111111111");
		return this;
	}
		
	public ManageTpByAddressPage selectIDTypeDropdown() {
		Select selectSalutationDropdown = new Select(ElementUtils.getElement(driver, idTypeDropDown));
		selectSalutationDropdown.selectByIndex(1);
		return this;
	}
	
	public ManageTpByAddressPage enterEmail(){
		ElementUtils.getElement(driver, emailAddressTextBox).sendKeys("test@test.com");
		return this;
	}
	
	public ManageTpByAddressPage enterAltContactNumber(){
		ElementUtils.getElement(driver, altNumberTextBox).sendKeys("11111111111111111111");
		return this;
	}
	
	public ManageTpByAddressPage enterContactNumber(){
		ElementUtils.getElement(driver, contactNumberTextBox).sendKeys("11111111111111111111");
		return this;
	}
	
	public ManageTpByAddressPage enterFirstName(){
		ElementUtils.getElement(driver, firstNameTextBox).sendKeys("Manu");
		return this;
	}
	
	public ManageTpByAddressPage enterLastName(){
		ElementUtils.getElement(driver, lastNameTextBox).sendKeys("Chauhan");
		return this;
	}
	
	public ManageTpByAddressPage selectSalutationDropdown() {
		Select selectSalutationDropdown = new Select(ElementUtils.getElement(driver, salutationDropdown));
		selectSalutationDropdown.selectByIndex(1);
		return this;
	}
	
	public boolean isChargesValueLabelPresent() {
		return (ElementUtils.getElement(driver, chargesValueLabel).isDisplayed());
	}
	
	public boolean isBuildingTypeInputBoxPresent() {
		return (!ElementUtils.getElement(driver, buildingTypeInputBox).isEnabled());
	}
	
	public boolean isStreetNameInputBoxPresent() {
		return (!ElementUtils.getElement(driver, streetNameInputBox).isEnabled());
	}
	
	public boolean isBuildingNameInputBoxPresent() {
		return (!ElementUtils.getElement(driver, buildingNameInputBox).isEnabled());
	}
	
	public boolean isCopifTypeInputBoxPresent() {
		return (!ElementUtils.getElement(driver, copifTypeInputBox).isEnabled());
	}
	
	public boolean isBuildingNumberDropdownPresent() {
		return (!ElementUtils.getElement(driver, buildingNumberDropdown).isEnabled());
	}
	
	public ManageTpByAddressPage enterAri(){
		ElementUtils.getElement(driver, ariInputTextBox).sendKeys("TestARI");
		return this;
	}
	
	public boolean isCsValueLabelDisplay() {
		return ElementUtils.getElement(driver, csValueLabel).isDisplayed();
	}
	
	public String getIdTypeLabel() {
		return ElementUtils.getText(driver, idTypeLabel);
	}
	
	public String getIdNumberLabel() {
		return ElementUtils.getText(driver, idNumberLabel);
	}
	
	public String getContactNumberLabel() {
		return ElementUtils.getText(driver, contactNumberLabel);
	}
	
	public String getAltNumberLabel() {
		return ElementUtils.getText(driver, altNumberLabel);
	}
	
	public String getEmailAddressLabel() {
		return ElementUtils.getText(driver, emailAddressLabel);
	}
	public String getFirstNameLabel() {
		return ElementUtils.getText(driver, firstNameLabel);
	}
	
	public String getLastNameLabel() {
		return ElementUtils.getText(driver, lastNameLabel);
	}
	
	public String getSalutationLabel() {
		return ElementUtils.getText(driver, salutationLabel);
	}
	
	public String getCopifTypeLabel() {
		return ElementUtils.getText(driver, copifTypeLabel);
	}
	public String getStreetNameLabel() {
		return ElementUtils.getText(driver, streetNameLabel);
	}
	
	public String getBuildingTypeLabel() {
		return ElementUtils.getText(driver, buildingTypeLabel);
	}
	
	public String getBuildingNameLabel() {
		return ElementUtils.getText(driver, buildingNameLabel);
	}
	
	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}
	
	public String getOrderRequestIdentifierLabel() {
		return ElementUtils.getText(driver, scheduleNameLabel);
	}
	
	public String getPostalCodeLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);
	}
	
	public String getUnitNumberLabel() {
		return ElementUtils.getText(driver, unitNumberLabel);
	}
	
	public ManageTpByAddressPage clickOnCheckFeasibility(){
		//driver.findElement(checkFeasibilityButton).click();
		ElementUtils.findElementForClick(driver, checkFeasibilityButton).click();
		return this;
	}

	public void checkFeasiabilityForSchedule1(){
		ElementUtils.getElement(driver, postalCodeTextBox).sendKeys("511111");
		ElementUtils.getElement(driver, unitNumberTextBox).sendKeys("01-01");
		Select selectCoorinateSystem = new Select(ElementUtils.getElement(driver, scheduleNameValueDropdown));
		selectCoorinateSystem.selectByIndex(1);
	}
	
	public void checkFeasiabilityForSchedule2(){
		ElementUtils.getElement(driver, postalCodeTextBox).sendKeys("511111");
		ElementUtils.getElement(driver, unitNumberTextBox).sendKeys("01-01");
		Select selectCoorinateSystem = new Select(ElementUtils.getElement(driver, scheduleNameValueDropdown));
		selectCoorinateSystem.selectByIndex(2);
	}
}
