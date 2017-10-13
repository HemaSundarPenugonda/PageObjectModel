package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.util.ElementUtils;

public class CommonViewPage extends CommonComponentPage {

	public CommonViewPage(WebDriver driver) {
		super(driver);
	}

	/* Application Details */
	protected final By currentStatusLabel = By.xpath("//*[@data-qa='currentStatus']");
	protected final By currentStatusValue = By.xpath("//*[@data-qa='currentStatus_value']");
	protected final By appDetailsORILabel = By.xpath("//label[@data-qa='appDetails_ORI_label']");
	protected final By appDetailsORIValue = By.xpath("//label[@data-qa='appDetails_ORI_value']");
	protected final By appDetailsCINLabel = By.xpath("//label[@data-qa='appDetails_CIN_label']");
	protected final By appDetailsCINValue = By.xpath("//label[@data-qa='appDetails_CIN_value']");
	protected final By ariHeaderLabel = By.xpath("//*[@id='newAriForm']/div/label/span");
	protected final By ariInputTextBox = By.xpath("//form[@id='newAriForm']/div/div[1]//*[@id='identifier']");
	protected final By appDetailsDOALabel = By.xpath("//label[@data-qa='appDetails_DOA_label']");
	protected final By appDetailsDOAValue = By.xpath("//label[@data-qa='appDetails_DOA_value']");
	protected final By appDetailsTPDLabel = By.xpath("//label[@data-qa='appDetails_TPD_label']");
	protected final By appDetailsTPDValue = By.xpath("//label[@data-qa='appDetails_TPD_value']");
	protected final By appDetailsRPDLabel = By.xpath("//label[@data-qa='appDetails_RPD_label']");
	protected final By appDetailsRPDvalue = By.xpath("//label[@data-qa='appDetails_RPD_value']");
	protected final By appDetailsRORlabel = By.xpath("//label[@data-qa='appDetails_ROR_label']");
	protected final By appDetailsRORvalue = By.xpath("//label[@data-qa='appDetails_ROR_value']");

	protected final By cureentStatusValue = By.xpath("//div[@data-qa='currentStatus_value']");

	// locators for buttons on view order page
	protected final By modfiyButton = By.xpath("//button[@data-qa='modify_button']");
	protected final By cancelButton = By.xpath("//button[@data-qa='cancel_button']");
	protected final By terminateButton = By.xpath("//button[@data-qa='terminate_button']");

	/* Site Survey Date & Time Slot page object */
	protected final By activationDateLabel = By.xpath("//label[@data-qa='activation_date_label']");
	protected final By installationSessionLabel = By.xpath("//label[@data-qa='installation_session_label']");
	protected final By daypicker = By.xpath(".//*[@id='daypicker_rfa']");
	protected final By timepickerDropDown = By.xpath("//*[@id='timepicker']");
	private final By ariTextBox = By.xpath("//form[@id='newAriForm']/div/div[1]//*[@id='identifier']");
	private final By appDetailsRPDValue = By.xpath("//label[@data-qa='appDetails_RPD_value']");
	
	private final By coverageStatusLabel = By.xpath("//label[@data-qa='coverage_status_label']");
	private final By chargesLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By buildingNameLabel = By.xpath("//label[@data-qa='building_name_label']");
	private final By buildingNumberLabel = By.xpath("//label[@data-qa='building_number_label']");
	private final By buildingTypeLabel = By.xpath("//label[@data-qa='building_type_label']");
	private final By copifTypeLabel = By.xpath("//label[@data-qa='copif_type_label']");
	private final By salutationLabel = By.xpath("//label[@data-qa='salutation_label']");
	private final By firstNameLabel = By.xpath("//label[@data-qa='first_name_label']");
	private final By lastNameLabel = By.xpath("//label[@data-qa='last_name_label']");
	private final By contactNumberLabel = By.xpath("//label[@data-qa='contact_number_label']");
	private final By altNumberLabel = By.xpath("//label[@data-qa='alt_number_label']");
	private final By emailAddressLabel = By.xpath("//label[@data-qa='email_address_label']");
	private final By idTypeLabel = By.xpath("//label[@data-qa='idType_label']");
	private final By streetNameLabel = By.xpath("//label[@data-qa='street_name_label']");
	private final By idNumberLabel = By.xpath("//label[@data-qa='id_number_label']");
	

	public boolean isAppDetailsRORPresent() {
		// return driver.findElement(appDetailsRORvalue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsRORvalue).isDisplayed();
	}

