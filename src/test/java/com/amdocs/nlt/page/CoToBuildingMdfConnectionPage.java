package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class CoToBuildingMdfConnectionPage extends CoToCoConnectionPage {

	public CoToBuildingMdfConnectionPage(WebDriver driver) {
		super(driver);
	}

	// xapth for CO to MDF room datils
	private final By coToMdfRoomDetailLabel = By.xpath("//span[text()='Request for CO to Building MDF Room Connection']");
	private final By segmentFromCoLabel = By.xpath("//label[@data-qa='segment_from_co_label']");
	private final By segmentFromCoDropdown = By.xpath(".//*[@id='segmentFromCo']");
	private final By orderOptionLabel = By.xpath("//label[@data-qa='order_option_label']");
	private final By radiobutton_postalCode = By.xpath("//input[@data-qa='postal_code_option']");
	private final By radiobutton_postalCode_Label = By.xpath(".//*[@id='feasibilityForm']/div[2]/div/label[1]/span");
	private final By radiobutton_ServingCabinet = By.xpath("//input[@data-qa='serving_cabinet_option']");
	private final By radiobutton_ServingCabinet_Label = By
			.xpath(".//*[@id='feasibilityForm']/div[2]/div/label[2]/span");

	private final By postalcodeLable = By.xpath("//label[@data-qa='postal_code_label']");
	private final By servingCabinetLable = By.xpath("//label[@ data-qa='serving_cabinet_label']");

	private final By postalcodeTextbox = By.xpath(".//*[@id='postalCode']");
	private final By servingCabinetTextbox = By.xpath(".//*[@id='servingCabinet']");

	private final By coverageStausLabel = By.xpath(".//*[@id='coToMdfForm']/div[1]/label[1]/span");
	private final By coverageStausValue = By.xpath("//label[@data-qa='cs_value_label']");

	private final By unitNumberLabel = By.xpath("//label[@ data-qa='unit_number_label']");
	private final By buildingNumLabel = By.xpath("//label[@ data-qa='building_number_label']");

	private final By buildingNameLabel = By.xpath("//label[@data-qa='building_name_label']");

	private final By streetNameLabel = By.xpath("//label[@data-qa='street_name_label']");

	private final By buidlingTypeLabel = By.xpath("//label[@data-qa='building_type_label']");

	private final By installationChargeLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By installationChargeValue = By.xpath("//label[@data-qa='charges_value_label']");

	private final By serviceActiavtionChargeLabel = By.xpath("//label[@ data-qa='activation_charges_label']");

	private final By serviceActiavtionChargeValue = By.xpath("//label[@data-qa='activation_value']");
	// Requested Date

	private final By requestedDateOFActivationLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By calendarInputBox = By.xpath("//label[@data-qa='charges_label']");
	private final By calendarIcon = By.xpath("//label[@data-qa='charges_label']");

	// Technical detail it will used as it is from cotoco story

	// Reqest Detail

	private final By requestDetailLabel = By.xpath("//div[@data-qa='request_details_heading']");

	private final By RlToProvidePatchLabel = By.xpath("//label[@data-qa='patch_cable_label']");
	private final By RlToProvidePatch_radioButton_Yes = By.xpath("//input[@data-qa='patch_cable_provided']");
	private final By RlToProvidePatch_radioButton_No = By.xpath("//input[@data-qa='patch_cable_not_provided']");
	private final By RlFDFLabel = By.xpath("//label[@data-qa='rl_fdf_id_label']");
	private final By RlFDFTextbox = By.xpath(".//*[@id='rlFdfIdNumber']");

	// Additional info
	private final By additionalInfoLink = By.xpath("//span[Text()='Additional Information']");
	private final By additionalInfoTextbox = By.xpath(".//*[@id='additionalInfo']");

	// Requesting Licensee
	private final By rlNameLabel = By.xpath("//label[@data-qa='licensee_name_label']");
	private final By designationLabel = By.xpath("//label[@data-qa='designation_label']");
	private final By companyNameLabel = By.xpath("//label[@data-qa='company_name_label']");
	private final By contactNumber_Rl_Label = By.xpath("//span[text()='Contact Number']");
	private final By faxNumLabel = By.xpath("//label[@data-qa='fax_number_label']");
	private final By emailAd_Rl_Label = By.xpath("//span[text()='Email Address']");

	// Submit Request button
	//private final By submitRequestButton = By.xpath("//label[@data-qa='charges_label']");
	
	private final By submitBtn = By.xpath("//button[@ data-qa='submit_btn']");

	public String getCotoMdfRoomDetail() {
		return ElementUtils.getText(driver, coToMdfRoomDetailLabel);

	}

	public String getSegmentFromCOLabel() {

		return ElementUtils.getText(driver, segmentFromCoLabel);
	}

	public String getOrderOptionLabel() {

		return ElementUtils.getText(driver, orderOptionLabel);
	}

	public String getPostalCodeLabel() {

		return ElementUtils.getText(driver, postalcodeLable);
	}

	public String getServingCabinetLabel() {

		//driver.findElement(radiobutton_ServingCabinet).click();
		//WebDriverWait wait = new WebDriverWait(driver, 4);
		ElementUtils.findElementForClick(driver, radiobutton_ServingCabinet).click();
		return ElementUtils.getText(driver, servingCabinetLable);
	}

	public String getPostalCodeRadiobuttonLabel() {

		return ElementUtils.getText(driver, radiobutton_postalCode_Label);
	}

	public String getServingCabinetRadiobuttonLabel() {

		return ElementUtils.getText(driver, radiobutton_ServingCabinet_Label);

	}

	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStausLabel);
	}

	public String getUnitNumLabel() {
		return ElementUtils.getText(driver, unitNumberLabel);
	}

	public String getBuildingNumLabel() {
		return ElementUtils.getText(driver, buildingNumLabel);
	}

	public String getBuildingNameLabel() {
		return ElementUtils.getText(driver, buildingNameLabel);
	}

	public String getStreetNameLabel() {
		return ElementUtils.getText(driver, streetNameLabel);
	}

	public String getInstallationChargeLabel() {
		return ElementUtils.getText(driver, installationChargeLabel);
	}

	public String getServiceActivationLabel() {
		return ElementUtils.getText(driver, serviceActiavtionChargeLabel);
	}

	public void checkFeasiblity() throws InterruptedException {
		//Select select = new Select(driver.findElement(segmentFromCoDropdown));
		Select select = new Select(ElementUtils.getElement(driver, segmentFromCoDropdown));
		select.selectByIndex(2);
		//driver.findElement(postalcodeTextbox).sendKeys("111111");
		//driver.findElement(submitBtn).click();
		ElementUtils.getElement(driver, postalcodeTextbox).sendKeys("111111");
		ElementUtils.findElementForClick(driver, submitBtn).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");

	}

	public String getCoverageStatus() {

		//return driver.findElement(coverageStausValue).getText();
		return ElementUtils.getElement(driver, coverageStausValue).getText();
	}

	public boolean isInstalltionChargePresent() {
		//String installationCharge = driver.findElement(installationChargeValue).getText();
		String installationCharge = ElementUtils.getElement(driver, installationChargeValue).getText();
		return (installationCharge.contains("$") && (installationCharge.length() > 1));
	}

	public boolean isServiceChargePresent() {
		//String installationCharge = driver.findElement(serviceActiavtionChargeValue).getText();
		String installationCharge = ElementUtils.getElement(driver, serviceActiavtionChargeValue).getText();
		return (installationCharge.contains("$") && (installationCharge.length() > 1));
	}

	// Requated Details methods

	public String getRLpatchLabel() {
		return ElementUtils.getText(driver, RlToProvidePatchLabel);

	}

	public String getRequestDetailLabel() throws InterruptedException {
		//driver.findElement(requestDetailLabel).click();
		ElementUtils.findElementForClick(driver, requestDetailLabel).click();
		return ElementUtils.getText(driver, requestDetailLabel);

	}

	public String getRlFdfLabel() throws InterruptedException {
		//driver.findElement(RlToProvidePatch_radioButton_Yes).click();
		ElementUtils.findElementForClick(driver, RlToProvidePatch_radioButton_Yes).click();
		return ElementUtils.getText(driver, RlFDFLabel);

	}

	public boolean isRadioButtonNoDefaultSelected() {
		//return driver.findElement(RlToProvidePatch_radioButton_No).isSelected();
		return ElementUtils.getElement(driver, RlToProvidePatch_radioButton_No).isSelected();

	}

	public boolean isRlFdfTextboxPresent() {

		//return driver.findElement(RlFDFTextbox).isDisplayed();
		return ElementUtils.getElement(driver, RlFDFTextbox).isDisplayed();

	}

}
