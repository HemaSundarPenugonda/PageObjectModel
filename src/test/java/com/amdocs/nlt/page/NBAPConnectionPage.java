package com.amdocs.nlt.page;


import java.awt.AWTException;
import java.net.URISyntaxException;

import com.amdocs.nlt.oders.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.NbapConnectionTestData;

public class NBAPConnectionPage extends CommonComponentPage {

	public NBAPConnectionPage(WebDriver driver) {
		super(driver);
	}

	NbapConnectionTestData nbapTestData = new NbapConnectionTestData();
	protected final By optionLabel = By.xpath("//label[@data-qa='option_label']");
	protected final By preInstallOptionLabel = By.xpath("//label[@data-qa='preInstallOption_label']");
	protected final By centralOfficeLabel = By.xpath("//label[@data-qa='centralOffice_label']");
	protected final By centralOfficeDropDown = By.xpath("//select[@data-qa='centralOffice']");
	protected final By aGboxIndentifierLabel = By.xpath("//label[@data-qa='AGBox_identifier_label']");
	protected final By aGboxIndentifierTextbox = By.xpath("//input[@data-qa='AGBox_identifier']");
	protected final By addressOptionLabel = By.xpath("//label[@data-qa='addressOption_label']");
	protected final By descriptionOfAddLabel = By.xpath("//label[@data-qa='description_address_label']");
	protected final By nearestPostalCodeLabel = By.xpath("//label[@data-qa='nearest_postal_code_label']");
	protected final By landmarkLabel = By.xpath("//label[@data-qa='landmark_label']");
	protected final By coordinateSysLabel = By.xpath("//label[@data-qa='coordinate_system_label']");
	protected final By xCoordinateLabel = By.xpath("//label[@data-qa='gps_coordinate_x_label']");
	protected final By yCoordinateLabel = By.xpath("//label[@data-qa='gps_coordinate_y_label']");
	protected final By heightLabel = By.xpath("//label[@data-qa='height']");
	protected final By optionDropdown = By.xpath("//select[@data-qa='option']");
	protected final By addressOptionTextbox = By.xpath("//input[@data-qa='description_address']");
	protected final By NearestPostalCodeTextbox = By.xpath("//input[@data-qa='nearest_postal_code']");
	protected final By landmarkTextbox = By.xpath("//input[@data-qa='landmark']");
	protected final By coordinateSysDropDpown = By.xpath("//select[@data-qa='coordinate_system']");
	protected final By xCoordinateTextbox = By.xpath("//input[@data-qa='gps_coordinate_x']");
	protected final By yCoordinateTextbox = By.xpath("//input[@data-qa='gps_coordinate_y']");
	protected final By heightTextbox = By.xpath("//input[@data-qa='height']");
	protected final By browseAndUploadButton = By.xpath("//span[@data-qa='fileBrowseUpload_data_qa']");
	protected final By coverageStatusLabel = By.xpath("//label[@data-qa='coverage_status_label']");
	protected final By uploadReqDocsLabel = By.xpath("//label[@data-qa='file_input_label']");
	protected final By streetNameLable = By.xpath("//label[@data-qa='street_name_label']");
	protected final By meterLabel = By.xpath("//span[text()='Meter']");
	protected final By nBapAddressRadioButton = By.xpath("//input[@data-qa='address_nbap']");
	protected final By DescriptionRadioButton = By.xpath("//input[@data-qa='address_description']");
	protected final By newRadioButton = By.xpath("//input[@data-qa='preInstall_new']");
	protected final By radioButtonExisting = By.xpath("//input[@data-qa='preInstall_existing']");
	protected final By contractTermLabel = By.xpath("//label[@data-qa='contract_term_label']");
	protected final By contractTermDropdown = By.xpath("//select[@data-qa='contract_term']");

	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}

	public String getMeterLabel() {
		return ElementUtils.getText(driver, meterLabel);
	}

	public String getStreetNameLabel() throws InterruptedException {
		ElementUtils.findElementForClick(driver, nBapAddressRadioButton).click();
		return ElementUtils.getText(driver, streetNameLable);
	}

	public String getCentralOfficeLabel() {
		return ElementUtils.getText(driver, centralOfficeLabel);
	}

	public String getAGboxIndentifierLabel() {
		return ElementUtils.getText(driver, aGboxIndentifierLabel);
	}

	public String getUploadReqDocsLabel() {
		return ElementUtils.getText(driver, uploadReqDocsLabel);
	}

	public String getOptionLabel() {
		return ElementUtils.getText(driver, optionLabel);
	}

	public String getPreInstallOptionLabel() {
		return ElementUtils.getText(driver, preInstallOptionLabel);
	}

	public String getAddressOptionLabel() {
		return ElementUtils.getText(driver, addressOptionLabel);
	}

	public String getDescriptionOfAddLabel() {
		return ElementUtils.getText(driver, descriptionOfAddLabel);
	}

	public String getNearestPostalCodeLabel() {
		return ElementUtils.getText(driver, nearestPostalCodeLabel);

	}

	public String getLandmarkLabel() {
		return ElementUtils.getText(driver, landmarkLabel);
	}

	public String getCoordinateSysLabel() {
		return ElementUtils.getText(driver, coordinateSysLabel);
	}

	public String getXCoordinateLabel() {
		return ElementUtils.getText(driver, xCoordinateLabel);
	}

	public String getYCoordinateLabel() {
		return ElementUtils.getText(driver, yCoordinateLabel);
	}

	public String getHeightLabel() {
		return ElementUtils.getText(driver, heightLabel);
	}

	public void checkFeasibilityForNbapConnectionWithNltToInstallOption() throws InterruptedException, AWTException, URISyntaxException {
		ElementUtils.getElement(driver, ARITextBox).sendKeys("111111");
		commonFieldForFeasibilityCheck();
	}

	public void chekcFeasibilityWithPreinstalledNbapOption(NbapConnectionTestData data) throws Exception {
		ElementUtils.getElement(driver, ARITextBox).sendKeys(data.getAppRefNumber());
		ElementUtils.findElementForClick(driver, radioButtonExisting).click();
		Select selectCentralOffice = new Select(ElementUtils.getElement(driver, centralOfficeDropDown));
		selectCentralOffice.selectByIndex(3);
		ElementUtils.getElement(driver, aGboxIndentifierTextbox).sendKeys(nbapTestData.getaGboxIdentifier());
		commonFieldForFeasibilityCheck();
	}

	public void clickTechnicalDetail() throws InterruptedException {
		ElementUtils.findElementForClick(driver, technicalDetailLabel).click();
	}

	public String getTechnologyLabel() {
		return ElementUtils.getText(driver, tecnologyLabel);
	}

	public String getTechnologyDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, tecnologyDropdown);
	}

	public String getContractLabel() {
		return ElementUtils.getText(driver, contractTermLabel);

	}

	public String getDefaultDropdownValueForContractTerm() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, contractTermDropdown);
	}

	private void commonFieldForFeasibilityCheck() throws InterruptedException, URISyntaxException, AWTException {

		ElementUtils.findElementForClick(driver, DescriptionRadioButton).click();
		ElementUtils.getElement(driver, addressOptionTextbox).sendKeys(nbapTestData.getDescriptionOFAddress());
		ElementUtils.getElement(driver, NearestPostalCodeTextbox).sendKeys(nbapTestData.getNearestPostalCode());
		ElementUtils.getElement(driver, landmarkTextbox).sendKeys(nbapTestData.getLandmark());
		Select selectCoorinateSystem = new Select(ElementUtils.getElement(driver, coordinateSysDropDpown));
		selectCoorinateSystem.selectByIndex(1);

		ElementUtils.getElement(driver, xCoordinateTextbox).sendKeys(nbapTestData.getXcoordinate());
		ElementUtils.getElement(driver, yCoordinateTextbox).sendKeys(nbapTestData.getYcoordinate());
		ElementUtils.getElement(driver, heightTextbox).sendKeys(nbapTestData.getHeight());
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();
		Thread.sleep(2000);
		ElementUtils.performFileUplaod(driver, "Nbap.pdf");
//		fileUplaod();

	}

	public void SelectDateAndClickSubmitButton() throws InterruptedException {
		selectCalendarDate();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

	public String verifyConfirmationMessage() {
		return ElementUtils.getElement(driver, confirmationMessage).getText();
	}

	public boolean isOptionDropdownValuesCorrect() throws InterruptedException {
		WebElement orderDropdown = ElementUtils.getElement(driver, optionDropdown);
		return ElementUtils.verifyDropdownValues(orderDropdown, DropDowns.NBAP_expOderDropdownValue);
	}

	public boolean getDefaultDropdownValueForOptionrDropdown() throws InterruptedException {
		WebElement orderDropdown = ElementUtils.getElement(driver, optionDropdown);
		return ElementUtils.verifyDropdownValues(orderDropdown, DropDowns.NBAP_expOderDropdownValue);
	}

	public boolean isCordinteSystemDropdownValuesCorrect() throws InterruptedException {
		WebElement coOrdinateDropdwon = ElementUtils.getElement(driver, coordinateSysDropDpown);
		return ElementUtils.verifyDropdownValues(coOrdinateDropdwon, DropDowns.NBAP_expCordinateSystemDropdownValue);
	}

	public boolean getDefaultDropdownValueForCordinateSystemDropdown() throws InterruptedException {
		WebElement coOrdinateDropdwon = ElementUtils.getElement(driver, coordinateSysDropDpown);
		return ElementUtils.verifyDropdownValues(coOrdinateDropdwon, DropDowns.NBAP_expCordinateSystemDropdownValue);
	}

	public boolean isNewRadioButtonDefaultChecked() {
		Select selectOption = new Select(ElementUtils.getElement(driver, optionDropdown));
		selectOption.selectByIndex(2);
		return ElementUtils.getElement(driver, newRadioButton).isSelected();
	}

	public boolean isDescriptionRadioButtonDefaultChecked() {
		return ElementUtils.getElement(driver, DescriptionRadioButton).isSelected();
	}
	
	public boolean isOptionDropdownEnabled() {
		return ElementUtils.isEnabled(driver, optionDropdown);
	}
	public boolean isDescriptionRadioButtonEnabled() {
		return ElementUtils.isEnabled(driver, DescriptionRadioButton);
	}
	public boolean isNBapAddressRadioButtonEnabled(){
		return ElementUtils.isEnabled(driver, nBapAddressRadioButton);
	}
	public boolean isAddressOptionTextboxEnabled(){
		return ElementUtils.isEnabled(driver, addressOptionTextbox);
	}
	public boolean isNearestPostalCodeTextboxEnabled(){
		return ElementUtils.isEnabled(driver, NearestPostalCodeTextbox);
	}
	public boolean isLandmarkTextboxEnable(){
		return ElementUtils.isEnabled(driver, landmarkTextbox);
	}
	public boolean isCoordinateSysDropDpownEnabled(){
		return ElementUtils.isEnabled(driver, coordinateSysDropDpown);
	}
	public boolean isxCoordinateTextboxEnabled(){
		return ElementUtils.isEnabled(driver, xCoordinateTextbox);
	}
	public boolean isyCoordinateTextboxEnabled(){
		return ElementUtils.isEnabled(driver, yCoordinateTextbox);
	}
	public boolean isHeightTextboxEnabled(){
		return ElementUtils.isEnabled(driver, heightTextbox);
	}

	public boolean isExistingRadioButtonSelected(){
		return ElementUtils.getVisibleElement(driver, radioButtonExisting).isSelected();
	}

	public boolean isNewRadioButtonSelected(){
		return ElementUtils.getVisibleElement(driver, newRadioButton).isSelected();
	}
}
