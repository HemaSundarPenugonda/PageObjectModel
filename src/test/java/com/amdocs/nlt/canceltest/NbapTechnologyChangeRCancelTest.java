package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class NbapTechnologyChangeRCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForNbapTechnologyChange() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink().navigateToView_Completed(3);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnChangeTechButton();
		dashboardPage.navigateToView_Pending(3);
		super.testCancelPopUpfuctionality();
	}
}
