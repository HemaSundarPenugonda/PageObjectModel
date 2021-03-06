package com.amdocs.nlt.terminateCancel;

import com.amdocs.nlt.canceltest.CommonCancelTest;
import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.viewpages.CommonTerminatePage;
import com.amdocs.nlt.viewtest.CommonViewTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NBAPDPtoNBAPTPConnectionTerminateCancelTest extends CommonCancelTest {

	@Test(enabled = true)
	public void testTerminateCancelOrder() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapDpToNbapTpConnectionLink()
				.navigateToView_Completed(11);
		CommonComponentPage page = new CommonComponentPage(driver);
		page.clickOnTerminateOrderButton();
		dashboardPage.navigateToView_Pending(11);

		testCancelPopUpfuctionality();
	}
}
