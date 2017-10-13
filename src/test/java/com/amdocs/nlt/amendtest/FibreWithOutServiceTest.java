package com.amdocs.nlt.amendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.oders.FibreWithoutServiceOrder;
import com.amdocs.nlt.page.RequestForFiberWithputServicePage;

public class FibreWithOutServiceTest extends CommonAmendTest {

	@Test(enabled = true)
	public void amendSuccessfulTest_Schedule1_Pending() throws InterruptedException {
		darkFibreTests(false, false);
	}

	@Test(enabled = true)
	public void amendSuccessfulTest_Schedule2_Pending() throws InterruptedException {
		darkFibreTests(true, false);
	}

	private void darkFibreTests(boolean isSchedule2, boolean isCompleted) throws InterruptedException {
		dashboardPage.moveToOrderManagementLink().clickFiberWithServiceLink();
		if (!isCompleted && !isSchedule2)
			dashboardPage.navigateToView_Pending(1);
		else if (!isCompleted && isSchedule2)
			dashboardPage.navigateToView_Pending(2);

		RequestForFiberWithputServicePage darkFibrePage = new RequestForFiberWithputServicePage(driver);

		FibreWithoutServiceOrder fibreWithoutServiceObject = darkFibrePage.fillFibreWithoutServiceObject();
		darkFibrePage.clickAmendButton();

		darkFibrePage.getDarkFiberPageHeadingText();

		Assert.assertFalse(darkFibrePage.isBuildingNumberEnabled());
		Assert.assertFalse(darkFibrePage.isBuildingNameEnabled());
		Assert.assertFalse(darkFibrePage.isStreetNameEnabled());
		// Assert.assertFalse(darkFibrePage.isBuildingTypeEnabled());Commented
		// becvause of bug
		// Assert.assertFalse(darkFibrePage.isCopifTypeEnabled()); Commented
		// becvause of bug

		Assert.assertTrue(darkFibrePage.isSalutationEnabled());
		Assert.assertTrue(darkFibrePage.isFirstNameEnabled());
		Assert.assertTrue(darkFibrePage.isLastNameEnabled());

		if (isSchedule2) {
			Assert.assertTrue(darkFibrePage.isCompanyNameDisplayed());
			Assert.assertTrue(darkFibrePage.isCompanyNameEnabled());// Only for
																	// schedule
																	// 2
		} else {
			Assert.assertFalse(darkFibrePage.isCompanyNameDisplayed());
		}
		Assert.assertTrue(darkFibrePage.isContactNumberEnabled());
		Assert.assertTrue(darkFibrePage.isAlternateContactNumberEnabled());
		Assert.assertTrue(darkFibrePage.isEmailAddressEnabled());
		Assert.assertFalse(darkFibrePage.isIdTypeEnabled());
		Assert.assertFalse(darkFibrePage.isIdNumberEnabled());

		// testRequetedDateAndTimeFunc();

		darkFibrePage.selectSameAsInstallationDetails();
		Thread.sleep(2000);
		verifyBillingDetailsSameAsInstallationDetails(fibreWithoutServiceObject, darkFibrePage, isSchedule2);

		Assert.assertFalse(darkFibrePage.isBillingPostalCodeEnabled());
		Assert.assertFalse(darkFibrePage.isBillingUnitNumberEnabled());
		Assert.assertFalse(darkFibrePage.isBillingBuildingNumberEnabled());
		Assert.assertFalse(darkFibrePage.isBillingBuildingNameEnabled());
		Assert.assertFalse(darkFibrePage.isBillingStreetNameEnabled());
		// Assert.assertFalse(darkFibrePage.isBillingBuildingTypeEnabled());
		// Commented because of bug
		Assert.assertFalse(darkFibrePage.isBillingSalutationEnabled());
		Assert.assertFalse(darkFibrePage.isBillingFirstNameEnabled());
		Assert.assertFalse(darkFibrePage.isBillingLastNameEnabled());
		Assert.assertFalse(darkFibrePage.isBillingContactNumberEnabled());
		Assert.assertFalse(darkFibrePage.isBillingAlternateContactNumberEnabled());
		Assert.assertFalse(darkFibrePage.isBillingEmailAddressEnabled());
		if (isSchedule2) {
			// only for schedule 2
			Assert.assertTrue(darkFibrePage.isBillingCompanyNameDisplayed());
			Assert.assertFalse(darkFibrePage.isBillingCompanyNameEnabled());
		} else {
			Assert.assertFalse(darkFibrePage.isCompanyNameDisplayed());
		}
		darkFibrePage.selectSameAsInstallationDetails();
		Thread.sleep(2000);
		Assert.assertTrue(darkFibrePage.isBillingPostalCodeEnabled());
		Assert.assertTrue(darkFibrePage.isBillingUnitNumberEnabled());
		Assert.assertTrue(darkFibrePage.isBillingBuildingNumberEnabled());
		Assert.assertTrue(darkFibrePage.isBillingBuildingNameEnabled());
		Assert.assertTrue(darkFibrePage.isBillingStreetNameEnabled());
		// Assert.assertTrue(darkFibrePage.isBillingBuildingTypeEnabled());
		// Commented because of bug
		Assert.assertTrue(darkFibrePage.isBillingSalutationEnabled());
		Assert.assertTrue(darkFibrePage.isBillingFirstNameEnabled());
		Assert.assertTrue(darkFibrePage.isBillingLastNameEnabled());
		Assert.assertTrue(darkFibrePage.isBillingContactNumberEnabled());
		Assert.assertTrue(darkFibrePage.isBillingAlternateContactNumberEnabled());
		Assert.assertTrue(darkFibrePage.isBillingEmailAddressEnabled());
		if (isSchedule2) {
			// only for schedule 2
			Assert.assertTrue(darkFibrePage.isBillingCompanyNameDisplayed());
			Assert.assertTrue(darkFibrePage.isBillingCompanyNameEnabled());
		} else {
			Assert.assertFalse(darkFibrePage.isCompanyNameDisplayed());
		}

		// testRequetedDateAndTimeFunc();
		// testRequestingLicenseeFunc();

		darkFibrePage.clickAmendSubmitButton_1();

		testSuccessPage("The Fibre Without Service : Amend request has been submitted successfully.");
	}

