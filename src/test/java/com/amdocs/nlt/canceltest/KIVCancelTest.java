package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.ResidentialEndUserConnectionViewPage;

public class KIVCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testKivCancel_Schedule1() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToViewKIV(1);
		ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);

		page.clickNoKivButton();
		Thread.sleep(2000);
		testCancelPopUpfuctionalitywithOutClickCancel("01-01-07022017-101837-A");
	}
}
