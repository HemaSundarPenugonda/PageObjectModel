package com.amdocs.nlt.createTest;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.page.NBAPConnectionPage;
import com.amdocs.nlt.util.NbapConnectionTestData;

public class NBAPConnectionTest extends CommonComponentPageTest {

	@Test(enabled = true)

	public void testNBAPConnectionPageAllComponent() throws Exception {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink();
		NBAPConnectionPage nBapConnection = new NBAPConnectionPage(driver);
		Assert.assertEquals(nBapConnection.getOptionLabel(), "Option*", "Lable Option should be present but it is not");

		Assert.assertEquals(nBapConnection.getAddressOptionLabel(), "Address Option*",
				"Lable Address option should  be present but it is not");
		Assert.assertTrue(nBapConnection.isOptionDropdownValuesCorrect(),
				"Order dropdown values  should be correct but they are not");
		Assert.assertTrue(nBapConnection.isDescriptionRadioButtonDefaultChecked(),
				"Description radio button should be default checked but it is not");
		/*Assert.assertEquals(nBapConnection.getDefaultDropdownValueForOptionrDropdown(), "NLT to install",
				"Default dropdown value for option dropdown should be NLT to install  but it is not");*/
		Assert.assertTrue(nBapConnection.isCordinteSystemDropdownValuesCorrect(),
				"coOrdinate System dropdown values hould be correct but they are not");
		/*Assert.assertEquals(nBapConnection.getDefaultDropdownValueForCordinateSystemDropdown(), "Select",
				"Default dropdown value for Cordinate System Dropdown dropdown should be Select  but it is not");*/
		Assert.assertEquals(nBapConnection.getDescriptionOfAddLabel(), "Description of Address*",
				"Label  Description of Address* should be present ");
		Assert.assertEquals(nBapConnection.getStreetNameLabel(), "Street Name",
				"Label Street Name should be present but it is not ");
		Assert.assertEquals(nBapConnection.getNearestPostalCodeLabel(), "Nearest Postal Code",
				"Label Nearest Postal Code should be present ");
		Assert.assertEquals(nBapConnection.getLandmarkLabel(), "Landmark", "Label Lanmark Code should be present");
		Assert.assertEquals(nBapConnection.getCoordinateSysLabel(), "Co-ordinate System*",
				"Label Co-ordinate System Code should be present");
		Assert.assertEquals(nBapConnection.getXCoordinateLabel(), "GPS Co-ordinate X*",
				"LabelGPS Co-ordinate X* SystemCode should be present");
		Assert.assertEquals(nBapConnection.getYCoordinateLabel(), "GPS Co-ordinate Y*",
				"Lable GPS Co-ordinate Y* should be present ");
		Assert.assertEquals(nBapConnection.getHeightLabel(), "Height*",
				"Lable Height* should be present but it is not");
		Assert.assertEquals(nBapConnection.getMeterLabel(), "Meter", "Lable Meter should be present but it is not");
		Assert.assertTrue(nBapConnection.isNewRadioButtonDefaultChecked(),
				"New radio button should be default checked but it is not");
		NbapConnectionTestData nbapOrderData = new NbapConnectionTestData("submitNbapForm", "ORDER", "SCHEDULE3",
				"PROVIDE");
		nBapConnection.chekcFeasibilityWithPreinstalledNbapOption(nbapOrderData);
		Assert.assertEquals(nBapConnection.getPreInstallOptionLabel(), "Pre-install option*",
				"Label Pre-install option* should be present but it is not");
		Assert.assertEquals(nBapConnection.getInstallationChargeLabel(), "Installation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(nBapConnection.getServiceActivationChargeLabel(), "Service Activation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(nBapConnection.getCentralOfficeLabel(), "Central Office*",
				"Label Central Office* should be present but it is not");
		Assert.assertEquals(nBapConnection.getAGboxIndentifierLabel(), "AG Box Identifier*",
				"Label Central Office* should be present but it is not");
		Assert.assertTrue(nBapConnection.isCalendarIconPresent(), "Calendar icon should be present but it is not");

		Assert.assertEquals(nBapConnection.getReqDateOfActLabel(), "Site Survey Date",
				"Text should be Requested Date of Activation*but it is not");

		Assert.assertTrue(nBapConnection.isRequestedDateTextBoxDisplayed(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertEquals(nBapConnection.getDefaulPlaceholderForCalendarTextbox(), "DD/MM/YYYY",
				"label should be prsent but it is not ");

		Assert.assertEquals(nBapConnection.getDefaultValueForPreferedInstallationDropdown(),
				CommonComponentPage.PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE,
				"label should be prsent but it is not ");

		Assert.assertEquals(nBapConnection.getPrefInstallLabel(), "Preferred Site Survey Session",
				"label should be prsent but it is not ");
		Assert.assertEquals(nBapConnection.getCoverageStatusLabel(), "Coverage Status",
				"label should be prsent but it is not ");
		Assert.assertEquals(nBapConnection.getUploadReqDocsLabel(), "Upload Required Documents*",
				"label should be prsent but it is not ");

		nBapConnection.clickTechnicalDetail();
		Assert.assertEquals(nBapConnection.getTechnologyLabel(), "Technology*",
				"For TechnicalDetail component:Label technology* " + "should be present but it is not");
		Assert.assertEquals(nBapConnection.getTechnologyDropdownDefaultValue(), "GPON",
				"For TechnicalDetail component:default value in the technology dropdown "
						+ "should be GPON but it is not");
		Assert.assertEquals(nBapConnection.getContractLabel(), "Contract Term",
				"Contract Term lable should be present but it is not");
		Assert.assertEquals(nBapConnection.getDefaultDropdownValueForContractTerm(), "12 Months",
				"Contract Term dropdown defualt value should be 12 Months but it is not");
		//super.testTechnicalDetailFunc();
		super.testRequestingLicenseeFunc();
		super.testAddtionalInfoComponent();
		nbapOrderData.setQueryParam(nbapOrderData.getAppRefNumber());
		nbapOrderData.setSubmitBeforeTime(new Date());
		nBapConnection.SelectDateAndClickSubmitButton();
		/*
		 * Assert.assertEquals(nBapConnection.verifyConfirmationMessage(),
		 * "The NBAP Connection request has been submitted successfully.",
		 * "confirmation message should be present but it is not");
		 * 
		 * String result = isSoapRequestXmlStable(nbapOrderData);
		 * Assert.assertNull(result,
		 * "The soap request submitted is not stable it has following issues " +
		 * result);
		 */
		testSuccessPage("The NBAP Connection request has been submitted successfully.");
	}
}
