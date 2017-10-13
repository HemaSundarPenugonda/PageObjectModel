package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class ResidentailEndUserConnectionTerminateTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityForResi() throws InterruptedException {


		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		super.testTerminatePopUpfuctionality();
	}
}
