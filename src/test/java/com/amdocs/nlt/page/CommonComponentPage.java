package com.amdocs.nlt.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.amdocs.nlt.oders.DropDowns;
import com.amdocs.nlt.util.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.OrderTestData;

public class CommonComponentPage {

	protected WebDriver driver;


	public final static String PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE = "08:00-22:00";

	// submit request button
	protected final By submitRequestButton = By.xpath("//button[@data-qa='submit_button']");

	public CommonComponentPage(WebDriver driver) {
		this.driver = driver;
	}

	protected final By confirmationMessage = By.xpath("//h1[@data-qa='confirmation_header']");
	protected final By salutationDropdown = By.xpath("//select[@data-qa='salutation']");
	private final By buildingNumLabel = By.xpath("//label[@data-qa='building_number_label']");
	protected final By actionDropdown_viewPage = By.xpath("//select[@data-qa='button_action_value']");
	protected final By proceedButton_ViewPage = By.xpath("//button[@data-qa='proceed_button']");

	// Technical detail locator
	public final By technicalDetailLabel = By.xpath("//div[@data-qa='techDetailsWidget_top_label']");
	protected final By redundancyServiceLabel = By.xpath("//*[@data-qa='redundancy_label']");
	protected final By rcServiceUnavailableLabel = By.xpath("//label[@data-qa='unavailable_label']");
	protected final By requriedRadioButtonLabel = By.xpath("//span[text()='Required']");
	protected final By notRequriedRadioButtonLabel = By.xpath("//span[text()='Not Required']");
	protected final By rejectRadioButtonLabel = By.xpath("//span[text()='Reject request']");
	protected final By notRejectRadioButtonLabel = By.xpath("//span[text()='Do not reject request']");
	protected final By requriedRadioButton = By.xpath("//input[@data-qa='redundancy_required']");
	protected final By notRequriedRadioButton = By.xpath("//input[@data-qa='redundancy_not_required']");
	protected final By rejectRadioButton = By.xpath("//input[@data-qa='reject']");
	protected final By notRejectRadioButton = By.xpath("//input[@data-qa='donot_reject']");

	// below locato are for technical details
	protected final By tecnologyDropdown = By.xpath("//select[@data-qa='technology']");
	protected final By splitRatioDropdown = By.xpath(".//*[@id='splitratio']");
	protected final By tecnologyLabel = By.xpath("//label[@data-qa='technology_label']");

	// ARI=Application Reference Identifier
	private final By ARILabel = By.xpath("//label[@data-qa='ari_header_label']");
	protected final By ARITextBox = By.xpath("//input[@data-qa='ari_input']");
	protected final By ARITextBox_Terminate = By.xpath("//input[@data-qa='create_ARI_input']");

	// below locator are for Requested Date & Time Slot
	protected final By prefInstallLabel = By.xpath("//label[@data-qa='installation_session_label']/span");
	protected final By reqDateOfActLabel = By.xpath("//label[@data-qa='activation_date_label']/span");
	protected final By calederIcon = By.xpath("//img[@data-qa='calendar_icon']");
	protected final By calederDates = By
			.xpath("//div[@class='DayPicker-Day DayPicker-Day--today'] |  //div[@class='DayPicker-Day']");

	protected final By day_Monday = By.xpath("//abbr[@title='Monday']");

	protected final By reqDateOfActTextbox = By.xpath(".//*[@id='daypicker_rfa']");
	protected final By prefInstallSessionDropdown = By.xpath(".//*[@id='timepicker']");

	protected final By feasibiltyChk = By.xpath("//span[text()='Feasibility Check']");
	protected final By postalCodeLabel = By.xpath("//label[@data-qa='postal_code_label']");
	protected final By postalCodeTextBox = By.xpath("//input[@data-qa='postal_code']");
	protected final By unitNumberTextBox = By.xpath("//input[@data-qa='unit_number']");
	protected final By unitNumberLabel = By.xpath("//label[@data-qa='unit_number_label']");
	protected final By feasibiltyChkButton = By.xpath("//button[@data-qa='submit_btn']");
	protected final By installationChargeLabel = By.xpath("//label[@data-qa='charges_label']");
	protected final By serviceActivationChargeLabel = By.xpath("//label[@data-qa='activation_charges_label']");
	private final By rlNameLabel = By.xpath("//label[@data-qa='licensee_name_label']");
	private final By designationLabel = By.xpath("//label[@data-qa='designation_label']");
	private final By rlCompanyNameLabel = By.xpath("//*[@data-qa='request_top_label']/..//label[@data-qa='company_name_label']");
	private final By contactNumber_Rl_Label = By.xpath("//span[text()='Contact Number']");
	private final By faxNumLabel = By.xpath("//label[@data-qa='fax_number_label']");
	private final By emailAd_Rl_Label = By.xpath("//span[text()='Email Address']");
	private final By requestingLicenseeHeader = By.xpath("//div[@data-qa='request_top_label']");
	// Additional Information Link Locators
	private final By additionalInfoLink = By.xpath("//a[@data-qa='additionalInfo_link']");
	private final By additionalInfoTextbox = By.xpath(".//*[@id='additionalInfo']");
	private final By additionalInfoLabel = By.xpath("//label[@data-qa='additional_info_label']");
	private final By datePickerDay = By.xpath("//div[@class='DayPicker-Day']");
	private final By requestTopLabel = By.xpath("//div[@data-qa='request_top_label']");
	private final By licenseeNameLabel = By.xpath("//*[@data-qa='licensee_name_label']");
	protected final By fileUpload = By.xpath("//input[@data-qa='required_file_value']");
	public final By browseAndUploadButton2 = By.xpath("(//*[@data-qa='required_file_value']//..//span)[2]");
	protected final By browseAndUploadButton = By.xpath("(//*[@data-qa='required_file_value']//..//span)[1]");
	public final By fileUpload2 = By.xpath("(//input[@data-qa='required_file_value'])[2]");

