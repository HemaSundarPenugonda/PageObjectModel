package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class BuildingMDFRoomToResidentialConnectionTerminateTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityForMDFToResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Completed(8);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		super.testTerminatePopUpfuctionality();
	}
}
