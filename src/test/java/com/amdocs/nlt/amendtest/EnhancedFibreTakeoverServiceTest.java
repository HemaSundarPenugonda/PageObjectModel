package com.amdocs.nlt.amendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.oders.CommonDataObject;
import com.amdocs.nlt.page.EnhancedFibreTakeoverServicePage;
import com.amdocs.nlt.util.Utilities;
import com.amdocs.nlt.viewtest.CommonViewTest;

public class EnhancedFibreTakeoverServiceTest extends CommonViewTest {

	@Test(enabled = true)
	public void enhancedFibreTakeOverServiceAmendTest_Schedule1_Pending() throws Exception {
		enhancedFibreTakeOverServiceCreateTest(false, false);
	}

	@Test(enabled = true)
	public void enhancedFibreTakeOverServiceAmendTest_Schedule2_Pending() throws Exception {
		enhancedFibreTakeOverServiceCreateTest(true, false);
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
		// Thread.sleep(1000);
		eftsPage.clickAmendButton();

		checkApplicationDetailsComponent();

		Assert.assertFalse(eftsPage.isScheduleDropdownValueEnabled());
		Assert.assertFalse(eftsPage.isPostalCodeTextBoxEnabled());
		Assert.assertFalse(eftsPage.isunitNumberTextBoxEnabled());
		// Assert.assertFalse(ftsPage.isAdditionalInfoValueEnabled());
		// Assert.assertFalse(eftsPage.isPrefInstallSessionDropdownEnabled());

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

		// testRequetedDateAndTimeFunc();

		Assert.assertFalse(eftsPage.isSubmitButtonEnabled_Bug());
		CommonDataObject userDetails = new Utilities().prepareCommonData();
		eftsPage.enterARI(userDetails.getApplicationReference_success());
		eftsPage.clickSubmitButton_Bug();
		testSuccessPage("The Enhanced Fibre Takeover Service : Amend request has been submitted successfully.");

	}
}
