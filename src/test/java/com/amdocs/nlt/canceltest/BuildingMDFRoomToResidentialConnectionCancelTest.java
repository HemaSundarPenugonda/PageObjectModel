package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class BuildingMDFRoomToResidentialConnectionCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForMdfToResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Pending(8);
		super.testCancelPopUpfuctionality();
	}
}
