package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.NonResiReclassifyPagePage;
import com.amdocs.nlt.page.NonResidentialEndUserConnectionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;
import com.amdocs.nlt.viewpages.NonResidentailEndUserConnectionViewPage;

public class NonResidentailEndUserConnectionViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void testNonResiViewComponents() throws Exception {
		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clikNonResiLink().navigateToView_Pending(1);
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Pending(1);
		NonResidentailEndUserConnectionViewPage nonResiViewPage = new NonResidentailEndUserConnectionViewPage(driver);
		checkApplicationDetailsComponent();
		testPriorityCircuitSection();
		nonResiViewPage.clickRequestingLincenseeComponent();
		testRequestingLicenseeFunc();
		Assert.assertTrue(nonResiViewPage.iSFirstNameBoxIsDisabledForAuthRep(),
				" first name text box should be disbaled for Auth Represenative but it is not");
		Assert.assertTrue(nonResiViewPage.iSLastNameBoxIsDisabledForAuthRep(),
				" last name text box should be disbaled for Auth Represenative but it is not");
		Assert.assertTrue(nonResiViewPage.iSContactNumTextboxDisabledForAuthRep(),
				" Contact numbertext box should be disbaled for Auth Represenative but it is not");
		Assert.assertTrue(nonResiViewPage.iSSalutationDropdownDisabled(),
				" Salutation drop down should be disbaled for Auth Represenative but it is not");
		Assert.assertTrue(nonResiViewPage.iSFirstNameBoxIsDisabledForPrimaryConact(),
				" first name text box  should be disbaled for primary contact but it is not");
		Assert.assertTrue(nonResiViewPage.iSLastNameBoxIsDisabledForPrimaryContact(),
				" last name text box  should be disbaled for primary contact but it is not");
		Assert.assertTrue(nonResiViewPage.iSContactNumTextboxDisabledForPrimaryContact(),
				"  Contact number text should be disbaled for primary contact but it is not");
		Assert.assertTrue(nonResiViewPage.iSFirstNameBoxIsDisabledForSecondaryConact(),
				" first name text box  should be disbaled for secondary contact but it is not");
		Assert.assertTrue(nonResiViewPage.iSLastNameBoxIsDisabledForSecondaryContact(),
				" last name text box  should be disbaled for secondary but it is not");
		Assert.assertTrue(nonResiViewPage.iSContactNumTextboxDisabledForSecondaryContact(),
				"  Contact number text should be disbaled for secondary but it is not");
		Assert.assertTrue(nonResiViewPage.isPreferedInstallationDropdownDisplayed(),
				" prefrred installation drop dwon should be disbaled   ");
		Assert.assertTrue(nonResiViewPage.isCalendarTextboxdisabled(), " calendat text box should be disbaled  ");
		Assert.assertTrue(nonResiViewPage.isTechnologyDropdownIsDisabled(),
				" technology dropdown should be disbaled  ");
		Assert.assertTrue(nonResiViewPage.isSpiltDropdownIsDisabled(), " split ratio dropdown should be disbaled  ");
		Assert.assertTrue(nonResiViewPage.isContractTermDropdownIsdisabled(),
				" contact term  dropdown should be disbaled  ");
		Assert.assertTrue(nonResiViewPage.isInstallationOptionDropdownIsdisabled(),
				"installation  dropdown should be disbaled  ");
		Assert.assertTrue(nonResiViewPage.isExternalDataRCnoTextboxDisabled(),
				" external data rack center should be disbaled  ");

	}

	/*id=1726
    Hema_Schedule2_View_Pending_Reconnect_ExpressYES*/
	@Test
	public void schedule2_RequestForExpressService_YES() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Reconnect_RequestForExpress_Yes(2);

		NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isRequiredRadiobuttonForExpressServiceSelected());
		Assert.assertFalse(page.isNotRequiredRadiobuttonForExpressServiceIsDefaultChecked());

	}
	/*id=1727
    Hema_Schedule2_View_Pending_Reconnect_ExpressNO*/
	@Test
	public void schedule2_RequestForExpressService_NO() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Reconnect_RequestForExpress_No(2);

		NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertFalse(page.isRequiredRadiobuttonForExpressServiceSelected());
		Assert.assertTrue(page.isNotRequiredRadiobuttonForExpressServiceIsDefaultChecked());
	}

	/*id=1765
    Hema_Schedule2_View_Pending_AmendUnitNumberIndTRUE*/
	@Test
	public void schedule2_AmendUnitNumberInd_TRUE() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_AmendUnitNumberInd_True(2);

		NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		page.clickAmendButton();
		Assert.assertTrue(page.isunitNumberTextBoxEnabled());

	}
	/*id=1781
    Hema_Schedule2_View_Pending_AmendUnitNumberIndFALSE*/
	@Test
	public void schedule2_AmendUnitNumberInd_FALSE() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_AmendUnitNumberInd_False(2);

		NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		page.clickAmendButton();
		Assert.assertFalse(page.isunitNumberTextBoxEnabled());
	}

	/*id=1765
    Hema_Schedule2_View_Pending_AmendUnitNumberIndTRUE*/
	@Test
	public void schedule2_Relocation_AmendUnitNumberInd_TRUE() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Completed(2);

		NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
		page.clickRelocateButton();

		dashboardPage.navigateToView_AmendUnitNumberInd_True(2);


		//To make sure that page is not breaking
		page.getCurrentSatus();
		page.clickAmendButton();
		Assert.assertTrue(page.isRelocationUnitNumberTextboxEnabled());
//		page.fillRelocationUnitNumberTextbox("11-111");
//		page.clickFeasibilityButton();


	}
	/*id=1781
    Hema_Schedule2_View_Pending_AmendUnitNumberIndFALSE*/
	@Test
	public void schedule2_Relocation_AmendUnitNumberInd_FALSE() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Completed(2);

		NonResidentialEndUserConnectionPage page = new NonResidentialEndUserConnectionPage(driver);
		page.clickRelocateButton();

		dashboardPage.navigateToView_AmendUnitNumberInd_False(2);

		//To make sure that page is not breaking
		page.getCurrentSatus();
		page.clickAmendButton();
		Assert.assertFalse(page.isRelocationUnitNumberTextboxEnabled());
	}

	@Test
	public void schedule2_Reclassify_FileUploadIndicator_YES() throws InterruptedException {
		dashboardPage.navigateToReclassify(2).navigateToView_FileUploadIndicator_Yes(2);

		NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isUploadDocumentsSectionDisplayed());
		Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
		Assert.assertTrue(page.isBrowseAndUploadButtonDisplayed());
	}
	/*id=1813
    Hema_Schedule1_View_Pending_FileUploadIndicator_NO*/
	@Test
	public void schedule2_Reclassify_FileUploadIndicator_NO() throws InterruptedException {
		dashboardPage.navigateToReclassify(2).navigateToView_FileUploadIndicator_No(2);

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
	public void schedule2_Reclassify_FileUploadIndicator_NO_UploadedFiles_NO() throws InterruptedException {
		dashboardPage.navigateToReclassify(2).navigateToView_FileUploadIndicator_No_UploadedFiles_No(2);

		NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertFalse(page.isUploadDocumentsSectionDisplayed());
	}
}
