package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class NBAPConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForNBAPTest() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink().navigateToView_Pending(3);
		super.testCancelPopUpfuctionality();
	}
}
