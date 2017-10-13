package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;

public class NonResiReclassifyCancelTest extends CommonCancelTest {

	//Change in functionality. Need to enable owhile testuing the user story ( Cancel Order button not displayed for Pending status)
	@Test(enabled = false)
	public void testCancelPopUpfuctionalityForNonResiReclassify() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToReclassify(2).navigateToView_Pending(2);
		testCancelPopUpfuctionality();
	}
}
