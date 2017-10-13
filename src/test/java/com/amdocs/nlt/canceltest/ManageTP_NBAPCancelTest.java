package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.ManageTpPage;
import com.amdocs.nlt.viewpages.CommonCancelPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageTP_NBAPCancelTest extends CommonCancelTest {

    @Test(enabled = true)
    public void testCancelPopUpfuctionalityForFibreWithoutService_Pending_Schedule1() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink().navigateToView_Completed(3);

		ManageTpPage manageTpPage = new ManageTpPage(driver);
		manageTpPage.clickOnManageTPButton();
		dashboardPage.navigateToView_Pending(3);
		
        testCancelPopUpfuctionality("01-01-07022017-101837-A");
    }
    public void testCancelPopUpfuctionality(String ori) throws InterruptedException {

        CommonCancelPage cancel = new CommonCancelPage(driver);

        cancel.clickOnCancelOrderButton();
        Assert.assertEquals(cancel.getExistingConnectionDetailLabel(), "Existing Connection Details",
                "text should be present but it is not");
        Assert.assertEquals(cancel.getOriLabel(), "Order Request Identifier", "text should be present but it is not");
        Assert.assertEquals(cancel.getOriValueLabel(), ori,
                "text should be present but it is not");
        Assert.assertEquals(cancel.getAriLabel(), "Application Reference Identifier",
                "text should be present but it is not");
        Assert.assertEquals(cancel.getAriValueLabel(), "123456", "text should be present but it is not");
        Assert.assertTrue(cancel.isCancelPopupPresent(), "popup should be present but it is not");
        Assert.assertTrue(cancel.isYesButtonPresentInCancelPopup(), "popup should be present but it is not");
        Assert.assertTrue(cancel.isNoButtonPresentInCancelPopup(), "popup should be present but it is not");
        Assert.assertEquals(cancel.getPopupHeaderText(), "Confirm " + ori + " Cancellation",
                "text should be present but it is not");
        Assert.assertEquals(cancel.getPopupTextMessage(),
                "Are you sure you want to Cancel this " + ori + "?",
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
