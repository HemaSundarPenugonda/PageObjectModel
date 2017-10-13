package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;

public class NonResidentialRelocationServiceCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForNonResiRelocate() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Completed(2);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickRelocateButton();
		dashboardPage.navigateToView_Pending(2);
		testCancelPopUpfuctionality();
	}
}