	private void verifyBillingDetailsSameAsInstallationDetails(FibreWithoutServiceOrder fibreWithoutServiceObject,
			RequestForFiberWithputServicePage darkFibrePage, boolean isSchedule2) {

		Assert.assertEquals(darkFibrePage.getBillingPostalCode(), fibreWithoutServiceObject.getPostalCode());
		Assert.assertEquals(darkFibrePage.getBillingUnitNumber(), fibreWithoutServiceObject.getUnitNumber());
		Assert.assertEquals(darkFibrePage.getBillingBuildingNumber(), fibreWithoutServiceObject.getBuildingNumber());
		Assert.assertEquals(darkFibrePage.getBillingBuildingName(), fibreWithoutServiceObject.getBuildingName());
		Assert.assertEquals(darkFibrePage.getBillingStreetName(), fibreWithoutServiceObject.getStreetName());
		// Assert.assertEquals(darkFibrePage.getBillingBuildingType(),
		// fibreWithoutServiceObject.getBuildingType()); Commented becvause of
		// bug
		Assert.assertEquals(darkFibrePage.getBillingSalutation(), fibreWithoutServiceObject.getSalutation());
		Assert.assertEquals(darkFibrePage.getBillingFirstName(), fibreWithoutServiceObject.getFirstName());
		Assert.assertEquals(darkFibrePage.getBillingLastName(), fibreWithoutServiceObject.getLastName());
		Assert.assertEquals(darkFibrePage.getBillingContactNumber(), fibreWithoutServiceObject.getContactNumber());
		Assert.assertEquals(darkFibrePage.getBillingAlternateContactNumber(),
				fibreWithoutServiceObject.getAlternateContactNumber());
		Assert.assertEquals(darkFibrePage.getBillingEmailAddress(), fibreWithoutServiceObject.getEmailAddress());
		if (isSchedule2) {
			Assert.assertEquals(darkFibrePage.getBillingCompanyName(), fibreWithoutServiceObject.getCompanyName());
		}
	}
}
