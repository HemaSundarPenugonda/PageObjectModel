package com.amdocs.nlt.terminateCancel;

import com.amdocs.nlt.canceltest.CommonCancelTest;
import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.viewpages.CommonTerminatePage;
import com.amdocs.nlt.viewtest.CommonViewTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResidentailEndUserConnectionTerminateCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testTerminateCancelOrder() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink()
				.navigateToView_Completed(1);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnTerminateOrderButton();
		dashboardPage.navigateToView_Pending(1);

		testCancelPopUpfuctionality();
	}
}
