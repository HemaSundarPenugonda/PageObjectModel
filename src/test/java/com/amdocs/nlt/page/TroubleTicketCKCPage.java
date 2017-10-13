package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class TroubleTicketCKCPage extends CommonComponentPage {

	private final By incidentLabel = By.xpath("//*[@data-qa='incident_label']");
	private final By incidentDropDown = By.xpath("//select[@data-qa='incident_dropdown']");
	private final By incidentidLabel = By.xpath("//*[@data-qa='incidentid_label']");
	private final By incidentidValueTextBox = By.xpath("//*[@data-qa='incidentid_value']");
	private final By coLocationAddressLabel = By.xpath("//*[@data-qa='coLocationAddress_label']");
	private final By coLocationAddresValueDropdown = By.xpath("//select[@data-qa='coLocationAddress_value']");
	private final By fileInputLabel = By.xpath("//*[@data-qa='file_input_label']");

	// protected final By browseAndUploadButton =
	// By.xpath("//span[@data-qa='fileBrowseUpload_data_qa']");


	private final By ticketClassificationLabel = By.xpath("//*[@data-qa='ticket_classification_label']");
	private final By severityLabel = By.xpath("//*[@data-qa='severity_label']");
	private final By serviceUnavailLabel = By.xpath("//*[@data-qa='service_unavail_label']");
	private final By servicesImpactedLabel = By.xpath("//*[@data-qa='services_impacted_label']");
	private final By ticketSummaryLabel = By.xpath("//*[@data-qa='ticket_summary_label']");
	private final By ticketDescriptionLabel = By.xpath("//*[@data-qa='ticketDescription_label']");

	private final By ticketClassificationTextBox = By.xpath("//*[@data-qa='ticket_classification']");
	private final By severityDropdown = By.xpath("//*[@data-qa='severity']");
	private final By unavailabilityYesRadioButton = By.xpath("//*[@data-qa='unavailability_yes']");
	private final By unavailabilityNoRadioButton = By.xpath("//*[@data-qa='unavailability_no']");
	private final By servicesImpactedTextBox = By.xpath("//*[@data-qa='services_impacted']");
	private final By ticketSummaryDropdown = By.xpath("//*[@data-qa='ticket_summary']");
	private final By ticketDescriptionTextArea = By.xpath("//*[@data-qa='ticket_description']");
	
	private final By rlFieldStaffLink = By.xpath("//*[@data-qa='rlFieldStaff_link']");
	private final By firstNameLabel = By.xpath("//*[@data-qa='first_name_label']");
	private final By lastNameLabel = By.xpath("//*[@data-qa='last_name_label']");
	private final By contactNumberLabel = By.xpath("//*[@data-qa='contact_number_label']");
	
	
	private final By firstNameBillingTextBox = By.xpath("//*[@data-qa='first_name_fieldStaff']");
	private final By lastNameBillingTextBox = By.xpath("//*[@data-qa='last_name_fieldStaff']");
	private final By contactNumberTextBox = By.xpath("//*[@data-qa='contact_number_fieldStaff']");
	
	
	private final By submitButton = By.xpath("//*[@data-qa='submit_button']");
	
	public TroubleTicketCKCPage enterFirstNameBillingTextBox() {
		ElementUtils.getElement(driver, firstNameBillingTextBox).sendKeys("Manu");
		return this;
	}
	
	public TroubleTicketCKCPage enterLastNameBillingTextBox() {
		ElementUtils.getElement(driver, lastNameBillingTextBox).sendKeys("Chauhan");
		return this;
	}
	
	public TroubleTicketCKCPage enterContactNumberTextBox() {
		ElementUtils.getElement(driver, contactNumberTextBox).sendKeys("11111111");
		return this;
	}
	
	
	public TroubleTicketCKCPage clickOnRlFieldStaffLink() {
		ElementUtils.getElement(driver, rlFieldStaffLink).click();
		return this;
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

	public TroubleTicketCKCPage enterTicketDescription() {
		ElementUtils.getElement(driver, ticketDescriptionTextArea).sendKeys("Test Desac");
		return this;
	}

	public TroubleTicketCKCPage ticketSummaryDropdown() {
		Select selectCoorinateSystem = new Select(ElementUtils.getElement(driver, ticketSummaryDropdown));
		selectCoorinateSystem.selectByIndex(2);
		return this;
	}

	public TroubleTicketCKCPage enterServicesImpacted() {
		ElementUtils.getElement(driver, servicesImpactedTextBox).sendKeys("1");
		return this;
	}

	public boolean isTicketClassificationTextBoxDisable() {
		return !ElementUtils.getElement(driver, ticketClassificationTextBox).isEnabled();

	}

	public boolean isSeverityDropdownDisable() {
		return !ElementUtils.getElement(driver, severityDropdown).isEnabled();

	}

	public boolean isUnavailabilityYesRadioButtonDisable() {
		return !ElementUtils.getElement(driver, unavailabilityYesRadioButton).isEnabled();

	}

	public boolean isUnavailabilityNoRadioButtonDisable() {
		return !ElementUtils.getElement(driver, unavailabilityNoRadioButton).isEnabled();

	}

	public String getTicketClassificationLabel() {
		return ElementUtils.getText(driver,ticketClassificationLabel);
	}

	public String getSeverityLabel() {
		return ElementUtils.getText(driver,severityLabel);
	}

	public String getServiceUnavailLabel() {
		return ElementUtils.getText(driver,serviceUnavailLabel);
	}

	public String getServicesImpactedLabel() {
		return ElementUtils.getText(driver,servicesImpactedLabel);
	}

	public String getticketSummaryLabel() {
		return ElementUtils.getText(driver,ticketSummaryLabel);
	}

	public String getTicketDescriptionLabel() {
		return ElementUtils.getText(driver,ticketDescriptionLabel);
	}

	public TroubleTicketCKCPage(WebDriver driver) {
		super(driver);
	}

	public TroubleTicketCKCPage enterIncidentId() {
		ElementUtils.getElement(driver, incidentidValueTextBox).sendKeys("Test OpCo");
		return this;
	}

	public String getFileInputLabel() {
		return ElementUtils.getText(driver,fileInputLabel);
	}

	public String getIncidentLabel() {
		return ElementUtils.getText(driver,incidentLabel);
	}

	public String getIncidentIdLabel() {
		return ElementUtils.getText(driver,incidentidLabel);
	}

	public String getCoLocationAddressLabel() {
		return ElementUtils.getText(driver,coLocationAddressLabel);
	}

	public TroubleTicketCKCPage incidentDropDown() {
		Select selectCoorinateSystem = new Select(ElementUtils.getElement(driver, incidentDropDown));
		selectCoorinateSystem.selectByIndex(6);

		return this;
	}

	public TroubleTicketCKCPage coLocationAddresValueDropdown() {

		Select selectCoorinateSystem = new Select(
				ElementUtils.getElement(driver, coLocationAddresValueDropdown));
		selectCoorinateSystem.selectByIndex(4);

		return this;
	}
}
