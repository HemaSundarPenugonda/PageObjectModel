package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class BuildingMDFRoomToNonResidentialPremiseConnectionPageTerminateTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityForMDFToNonResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToNonResiLink().navigateToView_Completed(9);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		super.testTerminatePopUpfuctionality();
	}
}
