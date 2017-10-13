package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class BuildingMDFRoomToFTTBNodeConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForMdfToFttb() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToFttbiLink().navigateToView_Pending(6);
		super.testCancelPopUpfuctionality();
	}

}
