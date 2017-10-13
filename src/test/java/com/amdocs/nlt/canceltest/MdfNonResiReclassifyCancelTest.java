package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class MdfNonResiReclassifyCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForMdfNonResiReclassify() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().navigateToViewUrlForMdfNonResiReclassify();
		testCancelPopUpfuctionality();
	}
}
