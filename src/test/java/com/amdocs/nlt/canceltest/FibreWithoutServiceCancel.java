package com.amdocs.nlt.canceltest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.CommonCancelPage;

public class FibreWithoutServiceCancel extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForFibreWithoutService_Pending_Schedule1() throws InterruptedException {
		testCancelPopUpfuctionalityForFibreWithoutService(false, false, "01-01-07022017-101837-A");
	}

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForFibreWithoutService_Pending_Schedule2() throws InterruptedException {
		testCancelPopUpfuctionalityForFibreWithoutService(false, true, "01-01-07022017-101837-A");
	}

	private void testCancelPopUpfuctionalityForFibreWithoutService(boolean isCompleted, boolean isSchedule2, String ori)
			throws InterruptedException {

		dashboardPage.moveToOrderManagementLink().clickFiberWithServiceLink();
		if (!isCompleted && !isSchedule2)
			dashboardPage.navigateToView_Pending(1);
		else if (!isCompleted && isSchedule2)
			dashboardPage.navigateToView_Pending(2);

		testCancelPopUpfuctionality(ori);
	}

	/*
	 * This method is the overridden version for Fibre without service as we
	 * don't have ARI field here
	 */
	public void testCancelPopUpfuctionality(String oriValue) throws InterruptedException {

		CommonCancelPage cancel = new CommonCancelPage(driver);

		Assert.assertTrue(cancel.isSubmitRequestButtonAppearsOnCancelOderButtonClick(),
				"Submit request button shoudl appear when user clicks on Cancel button");
		Assert.assertEquals(cancel.getExistingConnectionDetailLabel(), "Existing Connection Details",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getOriLabel(), "Order Request Identifier", "text should be present but it is not");
		Assert.assertEquals(cancel.getOriValueLabel(), oriValue, "text should be present but it is not");

		cancel.clickSubmitButton();
		Assert.assertTrue(cancel.isConfirmationPopupDisplayed(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isYesButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isNoButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertEquals(cancel.getPopupHeaderText(), "Confirm " + oriValue + " Cancellation",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getPopupTextMessage(),
				"Are you sure you want to Cancel this " + oriValue + "?", "text should be present but it is not");
		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnNoButton(),
				"popup should be present but it is not");

		cancel.clickSubmitButton();
		Assert.assertTrue(cancel.isCrossButtonOnCancelPopupDisplayed(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnCrossButton(),
				"popup should be present but it is not");

		cancel.clickSubmitButton();
		cancel.clickYesButtonOnCancelPopup();
		Thread.sleep(1000);
		Assert.assertEquals(cancel.VerifyConfirmationMessage(),
				"The Cancellation request has been submitted successfully.", "text should be present but it is not");
	}
}
