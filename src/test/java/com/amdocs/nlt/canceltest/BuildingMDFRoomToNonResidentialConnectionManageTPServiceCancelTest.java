package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

public class BuildingMDFRoomToNonResidentialConnectionManageTPServiceCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForManageTPBuildingMDFRoomToNonResidentialConnection() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToNonResiLink().navigateToView_Completed(9);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnManageTPButton();
		dashboardPage.navigateToView_Pending(9);
		super.testCancelPopUpfuctionality();
	}
}
