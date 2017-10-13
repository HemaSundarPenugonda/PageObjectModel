package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class NonResidentailEndUserConnectionTerminateTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityForNonResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Completed(2);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		testTerminatePopUpfuctionality();
	}
}
