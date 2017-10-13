package com.amdocs.nlt.amendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.oders.ManageTPRRRObject;
import com.amdocs.nlt.page.ManageTpRrrPage;

public class ManageTpRRRTest extends CommonAmendTest {

	@Test(enabled = true)
	public void amendSuccessfulTest_Schedule1_Pending() throws InterruptedException {
		manageTPTests(false, false);
	}

	@Test(enabled = true)
	public void amendSuccessfulTest_Schedule2_Pending() throws InterruptedException {
		manageTPTests(true, false);
	}

	private void manageTPTests(boolean isSchedule2, boolean isCompleted) throws InterruptedException {
		dashboardPage.moveToOrderManagementLink().clickManageTPRRRLink();
		if (!isCompleted && !isSchedule2)
			dashboardPage.navigateToView_Pending(1);
		else if (!isCompleted && isSchedule2)
			dashboardPage.navigateToView_Pending(2);

		ManageTpRrrPage manageTPPage = new ManageTpRrrPage(driver);

		ManageTPRRRObject fibreWithoutServiceObject = manageTPPage.fillManageTPRRRObject();
		manageTPPage.clickAmendButton();

		manageTPPage.getHeader();

		Assert.assertFalse(manageTPPage.isBuildingNumberEnabled());
		Assert.assertFalse(manageTPPage.isBuildingNameEnabled());
		Assert.assertFalse(manageTPPage.isStreetNameEnabled());
		// Assert.assertFalse(darkFibrePage.isBuildingTypeEnabled());Commented
		// becvause of bug
		// Assert.assertFalse(darkFibrePage.isCopifTypeEnabled()); Commented
		// becvause of bug

		Assert.assertTrue(manageTPPage.isSalutationEnabled());
		Assert.assertTrue(manageTPPage.isFirstNameEnabled());
		Assert.assertTrue(manageTPPage.isLastNameEnabled());

		if (isSchedule2) {
			Assert.assertTrue(manageTPPage.isCompanyNameDisplayed());
			Assert.assertTrue(manageTPPage.isCompanyNameEnabled());
		} else {
			Assert.assertFalse(manageTPPage.isCompanyNameDisplayed());
		}
		Assert.assertTrue(manageTPPage.isContactNumberEnabled());
		Assert.assertTrue(manageTPPage.isAlternateContactNumberEnabled());
		Assert.assertTrue(manageTPPage.isEmailAddressEnabled());
		Assert.assertFalse(manageTPPage.isIdTypeEnabled());
		Assert.assertFalse(manageTPPage.isIdNumberEnabled());

		// testRequetedDateAndTimeFunc();

		manageTPPage.selectSameAsInstallationDetails();
		Thread.sleep(2000);
		verifyBillingDetailsSameAsInstallationDetails(fibreWithoutServiceObject, manageTPPage, isSchedule2);

		Assert.assertFalse(manageTPPage.isBillingPostalCodeEnabled());
		Assert.assertFalse(manageTPPage.isBillingUnitNumberEnabled());
		Assert.assertFalse(manageTPPage.isBillingBuildingNumberEnabled());
		Assert.assertFalse(manageTPPage.isBillingBuildingNameEnabled());
		Assert.assertFalse(manageTPPage.isBillingStreetNameEnabled());
		// Assert.assertFalse(darkFibrePage.isBillingBuildingTypeEnabled());
		// Commented because of bug
		Assert.assertFalse(manageTPPage.isBillingSalutationEnabled());
		Assert.assertFalse(manageTPPage.isBillingFirstNameEnabled());
		Assert.assertFalse(manageTPPage.isBillingLastNameEnabled());
		Assert.assertFalse(manageTPPage.isBillingContactNumberEnabled());
		Assert.assertFalse(manageTPPage.isBillingAlternateContactNumberEnabled());
		Assert.assertFalse(manageTPPage.isBillingEmailAddressEnabled());
		if (isSchedule2) {
			Assert.assertTrue(manageTPPage.isBillingCompanyNameDisplayed());
			Assert.assertFalse(manageTPPage.isBillingCompanyNameEnabled());
		} else {
			Assert.assertFalse(manageTPPage.isCompanyNameDisplayed());
		}
		manageTPPage.selectSameAsInstallationDetails();
		Thread.sleep(2000);
		Assert.assertTrue(manageTPPage.isBillingPostalCodeEnabled());
		Assert.assertTrue(manageTPPage.isBillingUnitNumberEnabled());
		Assert.assertTrue(manageTPPage.isBillingBuildingNumberEnabled());
		Assert.assertTrue(manageTPPage.isBillingBuildingNameEnabled());
		Assert.assertTrue(manageTPPage.isBillingStreetNameEnabled());
		// Assert.assertFalse(darkFibrePage.isBillingBuildingTypeEnabled());
		// Commented because of bug

		Assert.assertTrue(manageTPPage.isBillingSalutationEnabled());
		Assert.assertTrue(manageTPPage.isBillingFirstNameEnabled());
		Assert.assertTrue(manageTPPage.isBillingLastNameEnabled());
		Assert.assertTrue(manageTPPage.isBillingContactNumberEnabled());
		Assert.assertTrue(manageTPPage.isBillingAlternateContactNumberEnabled());
		Assert.assertTrue(manageTPPage.isBillingEmailAddressEnabled());
		if (isSchedule2) {
			Assert.assertTrue(manageTPPage.isBillingCompanyNameDisplayed());
			Assert.assertTrue(manageTPPage.isBillingCompanyNameEnabled());
		} else {
			Assert.assertFalse(manageTPPage.isCompanyNameDisplayed());
		}

		// testRequestingLicenseeFunc();

		manageTPPage.clickAmendSubmitButton_1();

		testSuccessPage("The Manage TP (RRR) Service : Amend request has been submitted successfully.");
	}

