package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class BuildingMDFRoomToResidentialConnectionManageTPServiceCancelTest extends CommonCancelTest {

	@Test
	public void testCancelPopUpfuctionalityForManageTPBuildingMDFRoomToResidentialConnection() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Completed(8);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnManageTPButton();
		dashboardPage.navigateToView_Pending(8);
		super.testCancelPopUpfuctionality();
	}
}
