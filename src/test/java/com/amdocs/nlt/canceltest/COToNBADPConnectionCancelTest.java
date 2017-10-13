package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class COToNBADPConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForCoToNbapDp() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().coToNbapDpconnectionLink().navigateToView_Pending(10);
		super.testCancelPopUpfuctionality();
	}
}