	public void clickOnSubmitButton() {
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

	public String getLicenseeNameLabel() {
		return ElementUtils.getText(driver, licenseeNameLabel);
	}

	public String getPalceHolderText_ARIField() {
		return ElementUtils.getText(driver, ARITextBox);
	}

	public String getFeasibiltiyCheckLabel() {
		return ElementUtils.getText(driver, feasibiltyChk);
	}

	public String getPalceHolderText_PostalcodeField() {
		return ElementUtils.getText(driver, postalCodeTextBox);
	}

	public String getPalceHolderText_UnitNumberField() {
		return ElementUtils.getText(driver, unitNumberTextBox);
	}

	public boolean isFeasibilityCheckButtonEnabled() throws InterruptedException {
		return ElementUtils.isEnabled(driver, feasibiltyChkButton);
	}

	public boolean isSubmitRequestButtonEnabled() {
		return ElementUtils.isEnabled(driver, submitRequestButton);
	}

	public String getARILabel() {
		return ElementUtils.getText(driver, ARILabel);
	}

	public boolean isARILabelDisplayed() {
		return ElementUtils.isDisplayed(driver, ARILabel);
	}

	public String getBuildingNumberLabel() {
		return ElementUtils.getText(driver, buildingNumLabel);
	}

	// Feasibility check component starts here
	public String getPostalcodeLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);
	}

	public String getUnitNumLabel() {
		return ElementUtils.getText(driver, unitNumberLabel);
	}

	// This all methods are related to the requesting licensee component
	public String clickAndGetRequestinglicenseeLabel() throws InterruptedException {
		ElementUtils.clickObject(driver, requestingLicenseeHeader);
		return ElementUtils.getText(driver, rlNameLabel);
	}

	public String getRequestinglicenseeLabel() {
		return ElementUtils.getText(driver, rlNameLabel);
	}

	public String getDesignationLabel() {
		return ElementUtils.getText(driver, designationLabel);
	}

	public String getRlCompanyNameLabel() {
		return ElementUtils.getText(driver, rlCompanyNameLabel);
	}

	public boolean isRlCompanyNameLabelDisplayed() {
		return ElementUtils.isDisplayed(driver, rlCompanyNameLabel);
	}

	public String getContactNumber_RL_Label() {
		return ElementUtils.getText(driver, contactNumber_Rl_Label);
	}

	public String getFaxNumberLabel() {
		return ElementUtils.getText(driver, faxNumLabel);
	}

	public String getEmailAddress_RL_Label() {
		return ElementUtils.getText(driver, emailAd_Rl_Label);
	}

	public String getRequestingLicenseeNameLabel() throws InterruptedException {
		return ElementUtils.getText(driver, rlNameLabel);
	}

	// This all methods are related to the requested date and time slot
	// component

	public boolean isCalendarIconPresent() {
		return ElementUtils.isDisplayed(driver, calederIcon);
	}

	public String getDefaulPlaceholderForCalendarTextbox() throws InterruptedException {
		return ElementUtils.getElement(driver, reqDateOfActTextbox).getAttribute("value");
	}

	public String getDefaultValueForPreferedInstallationDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, prefInstallSessionDropdown);
	}

	public String getReqDateOfActLabel() {
		return ElementUtils.getText(driver, reqDateOfActLabel);
	}

	public String getPrefInstallLabel() {
		return ElementUtils.getText(driver, prefInstallLabel);
	}

	public boolean isCalenderIconPresent() {
		return ElementUtils.isDisplayed(driver, calederIcon);
	}

	public boolean isRequestedDateTextBoxDisplayed() {
		return ElementUtils.isDisplayed(driver, reqDateOfActTextbox);
	}

	public boolean isPreferedInstallationDropdownDisplayed() {
		return ElementUtils.isDisplayed(driver, prefInstallSessionDropdown);
	}

	// This all methods are related to the technical detail component

	public String getRedundancyServiceLabel() throws InterruptedException {
		return ElementUtils.getText(driver, redundancyServiceLabel);
	}

	public String getRequiredRadioButtonLabel() {
		return ElementUtils.getText(driver, requriedRadioButtonLabel);
	}

	public String getNotRequiredRadioButtonLabel() {
		return ElementUtils.getText(driver, notRequriedRadioButtonLabel);
	}

	public boolean iSRequiredRadioButtonDefaultSelected() {
		return ElementUtils.getElement(driver, requriedRadioButton).isSelected();
	}

	public boolean iSNotRequiredRadioButtonNotDefaultSelected() {
		return ElementUtils.getElement(driver, notRequriedRadioButton).isSelected();
	}

	public String clickRequiredAndGetIncaseOfreduandanycSeviceLabel() throws InterruptedException {
		ElementUtils.clickObject(driver, requriedRadioButton);
		return ElementUtils.getText(driver, rcServiceUnavailableLabel);
	}

	public String getIncaseOfreduandanycSeviceLabel() throws InterruptedException {
		return ElementUtils.getText(driver, rcServiceUnavailableLabel);
	}

	public boolean isrejectRequetRadioButtonDefualtSelected() {
		return ElementUtils.getElement(driver, rejectRadioButton).isSelected();
	}

	public boolean iNotsrejectRequetRadioButtonNotDefualtSelected() {
		return ElementUtils.getElement(driver, notRejectRadioButton).isSelected();
	}

	// This all methods related to additional info component

	public boolean iSadditionalInfoLinkPresent() {
		return ElementUtils.isDisplayed(driver, additionalInfoLink);
	}

	public boolean iSadditionalInfoTextBoxPresent() {
		return ElementUtils.isDisplayed(driver, additionalInfoTextbox);
	}

	public String getAdditionalInfoLabel() throws InterruptedException {
		ElementUtils.clickObject(driver, additionalInfoLink);
		return ElementUtils.getText(driver, additionalInfoLabel);
	}

	public String getTechnologyLabel() {
		ElementUtils.clickObject(driver, technicalDetailLabel);
		return ElementUtils.getText(driver, tecnologyLabel);
	}
	//need to refactor this method
	public void selectCalendarDate() throws InterruptedException {
		List<WebElement> allDates = driver.findElements(datePickerDay);
		Thread.sleep(1000);
		int retryCalendarRetry = 0;
		while (allDates.isEmpty()) {
			retryCalendarRetry++;
			ElementUtils.clickObject(driver, calederIcon);
			Thread.sleep(1000);
			allDates = driver.findElements(calederDates);
			if (retryCalendarRetry > 5) {
				break;
			}
		}
		allDates.get(0).click();
	}

	public String VerifyConfirmationMessage() {
		return ElementUtils.getText(driver, confirmationMessage);
	}

	public boolean areSalutationDropDownValuesCorrect() throws InterruptedException {
		WebElement salutationDropDownElement = ElementUtils.getElement(driver, salutationDropdown);
		return ElementUtils.verifyDropdownValues(salutationDropDownElement, DropDowns.EXPSALUTATION_VALUES);
	}

	public boolean areActionDropdownaValuesCorrectForCurrentStaus_Pending() throws InterruptedException {
		WebElement actionDropdownElement = ElementUtils.getElement(driver, actionDropdown_viewPage);
		return ElementUtils.verifyDropdownValues(actionDropdownElement, DropDowns.EXPACTION_DROPDOWN_VALUES_FOR_CURRENT_STATUS_PENDING);
	}

	public String getInstallationChargeLabel() {
		return ElementUtils.getText(driver, installationChargeLabel);
	}

	public String getServiceActivationChargeLabel() {
		return ElementUtils.getText(driver, serviceActivationChargeLabel);
	}

	public void clickRequestingLincenseeComponent() {
		ElementUtils.clickObject(driver, requestTopLabel);
	}

	public void submitFeasibility() throws InterruptedException {
		OrderTestData orderData = new OrderTestData();
		ElementUtils.sendKeys(driver, postalCodeTextBox, orderData.getPostalCode_Homepassed());
		ElementUtils.sendKeys(driver, unitNumberTextBox, orderData.getUnitNum());
		ElementUtils.clickObject(driver, feasibiltyChkButton);
	}


	protected final By additionalInfoValue = By.xpath("//label[@data-qa='additional_info']");
	protected final By currentStatus = By.xpath("//div[@data-qa='currentStatus_value']");
	protected final By ori = By.xpath("//label[@data-qa='appDetails_ORI_value']/input");
	protected final By cin = By.xpath("//label[@data-qa='appDetails_CIN_value']/input");
	protected final By dateOfApplication = By.xpath("//label[@data-qa='appDetails_DOA_value']/input");
	protected final By tentativeProvisionDate = By.xpath("//label[@data-qa='appDetails_TPD_value']");
	protected final By timeLineToComplete = By.xpath("//label[@data-qa='appDetails_RPD_value']/input");
	protected final By reasonForRejection = By.xpath("//label[#data-qa='appDetails_ROR_value']/input");
	protected final By buildingNumber = By.xpath("//select[@data-qa='building_number']");
	protected final By streetName = By.xpath("//input[@data-qa='street_name']");
	protected final By calenderIcon = By.xpath("//img[@data-qa='calendar_icon']");
	protected final By companyName = By.xpath("//input[@data-qa='company_name']");
	protected final By scheduleDropdownValue = By.xpath("//select[@data-qa='scheduleName_value']");

	protected By sameAsInstallationDetails = By.xpath("//input[@data-qa='same_as_install']");
	protected By billingPostalCode = By.xpath("//input[@data-qa='billing_postal_code']");
	protected By billingUnitNumber = By.xpath("//input[@data-qa='billing_unit_number']");
	protected By billingBuildingNumber = By.xpath("//input[@data-qa='billing_building_number']");
	protected By billingBuildingName = By.xpath("(//input[@data-qa='building_name'])[2]");
	protected By billingStreetName = By.xpath("(//input[@data-qa='street_name'])[2]");
	protected By billingBuildingType = By.xpath("//select[@data-qa='billing_building_type']");
	protected By billingSalutation = By.xpath("//select[@data-qa='salutation_billing']");
	protected By billingFirstName = By.xpath("//input[@data-qa='first_name_billing']");
	protected By billingLastName = By.xpath("//input[@data-qa='last_name_billing']");
	protected By billingContactNumber = By.xpath("//input[@data-qa='contact_number_billing']");
	protected By billingAlternateContactNumber = By.xpath("//input[@data-qa='alt_number_billing']");
	protected By billingEmailAddress = By.xpath("//input[@data-qa='email_address_billing']");
	protected By billingCompanyName = By.xpath("(//input[@data-qa='company_name'])[2]");

	// These fields commented in ResidentailOrderPage.java
	protected final By buildingName = By.xpath("//input[@data-qa='building_name']");
	protected final By copifType = By.xpath("//input[@data-qa='copif_type']");
	protected final By alternateContactNumberValue = By.xpath("//input[@data-qa='alt_number']");
	protected final By buildingTypeTextbox = By.xpath("//input[@data-qa='building_type']");
	protected final By firstNameTextBox = By.xpath("//input[@data-qa='first_name']");
	protected final By lastNameTextBox = By.xpath("//input[@data-qa='last_name']");
	protected final By contactNumberTextBox = By.xpath("//input[@data-qa='contact_number']");
	protected final By emailAddTextBox = By.xpath("//input[@data-qa='email_address']");

	protected final By goBackTop = By.xpath("//div[@data-qa='top-go-back']");
	protected final By goBackBottom = By.xpath("//div[@data-qa='bottom-go-back']");
	protected final By newARI = By.xpath("//label[@data-qa='new_ari_header_label']");
	protected final By newARITextBox = By.xpath("//input[@data-qa='new_ari_input']");
	protected final By existingRSPDropdown = By.xpath("//select[@data-qa='rsp_dropdown']");

	protected final By coverageStatusValue = By.xpath("//label[@data-qa='cs_value_label']");
	protected final By errorVallidation = By.xpath("//div[@data-qa='line_error']");
	protected final By amendOrder = By.xpath("//button[@data-qa='modify_button']");

	protected final By scheduleNameDropdown = By.xpath("//select[@data-qa='scheduleName_value']");
	protected final By idTypeDropdown = By.xpath("//select[@data-qa='idType']");
	protected final By idNumberTextBox = By.xpath("//input[@data-qa='id_number']");

	public boolean isIdTypeEnabled() {
		return ElementUtils.isEnabled(driver, idTypeDropdown);
	}

	public boolean isIdNumberEnabled() {
		return ElementUtils.isEnabled(driver, idNumberTextBox);
	}

	public boolean isAmendOrderButtonDisplayed() {
		return ElementUtils.isDisplayed(driver, amendOrder);
	}

	public boolean isAmendOrderButtonEnabled() {
		return ElementUtils.isEnabled(driver, amendOrder);
	}

	public boolean isErrorVallidationDisplayed() {
		return ElementUtils.isDisplayed(driver, errorVallidation);
	}

	public String getErrorVallidation() {
		return ElementUtils.getText(driver, errorVallidation);
	}

	public String getCoverageStatusValue() {
		return ElementUtils.getText(driver, coverageStatusValue);
	}

	public boolean areRSPDropDownValuesCorrect() throws InterruptedException {
		return ElementUtils.verifyDropdownValues(ElementUtils.getVisibleElement(driver, existingRSPDropdown), DropDowns.expRSP);
	}

	public String getDefaultValueForRSPDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, existingRSPDropdown);
	}

	public boolean clickTopBackButton() {
		ElementUtils.clickObject(driver, goBackTop);
		return true;
	}

	public boolean clickBottomBackButton() {
		ElementUtils.clickObject(driver, goBackBottom);
		return true;
	}

	public boolean isNewARILabelDisplayed() {
		return ElementUtils.isDisplayed(driver, newARI);
	}

	public boolean isNewARILabelEnabled() {
		return ElementUtils.isEnabled(driver, newARI);
	}

	public void enterARI(String value) throws InterruptedException {
		Thread.sleep(2000);
		ElementUtils.sendKeys(driver, newARITextBox, value);
	}

	public int getARILength() {
		return ElementUtils.getLengthOfTextBoxValue(driver, newARITextBox);
	}

	public boolean isBillingPostalCodeEnabled() {
		return ElementUtils.isEnabled(driver, billingPostalCode);
	}

	public boolean isBillingUnitNumberEnabled() {
		return ElementUtils.isEnabled(driver, billingUnitNumber);
	}

	public boolean isBillingBuildingNumberEnabled() {
		return ElementUtils.isEnabled(driver, billingBuildingNumber);
	}

	public boolean isBillingBuildingNameEnabled() {
		return ElementUtils.isEnabled(driver, billingBuildingName);
	}

	public boolean isBillingStreetNameEnabled() {
		return ElementUtils.isEnabled(driver, billingStreetName);
	}

	public boolean isBillingBuildingTypeEnabled() {
		return ElementUtils.isEnabled(driver, billingBuildingType);
	}

	public boolean isBillingSalutationEnabled() {
		return ElementUtils.isEnabled(driver, billingSalutation);
	}

	public boolean isBillingFirstNameEnabled() {
		return ElementUtils.isEnabled(driver, billingFirstName);
	}

	public boolean isBillingLastNameEnabled() {
		return ElementUtils.isEnabled(driver, billingLastName);
	}

	public boolean isBillingContactNumberEnabled() {
		return ElementUtils.isEnabled(driver, billingContactNumber);
	}

	public boolean isBillingAlternateContactNumberEnabled() {
		return ElementUtils.isEnabled(driver, billingAlternateContactNumber);
	}

	public boolean isBillingEmailAddressEnabled() {
		return ElementUtils.isEnabled(driver, billingEmailAddress);
	}

	public String getBillingPostalCode() {
		return ElementUtils.getValue(driver, billingPostalCode);
	}

	public String getBillingUnitNumber() {
		return ElementUtils.getValue(driver, billingUnitNumber);
	}

	public String getBillingBuildingNumber() {
		return ElementUtils.getValue(driver, billingBuildingNumber);
	}

	public String getBillingBuildingName() {
		return ElementUtils.getValue(driver, billingBuildingName);
	}

	public String getBillingStreetName() {
		return ElementUtils.getValue(driver, billingStreetName);
	}

	public String getBillingBuildingType() {
		return ElementUtils.getSelectedValue(driver, billingBuildingType);
	}

	public String getBillingSalutation() {
		return ElementUtils.getSelectedValue(driver, billingSalutation);
	}

	public String getBillingFirstName() {
		return ElementUtils.getValue(driver, billingFirstName);
	}

	public String getBillingLastName() {
		return ElementUtils.getValue(driver, billingLastName);
	}

	public String getBillingContactNumber() {
		return ElementUtils.getValue(driver, billingContactNumber);
	}

	public String getBillingAlternateContactNumber() {
		return ElementUtils.getValue(driver, billingAlternateContactNumber);
	}

	public String getBillingEmailAddress() {
		return ElementUtils.getValue(driver, billingEmailAddress);
	}

	public boolean areScheduleDropDownValuesCorrect() throws InterruptedException {
		return ElementUtils.verifyDropdownValues(ElementUtils.getVisibleElement(driver, scheduleDropdownValue), DropDowns.expSchedules_FTO);
	}

	public String getDefaultValueForScheduleDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, scheduleDropdownValue);
	}

	public boolean isFeasibilityCheckSectionDisplayed() {
		return ElementUtils.isDisplayed(driver, feasibiltyChk);
	}

	public boolean isSalutationEnabled() {
		return ElementUtils.isEnabled(driver, salutationDropdown);
	}

	public boolean isBuildingNumberEnabled() {
		return ElementUtils.isEnabled(driver, buildingNumber);
	}

	public boolean isStreetNameEnabled() {
		return ElementUtils.isEnabled(driver, streetName);
	}

	public boolean isBuildingNameEnabled() {
		return ElementUtils.isEnabled(driver, buildingName);
	}

	public boolean isBuildingTypeEnabled() {
		return ElementUtils.isEnabled(driver, buildingTypeTextbox);
	}

	public boolean isBuildingTypeDisplayed() {
		return ElementUtils.isDisplayed(driver, buildingTypeTextbox);
	}

	public boolean isCopifTypeEnabled() {
		return ElementUtils.isEnabled(driver, copifType);
	}

	public boolean isCopifTypeDisplayed() {
		return ElementUtils.isDisplayed(driver, copifType);
	}

	public boolean isFirstNameEnabled() {
		return ElementUtils.isEnabled(driver, firstNameTextBox);
	}

	public boolean isLastNameEnabled() {
		return ElementUtils.isEnabled(driver, lastNameTextBox);
	}

	public boolean isContactNumberEnabled() {
		return ElementUtils.isEnabled(driver, contactNumberTextBox);
	}

	public boolean isAlternateContactNumberEnabled() {
		return ElementUtils.isEnabled(driver, alternateContactNumberValue);
	}

	public boolean isEmailAddressEnabled() {
		return ElementUtils.isEnabled(driver, emailAddTextBox);
	}

	public void selectSameAsInstallationDetails() {
		ElementUtils.clickObject(driver, sameAsInstallationDetails);
	}

	public boolean isCompanyNameDisplayed() {
		return ElementUtils.isDisplayed(driver, companyName);
	}

	public boolean isCompanyNameEnabled() {
		return ElementUtils.isEnabled(driver, companyName);
	}

	public boolean isBillingCompanyNameDisplayed() {
		return ElementUtils.isDisplayed(driver, billingCompanyName);
	}

	public boolean isBillingCompanyNameEnabled() {
		return ElementUtils.isEnabled(driver, billingCompanyName);
	}

	public String getCompanyName() {
		return ElementUtils.getValue(driver, companyName);
	}

	public String getBillingCompanyName() {
		return ElementUtils.getValue(driver, billingCompanyName);
	}

	public String getBuildingNumberValue() {
		return ElementUtils.getSelectedValue(driver, buildingNumber);
	}

	public String getBuildingNameValue() {
		return ElementUtils.getValue(driver, buildingName);
	}

	public String getStreetNameValue() {
		return ElementUtils.getValue(driver, streetName);
	}

	public String getBuildingType() {
		return ElementUtils.getValue(driver, buildingTypeTextbox);
	}

	public String getCopifType() {
		return ElementUtils.getValue(driver, copifType);
	}

	public void clickSubmitButton() {
		ElementUtils.clickObject(driver, submitRequestButton);
	}

	public boolean isExistingRspEnabled() {
		return ElementUtils.isEnabled(driver, existingRSPDropdown);
	}

	public boolean isEmailAddressMandatory() {
		return ElementUtils.isMandatory(driver, emailAddTextBox);
	}

	protected final By submitRequestButton_Bug = By.xpath("(//button[@data-qa='submit_button'])[2]");

	public void clickSubmitButton_Bug() throws InterruptedException {
		ElementUtils.clickObject(driver, submitRequestButton_Bug);
	}

	public boolean isSubmitButtonEnabled_Bug() throws InterruptedException {
		return ElementUtils.isEnabled(driver, submitRequestButton_Bug);
	}

	public void enterPostalCode(String val) {
		ElementUtils.sendKeys(driver, postalCodeTextBox, val);
	}

	public void enterUnitNumber(String val) {
		ElementUtils.sendKeys(driver, unitNumberTextBox, val);
	}

	public void clickFeasibilityButton() {
		ElementUtils.clickObject(driver, feasibiltyChkButton);
	}

	public String getCurrentSatus() {
		return ElementUtils.getText(driver, currentStatus);
	}

	public boolean isAriTextboxEnabled() {
		return ElementUtils.isEnabled(driver, ARITextBox);
	}

	public boolean isScheduleDropdownValueEnabled() {
		return ElementUtils.isEnabled(driver, scheduleDropdownValue);
	}

	public boolean isPostalCodeTextBoxEnabled() {
		return ElementUtils.isEnabled(driver, postalCodeTextBox);
	}

	public String getpostalCodeTextBox() {
		return ElementUtils.getValue(driver, postalCodeTextBox);
	}

	public boolean isunitNumberTextBoxEnabled() {
		return ElementUtils.isEnabled(driver, unitNumberTextBox);
	}

	public String getunitNumberTextBox() {
		return ElementUtils.getValue(driver, unitNumberTextBox);
	}

	public boolean isAdditionalInfoValueEnabled() {
		return ElementUtils.isEnabled(driver, additionalInfoValue);
	}

	public boolean isPrefInstallSessionDropdownEnabled() {
		return ElementUtils.isEnabled(driver, prefInstallSessionDropdown);
	}

	public boolean isAmendOrderOptionExistsInActionDropdown() throws InterruptedException {
		WebElement actionDropdown = ElementUtils.getElement(driver, actionDropdown_viewPage);
		return ElementUtils.verifyoptionExistsInDropdown(actionDropdown, "Amend Order");
	}

	protected final By CancelButton = By.xpath("//*[@data-qa='cancel_button']");

	public boolean isCancelOrderOptionExistsInActionDropdown() throws InterruptedException {
		WebElement actionDropdown = ElementUtils.getElement(driver, actionDropdown_viewPage);
		return ElementUtils.verifyoptionExistsInDropdown(actionDropdown, "Cancel Order");
	}

	public boolean isCancelButtonDisplayed() {
		return ElementUtils.isDisplayed(driver, CancelButton);
	}

	public boolean isNewAriEnabled() {
		return ElementUtils.isEnabled(driver, newARITextBox);
	}

	public boolean isRequestedDateTextBoxEnabled() {
		return ElementUtils.isEnabled(driver, reqDateOfActTextbox);
	}

	protected final By manageTPButton = By.xpath("//*[@data-qa='manageTp_button']");

	// Need to remove this method
	public void clickManageTPButton() {
		ElementUtils.clickObject(driver, manageTPButton);
	}

	protected final By newARIAmend = By.xpath("//*[@data-qa='new_ammend_ari_input']");

	public void enterNewARI(String val) {
		ElementUtils.sendKeys(driver, newARIAmend, val);
	}

	protected final By teminateButton = By.xpath("//*[@data-qa='terminate_button']");

	public void clickTerminateButton() {
		ElementUtils.clickObject(driver, teminateButton);
	}

	protected final By amendButton1 = By.xpath("//*[@data-qa='activate_amend_button']");

	public boolean isAmendButton1Enabled() {
		return ElementUtils.isEnabled(driver, amendButton1);
	}

	protected final By redundancyOriLabel = By.xpath("//*[@data-qa='netAttr_redundancyORI_label']");

	public boolean isRedundancyOriLabelDisplayed() {
		return ElementUtils.isDisplayed(driver, redundancyOriLabel);
	}

	protected final By kivHeader = By.xpath("//*[@data-qa='kiv_msg_header']");

	public String getKivHeader() {
		return ElementUtils.getText(driver, kivHeader);
	}

	public boolean isKivHeaderDisplayed() {
		return ElementUtils.isDisplayed(driver, kivHeader);
	}

	protected final By kivMessage = By.xpath("//*[@data-qa='kiv_msg_body']");

	public String getKivMessage() {
		return ElementUtils.getText(driver, kivMessage);
	}

	protected final By noKivButton = By.xpath("//*[@data-qa='no_kiv_btn']");

	public boolean isNoKIVButtonEnabled() {
		return ElementUtils.isEnabled(driver, noKivButton);
	}

	public void clickNoKivButton() {
		ElementUtils.clickObject(driver, noKivButton);
	}

	protected final By yesKivButton = By.xpath("//*[@data-qa='yes_kiv_btn']");

	public boolean isYesKIVButtonEnabled() {
		return ElementUtils.isEnabled(driver, yesKivButton);
	}

	public void clickYesKivButton() {
		ElementUtils.clickObject(driver, yesKivButton);
	}

	protected final By kivSuccessMessage = By
			.xpath("//*[text()='Request to keep the order open, is submitted successfully.']");

	public String getKivSuccessMessage() {
		return ElementUtils.getText(driver, kivSuccessMessage);
	}

	public boolean isSubmitRequestButtonDisplayed() {
		return ElementUtils.isDisplayed(driver, submitRequestButton);
	}

	protected final By amendSubmitButton = By.xpath("//*[@data-qa='amend_submit_button']");

	public void clickAmendSubmitButton() {
		ElementUtils.clickObject(driver, amendSubmitButton);
	}

	public void clickAmendSubmitButton_1() {
		ElementUtils.clickObject(driver, amendOrder);
	}

	protected final By applicationReferenceIdentifierLabel_bug = By.xpath("(//*[@data-qa='ari_header_label'])[2]/span");

	public String getApplicationReferenceIdentifierLabel_bug() {
		return ElementUtils.getText(driver, applicationReferenceIdentifierLabel_bug);
	}

	private void clickButtonFromActionDropdown(String buttonName) throws InterruptedException {
		ElementUtils.selectDropdownValue(driver, actionDropdown_viewPage, buttonName);

		ElementUtils.clickObject(driver, proceedButton_ViewPage);
		driver.manage().timeouts().pageLoadTimeout(PropertiesReader.getInstance().waitForSecondsHigh(), TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	public int totalNoButtonsInActionDropdown() throws InterruptedException {
		return ElementUtils.noOptionsInDropdown(driver, actionDropdown_viewPage);
	}

	public void clickAmendButton() throws InterruptedException {
		clickButtonFromActionDropdown("Amend Order");
	}

	public void clickOnCancelOrderButton() throws InterruptedException {
		clickButtonFromActionDropdown("Cancel Order");
	}

	public void clickRelocateButton() throws InterruptedException {
		clickButtonFromActionDropdown("Relocate");
	}

	public void clickOnManageTPButton() throws InterruptedException {
		clickButtonFromActionDropdown("Manage TP");
	}

	public void clickOnChangeTechButton() throws InterruptedException {
		clickButtonFromActionDropdown("Change Technology");
	}

	public void clickOnTerminateOrderButton() throws InterruptedException {
		clickButtonFromActionDropdown("Terminate Order");
	}
	protected final By reclassify_Yes_Button = By.xpath("// button[@data-qa='yes-button']");
	public void clickReclassifyOnPopup(){
		ElementUtils.clickObject(driver, reclassify_Yes_Button);
	}

	public boolean isTerminateOrderOptionExistsInActionDropdown() throws InterruptedException {
		return ElementUtils.verifyoptionExistsInDropdown(driver, actionDropdown_viewPage, "Terminate Order");
	}

	public boolean isChangeTechnologyOptionExistsInActionDropdown() throws InterruptedException {
		return ElementUtils.verifyoptionExistsInDropdown(driver, actionDropdown_viewPage, "Change Technology");
	}

	public boolean isManageTPOptionExistsInActionDropdown() throws InterruptedException {
		return ElementUtils.verifyoptionExistsInDropdown(driver, actionDropdown_viewPage, "Manage TP");
	}

	public boolean isRelocateOptionExistsInActionDropdown() throws InterruptedException {
		return ElementUtils.verifyoptionExistsInDropdown(driver, actionDropdown_viewPage, "Relocate");
	}

	public boolean isActionDropdownDisplayed(){
		return ElementUtils.isDisplayed(driver, actionDropdown_viewPage);
	}

	
	public void enterAmendARI(String value) throws InterruptedException {
		Thread.sleep(2000);
		ElementUtils.sendKeys(driver, ARITextBox, value);
	}


	protected final By kivSectionHeader = By.xpath("//*[@data-qa='kiv_header']");
	public String getKivSectionHeader(){
		return ElementUtils.getText(driver, kivSectionHeader);
	}

	public boolean isKivSectionHeaderDisplayed(){
		return ElementUtils.isDisplayed(driver, kivSectionHeader);
	}

	public boolean isBrowseAndUploadButtonDisplayed(){
		return ElementUtils.isDisplayed(driver, fileUpload);

	}
	protected final By relocationUnitNumberTextbox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='unit_number']");
	public boolean isRelocationUnitNumberTextboxEnabled(){
		return ElementUtils.isEnabled(driver, relocationUnitNumberTextbox);
	}

	public void fillRelocationUnitNumberTextbox(String valueToEnter){
		ElementUtils.sendKeys(driver, relocationUnitNumberTextbox, valueToEnter);
	}

	protected final By viewAmend_PageHeader = By.xpath("//*[@data-qa='page_heading']");
	public String getPageHeaderForViewAmendScreen(){
		return ElementUtils.getText(driver, viewAmend_PageHeader);
	}

	private final By billingPostalCodeLabel = By.xpath("//*[@data-qa='billing_postal_code_label']");
	private final By billingUnitNumberLabel = By.xpath("//*[@data-qa='billing_unit_number_label']");
	private final By billingBuildingNumberLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='building_number_label']");
	private final By billingBuildingNameLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='building_name_label']");
	private final By billingStreetNameLabel = By.xpath("//*[@data-qa='billing_street_name_label']");
	private final By billingSalutationLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='salutation_label']");
	private final By billingFirstNameLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='first_name_label']");
	private final By billingLastNameLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='last_name_label']");
	private final By billingCompanyNameLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='company_name_label']");
	private final By billingContactNumberLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='contact_number_label']");
	private final By billingAlternateContactNumberLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='alt_number_label']");
	private final By billingEmailAddressLabel = By.xpath("//*[@data-qa='billing-form']//*[@data-qa='email_address_label']");
	private final By billingEndUserDetailsSectionHeader = By.xpath("//*[@data-qa='billing_header']");

	public String getBillingEndUserDetailsSectionHeader() {
		return ElementUtils.getText(driver, billingEndUserDetailsSectionHeader);
	}

	public String getBillingPostalCodeLabel() {
		return ElementUtils.getText(driver, billingPostalCodeLabel);
	}

	public String getBillingUnitNumberLabel() {
		return ElementUtils.getText(driver, billingUnitNumberLabel);
	}

	public String getBillingBuildingNumberLabel() {
		return ElementUtils.getText(driver, billingBuildingNumberLabel);
	}

	public String getBillingBuildingNameLabel() {
		return ElementUtils.getText(driver, billingBuildingNameLabel);
	}

	public String getBillingStreetNameLabel() {
		return ElementUtils.getText(driver, billingStreetNameLabel);
	}

	public String getBillingSalutationLabel() {
		return ElementUtils.getText(driver, billingSalutationLabel);
	}

	public String getBillingFirstNameLabel() {
		return ElementUtils.getText(driver, billingFirstNameLabel);
	}

	public String getBillingLastNameLabel() {
		return ElementUtils.getText(driver, billingLastNameLabel);
	}

	public String getBillingCompanyNameLabel() {
		return ElementUtils.getText(driver, billingCompanyNameLabel);
	}

	public String getBillingContactNumberLabel() {
		return ElementUtils.getText(driver, billingContactNumberLabel);
	}

	public String getBillingAlternateContactNumberLabel() {
		return ElementUtils.getText(driver, billingAlternateContactNumberLabel);
	}

	public String getBillingEmailAddressLabel() {
		return ElementUtils.getText(driver, billingEmailAddressLabel);
	}

	private final By appDetailsHeaderLabel = By.xpath("//div[@data-qa='appDetails_header']/h2/span");

	public String getAppDetailsHeaderLabel() {
		return ElementUtils.getText(driver, appDetailsHeaderLabel);
	}

	private final By billingUserDetailsSectionHeader = By.xpath("//*[@data-qa='user_billing_header']");

	public String getBillingUserDetailsSectionHeader() {
		return ElementUtils.getText(driver, billingUserDetailsSectionHeader);
	}

	private final By rfaInstallationSessionLabel = By.xpath("//div[@data-qa='rfa_installation_session']/h2/span");

	public String getRequestedDateTimeSlotLabel() {
		return ElementUtils.getText(driver, rfaInstallationSessionLabel);
	}

//	private final By userDetailsCompanyNameLabel = By.xpath("//*[@data-qa='user-form']//*[@data-qa='company_name_label']");
	private final By userDetailsCompanyNameLabel = By.xpath("//*[@data-qa='last_name_label']/../following-sibling::div/label[@data-qa='company_name_label']");

	public boolean isUserDetailsCompanyNameLabelDisplayed() {
		return ElementUtils.isDisplayed(driver, userDetailsCompanyNameLabel);
	}

	public String getUserDetailsCompanyNameLabel() {
		return ElementUtils.getText(driver, userDetailsCompanyNameLabel);
	}
}
