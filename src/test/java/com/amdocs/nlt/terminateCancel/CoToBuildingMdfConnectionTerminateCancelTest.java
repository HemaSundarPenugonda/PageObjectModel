package com.amdocs.nlt.terminateCancel;

import com.amdocs.nlt.canceltest.CommonCancelTest;
import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.viewpages.CommonTerminatePage;
import com.amdocs.nlt.viewtest.CommonViewTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CoToBuildingMdfConnectionTerminateCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testTerminateCancelOrder() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink()
				.navigateToView_Completed(5);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnTerminateOrderButton();
		dashboardPage.navigateToView_Pending(5);

		testCancelPopUpfuctionality();
	}
}
