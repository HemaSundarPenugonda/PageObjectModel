package com.amdocs.nlt.terminateCancel;

import com.amdocs.nlt.canceltest.CommonCancelTest;
import com.amdocs.nlt.page.CommonComponentPage;
import org.testng.annotations.Test;

public class BuildingMDFRoomToFTTBNodeConnectionTerminateCancelTest extends CommonCancelTest {

    @Test(enabled = true)
    public void testTerminateCancelOrder() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToFttbiLink().navigateToView_Completed(6);
        CommonComponentPage page = new CommonComponentPage(driver);
        page.clickOnTerminateOrderButton();
        dashboardPage.navigateToView_Pending(6);

        testCancelPopUpfuctionality();
    }
}
