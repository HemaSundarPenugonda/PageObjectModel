package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;
import com.amdocs.nlt.viewpages.NBAPDPtoNBAPTPConnectionViewPage;

public class NBAPDPtoNBAPTPConnectionViewTest extends CommonViewTest {

	@Test
	public void testViewDetailsPage_Schedule11() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapDpToNbapTpConnectionLink().navigateToView_Pending(11);

		checkApplicationDetailsComponent();
		checkNBAPDPDetailsComponent();
		checkTechnicalDetailComponent();
		checkNetworkAttributesComponent();
		checkSiteSurveyDateAndTimeSlotComponent();
		checkNBAPTPDetailsComponent();
	}

	public void checkApplicationDetailsComponent() {

		NBAPDPtoNBAPTPConnectionViewPage nbapdPtoNBAPTPConnectionViewPage = new NBAPDPtoNBAPTPConnectionViewPage(driver);

		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getCurrentStatusLabel(), "Current Status",
				"Current Status label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
	/*	Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAppDetailsCINLabel(), "Circuit Identifier Number",
				"Circuit Identifier Number label should be present but it is not ");*/
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAriHeaderLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isCurrentStatusValuePresent(),
				"Current status value should be present but it is not ");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAppDetailsORIValuePresent(),
				"Order Request Identifier value should be present but it is not ");
		/*Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAppDetailsCINValuePresent(),
				"Circuit Identifier Number value should be present but it is not ");*/
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAriInputTextBoxDisable(),
				"Application Reference Identifier value field should be disable but it is not ");

		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAriInputTextBoxDisable(),
				"Application Reference Identifier value field should be disable but it is not ");

		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present but it is not ");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should be present but it is not ");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete should be present but it is not ");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAppDetailsRORvaluePresent(),
				"Reason for Rejection should be present but it is not ");
	}

	public void checkNBAPDPDetailsComponent() {

		NBAPDPtoNBAPTPConnectionViewPage nbapdPtoNBAPTPConnectionViewPage = new NBAPDPtoNBAPTPConnectionViewPage(driver);
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getReferenceSchedule10ORILabel(),
				"Reference Schedule 10 ORI", " Reference Schedule 10 ORI label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getDpNameLabel(), "DP Name",
				"DP Name label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getDescriptionOfAddLabel(), "Description of Address",
				"Description of Address label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getStreetNameLabel(), "Street Name",
				"Street Name label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getNearestPostalCodeLabel(), "Nearest Postal Code",
				"Nearest Postal Code label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getLandmarkLabel(), "Landmark",
				"Landmark label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getDPCoOrdinateSystemLabel(), "DP Co-ordinate System",
				"DP Co-ordinate System label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getGpsCoOrdinateXLabel(), "GPS Co-ordinate X",
				"GPS Co-ordinate X label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getGpsCoOrdinateYLabel(), "GPS Co-ordinate Y",
				"GPS Co-ordinate Y label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getHeightLabel(), "Height",
				"Height label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getInstallationChargeLabel(), "Installation Charge",
				"Installation Charge label should be present but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getServiceActivationChargeLabel(),
				"Service Activation Charge", "Service Activation Charge label should be present but it is not ");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isInstallationChargeValuePresent(),
				"Installation charge value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isServiceActivationChargeValuePresent(),
				"Service activation charge value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isToolTipPtresentForInstallationType(),
				"Tooltip for installation charge should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpNameValueTextBoxDisable(),
				"DP Name field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpDescriptionAddressValueTextBoxDisable(),
				"Description of Address field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpStreetNameValueTextBoxDisable(),
				"Street Name field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpNearestPostalCodeValueTextBoxDisable(),
				"Nearest Postal Code field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpLandmarkValueTextBoxDisable(),
				"Landmark field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpCoordinateSystemDropDownDisable(),
				"DP Co-ordinate System dropdown should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpGpsCoordinateXValueTextBoxDisable(),
				"GPS Co-ordinate X textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpGpsCoordinateYValueTextBoxDisable(),
				"GPS Co-ordinate Y textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDpHeightValueTextBoxDisable(),
				"Height textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isToolTipPtresentForNbapDPDetailsInstallationCharge(),
				"Service Activation Charge Tooltip should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isToolTipPtresentForNbapDpFormHeight(),
				"Height Tooltip should be present but it is not");

	}

	public void checkNetworkAttributesComponent() {

		NBAPDPtoNBAPTPConnectionViewPage nbapdPtoNBAPTPConnectionViewPage = new NBAPDPtoNBAPTPConnectionViewPage(
				driver);
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getNetAttrOrderTypeLabel(), "Order Type",
				"Order Type label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getNetAttrRlfdfTransmissionTieCablePortLabel(),
				"RL FDF Transmission Tie Cable Port",
				"RL FDF Transmission Tie Cable Port label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getNetAttrMDFCabinetLabel(), "MDF Cabinet ID",
				"MDF Cabinet ID label should be present but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isNetAttrOrderTypeValuePresent(),
				"Order Type value should be present but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isNetAttrRlfdfTransmissionTieCablePortValuePresent(),
				"RL FDF Transmission Tie Cable Port value should be present but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isNetAttrMDFCabinetValuePresent(),
				"Order Type value should be present but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isRedundancyOriLabelDisplayed(),
				"Reduncency Ori label should be displayed but it is not.");

	}

	public void checkSiteSurveyDateAndTimeSlotComponent() {
		super.checkSiteSurveyDateAndTimeSlotComponent();

		NBAPDPtoNBAPTPConnectionViewPage nbapdPtoNBAPTPConnectionViewPage = new NBAPDPtoNBAPTPConnectionViewPage(
				driver);
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getActivationDateLabel(), "Site Survey Date",
				"Site Survey Date label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getInstallationSessionLabel(),
				"Preferred Site Survey Session",
				"Preferred Site Survey Session Name label should be present but it is not.");
	}

	public void checkNBAPTPDetailsComponent() {
		NBAPDPtoNBAPTPConnectionViewPage nbapdPtoNBAPTPConnectionViewPage = new NBAPDPtoNBAPTPConnectionViewPage(
				driver);
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getAddressOptionLabel(), "Address Option",
				"Site Survey Date label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getDescriptionAddressLabel(), "Description of Address",
				"Description of Address label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getNearestTpPostalCodeLabel(), "Nearest Postal Code",
				"Nearest Postal Code label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getLandmarkTpLabel(), "Landmark",
				"Landmark label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getCoOrdinateSystemTpLabel(), "Co-ordinate System",
				"Co-ordinate System label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getGpsCoordinateXTpLabel(), "GPS Co-ordinate X",
				"GPS Co-ordinate X label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getGpsCoordinateYTpLabel(), "GPS Co-ordinate Y",
				"GPS Co-ordinate Y label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getHeightTpLabel(), "Height",
				"Height label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getCoverageStatusLabel(), "Coverage Status",
				"Coverage Status label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getChargesLabel(), "Installation Charge",
				"Installation Charge label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.gerActivationChargesLabel(), "Service Activation Charge",
				"Service Activation Charge label should be present but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionViewPage.getFileInputLabel(), "Upload Required Documents",
				"Upload Required Documents label should be present but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAddressNbapRadioButtonDisable(),
				"Description of Address Radio Button Disable should be Disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isAddressDescriptionRadioButtonDisable(),
				"NBAP Address Radio Button Disable should be Disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isDescriptionAddressTextBoxDisable(),
				"Description of Address field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isNearestPostalCodeTextBoxDisable(),
				"Nearest Postal Code Text Box should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isLandmarkTextBoxDisable(),
				"Landmark Text Box should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isCoordinateSystemDropDownDisable(),
				"Coordinate System Drop Down textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isGpsCoordinateXTextBoxDisable(),
				"Gps Coordinate X TextBox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isGpsCoordinateYTextBoxDisable(),
				"Gps Coordinate Y TextBox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isHeightTextBoxDisable(),
				"Height TextBox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isCsValueLabelPresent(),
				"Cs Value Label should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isChargesValueLabelPresent(),
				"Charges Value Label should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isActivationValueLabel(),
				"Activation Value Label should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionViewPage.isFilesLabel(),
				"Files Label should be present but it is not");
	}
}