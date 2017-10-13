package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.NBAPDPtoNBAPTPConnectionPage;

import java.awt.*;
import java.net.URISyntaxException;

public class NBAPDPtoNBAPTPConnectionTest extends CommonComponentPageTest {

	@Test
	public void testAllFields() throws InterruptedException, URISyntaxException, AWTException {
		dashboardPage.clickOrderManagementLink().nbapDpToNbapTpConnectionLink();
		NBAPDPtoNBAPTPConnectionPage nbapdPtoNBAPTPConnectionPage = new NBAPDPtoNBAPTPConnectionPage(driver);
		nbapdPtoNBAPTPConnectionPage.checkGetDetails();
		Thread.sleep(2000);

		checkNBAPDPDetailsComponent(nbapdPtoNBAPTPConnectionPage);
		checkNBAPTPDetailsComponent(nbapdPtoNBAPTPConnectionPage);

		nbapdPtoNBAPTPConnectionPage.checkFeasibilityWithDescriptionofAddress();
		checkFeaisbiltyComponentWithDescriptionofAddress(nbapdPtoNBAPTPConnectionPage);
		checkFeaisbiltyComponentWithNbapAddress(nbapdPtoNBAPTPConnectionPage);
		testRequestForNbapDptoNbapTpConnection(nbapdPtoNBAPTPConnectionPage);

		testSuccessPage("The NBAP DP to NBAP TP Connection request has been submitted successfully.");
	}
	public void checkNBAPDPDetailsComponent(NBAPDPtoNBAPTPConnectionPage nbapdPtoNBAPTPConnectionPage) {

		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getReferenceSchedule10ORILabel(), "Reference Schedule 10 ORI*",
				" Reference Schedule 10 ORI* label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getDpNameLabel(), "DP Name",
				"DP Name label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getDescriptionOfAddLabel(), "Description of Address*",
				"Description of Address label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getStreetNameLabel(), "Street Name",
				"Street Name label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getNearestPostalCodeLabel(), "Nearest Postal Code",
				"Nearest Postal Code label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getLandmarkLabel(), "Landmark",
				"Landmark label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getDPCoOrdinateSystemLabel(), "DP Co-ordinate System",
				"DP Co-ordinate System label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getGpsCoOrdinateXLabel(), "GPS Co-ordinate X",
				"GPS Co-ordinate X label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getGpsCoOrdinateYLabel(), "GPS Co-ordinate Y",
				"GPS Co-ordinate Y label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getHeightLabel(), "Height",
				"Height label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getInstallationChargeLabel(), "Installation Charge",
				"Installation Charge label should be prsent but it is not ");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getServiceActivationChargeLabel(), "Service Activation Charge",
				"Service Activation Charge label should be prsent but it is not ");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isInstallationChargeValuePresent(),
				"Installation charge value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isServiceActivationChargeValuePresent(),
				"Service activation charge value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isToolTipPtresentForInstallationType(),
				"Tooltip for installation charge should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpNameValueTextBoxDisable(),
				"DP Name field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpDescriptionAddressValueTextBoxDisable(),
				"Description of Address field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpStreetNameValueTextBoxDisable(),
				"Street Name field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpNearestPostalCodeValueTextBoxDisable(),
				"Nearest Postal Code field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpLandmarkValueTextBoxDisable(),
				"Landmark field textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpCoordinateSystemDropDownDisable(),
				"DP Co-ordinate System dropdown should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpGpsCoordinateXValueTextBoxDisable(),
				"GPS Co-ordinate X textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpGpsCoordinateYValueTextBoxDisable(),
				"GPS Co-ordinate Y textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isDpHeightValueTextBoxDisable(),
				"Height textbox should be disable but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isToolTipPtresentForNbapDPDetailsServiceActivationCharge(),
				"Service Activation Charge Tooltip should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isToolTipPtresentForNbapDpFormHeight(),
				"Height Tooltip should be present but it is not");
	}

	public void checkNBAPTPDetailsComponent(NBAPDPtoNBAPTPConnectionPage nbapdPtoNBAPTPConnectionPage) {
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getAddressOptionLabel(), "Address Option*",
				"Address Option* label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getDescriptionAddressLabel(), "Description of Address*",
				"Description of Address* label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getNearestPostalCodeLabel(), "Nearest Postal Code",
				"Nearest Postal Code label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getLandmarkLabel(), "Landmark",
				"Landmark label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getCoordinateSysLabel(), "Co-ordinate System*",
				"Co-ordinate System* label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getXCoordinateLabel(), "GPS Co-ordinate X*",
				"GPS Co-ordinate X* label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getYCoordinateLabel(), "GPS Co-ordinate Y*",
				"GPS Co-ordinate Y* label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getHeightTpLabel(), "Height*",
				"Height* label should be prsent but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isToolTipPtresentForNbapTpFormHeight(),
				"Height Tooltip should be present but it is not");
	}

	public void checkFeaisbiltyComponentWithDescriptionofAddress(NBAPDPtoNBAPTPConnectionPage nbapdPtoNBAPTPConnectionPage) {

		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getCoverageStatusLabel(), "Coverage Status",
				"Coverage Status label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getInstallationChargeLabel(), "Installation Charge",
				"Installation Charge label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getServiceActivationChargeLabel(), "Service Activation Charge",
				"Service Activation Charge label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getFileInputLabel(), "Upload Required Documents*",
				"Service Activation Charge label should be prsent but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isCoverageStatusValuePresent(),
				"Coverage status value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isFeasibilityInstallationChargeValuePresent(),
				"Insatallation charge value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isFeasibilityServiceActivationChargeValuePresent(),
				"Service Activation Charge should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isToolTipFeasibilityInstallationCharges(),
				"Installation Charges Tooltip should be present but it is not");
		/*
		 * Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.
		 * isToolTipPtresentBrowseAndUpload(),
		 * "Browse And Upload Tooltip should be present but it is not");
		 */ // to do

	}

	public void checkFeaisbiltyComponentWithNbapAddress(NBAPDPtoNBAPTPConnectionPage nbapdPtoNBAPTPConnectionPage) {
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getStreetNameLabel(), "Street Name",
				"Street Name label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getCoverageStatusLabel(), "Coverage Status",
				"Coverage Status label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getInstallationChargeLabel(), "Installation Charge",
				"Installation Charge label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getServiceActivationChargeLabel(), "Service Activation Charge",
				"Service Activation Charge label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getFileInputLabel(), "Upload Required Documents*",
				"Service Activation Charge label should be prsent but it is not.");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isCoverageStatusValuePresent(),
				"Coverage status value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isFeasibilityInstallationChargeValuePresent(),
				"Insatallation charge value should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isFeasibilityServiceActivationChargeValuePresent(),
				"Service Activation Charge should be present but it is not");
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isToolTipFeasibilityInstallationCharges(),
				"Installation Charges Tooltip should be present but it is not");
		/*
		 * Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.
		 * isToolTipPtresentBrowseAndUpload(),
		 * "Browse And Upload Tooltip should be present but it is not");
		 */ // to do

	}

	public void testRequestForNbapDptoNbapTpConnection(NBAPDPtoNBAPTPConnectionPage nbapdPtoNBAPTPConnectionPage) throws InterruptedException {
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getSiteSurveyDateLabel(), "Site Survey Date*",
				"Site Survey Date label should be prsent but it is not.");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getPreferredSiteSurveySessionLabel(),
				"Preferred Site Survey Session", "Preferred Site Survey Session label should be prsent but it is not.");
		super.testAddtionalInfoComponent();
		super.testRequestingLicenseeFunc();
		Assert.assertTrue(nbapdPtoNBAPTPConnectionPage.isSubmitButtonDisable(),
				"Submit Button should be disable but it is not");
		Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.getApplicationReferenceIdentifierLabel(),
				"Application Reference Identifier*",
				"Application Reference Identifier label should be prsent but it is not.");
		nbapdPtoNBAPTPConnectionPage.selectInstallationDateAndSubmitRequest();
		/*
		 * Assert.assertEquals(nbapdPtoNBAPTPConnectionPage.
		 * getConfirmationMessageLabel(),
		 * "The NBAP DP to NBAP TP Connection request has been submitted successfully."
		 * ," Confirmation message label should be prsent but it is not.");
		 */
	}
}
