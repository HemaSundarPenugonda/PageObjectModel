package com.amdocs.nlt.terminateviewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.canceltest.CommonCancelTest;
import com.amdocs.nlt.viewpages.CommonTerminatePage;
import com.amdocs.nlt.viewtest.CommonViewTest;

public class CoToBuildingMdfConnectionTerminateViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void testTerminateApplicationDetailsComponent() throws InterruptedException {

		dashboardPage.clickOrderManagementLink().clickCotoMdfLink().navigateToView_Completed(5);

		CommonTerminatePage commonTerminatePage = new CommonTerminatePage(driver);
		commonTerminatePage.isSubmitRequestButtonAppearsOnTerminateOderButtonClick();

		dashboardPage.navigateToView_Completed(5);

		Assert.assertEquals(commonTerminatePage.getCurrentStatusLabel(), "Current Status",
				"Current Status Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getARILabel(), "Application Reference Identifier",
				"Application Reference Identifier Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection Lable should be present but it is not");
		Assert.assertTrue(commonTerminatePage.isCurrentStatusValuePresent(),
				"Current Status value should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsORIValuePresent(), "ORI value should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsDOAValue(),
				"Date of Application should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsTimeLineValuePresent(),
				"Timeline to Complete should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsRORvaluePresent(),
				"Timeline to Complete should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAriHeaderDisabled(), "ARI textbox should be disable but it is not");
	}

	
	
	@Test(enabled = true)
	public void testTerminateExistingConnectionDetailsComponent() throws InterruptedException {

		dashboardPage.clickOrderManagementLink().clickCotoMdfLink().navigateToView_Completed(5);

		CommonTerminatePage commonTerminatePage = new CommonTerminatePage(driver);
		commonTerminatePage.isSubmitRequestButtonAppearsOnTerminateOderButtonClick();

		dashboardPage.navigateToView_Completed(5);

		Assert.assertEquals(commonTerminatePage.getOrderRequestIdentifierLabel(), "Order Request Identifier",
				"Order Request Identifier Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getApplicationReferenceIdentifierLabel(),
				"Application Reference Identifier",
				"Application Reference Identifier Lable should be present but it is not");
		Assert.assertTrue(commonTerminatePage.isAriValueLabelDisabled(), "ARI textbox should be disable but it is not");
		Assert.assertTrue(commonTerminatePage.isOriValueLabelPresent(), "ORI Value should present but it is not");
		Assert.assertEquals(commonTerminatePage.getActivationDateLabel(), "Requested Date of Termination",
				"Requested Date of Termination Lable should be present but it is not");
		Assert.assertTrue(commonTerminatePage.isDaypickerRfaDisabled(), "Day picker RFA should present but it is not");
	}

	@Test(enabled = true)
	public void testTerminateAmendOrder() throws InterruptedException {

		dashboardPage.clickOrderManagementLink().clickCotoMdfLink().navigateToView_Completed(5);

		CommonTerminatePage commonTerminatePage = new CommonTerminatePage(driver);
		commonTerminatePage.isSubmitRequestButtonAppearsOnTerminateOderButtonClick();

		dashboardPage.navigateToView_Completed(5);
		Assert.assertEquals(commonTerminatePage.getCurrentStatusLabel(), "Current Status",
				"Current Status Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getARILabel(), "Application Reference Identifier",
				"Application Reference Identifier Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete Lable should be present but it is not");
		Assert.assertEquals(commonTerminatePage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection Lable should be present but it is not");
		Assert.assertTrue(commonTerminatePage.isCurrentStatusValuePresent(),
				"Current Status value should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsORIValuePresent(), "ORI value should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsDOAValue(),
				"Date of Application should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsTimeLineValuePresent(),
				"Timeline to Complete should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAppDetailsRORvaluePresent(),
				"Timeline to Complete should present but it is not");
		Assert.assertTrue(commonTerminatePage.isAriHeaderDisabled(), "ARI textbox should be disable but it is not");
		commonTerminatePage.clickAmendButton();
		commonTerminatePage.enterNewARI().clickAmendSubmitButton();
		Assert.assertEquals(commonTerminatePage.VerifyConfirmationMessage(),
				"The Terminate Order : Amend request has been submitted successfully.");
	}
}
