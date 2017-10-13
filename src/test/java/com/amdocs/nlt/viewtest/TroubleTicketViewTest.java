package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.TroubleTicketViewPage;

public class TroubleTicketViewTest extends CommonViewTest{
	
	@Test(enabled = true)
	public void testTicketSummaryComponent() throws Exception {
		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt().navigateToTroubleTktViewUrl("/ViewTTPending");
		TroubleTicketViewPage troubleTicketViewPage = new TroubleTicketViewPage(driver);
		Assert.assertEquals(troubleTicketViewPage.getCurrentStatusLabel(), "Ticket Status","Ticket Status label should be present but it is not");
		Assert.assertTrue(troubleTicketViewPage.isCurrentStatusValueLabelPresent(),"Ticket Status value label should be present but it is not");
		
		Assert.assertEquals(troubleTicketViewPage.getIncidentTypeLabel(), "Incident Type","Incident Type label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getTicketIdLabel(), "NLT Incident Ticket ID","NLT Incident Ticket ID label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getIncidentIdLabel(), "OpCo Incident ID","OpCo Incident ID label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getOriLabel(), "Order Request Identifier","Order Request Identifier label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getSeverityLabel(), "Severity","Ticket Status label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getRemarksLabel(), "Remarks","Remarks label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getPrimaryCauseLabel(), "Primary Cause","Primary Cause label should be present but it is not");
		
		Assert.assertTrue(troubleTicketViewPage.isIncidentTypeInputDropdownDisable(),"Incident Type Dropdown should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isTicketIdInputTextBoxDisable(),"NLT Incident Ticket ID value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isIncidentIdInputTextBoxDisable(),"OpCo Incident ID value Text Box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isOriInputTextBoxDisable(),"Order Request Identifier value text Box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isSeverityValueLabelPresent(),"Severity value label should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isRemarksInputTextBoxDisable(),"Remarks value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isPrimaryCauseInputTextBoxDisable(),"TPrimary Cause value text box should be disable but it is not");
		
	}
	
	
	@Test(enabled = true)
	public void testTicketDetailsComponent() throws Exception {
		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt().navigateToTroubleTktViewUrl("/ViewTTPending");
		TroubleTicketViewPage troubleTicketViewPage = new TroubleTicketViewPage(driver);
		Assert.assertEquals(troubleTicketViewPage.getScheduleNameLabel(), "Schedule Name","Schedule Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getTicketClassificationLabel(), "Classification","Classification label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getPriorityCircuitLabel(), "Priority Circuit","Priority Circuit label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getServiceUnavailLabel(), "Service Unavailability","Service Unavailability label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getServicesImpactedLabel(), "Number of Services Impacted","Number of Services Impacted label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getTicketSummaryLabel(), "Ticket Summary","Ticket Summary should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getTicketDescriptionLabel(), "Ticket Description","Ticket Description label should be present but it is not");
		
		Assert.assertTrue(troubleTicketViewPage.isScheduleNameValueDropdownDisable(),"Schedule Name drop down should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isTicketClassificationTextBoxDisable(),"Classification value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isPriorityCircuitYesRadioButtonDisable(),"Priority Circuit value radio button should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isPriorityCircuitNoRadioButtonDisable(),"Priority Circuitr value radio button should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isUnavailabilityYesRadioButtonDisable(),"Service Unavailability radio button should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isUnavailabilityNoRadioButtonDisable(),"Service Unavailability radio button should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isServicesImpactedTextBoxDisable(),"Number of Services Impacted text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isTicketSummaryTextBoxDisable(),"Ticket Summary text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isTicketDescriptionTextAreaDisable(),"Ticket Description value text box should be disable but it is not");
	}
	

