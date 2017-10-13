package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class FTTBNodeToDPConnectionTerminateTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityForFTTBNodeToDP() throws InterruptedException {


		dashboardPage.clickOrderManagementLink().clikFttbToDpLink().navigateToView_Completed(7);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		super.testTerminatePopUpfuctionality();

	}
}
