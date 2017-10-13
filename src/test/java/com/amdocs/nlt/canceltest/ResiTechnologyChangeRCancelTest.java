package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class ResiTechnologyChangeRCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForResiTechnologyChange() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnChangeTechButton();
		dashboardPage.navigateToView_Pending(1);
		super.testCancelPopUpfuctionality();
	}
}
