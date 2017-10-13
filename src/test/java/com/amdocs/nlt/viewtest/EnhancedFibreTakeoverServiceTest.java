package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.EnhancedFibreTakeoverServicePage;

public class EnhancedFibreTakeoverServiceTest extends CommonViewTest {

	@Test(enabled = true)
	public void enhancedFibreTakeOverServiceCreateTest_Schedule1_Pending() throws Exception {
		enhancedFibreTakeOverServiceCreateTest(false, false);
	}

	@Test(enabled = true)
	public void enhancedFibreTakeOverServiceCreateTest_Schedule2_Pending() throws Exception {
		enhancedFibreTakeOverServiceCreateTest(true, false);
	}

	@Test(enabled = true)
	public void enhancedFibreTakeOverServiceCreateTest_Schedule1_Completed() throws Exception {
		enhancedFibreTakeOverServiceCreateTest(false, true);
	}

	@Test(enabled = true)
	public void enhancedFibreTakeOverServiceCreateTest_Schedule2_Completed() throws Exception {
		enhancedFibreTakeOverServiceCreateTest(true, true);
	}

	private void enhancedFibreTakeOverServiceCreateTest(boolean isSchedule2, boolean isCompleted) throws Exception {
		dashboardPage.clickEnhancedFibreTakeoverService();
		if (!isSchedule2 && !isCompleted)
			dashboardPage.navigateToView_Pending(1);
		else if (isSchedule2 && !isCompleted)
			dashboardPage.navigateToView_Pending(2);
		else if (!isSchedule2 && isCompleted)
			dashboardPage.navigateToView_Completed(1);
		else
			dashboardPage.navigateToView_Completed(2);

		EnhancedFibreTakeoverServicePage eftsPage = new EnhancedFibreTakeoverServicePage(driver);
		Thread.sleep(1000);

		checkApplicationDetailsComponent();

		Assert.assertFalse(eftsPage.isScheduleDropdownValueEnabled());
		Assert.assertFalse(eftsPage.isPostalCodeTextBoxEnabled());
		Assert.assertFalse(eftsPage.isunitNumberTextBoxEnabled());
		// Assert.assertFalse(ftsPage.isAdditionalInfoValueEnabled());
		Assert.assertFalse(eftsPage.isPrefInstallSessionDropdownEnabled());

		Assert.assertFalse(eftsPage.isBuildingNumberEnabled());
		Assert.assertFalse(eftsPage.isBuildingNameEnabled());
		Assert.assertFalse(eftsPage.isStreetNameEnabled());
		if (!isSchedule2) {
			Assert.assertFalse(eftsPage.isBuildingTypeEnabled());
			Assert.assertFalse(eftsPage.isCopifTypeEnabled());
		} else if (isSchedule2) {
			Assert.assertFalse(eftsPage.isBuildingTypeDisplayed());
			Assert.assertFalse(eftsPage.isCopifTypeDisplayed());
		}

		Assert.assertFalse(eftsPage.isSalutationEnabled());
		Assert.assertFalse(eftsPage.isFirstNameEnabled());
		Assert.assertFalse(eftsPage.isLastNameEnabled());
		if (!isSchedule2) {
			Assert.assertFalse(eftsPage.isCompanyNameDisplayed());
		} else if (isSchedule2) {
			Assert.assertTrue(eftsPage.isCompanyNameDisplayed());
			Assert.assertFalse(eftsPage.isCompanyNameEnabled());
		}
		Assert.assertFalse(eftsPage.isContactNumberEnabled());
		Assert.assertFalse(eftsPage.isAlternateContactNumberEnabled());
		Assert.assertFalse(eftsPage.isEmailAddressEnabled());

		Assert.assertEquals(eftsPage.getUploadReqDocsLabel(), "Upload Required Documents*");
		Assert.assertTrue(eftsPage.isUploadedFilesDisplayed());

		Assert.assertFalse(eftsPage.isCalenderIconPresent());
		Assert.assertTrue(eftsPage.isAmendOrderOptionExistsInActionDropdown());
		if (!isCompleted) {
			Assert.assertTrue(eftsPage.isCancelOrderOptionExistsInActionDropdown());
		} else {
		}
	}
}
