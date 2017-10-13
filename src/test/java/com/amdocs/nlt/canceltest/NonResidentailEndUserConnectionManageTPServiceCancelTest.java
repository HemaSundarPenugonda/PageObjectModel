package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

public class NonResidentailEndUserConnectionManageTPServiceCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForManageTPNonResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Completed(2);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnManageTPButton();
		dashboardPage.navigateToView_Pending(2);
		super.testCancelPopUpfuctionality();
	}
}