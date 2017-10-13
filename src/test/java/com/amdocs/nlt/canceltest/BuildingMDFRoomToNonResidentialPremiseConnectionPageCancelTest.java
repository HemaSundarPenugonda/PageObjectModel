package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class BuildingMDFRoomToNonResidentialPremiseConnectionPageCancelTest extends CommonCancelTest {

	//Change in functionality. Need to enable owhile testuing the user story ( Cancel Order button not displayed for Pending status)
	@Test(enabled = false)
	public void testCancelPopUpfuctionalityForMdfToNonResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToNonResiLink().navigateToView_Pending(9);
		testCancelPopUpfuctionality();
	}

}
