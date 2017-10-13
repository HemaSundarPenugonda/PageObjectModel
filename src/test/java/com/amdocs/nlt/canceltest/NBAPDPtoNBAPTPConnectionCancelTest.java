package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class NBAPDPtoNBAPTPConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForNBAPDPToNBAPTp() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapDpToNbapTpConnectionLink().navigateToView_Pending(11);
		super.testCancelPopUpfuctionality();
	}
}
