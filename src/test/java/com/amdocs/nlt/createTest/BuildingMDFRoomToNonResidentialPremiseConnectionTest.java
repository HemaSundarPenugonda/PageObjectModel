package com.amdocs.nlt.createTest;

import java.io.IOException;

import com.amdocs.nlt.page.NonResiReclassifyPagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.BuildingMDFRoomToNonResidentialPremiseConnectionPage;
import com.amdocs.nlt.util.OrderTestData;

public class BuildingMDFRoomToNonResidentialPremiseConnectionTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testAllComponentOfMdfNonresi() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clikMdfToNonResiLink();
		BuildingMDFRoomToNonResidentialPremiseConnectionPage mdfNonResiOrder = new BuildingMDFRoomToNonResidentialPremiseConnectionPage(
				driver);
		mdfNonResiOrder.submitFeasibility();
		Assert.assertTrue(mdfNonResiOrder.areSalutationDropDownValuesCorrect(),
				"Salutation drop down values should be valid");
		super.testRequetedDateAndTimeFunc();
		super.testRequestingLicenseeFunc();
		mdfNonResiOrder.clickTechnicaDetai();
		Assert.assertEquals(mdfNonResiOrder.getContractLabel(), "Contract Term",
				"Contract Term lable should be present but it is not");
		Assert.assertEquals(mdfNonResiOrder.getDefaultDropdownValueForContractTerm(), "12 Months",
				"Contract Term dropdown defualt value should be 12 Months but it is not");
		Assert.assertEquals(mdfNonResiOrder.getDataCenterLabel(), "Data Center*",
				"Label Data Center* should be present but it is not ");
		Assert.assertTrue(mdfNonResiOrder.areContractTermDropdownVlauesAreCorrect(),
				"Contract term dropdown values should be valid");
		Assert.assertTrue(mdfNonResiOrder.isRadioButtonNoDefaultSelectedForDataCenter(),
				"Radio button No should be default selcted for contract term");
		Assert.assertEquals(mdfNonResiOrder.getExternalDRCNLabel(), "External Data Center Rack Number",
				"LabelExternal Data Center Rack Number should be present but it is not ");
		Assert.assertEquals(mdfNonResiOrder.getDefaulttValueForInstallationDrdownFormdfNonresi(),
				"Termination Point in Vertical Telco Riser",
				"Default value  In-building wiring to TP (NLT to Install) should be present but it is not ");
		Assert.assertTrue(mdfNonResiOrder.areDropdownValuesCorrectForInstallationOption(),
				"dropdown vlaues should be correct for with count 2");

		super.testTechnicalDetailFunc();
	}

	@Test(enabled = false, description = "Need to lookinto the functionality")
	public void populateMdfToNonresiCreateOrderForm() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToNonResiLink();
		BuildingMDFRoomToNonResidentialPremiseConnectionPage mdfNonResiOrder = new BuildingMDFRoomToNonResidentialPremiseConnectionPage(driver);
		OrderTestData orderData = new OrderTestData("populateNonresiCreateOrderForm", "ORDER", "SCHEDULE2", "PROVIDE");
		mdfNonResiOrder.populateCreateOrderForm(orderData);

		testSuccessPage("The Building MDF Room to Non-Residential Premise Connection request has been submitted successfully.");
	}

	@Test
	public void schedule9_Reclassify_FileUploadIndicator_YES() throws InterruptedException {
		dashboardPage.navigateToReclassify(9).navigateToView_FileUploadIndicator_Yes(9);

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
	public void schedule9_Reclassify_FileUploadIndicator_NO() throws InterruptedException {
		dashboardPage.navigateToReclassify(9).navigateToView_FileUploadIndicator_No(9);

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
	public void schedule9_Reclassify_FileUploadIndicator_NO_UploadedFiles_NO() throws InterruptedException {
		dashboardPage.navigateToReclassify(9).navigateToView_FileUploadIndicator_No_UploadedFiles_No(9);

		NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
		//To make sure that page is not breaking
		page.getCurrentSatus();
		Assert.assertFalse(page.isUploadDocumentsSectionDisplayed());
	}

}
