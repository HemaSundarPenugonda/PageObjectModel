package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.ManageTpViewPage;

public class ManageTPViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void testApplicationDetailsComponentForSc1() throws Exception {

		// StartPage startpage = new StartPage(driver);
		// startpage.login().clickOrderManagementLink().clickResiLink().navigateToResiViewUrl().clickOnManageTPButton().navigateToNonResiViewPage();
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ManageTpViewPage manageTpViewPage = new ManageTpViewPage(driver);
		manageTpViewPage.clickOnManageTPButton();
		dashboardPage.navigateToView_Completed(2);

		Assert.assertEquals(manageTpViewPage.getCurrentStatusLabel(), "Current Status",
				"Current Status Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier Label should present but it is not");

		Assert.assertEquals(manageTpViewPage.getAriHeaderLabel(), "Application Reference Identifier",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection Label should present but it is not");
		Assert.assertTrue(manageTpViewPage.isCurrentStatusOfViewOrderValuePresent(),
				"Current status value should be present");
		Assert.assertTrue(manageTpViewPage.isAppDetailsORIValuePresent(),
				"Order Request Identifier value should be present");

		Assert.assertTrue(manageTpViewPage.isAriTextBoxPresent(),
				"Application Reference Identifier value should be present");
		Assert.assertTrue(manageTpViewPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present");
		Assert.assertTrue(manageTpViewPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date value should be present");
		Assert.assertTrue(manageTpViewPage.isAppDetailsRPDValuePresent(),
				"Timeline to Complete value should be present");
		Assert.assertTrue(manageTpViewPage.isAppDetailsRORPresent(), "Reason for Rejection value should be present");
	}

	@Test(enabled = true)
	public void testExistingUserAddressDetailsComponentforSc1() throws Exception {

		// StartPage startpage = new StartPage(driver);
		// startpage.login().clickOrderManagementLink().clickResiLink().navigateToResiViewUrl().clickOnManageTPButton().navigateToNonResiViewPage();
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);

		ManageTpViewPage manageTpViewPage = new ManageTpViewPage(driver);
		manageTpViewPage.clickOnManageTPButton();
		dashboardPage.navigateToView_Completed(2);

		Assert.assertEquals(manageTpViewPage.getPostalLabel(), "Postal Code",
				"Postal Code Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getUnitNumLabel(), "Unit Number",
				"Unit Number Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getOptionLabel(), "Building Number",
				"Building Number Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getBuildingNameLabel(), "Building Name",
				"Building Name Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getStreetNameLabel(), "Street Name",
				"Street Name Label should present but it is not");

		Assert.assertTrue(manageTpViewPage.isPostalCodeTextBoxDisable(),
				"Postal Code Text Box should Disable but it is not");
		Assert.assertTrue(manageTpViewPage.isUnitNumberTextBoxDisable(),
				"Unit Number Text Box should Disable but it is not");
		Assert.assertTrue(manageTpViewPage.buildingNumberOptionDropdown(),
				"Building Number Option Dropdown should Disable but it is not");
		Assert.assertTrue(manageTpViewPage.isBuildingNameTextBoxDisable(),
				"Building Name Text Box should Disable but it is not");
		/*
		 * Assert.assertTrue(manageTpViewPage.isCopifTypeTextBoxDisable(),
		 * "Building Name Text Box should Disable but it is not");
		 */
	}

	@Test(enabled = true)
	public void testManageTpDetailsForSc1() throws Exception {
		// StartPage startpage = new StartPage(driver);
		// startpage.login().clickOrderManagementLink().clickResiLink().navigateToResiViewUrl().clickOnManageTPButton().navigateToNonResiViewPage();
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);

		ManageTpViewPage manageTpViewPage = new ManageTpViewPage(driver);
		manageTpViewPage.clickOnManageTPButton();
		dashboardPage.navigateToView_Completed(2);

		Assert.assertEquals(manageTpViewPage.getOperationToBePerformedLabel(), "Operation to be performed",
				"Operation to be performed Label should present but it is not");
		Assert.assertTrue(manageTpViewPage.isPostalCodeTextBoxDisable(),
				"Operation to be performed dropdown should Disable but it is not");
		Assert.assertEquals(manageTpViewPage.getActivationDateLabel(), "Requested Date of Activation",
				"Requested Date of Activation Label should present but it is not");
		Assert.assertEquals(manageTpViewPage.getInstallationSessionLabel(), "Preferred Installation Session",
				"Preferred Installation Session Label should present but it is not");
		Assert.assertTrue(manageTpViewPage.isDaypickerDisable(),
				"Requested Date of Activation text field should Disable but it is not");
		Assert.assertTrue(manageTpViewPage.isTimepickerDropDownDisable(),
				"referred Installation Session dfrop down should Disable but it is not");
		Assert.assertEquals(manageTpViewPage.getLicenseeNameLabel(), "Requesting Licensee Name",
				"For REQUESTING LICENSEE component:Label Requesting Licensee Name* "
						+ "should be present but it is not ");
		Assert.assertEquals(manageTpViewPage.getDesignationLabel(), "Designation",
				"For REQUESTING LICENSEE component:Label Designation* " + "should be present but it is not ");
		Assert.assertEquals(manageTpViewPage.getRlCompanyNameLabel(), "Company Name",
				"For REQUESTING LICENSEE component:Label Company Name* " + "should be present but it is not ");
		Assert.assertEquals(manageTpViewPage.getContactNumber_RL_Label(), "Contact Number",
				"For REQUESTING LICENSEE component:Label  contactNumber* " + "should be present but it is not ");
		Assert.assertEquals(manageTpViewPage.getFaxNumberLabel(), "Fax Number",
				"For REQUESTING LICENSEE component:Label faxNumber* " + "should be present but it is not ");
		Assert.assertEquals(manageTpViewPage.getEmailAddress_RL_Label(), "Email Address",
				"For REQUESTING LICENSEE component:Label emailAddress " + "should be present but it is not ");
	}

}
