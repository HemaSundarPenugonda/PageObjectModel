package com.amdocs.nlt.amendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.ManageTpPage;
import com.amdocs.nlt.page.NBAPConnectionPage;
import com.amdocs.nlt.page.NBAPManageTPPage;

public class ManageTP_NBAPTest extends CommonAmendTest {

	@Test(enabled = true)
	public void testManageTP_NBAP() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink().navigateToView_Completed(3);

		ManageTpPage manageTpPage = new ManageTpPage(driver);
		manageTpPage.clickOnManageTPButton();
		dashboardPage.navigateToView_Pending(3);
		manageTpPage.clickAmendButton();

		Assert.assertEquals(manageTpPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier Label should present but it is not");
		Assert.assertEquals(manageTpPage.getApplicationReferenceIdentifierLabel(), "Application Reference Identifier",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertTrue(manageTpPage.isAppDetailsORIValueLabelPresent(), "Ori Label should be present but it is not");
		Assert.assertFalse(manageTpPage.isApplicationReferenceIdentifierTextBoxDisable(),
				"Application Reference Identifier Text Box should Enable but it is not");

		NBAPConnectionPage nbapPage = new NBAPConnectionPage(driver);
		nbapPage.isOptionDropdownEnabled();
		nbapPage.isDescriptionRadioButtonEnabled();
		nbapPage.isNBapAddressRadioButtonEnabled();
		nbapPage.isAddressOptionTextboxEnabled();
		nbapPage.isNearestPostalCodeTextboxEnabled();
		nbapPage.isLandmarkTextboxEnable();
		nbapPage.isCoordinateSysDropDpownEnabled();
		nbapPage.isxCoordinateTextboxEnabled();
		nbapPage.isyCoordinateTextboxEnabled();
		nbapPage.isHeightTextboxEnabled();

		NBAPManageTPPage nbapManageTP = new NBAPManageTPPage(driver);
		Assert.assertTrue(nbapManageTP.isAriTextboxEnabled());
		Assert.assertFalse(nbapManageTP.isoperationToBePerformedDropDownEnabled());
		Assert.assertFalse(nbapManageTP.isOption2DropdownEnabled());
		Assert.assertFalse(nbapManageTP.isNearestPostalCodeTextboxEnabled());
		Assert.assertFalse(nbapManageTP.isLandmarkTextboxEnable());
		Assert.assertFalse(nbapManageTP.isCoordinateSysDropDpownEnabled());
		Assert.assertFalse(nbapManageTP.isxCoordinateTextboxEnabled());
		Assert.assertFalse(nbapManageTP.isyCoordinateTextboxEnabled());
		Assert.assertFalse(nbapManageTP.isHeightTextboxEnabled());

		Assert.assertFalse(nbapManageTP.isSubmitRequestButtonEnabled());

		nbapManageTP.enterNewARI("123456");
		Assert.assertTrue(nbapManageTP.isSubmitRequestButtonEnabled());

		nbapManageTP.clickSubmitButton();
		testSuccessPage("The Request for Manage TP Service : Amend request has been submitted successfully.");
	}
}