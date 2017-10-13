package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.viewpages.ResidentialEndUserConnectionViewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KIVSuccessTest extends CommonViewTest {

    @Test(enabled = true)
    public void testKIVSchedule1() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink().navigateToViewKIV(1);
        ResidentialEndUserConnectionViewPage resiViewPage = new ResidentialEndUserConnectionViewPage(driver);
        testKIVSuccess(resiViewPage);
    }

    private void testKIVSuccess(CommonComponentPage page) {

        Assert.assertEquals(page.getKivHeader(), "Order is in Pending State", "KIV header is displayed wrong");
        Assert.assertEquals(page.getKivMessage(), "This order is in pending state for a long time and the system will automatically cancel this order. Do you want us to keep this order open?", "KIV message is displayed wrong");
        Assert.assertTrue(page.isNoKIVButtonEnabled(), "KIV NO button is not enabled which is wrong");
        Assert.assertTrue(page.isYesKIVButtonEnabled(), "KIV YES button is not enabled which is wrong");
        page.clickYesKivButton();
        Assert.assertEquals(page.getKivSuccessMessage(), "Request to keep the order open, is submitted successfully.", "KIV success message is displayed wrong");
    }
}
