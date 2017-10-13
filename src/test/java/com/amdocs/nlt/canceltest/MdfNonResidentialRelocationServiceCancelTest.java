package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;

public class MdfNonResidentialRelocationServiceCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForMdfNonResiRelocate() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToNonResiLink().navigateToView_Completed(9);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickRelocateButton();
		dashboardPage.navigateToView_Pending(9);
		super.testCancelPopUpfuctionality();
	}
}
