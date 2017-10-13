package com.amdocs.nlt.amendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.oders.CommonDataObject;
import com.amdocs.nlt.page.FibreTakeOverServicePage;
import com.amdocs.nlt.util.Utilities;

public class FibreTakeoverServiceTest extends CommonAmendTest {

	@Test(enabled = true)
	public void fibreTakeOverServiceAmendTest_Schedule1_Pending() throws Exception {
		fibreTakeOverServiceAmendTest(false, false);
	}

	@Test(enabled = true)
	public void fibreTakeOverServiceAmendTest_Schedule2_Pending() throws Exception {
		fibreTakeOverServiceAmendTest(true, false);
	}

	private void fibreTakeOverServiceAmendTest(boolean isSchedule2, boolean isCompleted) throws Exception {

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
		ftsPage.clickAmendButton();
		// checkApplicationDetailsComponent();

		Assert.assertTrue(ftsPage.isAriTextboxEnabled());
		Assert.assertFalse(ftsPage.isScheduleDropdownValueEnabled());
		Assert.assertFalse(ftsPage.isPostalCodeTextBoxEnabled());
		Assert.assertFalse(ftsPage.isunitNumberTextBoxEnabled());
		// Assert.assertFalse(ftsPage.isAdditionalInfoValueEnabled());
		Assert.assertTrue(ftsPage.isPrefInstallSessionDropdownEnabled());

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

		// testRequetedDateAndTimeFunc();

		Assert.assertFalse(ftsPage.isAmendOrderButtonEnabled());
		Assert.assertTrue(ftsPage.isNewARILabelEnabled());
		CommonDataObject userDetails = new Utilities().prepareCommonData();
		ftsPage.enterARI(userDetails.getApplicationReference_success());
		ftsPage.clickAmendSubmitButton_1();

		testSuccessPage("The Fibre Takeover Service : Amend request has been submitted successfully.");
	}
}
