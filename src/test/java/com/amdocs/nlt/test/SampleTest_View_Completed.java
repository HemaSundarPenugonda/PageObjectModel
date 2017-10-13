package com.amdocs.nlt.test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;

public class SampleTest_View_Completed extends CommonComponentPageTest {

    /*@Test
    public void viewSchedule1_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule1_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule1_2();
    }

    @Test
    public void viewSchedule2_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule2_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule1_2();
    }

    @Test
    public void viewSchedule3_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule3_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule3();
    }

    @Test
    public void viewSchedule4_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule4_view_completed();

        checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13();
    }

    @Test
    public void viewSchedule5_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule5_view_completed();

        checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13();
    }
    @Test
    public void viewSchedule6_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule6_view_completed();

        checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13();
    }
    @Test
    public void viewSchedule7_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule7_view_completed();

        checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13();
    }
    @Test
    public void viewSchedule8_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule8_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule8_9();
    }

    @Test
    public void viewSchedule9_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule9_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule8_9();
    }
    @Test
    public void viewSchedule10_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule10_view_completed();

        checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13();
    }
    @Test
    public void viewSchedule11_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule11_view_completed();

        checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13();
    }
    @Test(enabled = false)
    public void viewSchedule12_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule1_2();
    }

    @Test(enabled = false)
    public void viewSchedule12A_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12A_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule1_2();
    }
    @Test(enabled = false)
    public void viewSchedule12B_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12B_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule1_2();
    }
    @Test(enabled = false)
    public void viewSchedule12C_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12C_view_completed();

        checkButtonsVisibility_CompletedScreens_Schedule1_2();
    }
    @Test
    public void viewSchedule13_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule13_view_completed();

        checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13();
    }
    @Test
    public void viewFTO_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToFTO_view_completed();

        checkButtonsVisibility_CompletedScreens_FTO_EFTO_ManageTPAddress_CoOrdinate();
    }
    @Test
    public void viewEFTO_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToEFTO_view_completed();

        checkButtonsVisibility_CompletedScreens_FTO_EFTO_ManageTPAddress_CoOrdinate();
    }
    @Test
    public void viewManageTPAddress_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToManageTPAddress_view_completed();

        checkButtonsVisibility_CompletedScreens_FTO_EFTO_ManageTPAddress_CoOrdinate();
    }
    @Test
    public void viewManageCoOrdinate_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToManageCoOrdinate_view_completed();

        checkButtonsVisibility_CompletedScreens_FTO_EFTO_ManageTPAddress_CoOrdinate();
    }

    @Test
    public void viewManageTPRRR_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToManageTPRRR_view_completed();

        checkButtonsVisibility_CompletedScreens_ManageTPRRR_DarkFibre();
    }
    @Test
    public void viewDarkFibre_completed() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToDarkFibre_view_completed();

        checkButtonsVisibility_CompletedScreens_ManageTPRRR_DarkFibre();
    }

*//*    private void checkButtonsVisibility_CompletedScreens_Schedule1_2() throws InterruptedException {
        ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
        Assert.assertTrue(resiPage.isAmendOrderOptionExistsInActionDropdown(), "Amend Order");
        Assert.assertTrue(resiPage.isTerminateOrderOptionExistsInActionDropdown(), "Terminate Order");
        Assert.assertTrue(resiPage.isChangeTechnologyOptionExistsInActionDropdown(), "Change Technology");
        Assert.assertTrue(resiPage.isManageTPOptionExistsInActionDropdown(), "Manage TP");
        Assert.assertTrue(resiPage.isRelocateOptionExistsInActionDropdown(), "Relocate");
    }*//*

    *//*private void checkButtonsVisibility_CompletedScreens_Schedule3() throws InterruptedException {
        ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
        Assert.assertTrue(resiPage.isAmendOrderOptionExistsInActionDropdown(), "Amend Order");
        Assert.assertTrue(resiPage.isTerminateOrderOptionExistsInActionDropdown(), "Terminate Order");
        Assert.assertTrue(resiPage.isChangeTechnologyOptionExistsInActionDropdown(), "Change Technology");
        Assert.assertTrue(resiPage.isManageTPOptionExistsInActionDropdown(), "Manage TP");

        Assert.assertFalse(resiPage.isRelocateOptionExistsInActionDropdown(), "Relocate");
    }

    private void checkButtonsVisibility_CompletedScreens_Schedule8_9() throws InterruptedException {
        ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
        Assert.assertTrue(resiPage.isAmendOrderOptionExistsInActionDropdown(), "Amend Order");
        Assert.assertTrue(resiPage.isTerminateOrderOptionExistsInActionDropdown(), "Terminate Order");
        Assert.assertTrue(resiPage.isManageTPOptionExistsInActionDropdown(), "Manage TP");
        Assert.assertTrue(resiPage.isRelocateOptionExistsInActionDropdown(), "Relocate");

        Assert.assertFalse(resiPage.isChangeTechnologyOptionExistsInActionDropdown(), "Change Technology");
    }

    private void checkButtonsVisibility_CompletedScreens3_Schedule4_5_6_7_10_11_13() throws InterruptedException {
        ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
        Assert.assertTrue(resiPage.isAmendOrderOptionExistsInActionDropdown(), "Amend Order");
        Assert.assertTrue(resiPage.isTerminateOrderOptionExistsInActionDropdown(), "Terminate Order");

        Assert.assertFalse(resiPage.isManageTPOptionExistsInActionDropdown(), "Manage TP");
        Assert.assertFalse(resiPage.isRelocateOptionExistsInActionDropdown(), "Relocate");
        Assert.assertFalse(resiPage.isChangeTechnologyOptionExistsInActionDropdown(), "Change Technology");
    }

    private void checkButtonsVisibility_CompletedScreens_FTO_EFTO_ManageTPAddress_CoOrdinate() throws InterruptedException {
        ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
        Assert.assertTrue(resiPage.isAmendOrderOptionExistsInActionDropdown(), "Amend Order");

        Assert.assertFalse(resiPage.isTerminateOrderOptionExistsInActionDropdown(), "Terminate Order");
        Assert.assertFalse(resiPage.isManageTPOptionExistsInActionDropdown(), "Manage TP");
        Assert.assertFalse(resiPage.isRelocateOptionExistsInActionDropdown(), "Relocate");
        Assert.assertFalse(resiPage.isChangeTechnologyOptionExistsInActionDropdown(), "Change Technology");
    }

    private void checkButtonsVisibility_CompletedScreens_ManageTPRRR_DarkFibre() throws InterruptedException {
        ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
        Assert.assertFalse(resiPage.isActionDropdownDisplayed(), "Action dropdown displayed which is wrong.");
    }*/
}