	@Test(enabled = true)
	public void testEndUserPrimaryContactDetailsWithCopIfType() throws Exception {
		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt().navigateToTroubleTktViewUrl("/ViewTTPending");
		TroubleTicketViewPage troubleTicketViewPage = new TroubleTicketViewPage(driver);
		
		Assert.assertEquals(troubleTicketViewPage.getFirstNameLabel(), "First Name","First Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getLastNameLabel(), "Last Name","Last Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getContactNumberLabel(), "Contact Number","Contact Number label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getEmailAddressLabel(), "Email Address","Email Address label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getBuildingNumberLabel(), "Block/House Number","Block/House Number Impacted label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getBuildingNameLabel(), "Building Name","Building Name should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getStreetNameLabel(), "Street Name","Street Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getCopifTypeLabel(), "COPIF Type","COPIF Type label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getPostalCodeLabel(), "Postal Code","Postal Code should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getUnitNumberLabel(), "Unit Number","Unit Number label should be present but it is not");
		
		Assert.assertTrue(troubleTicketViewPage.isFirstNameTextBoxDisable(),"First Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isLastNameTextBoxDisable(),"Last Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isContactNumberTextBoxDisable(),"Contact Number text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isEmailAddressTextBoxDisable(),"Email Address text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isBuildingNumberDropDownDisable(),"Block/House Number text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isBuildingNameTextBoxDisable(),"Building Name text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isStreetNameTextBoxDisable(),"Street Name text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isCopifTypeTextBoxDisable(),"COPIF Type text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isPostalCodeTextBoxDisable(),"Postal Code value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isUnitNumberTextBoxDisable(),"Unit Number value text box should be disable but it is not");
	}
	
	@Test(enabled = true)
	public void testTicketDetailsComponentWithOutCopIfType() throws Exception {
		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt().navigateToTroubleTktViewUrl("/ViewTTSchedule2");
		TroubleTicketViewPage troubleTicketViewPage = new TroubleTicketViewPage(driver);
		
		Assert.assertEquals(troubleTicketViewPage.getFirstNameLabel(), "First Name","First Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getLastNameLabel(), "Last Name","Last Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getContactNumberLabel(), "Contact Number","Contact Number label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getEmailAddressLabel(), "Email Address","Email Address label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getBuildingNumberLabel(), "Block/House Number","Block/House Number Impacted label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getBuildingNameLabel(), "Building Name","Building Name should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getStreetNameLabel(), "Street Name","Street Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getPostalCodeLabel(), "Postal Code","Postal Code should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getUnitNumberLabel(), "Unit Number","Unit Number label should be present but it is not");
		
		Assert.assertTrue(troubleTicketViewPage.isFirstNameTextBoxDisable(),"First Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isLastNameTextBoxDisable(),"Last Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isContactNumberTextBoxDisable(),"Contact Number text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isEmailAddressTextBoxDisable(),"Email Address text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isBuildingNumberDropDownDisable(),"Block/House Number text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isBuildingNameTextBoxDisable(),"Building Name text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isStreetNameTextBoxDisable(),"Street Name text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isPostalCodeTextBoxDisable(),"Postal Code value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isUnitNumberTextBoxDisable(),"Unit Number value text box should be disable but it is not");
	}

	@Test(enabled = true)
	public void testEndUserSecondaryContactDetails() throws Exception {
		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt().navigateToTroubleTktViewUrl("/ViewTTSchedule2");
		TroubleTicketViewPage troubleTicketViewPage = new TroubleTicketViewPage(driver);
		Assert.assertEquals(troubleTicketViewPage.getFirstNameSCLabel(), "First Name","First Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getLastNameSCLabel(), "Last Name","Last Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getContactNumberSCLabel(), "Contact Number","Contact Number label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getEmailAddressSCLabel(), "Email Address","Email Address label should be present but it is not");
		
		Assert.assertTrue(troubleTicketViewPage.isFirstNameBillingDisable(),"First Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isLastNameBillingDisable(),"Last Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isContactNumberBillingDisable(),"Contact Number text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isEmailAddressBillingdisable(),"Email Address text box should be disable but it is not");
	}
	
	@Test(enabled = true)
	public void testRLFieldStaffContactDetails() throws Exception {
		
		dashboardPage.clickOnTroubleTicket().clickOnTroubleTkt().navigateToTroubleTktViewUrl("/ViewTTSchedule2");
		TroubleTicketViewPage troubleTicketViewPage = new TroubleTicketViewPage(driver);
		Assert.assertEquals(troubleTicketViewPage.getFirstNameRLLabel(), "First Name","First Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getLastNameRLLabel(), "Last Name","Last Name label should be present but it is not");
		Assert.assertEquals(troubleTicketViewPage.getContactNumberRLLabel(), "Contact Number","Contact Number label should be present but it is not");
		
		Assert.assertTrue(troubleTicketViewPage.isFirstNameFieldStaffDisable(),"First Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isLastNameFieldStaffDisable(),"Last Name value text box should be disable but it is not");
		Assert.assertTrue(troubleTicketViewPage.isContactNumberFieldStaffDisable(),"Contact Number text box should be disable but it is not");
		super.testRequestingLicenseeFunc();
		
		}
}
