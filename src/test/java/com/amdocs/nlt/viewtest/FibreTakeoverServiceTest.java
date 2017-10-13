package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.FibreTakeOverServicePage;

public class FibreTakeoverServiceTest extends CommonViewTest {

	@Test(enabled = true)
	public void fibreTakeOverServiceCreateTest_Schedule1_Pending() throws Exception {
		fibreTakeOverServiceCreateTest(false, false);
	}

	@Test(enabled = true)
	public void fibreTakeOverServiceCreateTest_Schedule2_Pending() throws Exception {
		fibreTakeOverServiceCreateTest(true, false);
	}

	@Test(enabled = true)
	public void fibreTakeOverServiceCreateTest_Schedule1_Completed() throws Exception {
		fibreTakeOverServiceCreateTest(false, true);
	}

	@Test(enabled = true)
	public void fibreTakeOverServiceCreateTest_Schedule2_Completed() throws Exception {
		fibreTakeOverServiceCreateTest(true, true);
	}

	private void fibreTakeOverServiceCreateTest(boolean isSchedule2, boolean isCompleted) throws Exception {

		dashboardPage.moveToOrderManagementLink().clickFibreTakeoverService();
		if (!isSchedule2 && !isCompleted)
			dashboardPage.navigateToView_Pending(1);
		else if (isSchedule2 && !isCompleted)
			dashboardPage.navigateToView_Pending(2);
		else if (!isSchedule2 && isCompleted)
			dashboardPage.navigateToView_Completed(1);
		else
			dashboardPage.navigateToView_Completed(2);
		FibreTakeOverServicePage ftsPage = new FibreTakeOverServicePage(driver);
		Thread.sleep(1000);

		checkApplicationDetailsComponent();

		Assert.assertFalse(ftsPage.isScheduleDropdownValueEnabled());
		Assert.assertFalse(ftsPage.isPostalCodeTextBoxEnabled());
		Assert.assertFalse(ftsPage.isunitNumberTextBoxEnabled());
		// Assert.assertFalse(ftsPage.isAdditionalInfoValueEnabled());
		Assert.assertFalse(ftsPage.isPrefInstallSessionDropdownEnabled());

		Assert.assertFalse(ftsPage.isBuildingNumberEnabled());
		Assert.assertFalse(ftsPage.isBuildingNameEnabled());
		Assert.assertFalse(ftsPage.isStreetNameEnabled());
		if (!isSchedule2) {
			Assert.assertFalse(ftsPage.isBuildingTypeEnabled());
			Assert.assertFalse(ftsPage.isCopifTypeEnabled());
		} else if (isSchedule2) {
			Assert.assertFalse(ftsPage.isBuildingTypeDisplayed());
			Assert.assertFalse(ftsPage.isCopifTypeDisplayed());
		}

		Assert.assertFalse(ftsPage.isSalutationEnabled());
		Assert.assertFalse(ftsPage.isFirstNameEnabled());
		Assert.assertFalse(ftsPage.isLastNameEnabled());
		if (!isSchedule2) {
			Assert.assertFalse(ftsPage.isCompanyNameDisplayed());
		} else if (isSchedule2) {
			Assert.assertTrue(ftsPage.isCompanyNameDisplayed());
			Assert.assertFalse(ftsPage.isCompanyNameEnabled());
		}

		Assert.assertFalse(ftsPage.isContactNumberEnabled());
		Assert.assertFalse(ftsPage.isAlternateContactNumberEnabled());
		Assert.assertFalse(ftsPage.isEmailAddressEnabled());
		Assert.assertFalse(ftsPage.isCalenderIconPresent());

		Assert.assertTrue(ftsPage.isAmendOrderOptionExistsInActionDropdown());
		if (!isCompleted) {

			Assert.assertTrue(ftsPage.isCancelOrderOptionExistsInActionDropdown());
		} else {
			Assert.assertFalse(ftsPage.isCancelButtonDisplayed());
		}
	}
}