	public boolean isAppDetailsRPDValuePresent() {
		// return driver.findElement(appDetailsRPDValue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsRPDValue).isDisplayed();
	}

	public boolean isCurrentStatusOfViewOrderValuePresent() {
		// return driver.findElement(cureentStatusValue).isDisplayed();
		return ElementUtils.getElement(driver, cureentStatusValue).isDisplayed();
	}

	public String getCurrentStatusOfViewOrder() {
//		System.out.println("current status" + ElementUtils.getText(driver, cureentStatusValue));
		return ElementUtils.getText(driver, cureentStatusValue);
	}

	public boolean isModifyButtonPresent() {
		if (getCurrentStatusOfViewOrder().equals("Pending")) {
			// return driver.findElement(cancelButton).isDisplayed();
			return ElementUtils.getElement(driver, cancelButton).isDisplayed();
		}

		return false;
	}

	public boolean isActionDropdownValuesCorrect() throws InterruptedException {
		if ((getCurrentStatusOfViewOrder().equals("Pending"))) {
			return areActionDropdownaValuesCorrectForCurrentStaus_Pending();
		}

		return false;

	}

	public boolean isSubmitRequestButtonAppearsOnModifyOderButtonClick() {
		if (isModifyButtonPresent()) {
			// driver.findElement(modfiyButton).click();
			ElementUtils.findElementForClick(driver, modfiyButton).click();
			// return driver.findElement(submitRequestButton).isDisplayed();
			return isSubmitRequestButtonDisplayed();
		}
		return false;
	}

	public boolean isSubmitRequestButtonAppearsOnCancelOderButtonClick() throws InterruptedException {
		if (isActionDropdownValuesCorrect()) {
			clickOnCancelOrderButton();
			Thread.sleep(2000);
			return isSubmitRequestButtonEnabled();
		}
		return false;
	}

	public boolean isSubmitRequestButtonAppearsOnTerminateOderButtonClick() throws InterruptedException {
		clickOnTerminateOrderButton();
		Thread.sleep(2000);
		return isSubmitRequestButtonDisplayed();
	}

	/*
	 * private boolean isTerminateButtonPresent() {
	 * 
	 * // return driver.findElement(terminateButton).isDisplayed(); return
	 * ElementUtils.getElement(driver, terminateButton).isDisplayed(); }
	 */

	// theses methods belongs to
	public String getAppDetailsRPDLabel() {
		return ElementUtils.getText(driver, appDetailsRPDLabel);
	}

	public boolean isAppDetailsTPDValuePresent() {
		// return driver.findElement(appDetailsTPDValue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsTPDValue).isDisplayed();
	}

	public String getAppDetailsTPDLabel() {
		return ElementUtils.getText(driver, appDetailsTPDLabel);
	}

	public boolean isAppDetailsDOAValuePresent() {
		// return driver.findElement(appDetailsDOAValue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsDOAValue).isDisplayed();
	}

	public String getAppDetailsDOALabel() {
		return ElementUtils.getText(driver, appDetailsDOALabel);
	}

	public boolean isAriInputTextBoxDisable() {
		return isDisabled(ariInputTextBox);
	}

	public String getAriHeaderLabel() {
		return ElementUtils.getText(driver, ariHeaderLabel);
	}

	public boolean isAriHeaderLabelDisplayed() {
		return ElementUtils.isDisplayed(driver, ariHeaderLabel);
	}

	public boolean isAppDetailsCINValuePresent() {
		// return driver.findElement(appDetailsCINValue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsCINValue).isDisplayed();
	}

	public String getAppDetailsCINLabel() {
		return ElementUtils.getText(driver, appDetailsCINLabel);
	}

	public boolean isAppDetailsORIValuePresent() {
		// return driver.findElement(appDetailsORIValue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsORIValue).isDisplayed();
	}

	public String getAppDetailsORILabel() {
		return ElementUtils.getText(driver, appDetailsORILabel);
	}

	public boolean isCurrentStatusValuePresent() {
		// return driver.findElement(currentStatusValue).isDisplayed();
		return ElementUtils.getElement(driver, currentStatusValue).isDisplayed();
	}

	public String getCurrentStatusLabel() {
		return ElementUtils.getText(driver, currentStatusLabel);
	}

	public boolean isAppDetailsRORvaluePresent() {

		// return driver.findElement(appDetailsRORvalue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsRORvalue).isDisplayed();
	}

	public String getAppDetailsRORlabel() {
		return ElementUtils.getText(driver, appDetailsRORlabel);
	}

