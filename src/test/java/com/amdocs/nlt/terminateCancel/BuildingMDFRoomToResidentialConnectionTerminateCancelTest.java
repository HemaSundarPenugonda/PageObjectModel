package com.amdocs.nlt.terminateCancel;

import com.amdocs.nlt.canceltest.CommonCancelTest;
import com.amdocs.nlt.viewpages.CommonTerminatePage;
import org.testng.annotations.Test;

public class BuildingMDFRoomToResidentialConnectionTerminateCancelTest extends CommonCancelTest {

    @Test(enabled = true)
    public void testTerminateCancelOrder() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Completed(8);
        CommonTerminatePage commonTerminatePage = new CommonTerminatePage(driver);
        commonTerminatePage.isSubmitRequestButtonAppearsOnTerminateOderButtonClick();

        dashboardPage.navigateToView_Pending(8);
        testCancelPopUpfuctionality();
    }
}
