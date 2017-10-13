package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

public class CoToNBAPDPConnectionTerminateTest extends CommonTerminateTest {

	@Test(enabled = false)
	public void testTerminatePopUpfuctionalityForCoToNBAPDP() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().coToNbapDpconnectionLink().navigateToView_Pending(1);

		super.testTerminatePopUpfuctionality();
	}
}
