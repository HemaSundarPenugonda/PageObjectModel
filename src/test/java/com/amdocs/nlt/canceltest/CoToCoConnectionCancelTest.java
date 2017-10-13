package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class CoToCoConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForCoToCo() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCoToCoLink().navigateToView_Pending(4);
		super.testCancelPopUpfuctionality();
	}
}
