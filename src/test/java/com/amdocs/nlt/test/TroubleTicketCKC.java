package com.amdocs.nlt.test;

import java.awt.AWTException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import com.amdocs.nlt.page.TroubleTicketCKCPage;
import com.amdocs.nlt.util.ElementUtils;



public class TroubleTicketCKC extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testIncidentTypeComponent() throws InterruptedException, URISyntaxException {

		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt();
		
		TroubleTicketCKCPage ticketCKCPage = new TroubleTicketCKCPage(driver);
		
		Assert.assertEquals(ticketCKCPage.getIncidentLabel(), "Incident Type*",
				"Incident Type* Label should present but it is not");
		ticketCKCPage.incidentDropDown();
		Assert.assertEquals(ticketCKCPage.getIncidentIdLabel(), "OpCo Incident ID*",
				"OpCo Incident ID* Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getCoLocationAddressLabel(), "Co-Location Address*",
				"Co-Location Address* Label should present but it is not");
		ticketCKCPage.coLocationAddresValueDropdown();
		Assert.assertEquals(ticketCKCPage.getFileInputLabel(), "Upload ORI List*",
				"Upload ORI List* Label should present but it is not");
//		ticketCKCPage.enterIncidentId().fileUplaod1();
		
	}
	
	@Test(enabled = true)
	public void testTicketDetailsComponent() throws InterruptedException  {

		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt();
		
		TroubleTicketCKCPage ticketCKCPage = new TroubleTicketCKCPage(driver);
		ticketCKCPage.incidentDropDown();
		Assert.assertEquals(ticketCKCPage.getTicketClassificationLabel(), "Classification",
				"Classification Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getSeverityLabel(), "Severity",
				"Severity* Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getServiceUnavailLabel(), "Service Unavailability",
				"Service Unavailability Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getServicesImpactedLabel(), "Number of Services Impacted*",
				"Number of Services Impacted* Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getticketSummaryLabel(), "Ticket Summary*",
				"Ticket Summary* Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getTicketDescriptionLabel(), "Ticket Description",
				"Ticket Description Label should present but it is not");
		
		Assert.assertTrue(ticketCKCPage.isTicketClassificationTextBoxDisable(),
				"Ticket Classification Text Box should disable but it is not");
		Assert.assertTrue(ticketCKCPage.isSeverityDropdownDisable(),
				"Severity Dropdown should disable but it is not");
		Assert.assertTrue(ticketCKCPage.isUnavailabilityYesRadioButtonDisable(),
				"Unavailability Yes Radio Button  should disable but it is not");
		Assert.assertTrue(ticketCKCPage.isUnavailabilityNoRadioButtonDisable(),
				"Unavailability No Radio Button  should disable but it is not");
		
		}
	
	@Test(enabled = true)
	public void testRLFieldStaffContactDetailsComponent() throws InterruptedException, URISyntaxException, AWTException  {

		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt();
		
		TroubleTicketCKCPage ticketCKCPage = new TroubleTicketCKCPage(driver);
		ticketCKCPage.incidentDropDown().enterIncidentId().coLocationAddresValueDropdown();
//		ticketCKCPage.fileUplaod();
		ElementUtils.performFileUplaod(driver, "TroubleTicket_CKC.txt");
		ticketCKCPage.enterServicesImpacted().ticketSummaryDropdown().enterTicketDescription().clickOnRlFieldStaffLink();
		Assert.assertEquals(ticketCKCPage.getFirstNameLabel(), "First Name",
				"First Name Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getLastNameLabel(), "Last Name",
				"Last Name Label should present but it is not");
		Assert.assertEquals(ticketCKCPage.getContactNumberLabel(), "Contact Number",
				"Contact Number Label should present but it is not");
		ticketCKCPage.enterFirstNameBillingTextBox().enterLastNameBillingTextBox().enterContactNumberTextBox();
//		ticketCKCPage.fileUplaod(ticketCKCPage.browseAndUploadButton2, ticketCKCPage.fileUpload2);
		ElementUtils.performFileUplaod(driver, ticketCKCPage.fileUpload2, "TroubleTicket_CKC.txt");
		super.testRequestingLicenseeFunc();
		ticketCKCPage.clickOnSubmitButton();
		ticketCKCPage.VerifyConfirmationMessage();
		
	}
}
