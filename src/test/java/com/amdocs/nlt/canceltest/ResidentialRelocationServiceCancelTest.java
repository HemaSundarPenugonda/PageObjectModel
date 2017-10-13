package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

public class ResidentialRelocationServiceCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForResiRelocate() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickRelocateButton();
		dashboardPage.navigateToView_Pending(1);
		testCancelPopUpfuctionality();
	}
}
