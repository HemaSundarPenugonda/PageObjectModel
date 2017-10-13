package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class NonResidentailEndUserConnectionCancelTest extends CommonCancelTest {

	//Change in functionality. Need to enable owhile testuing the user story ( Cancel Order button not displayed for Pending status)
	@Test(enabled = false)
	public void testCancelPopUpfuctionalityForNonResi() throws InterruptedException {
		//Cancel functionality is no longer with status as pending
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Pending(2);
		testCancelPopUpfuctionality();
	}
}
