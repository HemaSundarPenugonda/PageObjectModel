package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.util.NavigationUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;
import com.amdocs.nlt.viewpages.CoToBuildingMDFConnectionViewPage;

public class CoToBuildingMDFConnectionViewTest extends CommonCoViewTypeTest {

	@Test(enabled = true)
	public void checkApplicationDetailsComponent() throws InterruptedException{
		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickCotoMdfLink();
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink()
			.navigateToView_Pending(1);
		CoToBuildingMDFConnectionViewPage coToBuildingMDFConnectionViewPage = new CoToBuildingMDFConnectionViewPage(
				driver);
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getCurrentStatusLabel(), "Current Status",
				"Current Status label should be present but it is not ");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		/*Assert.assertEquals(coToBuildingMDFConnectionViewPage.getAppDetailsCINLabel(), "Circuit Identifier Number",
				"Circuit Identifier Number label should be present but it is not ");*/
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getAriHeaderLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application should be present but it is not ");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date Label should be present but it is not ");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isCurrentStatusOfViewOrderValuePresent(),
				"Current status value should be present");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isAppDetailsORIValuePresent(),
				"Order Request Identifier value should be present");
	/*	Assert.assertTrue(coToBuildingMDFConnectionViewPage.isAppDetailsCINValuePresent(),
				"Circuit Identifier Number value should be present");*/
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isAriInputTextBoxDisable(),
				"Application Reference Identifier value should be present");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date value should be present");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete value should be present");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isAppDetailsRORvaluePresent(),
				"Reason for Rejection value should be present");
		super.testRequestingLicenseeFunc();

	}

	@Test(enabled = true)
	public void checkCoToBuildingMDFConnectionDetailsComponent() throws Exception {
		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickCotoMdfLink();
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink()
			.navigateToView_Pending(1);
		CoToBuildingMDFConnectionViewPage coToBuildingMDFConnectionViewPage = new CoToBuildingMDFConnectionViewPage(
				driver);
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getSegmentFromCoLabel(), "Segment from CO",
				"Segment from CO label should be present but it is not");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getOrderOptionLabel(), "Order Option",
				"Order Option label should be present but it is not");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getPostalCodeLabel(), "Postal Code",
				"Postal Code label should be present but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isServingCabinetRadioButtonPresent(),
				"Serving Cabinet Radio Button should be disable but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isPostalCodeRadioButtonPresent(),
				"Postal Code Radio Button should be disable but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isSegmentFromCoDropDownPresent(),
				"Segment from CO dropdown should be present but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isPostalCodeTextBoxPresent(),
				"Postal Code textbox should be disable but it is not");
	}

	@Test(enabled = true)
	public void checkNetworkAttributesComponent() throws Exception {
		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickCotoMdfLink();
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink()
			.navigateToView_Pending(1);
		CoToBuildingMDFConnectionViewPage coToBuildingMDFConnectionViewPage = new CoToBuildingMDFConnectionViewPage(
				driver);
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getNetAttrOrderTypeLabel(), "Order Type",
				"Order Type label should be present but it is not");
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getNetAttrRlfdfTransmissionTieCablePortLabel(),
				"RL FDF Transmission Tie Cable Port",
				"RL FDF Transmission Tie Cable Port label should be present but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isNetAttrOrderTypeValuePresent(),
				"Order Type value should be disable but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isNetAttrRlfdfTransmissionTieCablePortValuePresent(),
				"RL FDF Transmission Tie Cable Port value should be disable but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isRedundancyOriLabelDisplayed(),
				"Reduncency Ori label should be displayed but it is not.");

	}

	@Test(enabled = true)
	public void checkRequestedDateComponent() throws Exception {
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink()
			.navigateToView_Pending(1);
		CoToBuildingMDFConnectionViewPage coToBuildingMDFConnectionViewPage = new CoToBuildingMDFConnectionViewPage(
				driver);
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getActivationDateLabel(), "Requested Date of Activation",
				"Requested Date of Activation label should be present but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isRequestedDateOfActivationTextBoxDisable(),
				"Requested Date of Activation text box should be disable but it is not");
	}

	@Test(enabled = true)
	public void checkTechnicalDetailsComponent() throws Exception {
		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickCotoMdfLink();
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink()
			.navigateToView_Pending(1);
		super.checkTechnicalDetailsComponent();

	}

	@Test(enabled = true)
	public void checkRequestDetailsComponent() throws Exception {
		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickCotoMdfLink();
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink()
			.navigateToView_Pending(1);
		CoToBuildingMDFConnectionViewPage coToBuildingMDFConnectionViewPage = new CoToBuildingMDFConnectionViewPage(
				driver);
		Assert.assertEquals(coToBuildingMDFConnectionViewPage.getPatchCableLabel(), "RL to provide own Patch Cable",
				"RL to provide own Patch Cable label should be present but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isPatchCableRequiredRadioButtonDisable(),
				"Patch Cable Required Radio Button should be disable but it is not");
		Assert.assertTrue(coToBuildingMDFConnectionViewPage.isPatchCableNotProvidedRadioButtonDisable(),
				"Patch Cable Not Provided Radio should be disable but it is not");
	}

	/*"Min Occurances = 0
    Valid Values:
    YES
    NO"*/
    /*id=1808
    Hema_Schedule5_View_Pending_PatchingCord_YES*/
	@Test
	public void schedule5_PatchingCord_YES() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink();
		NavigationUtils.navigateToExtn(driver, "/sch5p_patchingcord_yes");

		CoToBuildingMDFConnectionViewPage page = new CoToBuildingMDFConnectionViewPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isPatchCableRequiredRadioButtonSelected());
	}
	/*id=1809
    Hema_Schedule5_View_Pending_PatchingCord_NO*/
	@Test
	public void schedule5_PatchingCord_NO() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink();
		NavigationUtils.navigateToExtn(driver, "/sch5p_patchingcord_no");

		CoToBuildingMDFConnectionViewPage page = new CoToBuildingMDFConnectionViewPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isPatchCableNotRequiredRadioButtonSelected());
	}
}