package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.FibreWithoutServiceOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class RequestForFiberWithputServicePage extends ResidentialEndUserConnectionPage {

	public RequestForFiberWithputServicePage(WebDriver driver) {
		super(driver);
	}

	private final By scheduleNameDropdown = By.xpath("//select[@data-qa='scheduleName_value']");
	private final By idTypeDropdown = By.xpath("//select[@data-qa='idType']");
	private final By idNumberTextBox = By.xpath("//input[@data-qa='id_number']");
	private final By darkFiberPageHeading = By.xpath("//h1[@data-qa='darkFibre-header']");
	private final By scheduleNameLabel = By.xpath("//label[@data-qa='scheduleName_label']");
	private final By amendViewScreenHeader = By.xpath("//*[@data-qa='managetpbyrrr_amendview_header']");
	private final By csoDetailLabel = By.xpath("//span[text()='CSO Details']");

	private final By endUserBillingDetailCheckbox = By.xpath(".//*[@id='formControlsCheckbox']");

	private final By messageForReconnectStatus = By
			.xpath("//span[text()='This is a case of Reconnect, please request Manage TP (RRR) order instead.']");

	public void checkDarkFiberFeasibility(int scheduleName) throws InterruptedException {
		Select selectScheduleName = new Select(ElementUtils.getElement(driver, scheduleNameDropdown));

		selectScheduleName.selectByIndex(scheduleName);
		super.submitFeasibility();
	}

	public void checkDarkFiberFeasibilityForReconnect(int i) throws InterruptedException {
		Select selectScheduleName = new Select(ElementUtils.getElement(driver, scheduleNameDropdown));
		selectScheduleName.selectByIndex(i);
		checkFeasibilityForReconnect();
	}

	public void populateDarkFiberoForm() throws InterruptedException {

		poulateResiUserDeatil();
		Select selectScheduleName = new Select(ElementUtils.getElement(driver, idTypeDropdown));

		selectScheduleName.selectByIndex(1);

		ElementUtils.getElement(driver, idNumberTextBox).sendKeys("12345ABCDE");
		ElementUtils.findElementForClick(driver, endUserBillingDetailCheckbox).click();

		selectCalendarDate();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();

	}

	public String getDarkFiberPageHeadingText() {
		return ElementUtils.getText(driver, darkFiberPageHeading);
	}

	public String getScheduleNameLabelText() {
		return ElementUtils.getText(driver, scheduleNameLabel);
	}

	public String getCSODetailLabel() {
		return ElementUtils.getText(driver, csoDetailLabel);

	}

	public String getMessageForReconnectStatus() {
		return ElementUtils.getText(driver, messageForReconnectStatus);
	}

	public String getPageHeaderForViewAmendScreen(){
		return ElementUtils.getText(driver, amendViewScreenHeader);
	}

	public boolean isIdTypeEnabled() {
		return ElementUtils.isEnabled(driver, idTypeDropdown);
	}

	public boolean isIdNumberEnabled(){
		return ElementUtils.isEnabled(driver, idNumberTextBox);
	}


	public FibreWithoutServiceOrder fillFibreWithoutServiceObject(){

		//Postal code and Unit number
		FibreWithoutServiceOrder.Builder builder = new FibreWithoutServiceOrder.Builder(ElementUtils.getSelectedValue(driver, scheduleNameDropdown), ElementUtils.getValue(driver, postalCodeTextBox), ElementUtils.getValue(driver, unitNumberTextBox));
		//End user installation details
		builder = builder.buildingNumber(getBuildingNumberValue())
				.buildingName(getBuildingNameValue())
				.streetName(getStreetNameValue())
//				.buildingType(getBuildingType()) Commented becvause of bug
//				.copifType(getCopifType()) Commented becvause of bug
				.salutation(ElementUtils.getSelectedValue(driver, salutationDropdown))
				.firstName(ElementUtils.getValue(driver, firstNameTextBox))
				.lastName(ElementUtils.getValue(driver, lastNameTextBox))
				.contactNumber(ElementUtils.getValue(driver, contactNumberTextBox))
				.alternateContactNumber(ElementUtils.getValue(driver, alternateContactNumberValue))
				.emailAddress(ElementUtils.getValue(driver, emailAddTextBox))
				.idType(ElementUtils.getSelectedValue(driver, idTypeDropdown))
				.idNumber(ElementUtils.getValue(driver, idNumberTextBox));
		if (isCompanyNameDisplayed()) {
			builder = builder.companyName(getCompanyName());
		}
		if (isBillingCompanyNameDisplayed()){
			builder = builder.billingCompanyName(getBillingCompanyName());
		}
		builder = builder.requestedDateOfActivation(ElementUtils.getValue(driver, reqDateOfActTextbox))
				.preferredInstallationSession(ElementUtils.getSelectedValue(driver, prefInstallSessionDropdown));
		//End user billing details
		builder = builder.billingPostalCode(ElementUtils.getValue(driver, billingPostalCode))
				.billingUnitNumber(ElementUtils.getValue(driver, billingUnitNumber))
				.billingBuildingNumber(ElementUtils.getValue(driver, billingBuildingNumber))
				.billingBuildingName(ElementUtils.getValue(driver, billingBuildingName))
				.billingStreetName(ElementUtils.getValue(driver, billingStreetName))
//				.billingBuildingType(getSelectedValue(billingBuildingType)) Commented becvause of bug
				.billingSalutation(ElementUtils.getSelectedValue(driver, billingSalutation))
				.billingFirstName(ElementUtils.getValue(driver, billingFirstName))
				.billingLastName(ElementUtils.getValue(driver, billingLastName))
				.billingContactNumber(ElementUtils.getValue(driver, billingContactNumber))
				.billingAlternateContactNumber(ElementUtils.getValue(driver, billingAlternateContactNumber))
				.billingEmailAddress(ElementUtils.getValue(driver, billingEmailAddress));

		FibreWithoutServiceOrder order = builder.build();

		return order;
		

	}

}