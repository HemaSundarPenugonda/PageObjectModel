package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.BuildingMDFRoomToResidentialPremiseConnectionPage;
import com.amdocs.nlt.page.NonResiReclassifyPagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildingMDFRoomToResidentialConnectionViewTest extends CommonViewTest {
    /*id=1718
        Hema_Schedule8_View_Pending_HomePassFirstFree_Yes*/
    @Test
    public void schedule8_FirstPassFree_YES() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_HomePassFirstFree_Yes(8);

        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getInformationMessageForFirstPassFree(), "This is a case of 'first pass free', hence installation charge is zero");
    }
    /*id=1787
    Hema_Schedule8_View_Pending_HomePassFirstFree_NO*/
    @Test
    public void schedule8_FirstPassFree_NO() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_HomePassFirstFree_No(8);

        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }

    /*id=1718
    Hema_Schedule8_View_Pending_HomePassFirstFree_Yes*/
    @Test
    public void schedule8_Reclassify_FirstPassFree_YES() throws InterruptedException {
        dashboardPage.navigateToReclassify(8).navigateToView_HomePassFirstFree_Yes(8);

        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getInformationMessageForFirstPassFree(), "This is a case of 'first pass free', hence installation charge is zero");
    }
    /*id=1787
    Hema_Schedule8_View_Pending_HomePassFirstFree_NO*/
    @Test
    public void schedule8_Reclassify_FirstPassFree_NO() throws InterruptedException {
        dashboardPage.navigateToReclassify(8).navigateToView_HomePassFirstFree_No(8);

        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }



    /*id=1718
    Hema_Schedule8_View_Pending_HomePassFirstFree_Yes*/
    @Test
    public void schedule8_Relocation_FirstPassFree_YES() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Completed(8);
        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        page.clickRelocateButton();
        dashboardPage.navigateToView_HomePassFirstFree_Yes(8);

        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertEquals(page.getInformationMessageForFirstPassFree(), "This is a case of 'first pass free', hence installation charge is zero");
    }
    /*id=1787
    Hema_Schedule8_View_Pending_HomePassFirstFree_NO*/
    @Test
    public void schedule8_Relocation_FirstPassFree_NO() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Completed(8);
        BuildingMDFRoomToResidentialPremiseConnectionPage page = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
        page.clickRelocateButton();
        dashboardPage.navigateToView_HomePassFirstFree_No(8);

        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
    }

    @Test
    public void schedule8_Reclassify_FileUploadIndicator_YES() throws InterruptedException {
        dashboardPage.navigateToReclassify(8).navigateToView_FileUploadIndicator_Yes(8);

        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertTrue(page.isUploadDocumentsSectionDisplayed());
        Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
        Assert.assertTrue(page.isBrowseAndUploadButtonDisplayed());
    }
    /*id=1813
    Hema_Schedule1_View_Pending_FileUploadIndicator_NO
    */
    @Test
    public void schedule8_Reclassify_FileUploadIndicator_NO() throws InterruptedException {
        dashboardPage.navigateToReclassify(8).navigateToView_FileUploadIndicator_No(8);

        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertTrue(page.isUploadDocumentsSectionDisplayed());
        Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
        Assert.assertFalse(page.isBrowseAndUploadButtonDisplayed());
    }

    /*id=4642859
    Hema_Schedule1_View_Pending_FileUploadIndicator_NO_NoUploadedFiles*/
    @Test (enabled = true)
    public void schedule8_Reclassify_FileUploadIndicator_NO_UploadedFiles_NO() throws InterruptedException {
        dashboardPage.navigateToReclassify(8).navigateToView_FileUploadIndicator_No_UploadedFiles_No(8);

        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        //To make sure that page is not breaking
        page.getCurrentSatus();
        Assert.assertFalse(page.isUploadDocumentsSectionDisplayed());
    }
}
