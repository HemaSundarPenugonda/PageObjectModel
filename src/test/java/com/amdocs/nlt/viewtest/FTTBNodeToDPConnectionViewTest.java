package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;
import com.amdocs.nlt.viewpages.FTTBNodeToDPConnectionViewPage;

public class FTTBNodeToDPConnectionViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void checkApplicationDetailsComponent() throws InterruptedException {

		dashboardPage.clickOrderManagementLink().clikFttbToDpLink()
			.navigateToView_Pending(1);
		FTTBNodeToDPConnectionViewPage fttbNodeToDPConnectionViewPage = new FTTBNodeToDPConnectionViewPage(driver);

		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getCurrentStatusLabel(), "Current Status",
				"Current Status label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getOrderRequestIdentifierLabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		/*Assert.assertEquals(fttbNodeToDPConnectionViewPage.getCircuitIdentifierNumber(), "Circuit Identifier Number",
				"Circuit Identifier Number label should be present but it is not ");*/
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getApplicationReferenceIdentifierLabel(),
				"Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getTentativeProvisionDateLabel(), "Tentative Provision Date",
				"Tentative Provision Date Label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getTimelineToCompleteLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getAppDetailsRORLabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isCurrentStatusOfViewOrderValuePresent(),
				"Current status value should be present");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isAppDetailsORIValuePresent(),
				"Order Request Identifier value should be present");
		/*Assert.assertTrue(fttbNodeToDPConnectionViewPage.isAppDetailsCINValuePresent(),
				"Circuit Identifier Number value should be present");*/
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isAriTextBoxPresent(),
				"Application Reference Identifier value should be present");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date value should be present");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isAppDetailsRPDValuePresent(),
				"Timeline to Complete value should be present");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isAppDetailsRORPresent(),
				"Reason for Rejection value should be present");
	}

	@Test(enabled = true)
	public void checkEndUserPremiseDetailsComponent() throws Exception {

		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clikFttbToDpLink();
		dashboardPage.clickOrderManagementLink().clikFttbToDpLink()
			.navigateToView_Pending(1);
		FTTBNodeToDPConnectionViewPage fttbNodeToDPConnectionViewPage = new FTTBNodeToDPConnectionViewPage(driver);

		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getPostalCodeLabel(), "Postal Code",
				"Postal Code label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getUnitNumberLabel(), "Unit Number",
				"Unit Number label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getCoverageStatusLabel(), "Coverage Status",
				"Coverage Status label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getBuildingNumberLabel(), "Building Number",
				"Building Number label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getBuildingNameLabel(), "Building Name",
				"Building Name label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getStreetNameLabel(), "Street Name",
				"Street Name label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getInstallationChargesLabel(), "Installation Charge",
				"Installation Charge label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getServiceActivationChargesLabel(),
				"Service Activation Charge", "Service Activation Charge label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getReferenceScheduleLabel(), "Reference Schedule 6 ORI",
				"Reference Schedule 6 ORI label should be present but it is not ");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isPostalCodeTextBoxDisable(),
				"Postal code text box should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isUnitNumberTextBoxDisable(),
				"Unit number text box should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isCsValueLabelValueLabelPresent(),
				"Coverage Status text box should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isBuildingNumberDropDownDisable(),
				"Building number text box should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isBuildingNameTextBoxDisable(),
				"Building name text box should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isStreetNameTextBoxDisable(),
				"Street name text box should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isChargesValueLabelPresent(),
				"installation charge label should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isActivationValueLabelPresent(),
				"Service activation label should be present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isReferenceScheduleValueTextBoxDisable(),
				"Reference Schedule 6 ORI text box should be disable but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isInstallationChargeTooltipPresent(),
				"Installation charge tool tip should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isReferenceSchedule6ORITooltipPresent(),
				"Reference Schedule 6 ORI Tool tip should be Present but it is not");
	}

	@Test(enabled = true)
	public void checkNetworkAttributeComponent() throws Exception {

		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clikFttbToDpLink();
		dashboardPage.clickOrderManagementLink().clikFttbToDpLink()
			.navigateToView_Pending(1);
		FTTBNodeToDPConnectionViewPage fttbNodeToDPConnectionViewPage = new FTTBNodeToDPConnectionViewPage(driver);

		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getNetAttrOrderTypeLabel(), "Order Type",
				"Order Type label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getFttbCabinetIdLabel(), "FTTB Cabinet ID",
				"FTTB Cabinet ID label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getFttbNodeStreetNameLabel(), "FTTB Node Street Name",
				"FTTB Node Street Name label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getFttbNodeHouseNumberLabel(), "FTTB Node House Number",
				"FTTB Node House Number label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getFttbNodePostalCodeLabel(), "FTTB Node Postal Code",
				"FTTB Node Postal Code label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getFttbNodeBuildingNameLabel(), "FTTB Node Building Name",
				"FTTB Node Building Name label should be present but it is not ");
		Assert.assertEquals(fttbNodeToDPConnectionViewPage.getFttbNodeBuildingTypeLabel(), "FTTB Node Building Type",
				"FTTB Node Building Type label should be present but it is not ");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isNetAttrOrderTypeValuePresent(),
				"Order Type Value should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isFttbCabinetIdValuePresent(),
				"Fttb Cabinet Id Value should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isFttbNodeStreetNameValuePresent(),
				"Fttb Node Street Name Value Present should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isFttbNodeHouseNumberValuePresent(),
				"Fttb Node House Number Value should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isFttbNodePostalCodeValuePresent(),
				"Fttb Node Postal Code Value should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isFttbNodeBuildingNameValuePresent(),
				"Fttb Node Building Name Value should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isFttbNodeBuildingTypeValuePresent(),
				"Fttb Node Building Type Value should be Present but it is not");
		Assert.assertTrue(fttbNodeToDPConnectionViewPage.isRedundancyOriLabelDisplayed(),
				"Reduncency Ori label should be displayed but it is not.");

	}

	@Test(enabled = true)
	public void testTechnicalDetailsComponent() throws Exception {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Pending(1);
		checkTechnicalDetailComponent();
	}
}
