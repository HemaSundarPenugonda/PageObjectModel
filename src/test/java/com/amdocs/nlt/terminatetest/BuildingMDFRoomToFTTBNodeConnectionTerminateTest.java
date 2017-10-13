package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class BuildingMDFRoomToFTTBNodeConnectionTerminateTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityForBuildingMDFRoomToFTTBNode() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToFttbiLink().navigateToView_Completed(6);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		super.testTerminatePopUpfuctionality();
	}
}
