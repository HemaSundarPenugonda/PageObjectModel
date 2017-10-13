package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class ResidentailEndUserConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Pending(1);
		super.testCancelPopUpfuctionality();
	}
}
