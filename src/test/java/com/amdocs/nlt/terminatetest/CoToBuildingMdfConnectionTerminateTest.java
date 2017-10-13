package com.amdocs.nlt.terminatetest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;

public class CoToBuildingMdfConnectionTerminateTest extends CommonTerminateTest {

	@Test(enabled = true)
	public void testTerminatePopUpfuctionalityForCoToMDF() throws InterruptedException {

		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickCotoMdfLink().navigateToViewUrl();

	//	dashboardPage.clickOrderManagementLink().clickCotoMdfLink().navigateToViewUrl().clickOnTerminateButton();

		//dashboardPage.clickOrderManagementLink().clickCotoMdfLink().navigateToView_Terminate();


		// StartPage startpage = new StartPage(driver);
		// startpage.login().clickOrderManagementLink().clickCotoMdfLink().navigateToView_Pending(1);
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink().navigateToView_Completed(5);
		CommonComponentPage commonComponentPage = new CommonComponentPage(driver);
		commonComponentPage.clickOnTerminateOrderButton();
		super.testTerminatePopUpfuctionality();
	}
}
