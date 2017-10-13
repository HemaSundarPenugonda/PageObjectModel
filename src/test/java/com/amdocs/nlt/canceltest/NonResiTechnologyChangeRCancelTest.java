package com.amdocs.nlt.canceltest;

import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

public class NonResiTechnologyChangeRCancelTest extends CommonCancelTest {
	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForNonResiTechnologyChange() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Completed(2);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnChangeTechButton();
		dashboardPage.navigateToView_Pending(2);
		super.testCancelPopUpfuctionality();
	}
}
