package com.amdocs.nlt.terminatetest;

import org.testng.Assert;

import com.amdocs.nlt.base.PageTest;
import com.amdocs.nlt.viewpages.CommonTerminatePage;

public class CommonTerminateTest extends PageTest {
	public void testTerminatePopUpfuctionality() throws InterruptedException {

		CommonTerminatePage terminate = new CommonTerminatePage(driver);

	/*	Assert.assertTrue(terminate.isSubmitRequestButtonAppearsOnTerminateOderButtonClick(),
				"Submit request button shoudl appear when user clicks on Cancel button");*/
		/*Assert.assertEquals(terminate.getExistingConnectionDetailLabel(), "Existing Connection Details",
				"text should be present but it is not");*/
		Assert.assertEquals(terminate.getOriLabel(), "Order Request Identifier",
				"text should be present but it is not");
		Assert.assertEquals(terminate.getOriValueLabel(), "01-01-07022017-101837-A",
				"text should be present but it is not");
		Assert.assertEquals(terminate.getAriLabel(), "Application Reference Identifier",
				"text should be present but it is not");
		Assert.assertTrue(terminate.getAriValueLabel(), "value should be 123456");
		Assert.assertTrue(terminate.isTerminatePopupPresent(), "popup should be present but it is not");
		Assert.assertTrue(terminate.isYesButtonPresentInTerminatePopup(), "popup should be present but it is not");
		Assert.assertTrue(terminate.isNoButtonPresentInTermiantePopup(), "popup should be present but it is not");
		Assert.assertEquals(terminate.getPopupHeaderText(), "Confirm 01-01-07022017-101837-A Termination",
				"text should be present but it is not");
		Assert.assertEquals(terminate.getPopupHeaderTextMessage(),
				"Are you sure you want to terminate this 01-01-07022017-101837-A?",
				"text should be present but it is not");
		Assert.assertTrue(terminate.isTerminatePopupDisappearsWhenUserClicksOnNoButton(),
				"popup should be present but it is not");
		Assert.assertTrue(terminate.isCrossButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(terminate.isTerminatePopupDisappearsWhenUserClicksOnCrossButton(),
				"popup should be present but it is not");
		Assert.assertEquals(terminate.verifyOnclickingOnYesbuttonWeGetConfirmationPage(),
				"The Termination request has been submitted successfully.", "text should be present but it is not");
	}
}