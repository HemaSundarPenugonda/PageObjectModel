package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import org.testng.Assert;

import com.amdocs.nlt.viewpages.CommonCancelPage;

import java.util.regex.Pattern;

public class CommonCancelTest extends CommonComponentPageTest {

	public void testCancelPopUpfuctionality() throws InterruptedException {

		CommonCancelPage cancel = new CommonCancelPage(driver);

//		Assert.assertTrue(cancel.isActionDropdownValuesCorrect());
		Thread.sleep(2000);
		cancel.clickOnCancelOrderButton();
//		Thread.sleep(2000);
		Assert.assertTrue(cancel.isSubmitRequestButtonDisplayed(),"Submit request button should appear when user clicks on Cancel button");

		Assert.assertEquals(cancel.getExistingConnectionDetailLabel(), "Existing Connection Details",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getOriLabel(), "Order Request Identifier", "text should be present but it is not");
		Assert.assertEquals(cancel.getOriValueLabel(), "01-01-07022017-101837-A",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getAriLabel(), "Application Reference Identifier",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getAriValueLabel(), "123456", "text should be present but it is not");

		cancel.populateCancelOderForm();
		cancel.clickOnSubmitButton();

		Assert.assertTrue(cancel.isConfirmationPopupDisplayed(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isYesButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isNoButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isCrossButtonOnCancelPopupDisplayed(), "cross button should be present on popup but it is not");

		Assert.assertEquals(cancel.getPopupHeaderText(), "Confirm 01-01-07022017-101837-A Cancellation",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getPopupTextMessage(),
				"Are you sure you want to Cancel this 01-01-07022017-101837-A?",
				"text should be present but it is not");

		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnNoButton(),
				"popup should be present but it is not");

		cancel.clickOnSubmitButton();
		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnCrossButton(),
				"popup should be present but it is not");

		cancel.clickOnSubmitButton();
		cancel.clickYesButtonOnCancelPopup();
		testSuccessPage("The Cancellation request has been submitted successfully.");

	}

    public void testCancelPopUpfuctionality(String ori) throws InterruptedException {

		CommonCancelPage cancel = new CommonCancelPage(driver);

//		Assert.assertTrue(cancel.isActionDropdownValuesCorrect());
//		Thread.sleep(2000);
		cancel.clickOnCancelOrderButton();
//		Thread.sleep(2000);
		testCancelPopUpfuctionalitywithOutClickCancel(ori);
    }

	public void testCancelPopUpfuctionalitywithOutClickCancel(String ori) throws InterruptedException {

		CommonCancelPage cancel = new CommonCancelPage(driver);

		Assert.assertTrue(cancel.isSubmitRequestButtonDisplayed(),"Submit request button should appear when user clicks on Cancel button");

		Assert.assertEquals(cancel.getExistingConnectionDetailLabel(), "Existing Connection Details",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getOriLabel(), "Order Request Identifier", "text should be present but it is not");
		Assert.assertTrue(Pattern.compile(ori).matcher(cancel.getOriValueLabel()).find(),
				"text should be present but it is not");
		Assert.assertEquals(cancel.getAriLabel(), "Application Reference Identifier",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getAriValueLabel(), "123456", "text should be present but it is not");

		cancel.populateCancelOderForm();
		cancel.clickOnSubmitButton();

		Assert.assertTrue(cancel.isConfirmationPopupDisplayed(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isYesButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isNoButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isCrossButtonOnCancelPopupDisplayed(), "cross button should be present on popup but it is not");

        /*Assert.assertEquals(cancel.getPopupHeaderText(), "Confirm " + ori + " Cancellation",
                "text should be present but it is not");*/
		Assert.assertTrue(cancel.getPopupHeaderText().contains("Confirm "), "text should be present but it is not");
		Assert.assertTrue(cancel.getPopupHeaderText().contains(" Cancellation"), "text should be present but it is not");
		Assert.assertTrue(Pattern.compile("Are you sure you want to Cancel this " + ori + "?").matcher(cancel.getPopupTextMessage()).find(),
				"text should be present but it is not");

		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnNoButton(),
				"popup should be present but it is not");

		cancel.clickOnSubmitButton();
		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnCrossButton(),
				"popup should be present but it is not");

		cancel.clickOnSubmitButton();
		cancel.clickYesButtonOnCancelPopup();
		testSuccessPage("The Cancellation request has been submitted successfully.");
	}
	
	//Need to refactor to sync with above cancel tests
	public void testCancelPopUpfuctionalityManageTPRRR() throws InterruptedException {

		CommonCancelPage cancel = new CommonCancelPage(driver);

		Assert.assertTrue(cancel.isSubmitRequestButtonAppearsOnCancelOderButtonClick(),
				"Submit request button shoudl appear when user clicks on Cancel button");
		Assert.assertEquals(cancel.getExistingConnectionDetailLabel(), "Existing Connection Details",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getOriLabel(), "Order Request Identifier", "text should be present but it is not");
		Assert.assertEquals(cancel.getOriValueLabel(), "01-01-07022017-101837-A",
				"text should be present but it is not");
		Assert.assertTrue(cancel.isCancelPopupPresent(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isYesButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isNoButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertEquals(cancel.getPopupHeaderText(), "Confirm 01-01-07022017-101837-A Cancellation",
				"text should be present but it is not");
		Assert.assertEquals(cancel.getPopupTextMessage(),
				"Are you sure you want to Cancel this 01-01-07022017-101837-A?",
				"text should be present but it is not");
		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnNoButton(),
				"popup should be present but it is not");
		Assert.assertTrue(cancel.isCrossButtonPresentInCancelPopup(), "popup should be present but it is not");
		Assert.assertTrue(cancel.isCancelPopupDisappearsWhenUserClicksOnCrossButton(),
				"popup should be present but it is not");
		Assert.assertEquals(cancel.verifyOnclickingOnYesbuttonWeGetConfirmationPage(),
				"The Cancellation request has been submitted successfully.", "text should be present but it is not");

	}
}
