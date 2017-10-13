package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.RequestForFiberWithputServicePage;
import com.amdocs.nlt.viewpages.CommonViewPage;

public class FibreWithoutServiceTest extends CommonViewTest {

	@Test(enabled = true, description = "US1464")
	public void fibreWithoutServiceCreateTest_Schedule1_Pending() throws Exception {
		fibreWithoutServiceCreateTest(false, false);
	}

	@Test(enabled = true, description = "US1464")
	public void fibreWithoutServiceCreateTest_Schedule2_Pending() throws Exception {
		fibreWithoutServiceCreateTest(true, false);
	}

	@Test(enabled = true, description = "US1464")
	public void fibreWithoutServiceCreateTest_Schedule1_Completed() throws Exception {
		fibreWithoutServiceCreateTest(false, true);
	}

	@Test(enabled = true, description = "US1464")
	public void fibreWithoutServiceCreateTest_Schedule2_Completed() throws Exception {
		fibreWithoutServiceCreateTest(true, true);
	}

	private void fibreWithoutServiceCreateTest(boolean isSchedule2, boolean isCompleted) throws Exception {

		// StartPage startpage = new StartPage(driver);
		dashboardPage.moveToOrderManagementLink().clickFiberWithServiceLink();
		if (!isSchedule2 && !isCompleted)
			dashboardPage.navigateToView_Pending(1);
		else if (isSchedule2 && !isCompleted)
			dashboardPage.navigateToView_Pending(2);
		else if (!isSchedule2 && isCompleted)
			dashboardPage.navigateToView_Completed(1);
		else
			dashboardPage.navigateToView_Completed(2);

		RequestForFiberWithputServicePage page = new RequestForFiberWithputServicePage(driver);
		Thread.sleep(1000);

		checkApplicationDetailsComponent();

		Assert.assertFalse(page.isScheduleDropdownValueEnabled());
		Assert.assertFalse(page.isPostalCodeTextBoxEnabled());
		Assert.assertFalse(page.isunitNumberTextBoxEnabled());
		// Assert.assertFalse(ftsPage.isAdditionalInfoValueEnabled());
		Assert.assertFalse(page.isPrefInstallSessionDropdownEnabled());

		Assert.assertFalse(page.isBuildingNumberEnabled());
		Assert.assertFalse(page.isBuildingNameEnabled());
		Assert.assertFalse(page.isStreetNameEnabled());
		if (!isSchedule2) {
			Assert.assertFalse(page.isBuildingTypeEnabled());
			Assert.assertFalse(page.isCopifTypeEnabled());
		} else {
			Assert.assertFalse(page.isBuildingTypeDisplayed());
			Assert.assertFalse(page.isCopifTypeDisplayed());
		}

		Assert.assertFalse(page.isSalutationEnabled());
		Assert.assertFalse(page.isFirstNameEnabled());
		Assert.assertFalse(page.isLastNameEnabled());
		if (!isSchedule2) {
			Assert.assertFalse(page.isCompanyNameDisplayed());
		} else {
			Assert.assertTrue(page.isCompanyNameDisplayed());
			Assert.assertFalse(page.isCompanyNameEnabled());
		}

		Assert.assertFalse(page.isContactNumberEnabled());
		Assert.assertFalse(page.isAlternateContactNumberEnabled());
		Assert.assertFalse(page.isEmailAddressEnabled());
		Assert.assertFalse(page.isCalenderIconPresent());
		if (!isCompleted) {
			Assert.assertTrue(page.isAmendOrderOptionExistsInActionDropdown());
			Assert.assertTrue(page.isCancelOrderOptionExistsInActionDropdown());
		} else {
			Assert.assertFalse(page.isAmendOrderButtonDisplayed());
			Assert.assertFalse(page.isCancelButtonDisplayed());
		}

	}

	/**
	 * Overridden the method to suit to Dark fibre functionality Removed ARI
	 * field specific tests from parent method
	 */
	public void checkApplicationDetailsComponent() {
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
}
