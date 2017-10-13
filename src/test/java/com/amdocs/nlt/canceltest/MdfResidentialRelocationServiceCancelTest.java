package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

public class MdfResidentialRelocationServiceCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForMdfResiRelocate() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Completed(8);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickRelocateButton();
		dashboardPage.navigateToView_Pending(8);
		testCancelPopUpfuctionality();
	}
}
