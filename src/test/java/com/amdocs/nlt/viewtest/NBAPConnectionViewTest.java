package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.NBAPConnectionPage;
import com.amdocs.nlt.util.NavigationUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.RequestForNBAPConnectionViewPage;

public class NBAPConnectionViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void testNBAPViewAllComponents() throws Exception {
		// StartPage startpage = new StartPage(driver);
		// startpage.login().clickOrderManagementLink().nbapConnectionLink().navigateToViewUrlForPending();
		dashboardPage.clickOrderManagementLink().nbapConnectionLink().navigateToView_Pending(3);
		RequestForNBAPConnectionViewPage nbapViewPage = new RequestForNBAPConnectionViewPage(driver);
		Assert.assertTrue(nbapViewPage.iSOptionDropdownDisabled(), " option drop dwon should be disbaled ");
		Assert.assertTrue(nbapViewPage.iSPostalCodeTextDisabled(), " postal code  text box should be disbaled ");
		Assert.assertTrue(nbapViewPage.iSLandMarkTextDisabled(), " Land mark text box  should be disbaled ");
		Assert.assertTrue(nbapViewPage.iSCordinateSystemDropdownDisabled(),
				" coordinate system  drop down should be disbaled");
		Assert.assertTrue(nbapViewPage.iSXCordinateTextDisabled(), " X cordinate  text box  should be disbaled");
		Assert.assertTrue(nbapViewPage.iSYCordinateTextDisabled(), " X cordinate  text box  should be disbaled");
		Assert.assertTrue(nbapViewPage.iSHeightTextDisabled(), " Height text box  should be disbaled   ");

		Assert.assertTrue(nbapViewPage.isPreferredInstallationSessionDropdowndisabled(),
				" prefrred installation drop dwon should be disbaled   ");
		Assert.assertTrue(nbapViewPage.isCalendarTextboxdisabled(), " calendat text box should be disbaled  ");
		Assert.assertTrue(nbapViewPage.isTechnologyDropdownIsDisabled(), " technology dropdown should be disbaled ");
		super.checkApplicationDetailsComponent();
		Assert.assertEquals(nbapViewPage.getOptionLabel(), "Option", "Lable Option should be present but it is not");

		Assert.assertEquals(nbapViewPage.getAddressOptionLabel(), "Address Option",
				"Lable Address option should  be present but it is not");
		Assert.assertTrue(nbapViewPage.isOptionDropdownValuesCorrect(),
				"Order dropdown values  should be correct but they are not");
		Assert.assertTrue(nbapViewPage.isCordinteSystemDropdownValuesCorrect(),
				"coOrdinate System dropdown values hould be correct but they are not");
		Assert.assertEquals(nbapViewPage.getNearestPostalCodeLabel(), "Nearest Postal Code",
				"Label Nearest Postal Code should be present ");
		Assert.assertEquals(nbapViewPage.getLandmarkLabel(), "Landmark", "Label Lanmark Code should be present");
		Assert.assertEquals(nbapViewPage.getCoordinateSysLabel(), "Co-ordinate System",
				"Label Co-ordinate System Code should be present");
		Assert.assertEquals(nbapViewPage.getXCoordinateLabel(), "GPS Co-ordinate X",
				"LabelGPS Co-ordinate X* SystemCode should be present");
		Assert.assertEquals(nbapViewPage.getYCoordinateLabel(), "GPS Co-ordinate Y",
				"Lable GPS Co-ordinate Y* should be present ");
		Assert.assertEquals(nbapViewPage.getHeightLabel(), "Height", "Lable Height* should be present but it is not");
		Assert.assertEquals(nbapViewPage.getMeterLabel(), "Meter", "Lable Meter should be present but it is not");
		Assert.assertEquals(nbapViewPage.getInstallationChargeLabel(), "Installation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(nbapViewPage.getServiceActivationChargeLabel(), "Service Activation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(nbapViewPage.getReqDateOfActLabel(), "Site Survey Date",
				"Text should be Requested Date of Activation*but it is not");
		Assert.assertTrue(nbapViewPage.isRequestedDateTextBoxDisplayed(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertEquals(nbapViewPage.getPrefInstallLabel(), "Preferred Site Survey Session",
				"label should be prsent but it is not ");
		Assert.assertEquals(nbapViewPage.getCoverageStatusLabel(), "Coverage Status",
				"label should be prsent but it is not ");
		Assert.assertEquals(nbapViewPage.getUploadReqDocsLabel(), "Upload Required Documents",
				"label should be prsent but it is not ");
		Assert.assertEquals(nbapViewPage.getTechnologyLabel(), "Technology",
				"For TechnicalDetail component:Label technology* " + "should be present but it is not");
		Assert.assertEquals(nbapViewPage.getTechnologyDropdownDefaultValue(), "GPON",
				"For TechnicalDetail component:default value in the technology dropdown "
						+ "should be GPON but it is not");
		Assert.assertEquals(nbapViewPage.getContractLabel(), "Contract Term",
				"Contract Term lable should be present but it is not");
		Assert.assertEquals(nbapViewPage.getDefaultDropdownValueForContractTerm(), "12 Months",
				"Contract Term dropdown defualt value should be 12 Months but it is not");
		nbapViewPage.clickRequestingLincenseeComponent();
		super.testRequestingLicenseeFunc();
		/* Need to check this */
		/*
		 * Assert.assertEquals(nbapViewPage.getDescriptionOfAddLabel(),
		 * "Description of Address",
		 * "Label  Description of Address* should be present ");
		 */

	}

	/*"Min Occurances = 0
    Valid Values:
    EXISTING
    NEW
    NA
    Default : NA"*/
    /*id=1801
    Hema_Schedule3_View_Pending_PreInstall_Existing*/
	@Test (enabled = true, description = "DE1163")
	public void schedule3_PreInstall_EXISTING() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink();
		NavigationUtils.navigateToExtn(driver, "/sch3p_preinstall_existing");

		NBAPConnectionPage page = new NBAPConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isExistingRadioButtonSelected());
	}
	/*id=1804
    Hema_Schedule3_View_Pending_PreInstall_NEW*/
	@Test
	public void schedule3_PreInstall_NEW() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink();
		NavigationUtils.navigateToExtn(driver, "/sch3p_preinstall_new");

		NBAPConnectionPage page = new NBAPConnectionPage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertTrue(page.isNewRadioButtonSelected());
	}
}
