package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.PatchingServicePage;
import com.amdocs.nlt.util.NavigationUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatchingServicesViewTest extends CommonViewTest {

    /*"Valid Values:
    NLT
    RL"*/
    /*id=1840
    Hema_Schedule13_View_Pending_Owner_NLT-RL*/
    @Test(enabled = true, description = "DE1154")
    public void schedule13_OwnerFrom_NLT() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();
        NavigationUtils.navigateToExtn(driver, "/sch13p_owner_nlt2rl");

        PatchingServicePage page = new PatchingServicePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getPatchFromValue(), "NLT");
    }
    /*id=1842
    Hema_Schedule13_View_Pending_Owner_RL-NLT*/
    @Test (enabled = true, description = "DE1154")
    public void schedule13_OwnerFrom_RL() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();
        NavigationUtils.navigateToExtn(driver, "/sch13p_owner_rl2nlt");

        PatchingServicePage page = new PatchingServicePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getPatchFromValue(), "RL");
    }


    /*"Valid Values:
    NLT
    RL"*/
    /*id=1842
    Hema_Schedule13_View_Pending_Owner_RL-NLT*/
    @Test (enabled = true, description = "DE1154")
    public void schedule13_OwnerTo_NLT() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();
        NavigationUtils.navigateToExtn(driver, "/sch13p_owner_rl2nlt");

        PatchingServicePage page = new PatchingServicePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getPatchToValue(), "NLT");
    }
    /*id=1840
    Hema_Schedule13_View_Pending_Owner_NLT-RL*/
    @Test (enabled = true, description = "DE1154")
    public void schedule13_OwnerTo_RL() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();
        NavigationUtils.navigateToExtn(driver, "/sch13p_owner_nlt2rl");

        PatchingServicePage page = new PatchingServicePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getPatchToValue(), "RL");

    }
}