	public boolean isappDetailsRPDvaluePresent() {

		// return driver.findElement(appDetailsRPDvalue).isDisplayed();
		return ElementUtils.getElement(driver, appDetailsRPDvalue).isDisplayed();
	}

	// These are method for Site Survey Date and Time slot

	public String getActivationDateLabel() {
		return ElementUtils.getText(driver, activationDateLabel);
	}

	public String getInstallationSessionLabel() {
		return ElementUtils.getText(driver, installationSessionLabel);
	}

	public boolean isTimepickerDropDownDisable() {
		return isDisabled(timepickerDropDown);
	}

	public boolean isDaypickerDisable() {
		return isDisabled(daypicker);
	}

	public boolean isAriTextBoxPresent() {
		return checkTextBoxDisable(ariTextBox);
	}
	// common method chk for disabled fuctinality

	/**
	 * @param element
	 * @return This method is use to verify field is enable or disable on screen
	 */
	public boolean isDisabled(By element) {
		// return (!driver.findElement(element).isEnabled());
		return (!ElementUtils.getElement(driver, element).isEnabled());
	}

	// dkasjhdkas
	public boolean isRedundancyServiceRequiredRadioButtonDisable() {
		return isDisabled(requriedRadioButton);
	}

	public boolean isRedundancyServiceNotRequiredRadioButtonDisable() {
		return isDisabled(notRequriedRadioButton);
	}

	public boolean isRedundancyRejectRequestRadioButtonDisable() {
		return isDisabled(rejectRadioButton);
	}

	public boolean isRedundancyDoNotRejectRequestRadioButtonDisable() {
		return isDisabled(notRejectRadioButton);
	}

	public void clickRequestingLincenseeComponent() {
		// driver.findElement(By.xpath("//div[@data-qa='request_top_label']")).click();
		ElementUtils.getElement(driver, By.xpath("//div[@data-qa='request_top_label']")).click();
	}

	public void clickCancelButton() {
		ElementUtils.clickObject(driver, cancelButton);
	}

	/**
	 * @param element
	 * @return This method is use to verify field is enable or disable on screen
	 */
	public boolean checkTextBoxDisable(By element) {

		// if (driver.findElement(element).isEnabled()) {
		if (ElementUtils.getElement(driver, element).isEnabled()) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}
	
	public String getInstallationChargeLabel() {
		return ElementUtils.getText(driver, chargesLabel);
	}
	
	public String getBuildingNameLabel() {
		return ElementUtils.getText(driver, buildingNameLabel);
	}
	
	public String getSalutationLabel() {
		return ElementUtils.getText(driver, salutationLabel);
	}
	
	public String getStreetNameLabel() {
		return ElementUtils.getText(driver, streetNameLabel);
	}
	
	public String getFirstNameLabel() {
		return ElementUtils.getText(driver, firstNameLabel);
	}
	
	public String getLastNameLabel() {
		return ElementUtils.getText(driver, lastNameLabel);
	}
	
	public String getIDTypeLabel() {
		return ElementUtils.getText(driver, idTypeLabel);
	}
	
	public String getBuildingNumberLabel() {
		return ElementUtils.getText(driver, buildingNumberLabel);
	}
	
	public String getBuildingTypeLabel() {
		return ElementUtils.getText(driver, buildingTypeLabel);
	}
	
	public String getCopifTypeLabel() {
		return ElementUtils.getText(driver, copifTypeLabel);
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
	
	public String getIdNumberLabel() {
		return ElementUtils.getText(driver, idNumberLabel);
	}
	
	private final By priorityCircuitSection = By.xpath("//*[@data-qa='priority_circuit_header']");
	private final By priorityCircuitLabel = By.xpath("//*[@data-qa='priority_charge_indicator_label']");
	private final By priorityCircuit_required = By.xpath("//*[@data-qa='priorityCircuit_required']");
	private final By priorityCircuit_notRequired = By.xpath("//*[@data-qa='priorityCircuit_not_required']");

	public String getPriorityCircuitSectionName(){
		return ElementUtils.getText(driver, priorityCircuitSection);
	}

	public String getPriorityCircuitLabel(){
		return ElementUtils.getText(driver, priorityCircuitLabel);
	}

	public boolean isPriorityCircuit_requiredDisplayed(){
		return ElementUtils.isDisplayed(driver, priorityCircuit_required);
	}

	public boolean isPriorityCircuit_notRequiredDisplayed(){
		return ElementUtils.isDisplayed(driver, priorityCircuit_notRequired);
	}


}
