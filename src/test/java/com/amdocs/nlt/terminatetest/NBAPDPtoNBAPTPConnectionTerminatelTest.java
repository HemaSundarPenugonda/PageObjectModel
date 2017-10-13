package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class NBAPDPtoNBAPTPConnectionTerminatelTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityNBAPDpToNBAPTp() throws InterruptedException {


		dashboardPage.clickOrderManagementLink().nbapDpToNbapTpConnectionLink().navigateToView_Completed(11);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		super.testTerminatePopUpfuctionality();
	}
}
