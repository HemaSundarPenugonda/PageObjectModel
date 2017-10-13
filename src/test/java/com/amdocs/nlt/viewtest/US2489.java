package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.*;
import com.amdocs.nlt.util.NavigationUtils;
import com.amdocs.nlt.viewpages.CoToBuildingMDFConnectionViewPage;
import com.amdocs.nlt.viewpages.ResidentialEndUserConnectionViewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US2489 extends CommonViewTest {

    /*id=1728
    Hema_Schedule2_View_Pending_Reconnect_ExpressINVALID*/
    @Test
    public void schedule2_RequestForExpressService_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikNonResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch2p_reconnect_requestforexpress_invalid");

        NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isRequiredRadiobuttonForExpressServiceSelected());
        Assert.assertTrue(page.isNotRequiredRadiobuttonForExpressServiceIsDefaultChecked());
    }

/*
    "Min Occurances = 1
    Valid Values:
    TRUE
    FALSE
    Default : FALSE"
*/

    /*id=1782
    Hema_Schedule2_View_Pending_AmendUnitNumberIndINVALID*/
    @Test
    public void schedule2_AmendUnitNumberInd_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikNonResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch2p_amendunitnumberind_invalid");

        NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        page.clickAmendButton();
        Assert.assertFalse(page.isunitNumberTextBoxEnabled());
    }
    /*"Valid Values:
    YES
    NO
    Default : NO"*/

    /*id=1716
    Hema_Schedule1_View_Pending_HomePassFirstFree_Invalid*/
    @Test
    public void schedule1_FirstPassFree_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch1p_homepassfirstfree_invalid");

        ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }


    /*id=1788
    Hema_Schedule8_View_Pending_HomePassFirstFree_INVALID*/
    @Test
    public void schedule8_FirstPassFree_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch8p_homepassfirstfree_invalid");

        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }

    /*id=1716
    Hema_Schedule1_View_Pending_HomePassFirstFree_Invalid*/
    @Test
    public void schedule1_Reclassify_FirstPassFree_INVALID() throws InterruptedException {
        dashboardPage.navigateToReclassify(1);
        NavigationUtils.navigateToExtn(driver, "/sch1p_homepassfirstfree_invalid");

        ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }


    /*id=1788
    Hema_Schedule8_View_Pending_HomePassFirstFree_INVALID*/
    @Test
    public void schedule8_Reclassify_FirstPassFree_INVALID() throws InterruptedException {
        dashboardPage.navigateToReclassify(8);
        NavigationUtils.navigateToExtn(driver, "/sch8p_homepassfirstfree_invalid");

        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }


    /*id=1716
    Hema_Schedule1_View_Pending_HomePassFirstFree_Invalid*/
    @Test
    public void schedule1_Relocation_FirstPassFree_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
        ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
        page.clickRelocateButton();
        NavigationUtils.navigateToExtn(driver, "/sch1p_homepassfirstfree_invalid");

        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }


    /*id=1788
    Hema_Schedule8_View_Pending_HomePassFirstFree_INVALID*/
    @Test
    public void schedule8_Relocation_FirstPassFree_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Completed(8);
        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        page.clickRelocateButton();
        NavigationUtils.navigateToExtn(driver, "/sch8p_homepassfirstfree_invalid");

        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }


    /*"Min Occurances = 0
    Valid Values:
    NORMAL
    SEASONAL"*/

