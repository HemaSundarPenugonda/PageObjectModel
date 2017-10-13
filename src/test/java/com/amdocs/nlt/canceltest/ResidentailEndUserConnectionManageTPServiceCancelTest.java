package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

public class ResidentailEndUserConnectionManageTPServiceCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForManageTPResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnManageTPButton();
		dashboardPage.navigateToView_Pending(1);
		super.testCancelPopUpfuctionality();
	}
}
