package com.amdocs.nlt.createTest;

import java.io.IOException;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.NonResidentialEndUserConnectionPage;
import com.amdocs.nlt.util.OrderTestData;

public class NonResidentialEndUserConnectionTest extends NonresidentialOrderTest {

	@Test(enabled = true)
	public void testAllComponentNonresi() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink();
		NonResidentialEndUserConnectionPage nonResiOrder = new NonResidentialEndUserConnectionPage(driver);
		nonResiOrder.submitFeasibility();
		super.testRequetedDateAndTimeFunc();
		super.testRequestingLicenseeFunc();
		Assert.assertEquals(nonResiOrder.getTechnologyLabel(), "Technology*",
				"For TechnicalDetail component:Label technology* " + "should be present but it is not");
		Assert.assertEquals(nonResiOrder.getSplitRatioDropdownDefaultValue(), "1:16",
				"default value in the technology dropdown " + "should be 1:16 but it is not");
		Assert.assertTrue(nonResiOrder.verifyActionWhenUserSelectOeAsTechnology(),
				"When User selects technology as OE then split ratio dropdwon gets disbaled with Default vaule as 1:16");
		Assert.assertEquals(nonResiOrder.getContractLabel(), "Contract Term",
				"Contract Term lable should be present but it is not");
		Assert.assertTrue(nonResiOrder.areSalutationDropDownValuesCorrect(),
				"Salutation drop down values should be valid");
		Assert.assertEquals(nonResiOrder.getDefaultValueForInstalltionOptionDropDown(),
				"In-building wiring to TP (Self Provide)", "" + "Default should be  Present but it is not");
		/*Assert.assertEquals(nonResiOrder.getDefaultDropdownValueForContractTerm(),
				"Contract Term dropdown defualt value should be 12 Months but it is not");*/
		Assert.assertEquals(nonResiOrder.getDataCenterLabel(), "Data Center*",
				"Label Data Center* should be present but it is not ");
		Assert.assertTrue(nonResiOrder.areContractTermDropdownVlauesAreCorrect(),
				"Contract term dropdown values should be valid");
		Assert.assertTrue(nonResiOrder.isNotRequiredRadiobuttonForExpressServiceIsDefaultChecked(),
				"buton should be default cheked");
		Assert.assertFalse(nonResiOrder.isRequiredRadiobuttonForExpressServiceSelected(),
				" buton should be default uncheked");
		Assert.assertTrue(nonResiOrder.isRadioButtonNoDefaultSelectedForDataCenter(),
				"Radio button No should be default selcted for contract term");
		Assert.assertTrue(nonResiOrder.areInstallationOptionDropDownValuesCorrect(),
				"Installation Option drop down values should be valid");
		/*
		 * Assert.assertEquals(nonResiOrder.
		 * getDefaultValueOfPrefInstallationSessionForReconnect(),
		 * "08:00-22:00",
		 * "default value in prefered installation  should be 00:00 - 23:59 but it is not "
		 * );
		 */
		Assert.assertEquals(nonResiOrder.getExternalDRCNLabel(), "External Data Center Rack Number",
				"LabelExternal Data Center Rack Number should be present but it is not ");
		Assert.assertEquals(nonResiOrder.getExpressServiceLabel(), "Express Service*",
				"LabelExternal Data Center Rack Number should be present but it is not ");
		testAddtionalInfoComponent();
		testTechnicalDetailFunc();
	}

	@Test(enabled = true)
	public void populateNonresiCreateOrderForm() throws InterruptedException {

		dashboardPage.clickOrderManagementLink().clikNonResiLink();
		NonResidentialEndUserConnectionPage nonResiOrder = new NonResidentialEndUserConnectionPage(driver);
		OrderTestData orderData = new OrderTestData("populateNonresiCreateOrderForm", "ORDER", "SCHEDULE2", "PROVIDE");
		orderData.setQueryParam(orderData.getAppRefNumber());
		orderData.setSubmitBeforeTime(new Date());
		nonResiOrder.populateCreateOrderForm(orderData);
		orderData.setSubmitAfterTime(new Date());
		Assert.assertEquals(nonResiOrder.VerifyConfirmationMessage(),
				"The Non-Residential End User Connection request has been submitted successfully.",
				"label should be prsent but it is not ");

	}
}
