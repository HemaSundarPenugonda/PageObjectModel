package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.AcceptRejectFibreTakeoverPage;
import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.page.NonResiReclassifyPagePage;
import com.amdocs.nlt.page.ResidentialEndUserConnectionPage;
import com.amdocs.nlt.util.NavigationUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.ResidentialEndUserConnectionViewPage;

public class ResidentialEndUserConnectionViewPageTest extends CommonViewTest {

	@Test(enabled = true)
	public void testResiViewComponents() throws Exception {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Pending(1);
		ResidentialEndUserConnectionViewPage resiViewPage = new ResidentialEndUserConnectionViewPage(driver);
		Assert.assertEquals(resiViewPage.getPostalCodeLabel(), "Postal Code",
				"Lable postal code should be present but it is not");
		Assert.assertEquals(resiViewPage.getUnitNumLabel(), "Unit Number",
				"Lable Unit Number should be present but it is not");
		checkApplicationDetailsComponent();
		checkTechnicalDetailComponent();
		testPriorityCircuitSection();
		resiViewPage.clickRequestingLincenseeComponent();
		super.testRequestingLicenseeFunc();
		Assert.assertEquals(resiViewPage.getCoverageStatusLabel(), "Coverage Status",
				"For Residential User Details component:Label Coverage Status " + "should be present but it is not ");
		Assert.assertEquals(resiViewPage.getBuildingNumberLabel(), "Building Number",
				"For Residential User Details component:Label Building Number* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getBuildingNameLabel(), "Building Name",
				"For Residential User Details component:Label Building Name " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getStreetNameLabel(), "Street Name",
				"For Residential User Details component:Label Street Name " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getBuildingTypeLabel(), "Building Type",
				"For Residential User Details component:Label Building Type " + "should be present but it is not");
		Assert.assertTrue(resiViewPage.isBuildingTypeTextboxdDisplayed(),
				"Building Type text box should   be displayed but it is not");
		Assert.assertTrue(resiViewPage.isStreetNameTextboxPresent(),
				"Street Name text box should   be displayed but it is not");
		Assert.assertEquals(resiViewPage.getInstallationChargeLabel(), "Installation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(resiViewPage.getServiceActivationChargeLabel(), "Service Activation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(resiViewPage.getSalutationLabel(), "Salutation",
				"For Residential User Details component:Label Salutation* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getFirstNameLabel(), "First Name",
				"For Residential User Details component:Label First Name* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getLastNameLabel(), "Last Name",
				"For Residential User Details component:Label Last Name* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getContactNumberLabel(), "Contact Number",
				"For Residential User Details component:Label Contact Number* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getAlternateContactNumberLabel(), "Alternate Contact Number",
				"For Residential User Details component:Label Alternate Contact Number "
						+ "should be present but it is not");
		Assert.assertEquals(resiViewPage.getEmailAddressLabel(), "Email Address",
				"For Residential User Details component:Label Email Address* " + "should be present but it is not");
		Assert.assertTrue(resiViewPage.isPostalCodeTextBoxIsDisabledAndIsNotEmpty(),
				"postal code text box should be disbaled and it should conatin vaild value ");
		Assert.assertTrue(resiViewPage.isUnitNumTextBoxIsDisabledAndIsNotEmpty(),
				"unit number text box should be disbaled and should contain valid value ");
		Assert.assertTrue(resiViewPage.isFirstNameTextBoxIsDisabledAndIsNotEmpty(),
				"first name text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isLastNameTextBoxIsDisabled(),
				"last name text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isContactTextBoxIsDisabled(),
				"Contact number text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isAlternateContactTextBoxIsDisabled(),
				"Alterate Contact number text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isEmailAddTextBoxIsDisabled(),
				"Email Add text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isSalutationDropdownIsDisabled(),
				" Salutation drop dwon should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isPreferredInstallationSessionDropdowndisabled(),
				" prefrred installation drop dwon should be disbaled   ");
		Assert.assertTrue(resiViewPage.isCalendarTextboxdisabled(), " calendat text box should be disbaled  ");
		Assert.assertTrue(resiViewPage.isTechnologyDropdownIsDisabled(), " technology dropdown should be disbaled  ");
		Assert.assertTrue(resiViewPage.isSpiltDropdownIsDisabled(), " split ratio dropdown should be disbaled  ");
		Assert.assertTrue(resiViewPage.isNormalSlotRadioButtonIsdisbaled(),
				" normal slot radio button  should be disbaled  ");
		Assert.assertTrue(resiViewPage.isSeasonalSlotRadioButtonIsdisbaled(),
				" seasonal slot radio button should be disbaled  ");

	}

	/*id=1715
    Hema_Schedule1_View_Pending_HomePassFirstFree*/
	@Test
	public void schedule1_FirstPassFree_YES() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_HomePassFirstFree_Yes(1);

		ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertEquals(page.getInformationMessageForFirstPassFree(), "This is a case of 'first pass free', hence installation charge is zero");
	}
	/*id=1784
    Hema_Schedule1_View_Pending_HomePassFirstFree_No*/
	@Test
	public void schedule1_FirstPassFree_NO() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_HomePassFirstFree_No(1);

		ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
	}

	/*"Min Occurances = 0
    Valid Values:
    NORMAL
    SEASONAL"*/
    /*id=1800
    Hema_Schedule1_View_Pending_SlotType_Normal*/
	@Test
	public void schedule1_SlotType_NORMAL() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_TimeSlot_Normal(1);

		ResidentialEndUserConnectionPage page = new ResidentialEndUserConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isNormalSlotRadioButtonDefaultSelected());
	}
	/*id=1799
    Hema_Schedule1_View_Pending_SlotType_Seasonal*/
	@Test
	public void schedule1_SlotType_SEASONAL() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_TimeSlot_Seasonal(1);

		ResidentialEndUserConnectionPage page = new ResidentialEndUserConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isSeasonalSlotRadioButtonSelected());
	}

	/*    "Min Occurances = 1
    Valid Values:
    YES
    NO
    NA
    Default : NA"*/
    /*id=1815
    Hema_Schedule1_View_Pending_TakeOverApprovalRequired_YES
    */
	@Test
	public void schedule1_TakeOverApprovalRequired_YES() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink();
		//Need to move this to StartPage class
		NavigationUtils.navigateToExtn(driver, "/sch1p_takeoverapproval_yes");

		AcceptRejectFibreTakeoverPage page = new AcceptRejectFibreTakeoverPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isTakeOverAccordionDisplayed());
		Assert.assertEquals(page.getTakeOverAccordionText(), "Accept/Reject Fibre Takeover");
	}
	/*id=1816
    Hema_Schedule1_View_Pending_TakeOverApprovalRequired_NO_Approved
    */
	@Test
	public void schedule1_TakeOverApprovalRequired_NO() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink();
		//Need to move this to StartPage class
		NavigationUtils.navigateToExtn(driver, "/sch1p_takeoverapproval_no_approved");

		AcceptRejectFibreTakeoverPage page = new AcceptRejectFibreTakeoverPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isTakeOverAccordionDisplayed());
		Assert.assertEquals(page.getTakeOverAccordionText(), "Accept/Reject Fibre Takeover");
		Assert.assertEquals(page.getTakeOverStatus(), "APPROVED");

	}

	/*"Min Occurances = 1
    Valid Values:
    TRUE
    FALSE
    Default : FALSE"*/
	//Need to do it for all schedules
    /*id=1833
    Hema_Schedule1_View_Pending_KeepOrderOpenInd_TRUE*/
	@Test
	public void schedule1_KeepOrderOpenInd_True() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_KeepOrderOpenInd_True(1);

		CommonComponentPage page = new CommonComponentPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertEquals(page.getKivHeader(), "Order is in Pending State");
	}
	/*id=1835
    Hema_Schedule1_View_Pending_KeepOrderOpenInd_FALSE*/
	@Test
	public void schedule1_KeepOrderOpenInd_False() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_KeepOrderOpenInd_False(1);

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
    /*id=1836
    Hema_Schedule1_View_Pending_KivInd_TRUE*/
	@Test
	public void schedule1_KIVInd_True() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_KivInd_True(1);

		CommonComponentPage page = new CommonComponentPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertEquals(page.getKivSectionHeader(), "KIV Information");
	}
	/*id=1837
    Hema_Schedule1_View_Pending_KivInd_FALSE*/
	@Test
	public void schedule1_KIVInd_False() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_KivInd_False(1);

		CommonComponentPage page = new CommonComponentPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertEquals(page.getKivSectionHeader(), "KIV Information");
	}

	/*id=1715
    Hema_Schedule1_View_Pending_HomePassFirstFree*/
	@Test
	public void schedule1_Reclassify_FirstPassFree_YES() throws InterruptedException {
		dashboardPage.navigateToReclassify(1).navigateToView_HomePassFirstFree_Yes(1);

		ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertEquals(page.getInformationMessageForFirstPassFree(), "This is a case of 'first pass free', hence installation charge is zero");
	}
	/*id=1784
    Hema_Schedule1_View_Pending_HomePassFirstFree_No*/
	@Test
	public void schedule1_Reclassify_FirstPassFree_NO() throws InterruptedException {
		dashboardPage.navigateToReclassify(1).navigateToView_HomePassFirstFree_No(1);

		ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
	}

	/*id=1715
    Hema_Schedule1_View_Pending_HomePassFirstFree*/
	@Test
	public void schedule1_Relocation_FirstPassFree_YES() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
		page.clickRelocateButton();
		dashboardPage.navigateToView_HomePassFirstFree_Yes(1);

		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertEquals(page.getInformationMessageForFirstPassFree(), "This is a case of 'first pass free', hence installation charge is zero");
	}
	/*id=1784
    Hema_Schedule1_View_Pending_HomePassFirstFree_No*/
	@Test
	public void schedule1_Relocation_FirstPassFree_NO() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ResidentialEndUserConnectionViewPage page = new ResidentialEndUserConnectionViewPage(driver);
		page.clickRelocateButton();
		dashboardPage.navigateToView_HomePassFirstFree_No(1);

		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed());
	}

	/*"Min Occurances = 1
    Valid Values:
    YES
    NO
    Default : NO"*/
    /*id=1812
    Hema_Schedule1_View_Pending_FileUploadIndicator_YES
    */
	@Test
	public void schedule1_Reclassify_FileUploadIndicator_YES() throws InterruptedException {
		dashboardPage.navigateToReclassify(1).navigateToView_FileUploadIndicator_Yes(1);

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
	public void schedule1_Reclassify_FileUploadIndicator_NO() throws InterruptedException {
		dashboardPage.navigateToReclassify(1).navigateToView_FileUploadIndicator_No(1);

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
	public void schedule1_Reclassify_FileUploadIndicator_NO_UploadedFiles_NO() throws InterruptedException {
		dashboardPage.navigateToReclassify(1).navigateToView_FileUploadIndicator_No_UploadedFiles_No(1);
		dashboardPage.navigateToReclassify(1).navigateToView_FileUploadIndicator_No_UploadedFiles_No(1);

		NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertFalse(page.isUploadDocumentsSectionDisplayed());
	}

}
