package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class CoToBuildingMdfConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForCotoMdf() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink().navigateToView_Pending(5);
		super.testCancelPopUpfuctionality();
	}
}
