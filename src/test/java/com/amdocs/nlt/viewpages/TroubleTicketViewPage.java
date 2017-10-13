package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class TroubleTicketViewPage extends CommonViewPage {

	private final By currentStatusLabel = By.xpath("//*[@data-qa='ticketStatus']");
	private final By currentStatusValueLabel = By.xpath("//*[@data-qa='currentStatus_value']");

	/* Ticket Summary */
	private final By incidentTypeLabel = By.xpath("//*[@data-qa='incidentType_label']");
	private final By ticketIdLabel = By.xpath("//*[@data-qa='ticketId_label']");
	private final By incidentIdLabel = By.xpath("//*[@data-qa='incidentId_label']");
	private final By oriLabel = By.xpath("//*[@data-qa='ori_label']");
	private final By severityLabel = By.xpath("//*[@data-qa='severity_label']");
	private final By remarksLabel = By.xpath("//*[@data-qa='remarks_label']");
	private final By primaryCauseLabel = By.xpath("//*[@data-qa='primaryCause_label']");

	private final By incidentTypeInputDropdown = By.xpath("//*[@data-qa='incidentType_input']");
	private final By ticketIdInputTextBox = By.xpath("//*[@data-qa='ticketId_input']");
	private final By incidentIdInputTextBox = By.xpath("//*[@data-qa='incidentId_input']");
	private final By oriInputTextBox = By.xpath("//*[@data-qa='ori_input']");
	private final By severityValueLabel = By.xpath("//*[@data-qa='severity_value']");
	private final By remarksInputTextBox = By.xpath("//*[@data-qa='remarks_input']");
	private final By primaryCauseInputTextBox = By.xpath("//*[@data-qa='primaryCause_input']");

	/* Ticket Details */

	private final By scheduleNameLabel = By.xpath("//*[@data-qa='scheduleName_label']");
	private final By ticketClassificationLabel = By.xpath("//*[@data-qa='ticket_classification_label']");
	private final By priorityCircuitLabel = By.xpath("//*[@data-qa='priority_circuit']");
	private final By serviceUnavailLabel = By.xpath("//*[@data-qa='service_unavail_label']");
	private final By servicesImpactedLabel = By.xpath("//*[@data-qa='services_impacted_label']");
	private final By ticketSummaryLabel = By.xpath("//*[@data-qa='ticket_summary_label']");
	private final By ticketDescriptionLabel = By.xpath("//*[@data-qa='ticketDescription_label']");

	private final By scheduleNameValueDropdown = By.xpath("//*[@data-qa='scheduleName_value']");
	private final By ticketClassificationTextBox = By.xpath("//*[@data-qa='ticket_classification']");
	private final By priorityCircuitYesRadioButton = By.xpath("//*[@data-qa='priority_circuit_yes']");
	private final By priorityCircuitNoRadioButton = By.xpath("//*[@data-qa='priority_circuit_no']");
	private final By unavailabilityYesRadioButton = By.xpath("//*[@data-qa='unavailability_yes']");
	private final By unavailabilityNoRadioButton = By.xpath("//*[@data-qa='unavailability_no']");
	private final By servicesImpactedTextBox = By.xpath("//*[@data-qa='services_impacted']");
	private final By ticketSummaryTextBox = By.xpath("//*[@data-qa='ticket_summary']");
	private final By ticketDescriptionTextArea = By.xpath("//*[@data-qa='ticket_description']");
	
	/* End user primary contact details */
	
	private final By firstNameLabel = By.xpath("(//*[@data-qa='first_name_label']/span)[1]");
	private final By lastNameLabel = By.xpath("(//*[@data-qa='last_name_label']/span)[1]");
	private final By contactNumberLabel = By.xpath("(//*[@data-qa='contact_number_label']/span)[1]");
	private final By emailAddressLabel = By.xpath("(//*[@data-qa='email_address_label']/span)[1]");
	private final By buildingNumberLabel = By.xpath("//*[@data-qa='building_number_label']");
	private final By buildingNameLabel = By.xpath("//*[@data-qa='building_name_label']");
	private final By streetNameLabel = By.xpath("//*[@data-qa='street_name_label']");
	private final By copifTypeLabel = By.xpath("//*[@data-qa='copif_type_label']");
	private final By postalCodeLabel = By.xpath("//*[@data-qa='postal_code_label']");
	private final By unitNumberLabel = By.xpath("//*[@data-qa='unit_number_label']");
	
	private final By firstNameTextBox = By.xpath("//*[@data-qa='first_name']");
	private final By lastNameTextBox = By.xpath("//*[@data-qa='last_name']");
	private final By contactNumberTextBox = By.xpath("//*[@data-qa='contact_number']");
	private final By emailAddressTextBox = By.xpath("//*[@data-qa='email_address']");
	private final By buildingNumberDropDown = By.xpath("//*[@data-qa='building_number']");
	private final By buildingNameTextBox = By.xpath("//*[@data-qa='building_name']");
	private final By streetNameTextBox = By.xpath("//*[@data-qa='street_name']");
	private final By copifTypeTextBox = By.xpath("//*[@data-qa='copif_type']");
	private final By postalCodeTextBox = By.xpath("//*[@data-qa='postal_code']");
	private final By unitNumberTextBox = By.xpath("//*[@data-qa='unit_number']");
	
	/* End User Secondary Contact Details */
	private final By firstNameSCLabel = By.xpath("(//*[@data-qa='first_name_label']/span)[2]");
	private final By lastNameSCLabel = By.xpath("(//*[@data-qa='last_name_label']/span)[2]");
	private final By contactNumberSCLabel = By.xpath("(//*[@data-qa='contact_number_label']/span)[2]");
	private final By emailAddressSCLabel = By.xpath("(//*[@data-qa='email_address_label']/span)[2]");
	
	private final By firstNameBilling = By.xpath("//*[@data-qa='first_name_billing']");
	private final By lastNameBilling = By.xpath("//*[@data-qa='last_name_billing']");
	private final By contactNumberBilling = By.xpath("//*[@data-qa='contact_number_billing']");
	private final By emailAddressBilling = By.xpath("//*[@data-qa='email_address_billing']");
	
	/*RL Field Staff Contact Details*/
	private final By firstNameRLLabel = By.xpath("(//*[@data-qa='first_name_label']/span)[3]");
	private final By lastNameRLLabel = By.xpath("(//*[@data-qa='last_name_label']/span)[3]");
	private final By contactNumberRLLabel = By.xpath("(//*[@data-qa='contact_number_label']/span)[3]");
	
	private final By firstNameFieldStaff = By.xpath("//*[@data-qa='first_name_fieldStaff']");
	private final By lastNameFieldStaff = By.xpath("//*[@data-qa='last_name_fieldStaff']");
	private final By contactNumberFieldStaff = By.xpath("//*[@data-qa='contact_number_fieldStaff']");
	
	/*RL Field Staff Contact Details*/
	
	public boolean isFirstNameFieldStaffDisable() {
		return ElementUtils.isDisabled(driver, firstNameFieldStaff);
	}

	public boolean isLastNameFieldStaffDisable() {
		return ElementUtils.isDisabled(driver, lastNameBilling);
	}

	public boolean isContactNumberFieldStaffDisable() {
		return ElementUtils.isDisabled(driver, contactNumberBilling);
	}
	
	public String getFirstNameRLLabel() {
		return ElementUtils.getText(driver,firstNameRLLabel);
	}

	public String getLastNameRLLabel() {
		return ElementUtils.getText(driver,lastNameRLLabel);
	}

	public String getContactNumberRLLabel() {
		return ElementUtils.getText(driver,contactNumberRLLabel);
	}
	
	
	/* End User Secondary Contact Details */
	
	public boolean isFirstNameBillingDisable() {
		return ElementUtils.isDisabled(driver, firstNameBilling);
	}

	public boolean isLastNameBillingDisable() {
		return ElementUtils.isDisabled(driver, lastNameBilling);
	}

	public boolean isContactNumberBillingDisable() {
		return ElementUtils.isDisabled(driver, contactNumberBilling);
	}

	public boolean isEmailAddressBillingdisable() {
		return ElementUtils.isDisabled(driver, emailAddressBilling);
	}
	
	public String getFirstNameSCLabel() {
		return ElementUtils.getText(driver,firstNameSCLabel);
	}

	public String getLastNameSCLabel() {
		return ElementUtils.getText(driver,lastNameSCLabel);
	}

	public String getContactNumberSCLabel() {
		return ElementUtils.getText(driver,contactNumberSCLabel);
	}

	public String getEmailAddressSCLabel() {
		return ElementUtils.getText(driver,emailAddressSCLabel);
	}
	
	/* End user primary contact details */
	
	public boolean isFirstNameTextBoxDisable() {
		return ElementUtils.isDisabled(driver, firstNameTextBox);
	}

	public boolean isLastNameTextBoxDisable() {
		return ElementUtils.isDisabled(driver, lastNameTextBox);
	}

	public boolean isContactNumberTextBoxDisable() {
		return ElementUtils.isDisabled(driver, contactNumberTextBox);
	}

	public boolean isEmailAddressTextBoxDisable() {
		return ElementUtils.isDisabled(driver, emailAddressTextBox);
	}

	public boolean isBuildingNumberDropDownDisable() {
		return ElementUtils.isDisabled(driver, buildingNumberDropDown);
	}
	

	public boolean isBuildingNameTextBoxDisable() {
		return ElementUtils.isDisabled(driver, buildingNameTextBox);
	}
	
	public boolean isStreetNameTextBoxDisable() {
		return ElementUtils.isDisabled(driver, streetNameTextBox);
	}
	
	public boolean isCopifTypeTextBoxDisable() {
		return ElementUtils.isDisabled(driver, copifTypeTextBox);
	}
	
	public boolean isPostalCodeTextBoxDisable() {
		return ElementUtils.isDisabled(driver, postalCodeTextBox);
	}
	
	public boolean isUnitNumberTextBoxDisable() {
		return ElementUtils.isDisabled(driver, unitNumberTextBox);
	}
	
	
	public boolean streetNameTextBox() {
		return ElementUtils.isDisabled(driver, streetNameTextBox);
	}

	public boolean copifTypeTextBox() {
		return ElementUtils.isDisabled(driver, copifTypeTextBox);
	}

	public boolean postalCodeTextBox() {
		return ElementUtils.isDisabled(driver, postalCodeTextBox);
	}

	public boolean unitNumberTextBox() {
		return ElementUtils.isDisabled(driver, unitNumberTextBox);
	}
	
	public String getFirstNameLabel() {
		return ElementUtils.getText(driver,firstNameLabel);
	}

	public String getLastNameLabel() {
		return ElementUtils.getText(driver,lastNameLabel);
	}

	public String getContactNumberLabel() {
		return ElementUtils.getText(driver,contactNumberLabel);
	}

	public String getEmailAddressLabel() {
		return ElementUtils.getText(driver,emailAddressLabel);
	}

	public String getBuildingNumberLabel() {
		return ElementUtils.getText(driver,buildingNumberLabel);
	}

	public String getBuildingNameLabel() {
		return ElementUtils.getText(driver,buildingNameLabel);
	}
	
	public String getStreetNameLabel() {
		return ElementUtils.getText(driver,streetNameLabel);
	}

	public String getCopifTypeLabel() {
		return ElementUtils.getText(driver,copifTypeLabel);
	}
	
	public String getPostalCodeLabel() {
		return ElementUtils.getText(driver,postalCodeLabel);
	}

	public String getUnitNumberLabel() {
		return ElementUtils.getText(driver,unitNumberLabel);
	}

	

	/* Ticket Details */

	public boolean isScheduleNameValueDropdownDisable() {
		return ElementUtils.isDisabled(driver, scheduleNameValueDropdown);
	}

	public boolean isTicketClassificationTextBoxDisable() {
		return ElementUtils.isDisabled(driver, ticketClassificationTextBox);
	}

	public boolean isPriorityCircuitYesRadioButtonDisable() {
		return ElementUtils.isDisabled(driver, priorityCircuitYesRadioButton);
	}

	public boolean isPriorityCircuitNoRadioButtonDisable() {
		return ElementUtils.isDisabled(driver, priorityCircuitNoRadioButton);
	}

	public boolean isUnavailabilityYesRadioButtonDisable() {
		return ElementUtils.isDisabled(driver, unavailabilityYesRadioButton);
	}

	public boolean isUnavailabilityNoRadioButtonDisable() {
		return ElementUtils.isDisabled(driver, unavailabilityNoRadioButton);
	}

	public boolean isServicesImpactedTextBoxDisable() {
		return ElementUtils.isDisabled(driver, servicesImpactedTextBox);
	}

	public boolean isTicketSummaryTextBoxDisable() {
		return ElementUtils.isDisabled(driver, ticketSummaryTextBox);
	}

	public boolean isTicketDescriptionTextAreaDisable() {
		return ElementUtils.isDisabled(driver, ticketDescriptionTextArea);
	}

	public String getScheduleNameLabel() {
		return ElementUtils.getText(driver,scheduleNameLabel);
	}

	public String getTicketClassificationLabel() {
		return ElementUtils.getText(driver,ticketClassificationLabel);
	}

	public String getPriorityCircuitLabel() {
		return ElementUtils.getText(driver,priorityCircuitLabel);
	}

	public String getServiceUnavailLabel() {
		return ElementUtils.getText(driver,serviceUnavailLabel);
	}

	public String getServicesImpactedLabel() {
		return ElementUtils.getText(driver,servicesImpactedLabel);
	}

	public String getTicketSummaryLabel() {
		return ElementUtils.getText(driver,ticketSummaryLabel);
	}

	public String getTicketDescriptionLabel() {
		return ElementUtils.getText(driver,ticketDescriptionLabel);
	}

	/* Ticket Summary */

	public boolean isIncidentTypeInputDropdownDisable() {
		return ElementUtils.isDisabled(driver, incidentTypeInputDropdown);
	}

	public boolean isTicketIdInputTextBoxDisable() {
		return ElementUtils.isDisabled(driver, ticketIdInputTextBox);
	}

	public boolean isIncidentIdInputTextBoxDisable() {
		return ElementUtils.isDisabled(driver, incidentIdInputTextBox);
	}

	public boolean isOriInputTextBoxDisable() {
		return ElementUtils.isDisabled(driver, oriInputTextBox);
	}

	public boolean isSeverityValueLabelPresent() {
		return ElementUtils.getElement(driver, severityValueLabel).isDisplayed();
	}

	public boolean isRemarksInputTextBoxDisable() {
		return ElementUtils.isDisabled(driver, remarksInputTextBox);
	}

	public boolean isPrimaryCauseInputTextBoxDisable() {
		return ElementUtils.isDisabled(driver, primaryCauseInputTextBox);
	}

	public String getIncidentTypeLabel() {
		return ElementUtils.getText(driver,incidentTypeLabel);
	}

	public String getTicketIdLabel() {
		return ElementUtils.getText(driver,ticketIdLabel);
	}

	public String getIncidentIdLabel() {
		return ElementUtils.getText(driver,incidentIdLabel);
	}

	public String getOriLabel() {
		return ElementUtils.getText(driver,oriLabel);
	}

	public String getSeverityLabel() {
		return ElementUtils.getText(driver,severityLabel);
	}

	public String getRemarksLabel() {
		return ElementUtils.getText(driver,remarksLabel);
	}

	public String getPrimaryCauseLabel() {
		return ElementUtils.getText(driver,primaryCauseLabel);
	}

	
	public String getCurrentStatusLabel() {
		return ElementUtils.getText(driver,currentStatusLabel);
	}

	public boolean isCurrentStatusValueLabelPresent() {
		return ElementUtils.getElement(driver, currentStatusValueLabel).isDisplayed();
	}

	public TroubleTicketViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
}