/*    *//*id=1798
    Hema_Schedule1_View_Pending_SlotType_Invalid*//*
    @Test
    public void schedule1_SlotType_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch1p_timeslot_invalid");

        ResidentialEndUserConnectionPage page = new ResidentialEndUserConnectionPage(driver);
        Assert.assertTrue(page.isNormalSlotRadioButtonDefaultSelected());
    }*/
    /*"Min Occurances = 0
    Valid Values:
    EXISTING
    NEW
    NA
    Default : NA"*/

    /*id=1802
    Hema_Schedule3_View_Pending_PreInstall_NA*/
    @Test
    public void schedule3_PreInstall_NA() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().nbapConnectionLink();
        NavigationUtils.navigateToExtn(driver, "/sch3p_preinstall_na");

        NBAPConnectionPage page = new NBAPConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isExistingRadioButtonSelected());
        Assert.assertFalse(page.isNewRadioButtonSelected());
    }
    /*id=1805
    Hema_Schedule3_View_Pending_PreInstall_Invalid*/
    @Test(enabled = true, description = "DE1165")
    public void schedule3_PreInstall_Invalid() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().nbapConnectionLink();
        NavigationUtils.navigateToExtn(driver, "/sch3p_preinstall_invalid");

        NBAPConnectionPage page = new NBAPConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isExistingRadioButtonSelected());
        Assert.assertFalse(page.isNewRadioButtonSelected());
    }

    /*"Min Occurances = 0
    Valid Values:
    YES
    NO"*/

    /*id=1810
    Hema_Schedule5_View_Pending_PatchingCord_INVALID
    Request deatils section displayed empty which is wrong*/
    @Test(enabled = true, description = "DE1160")
    public void schedule5_PatchingCord_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickCotoMdfLink();
        NavigationUtils.navigateToExtn(driver, "/sch5p_patchingcord_invalid");

        CoToBuildingMDFConnectionViewPage page = new CoToBuildingMDFConnectionViewPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isPatchCableRequiredRadioButtonSelected());
        Assert.assertTrue(page.isPatchCableNotRequiredRadioButtonSelected());
    }

    /*"Min Occurances = 1
    Valid Values:
    YES
    NO
    Default : NO"*/

    /*id=1814
    Hema_Schedule1_View_Pending_FileUploadIndicator_INVALID*/
    @Test(enabled = false)
    public void schedule1_Reclassify_FileUploadIndicator_INVALID() throws InterruptedException {
        dashboardPage.navigateToReclassify(1);
        NavigationUtils.navigateToExtn(driver, "/sch1p_fileuploadindicator_invalid");

        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertTrue(page.isUploadDocumentsSectionDisplayed());
        Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
        Assert.assertFalse(page.isBrowseAndUploadButtonDisplayed());
    }


    /*id=1814
    Hema_Schedule1_View_Pending_FileUploadIndicator_INVALID
    */
    @Test(enabled = false)
    public void schedule2_Reclassify_FileUploadIndicator_INVALID() throws InterruptedException {
        dashboardPage.navigateToReclassify(2);
        NavigationUtils.navigateToExtn(driver, "/sch2p_fileuploadindicator_invalid");

        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertTrue(page.isUploadDocumentsSectionDisplayed());
        Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
        Assert.assertFalse(page.isBrowseAndUploadButtonDisplayed());
    }


    /*id=1814
    Hema_Schedule1_View_Pending_FileUploadIndicator_INVALID
    */
    @Test(enabled = false)
    public void schedule8_Reclassify_FileUploadIndicator_INVALID() throws InterruptedException {
        dashboardPage.navigateToReclassify(8);
        NavigationUtils.navigateToExtn(driver, "/sch8p_fileuploadindicator_invalid");

        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertTrue(page.isUploadDocumentsSectionDisplayed());
        Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
        Assert.assertFalse(page.isBrowseAndUploadButtonDisplayed());
    }


    /*id=1814
    Hema_Schedule1_View_Pending_FileUploadIndicator_INVALID
    */
    @Test(enabled = false)
    public void schedule9_Reclassify_FileUploadIndicator_INVALID() throws InterruptedException {
        dashboardPage.navigateToReclassify(9);
        NavigationUtils.navigateToExtn(driver, "/sch9p_fileuploadindicator_invalid");

        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertTrue(page.isUploadDocumentsSectionDisplayed());
        Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
        Assert.assertFalse(page.isBrowseAndUploadButtonDisplayed());
    }


    /*id=1817
    Hema_Schedule1_View_Pending_TakeOverApprovalRequired_NA_Approved
    */
    @Test
    public void schedule1_TakeOverApprovalRequired_NA() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch1p_takeoverapproval_na");

        AcceptRejectFibreTakeoverPage page = new AcceptRejectFibreTakeoverPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isTakeOverAccordionDisplayed());
    }
    /*id=1818
    Hema_Schedule1_View_Pending_TakeOverApprovalRequired_NULL
    */
    @Test
    public void schedule1_TakeOverApprovalRequired_null() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch1p_takeoverapproval_null");

        AcceptRejectFibreTakeoverPage page = new AcceptRejectFibreTakeoverPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isTakeOverAccordionDisplayed());
    }
    /*id=1827
    Hema_Schedule1_View_Pending_TakeOverApprovalRequired_INVALID*/
    @Test
    public void schedule1_TakeOverApprovalRequired_INVALID() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch1p_takeoverapproval_invalid");

        AcceptRejectFibreTakeoverPage page = new AcceptRejectFibreTakeoverPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isTakeOverAccordionDisplayed());
    }


    /*id=1834
    Hema_Schedule1_View_Pending_KeepOrderOpenInd_INVALID*/
    @Test(enabled = true, description = "DE1156")
    public void schedule1_KeepOrderOpenInd_Invalid() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch1p_keeporderopenind_invalid");

        CommonComponentPage page = new CommonComponentPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isKivHeaderDisplayed());
    }
    /*"Min Occurances = 1
    Valid Values:
    TRUE
            FALSE
    Default : FALSE"*/
    //Need to do it for all schedules

    /*id=1838
    Hema_Schedule1_View_Pending_KivInd_INVALID*/
    @Test
    public void schedule1_KIVInd_Invalid() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickResiLink();
        NavigationUtils.navigateToExtn(driver, "/sch1p_kivind_invalid");

        CommonComponentPage page = new CommonComponentPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isKivSectionHeaderDisplayed());
    }

    /*id=1841
    Hema_Schedule13_View_Pending_Owner_INVALID*/
    @Test (enabled = true, description = "DE1154")
    public void schedule13_OwnerFrom_Invalid() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();
        NavigationUtils.navigateToExtn(driver, "/sch13p_owner_invalid");

        PatchingServicePage page = new PatchingServicePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getPatchFromValue(), "Select");
    }


    /*id=1841
    Hema_Schedule13_View_Pending_Owner_INVALID*/
    @Test (enabled = true, description = "DE1154")
    public void schedule13_OwnerTo_Invalid() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();
        NavigationUtils.navigateToExtn(driver, "/sch13p_owner_invalid");

        PatchingServicePage page = new PatchingServicePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getPatchToValue(), "Select");
    }
}