	private void verifyBillingDetailsSameAsInstallationDetails(ManageTPRRRObject manageTPRRRObject,
			ManageTpRrrPage manageTpRrrPage, boolean isSchedule2) {

		Assert.assertEquals(manageTpRrrPage.getBillingPostalCode(), manageTPRRRObject.getPostalCode());
		Assert.assertEquals(manageTpRrrPage.getBillingUnitNumber(), manageTPRRRObject.getUnitNumber());
		Assert.assertEquals(manageTpRrrPage.getBillingBuildingNumber(), manageTPRRRObject.getBuildingNumber());
		Assert.assertEquals(manageTpRrrPage.getBillingBuildingName(), manageTPRRRObject.getBuildingName());
		Assert.assertEquals(manageTpRrrPage.getBillingStreetName(), manageTPRRRObject.getStreetName());
		// Assert.assertEquals(darkFibrePage.getBillingBuildingType(),
		// fibreWithoutServiceObject.getBuildingType()); Commented becvause of
		// bug
		Assert.assertEquals(manageTpRrrPage.getBillingSalutation(), manageTPRRRObject.getSalutation());
		Assert.assertEquals(manageTpRrrPage.getBillingFirstName(), manageTPRRRObject.getFirstName());
		Assert.assertEquals(manageTpRrrPage.getBillingLastName(), manageTPRRRObject.getLastName());
		Assert.assertEquals(manageTpRrrPage.getBillingContactNumber(), manageTPRRRObject.getContactNumber());
		Assert.assertEquals(manageTpRrrPage.getBillingAlternateContactNumber(),
				manageTPRRRObject.getAlternateContactNumber());
		Assert.assertEquals(manageTpRrrPage.getBillingEmailAddress(), manageTPRRRObject.getEmailAddress());
		if (isSchedule2) {
			Assert.assertEquals(manageTpRrrPage.getBillingCompanyName(), manageTPRRRObject.getCompanyName());
		}
	}
}
