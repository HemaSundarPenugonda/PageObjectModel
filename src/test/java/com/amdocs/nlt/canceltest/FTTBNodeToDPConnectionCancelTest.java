package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class FTTBNodeToDPConnectionCancelTest extends CommonCancelTest {
	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForFttbToDp() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikFttbToDpLink().navigateToView_Pending(7);
		super.testCancelPopUpfuctionality();
	}
}
