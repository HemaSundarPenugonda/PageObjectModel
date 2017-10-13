package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.Assert;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import com.amdocs.nlt.viewpages.CommonViewPage;

public class CommonViewTest extends CommonComponentPageTest {

	public void checkApplicationDetailsComponent() throws InterruptedException {

		CommonViewPage viewPage = new CommonViewPage(driver);
		Assert.assertEquals(viewPage.getCurrentStatusLabel(), "Current Status",
				"Current Status label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		/*
		 * Assert.assertEquals(viewPage.getAppDetailsCINLabel(),
		 * "Circuit Identifier Number",
		 * "Circuit Identifier Number label should be present but it is not ");
		 */
		Assert.assertEquals(viewPage.getAriHeaderLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(viewPage.isCurrentStatusValuePresent(),
				"Current status value should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsORIValuePresent(),
				"Order Request Identifier value should be present but it is not ");
		/*
		 * Assert.assertTrue(viewPage.isAppDetailsCINValuePresent(),
		 * "Circuit Identifier Number value should be present but it is not ");
		 */
		/*
		 * Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.
		 * isAriInputTextBoxDisable(),
		 * "Application Reference Identifier value field should be disable but it is not "
		 * );
		 */ // To do Not working while it should work
		Assert.assertTrue(viewPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should be present but it is not ");
		Assert.assertTrue(viewPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsRORvaluePresent(),
				"Reason for Rejection should be present but it is not ");
		/*
		 * Assert.assertTrue(viewPage.isModifyButtonPresent(),
		 * "modify button should be present when current status is pending");
		 * Assert.assertTrue(viewPage.isCancelButtonPresent(),
		 * " cancel button should be present when current status is pending");
		 */

	}

	/**
	 * Overridden the method to suit to Dark fibre functionality Removed ARI
	 * field specific tests from parent method
	 */
	public void checkApplicationDetailsComponentWothoutARI() {
		CommonViewPage viewPage = new CommonViewPage(driver);
		Assert.assertEquals(viewPage.getCurrentStatusLabel(), "Current Status",
				"Current Status label should be present but it is not ");

		Assert.assertFalse(viewPage.isAriHeaderLabelDisplayed());

		Assert.assertEquals(viewPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		/*
		 * Assert.assertEquals(viewPage.getAppDetailsCINLabel(),
		 * "Circuit Identifier Number",
		 * "Circuit Identifier Number label should be present but it is not ");
		 */
		Assert.assertEquals(viewPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(viewPage.isCurrentStatusValuePresent(),
				"Current status value should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsORIValuePresent(),
				"Order Request Identifier value should be present but it is not ");
		/*
		 * Assert.assertTrue(viewPage.isAppDetailsCINValuePresent(),
		 * "Circuit Identifier Number value should be present but it is not ");
		 */
		/*
		 * Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.
		 * isAriInputTextBoxDisable(),
		 * "Application Reference Identifier value field should be disable but it is not "
		 * );
		 */ // To do Not working while it should work
		Assert.assertTrue(viewPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should be present but it is not ");
		Assert.assertTrue(viewPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsRORvaluePresent(),
				"Reason for Rejection should be present but it is not ");
		/*
		 * Assert.assertTrue(viewPage.isModifyButtonPresent(),
		 * "modify button should be present when current status is pending");
		 * Assert.assertTrue(viewPage.isCancelButtonPresent(),
		 * " cancel button should be present when current status is pending");
		 */
	}

	public void checkSiteSurveyDateAndTimeSlotComponent() {

		CommonViewPage viewPage = new CommonViewPage(driver);
		Assert.assertEquals(viewPage.getActivationDateLabel(), "Site Survey Date",
				"Site Survey Date label should be present but it is not.");
		Assert.assertEquals(viewPage.getInstallationSessionLabel(), "Preferred Site Survey Session",
				"Preferred Site Survey Session Name label should be present but it is not.");
		Assert.assertTrue(viewPage.isTimepickerDropDownDisable(), "Order Type value should be present but it is not.");
		Assert.assertTrue(viewPage.isDaypickerDisable(), "Order Type value should be present but it is not.");
	}

	public void checkTechnicalDetailComponent() throws InterruptedException {
		CommonViewPage viewPage = new CommonViewPage(driver);

		Assert.assertEquals(viewPage.getRedundancyServiceLabel(), "Redundancy Service",
				"Redundancy Service label should be present but it is not.");

		Assert.assertEquals(viewPage.getIncaseOfreduandanycSeviceLabel(), "In case redundancy service is unavailable",
				"In case redundancy service is unavailable label should be present but it is not.");
		Assert.assertTrue(viewPage.isRedundancyServiceRequiredRadioButtonDisable(),
				"Redundancy Service Required Radio Button should be Disable but it is not");
		Assert.assertTrue(viewPage.isRedundancyServiceNotRequiredRadioButtonDisable(),
				"Redundancy Service Not Required Radio Button Disable should be Disable but it is not");
		Assert.assertTrue(viewPage.isRedundancyRejectRequestRadioButtonDisable(),
				"Redundancy Reject Request Radio Button Disable should be Disable but it is not");
		Assert.assertTrue(viewPage.isRedundancyDoNotRejectRequestRadioButtonDisable(),
				"Redundancy Do Not Reject Request Radio Button Disable should be Disable but it is not");
	}

	public void testRequestingLicenseeFunc() {
		CommonComponentPage order = new CommonComponentPage(driver);
		Assert.assertEquals(order.getRequestinglicenseeLabel(), "Requesting Licensee Name",
				"For REQUESTING LICENSEE component:Label Requesting Licensee Name*  "
						+ "should be present but it is not ");
		Assert.assertEquals(order.getDesignationLabel(), "Designation",
				"For REQUESTING LICENSEE component:Label Designation* " + "should be present but it is not ");
		Assert.assertEquals(order.getRlCompanyNameLabel(), "Company Name",
				"For REQUESTING LICENSEE component:Label Company Name* " + "should be present but it is not ");
		Assert.assertEquals(order.getContactNumber_RL_Label(), "Contact Number",
				"For REQUESTING LICENSEE component:Label  contactNumber* " + "should be present but it is not ");
		Assert.assertEquals(order.getFaxNumberLabel(), "Fax Number",
				"For REQUESTING LICENSEE component:Label faxNumber* " + "should be present but it is not ");
		Assert.assertEquals(order.getEmailAddress_RL_Label(), "Email Address",
				"For REQUESTING LICENSEE component:Label emailAddress " + "should be present but it is not ");
	}

	public void testCSODetailsFieldLabels() {
		CommonComponentPage order = new CommonComponentPage(driver);

		Assert.assertEquals(order.getRequestinglicenseeLabel(), "CSO Name",
				"For REQUESTING LICENSEE component:Label Requesting Licensee Name*  "
						+ "should be present but it is not ");
		Assert.assertEquals(order.getDesignationLabel(), "Designation",
				"For REQUESTING LICENSEE component:Label Designation* " + "should be present but it is not ");
		Assert.assertEquals(order.getRlCompanyNameLabel(), "Company Name",
				"For REQUESTING LICENSEE component:Label Company Name* " + "should be present but it is not ");
		Assert.assertEquals(order.getContactNumber_RL_Label(), "Contact Number",
				"For REQUESTING LICENSEE component:Label  contactNumber* " + "should be present but it is not ");
		Assert.assertEquals(order.getFaxNumberLabel(), "Fax Number",
				"For REQUESTING LICENSEE component:Label faxNumber* " + "should be present but it is not ");
		Assert.assertEquals(order.getEmailAddress_RL_Label(), "Email Address",
				"For REQUESTING LICENSEE component:Label emailAddress " + "should be present but it is not ");
	}

	public void checkApplicationDetailsComponentForChangeTechnologyView() throws Exception {

		CommonViewPage viewPage = new CommonViewPage(driver);
		Assert.assertEquals(viewPage.getCurrentStatusLabel(), "Current Status",
				"Current Status label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		/*
		 * Assert.assertEquals(viewPage.getAppDetailsCINLabel(),
		 * "Circuit Identifier Number",
		 * "Circuit Identifier Number label should be present but it is not ");
		 */
		Assert.assertEquals(viewPage.getAriHeaderLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(viewPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(viewPage.isCurrentStatusValuePresent(),
				"Current status value should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsORIValuePresent(),
				"Order Request Identifier value should be present but it is not ");
		/*
		 * Assert.assertTrue(viewPage.isAppDetailsCINValuePresent(),
		 * "Circuit Identifier Number value should be present but it is not ");
		 */
		Assert.assertTrue(viewPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should be present but it is not ");
		Assert.assertTrue(viewPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete should be present but it is not ");
		Assert.assertTrue(viewPage.isAppDetailsRORvaluePresent(),
				"Reason for Rejection should be present but it is not ");
	}

	public void checkEndUserInstallationDetailsView(int i) {
		CommonViewPage viewPage = new CommonViewPage(driver);
		Assert.assertEquals(viewPage.getCoverageStatusLabel(), "Coverage Status",
				"Coverage Status Label should present but it is not");
		Assert.assertEquals(viewPage.getBuildingNumberLabel(), "Building Number",
				"Building Number Label should present but it is not");
		Assert.assertEquals(viewPage.getBuildingNameLabel(), "Building Name",
				"Building Name Label should present but it is not");
		Assert.assertEquals(viewPage.getStreetNameLabel(), "Street Name",
				"Street Name Label should present but it is not");
		if (i == 1){
			Assert.assertEquals(viewPage.getBuildingTypeLabel(), "Building Type",
					"Building Type Label should present but it is not");
			Assert.assertEquals(viewPage.getCopifTypeLabel(), "COPIF Type",
					"COPIF Type Label should present but it is not");
		}
		Assert.assertEquals(viewPage.getInstallationChargeLabel(), "Installation Charge",
				"Installation Charge Label should present but it is not");
		Assert.assertEquals(viewPage.getSalutationLabel(), "Salutation",
				"Salutation Label should present but it is not");
		Assert.assertEquals(viewPage.getFirstNameLabel(), "First Name",
				"First Name Label should present but it is not");
		Assert.assertEquals(viewPage.getLastNameLabel(), "Last Name", "Last Name Label should present but it is not");
		Assert.assertEquals(viewPage.getContactNumberLabel(), "Contact Number",
				"Contact Number Label should present but it is not");
		Assert.assertEquals(viewPage.getAltNumberLabel(), "Alternate Contact Number",
				"Alternate Contact Number Label should present but it is not");
		Assert.assertEquals(viewPage.getEmailAddressLabel(), "Email Address",
				"Email Address Label should present but it is not");
		Assert.assertEquals(viewPage.getIDTypeLabel(), "ID Type", "ID Type Label should present but it is not");
		Assert.assertEquals(viewPage.getIdNumberLabel(), "ID Number", "ID Number Label should present but it is not");

	}

	public void testPriorityCircuitSection(){
		CommonViewPage page = new CommonViewPage(driver);
		Assert.assertEquals(page.getPriorityCircuitSectionName(), "Priority Circuit Details");
		Assert.assertEquals(page.getPriorityCircuitLabel(), "Priority Charge Indicator");
		Assert.assertTrue(page.isPriorityCircuit_requiredDisplayed());
		Assert.assertTrue(page.isPriorityCircuit_notRequiredDisplayed());

	}

}
