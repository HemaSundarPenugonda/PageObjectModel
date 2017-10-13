package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.ManageTpPage;
import com.amdocs.nlt.page.ResidentialEndUserConnectionPage;

public class ManageTPTest extends CommonComponentPageTest {

	public void testAllFields() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);

		ResidentialEndUserConnectionPage connectionTest = new ResidentialEndUserConnectionPage(driver);
		connectionTest.clickOnManageTPButton();
		Thread.sleep(2000);

		testApplicationDetailsComponent();
		testExistingUserAddressDetailsComponent();
	}

	public void testApplicationDetailsComponent() {
		ManageTpPage manageTpPage = new ManageTpPage(driver);
		Assert.assertEquals(manageTpPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier Label should present but it is not");
		Assert.assertEquals(manageTpPage.getApplicationReferenceIdentifierLabel_bug(), "Application Reference Identifier",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertTrue(manageTpPage.isAppDetailsORIValueLabelPresent(), "Ori Label should be present but it is not");
		Assert.assertTrue(manageTpPage.isApplicationReferenceIdentifierTextBoxDisable(),
				"Application Reference Identifier Text Box should Disable but it is not");

	}

	public void testExistingUserAddressDetailsComponent() {

		ManageTpPage manageTpPage = new ManageTpPage(driver);

		Assert.assertEquals(manageTpPage.getPostalCodeLabel(), "Postal Code",
				"Postal Code Label should present but it is not");
		Assert.assertEquals(manageTpPage.getUnitNumberLabel(), "Unit Number",
				"Unit Number Label should present but it is not");
		Assert.assertEquals(manageTpPage.getBuildingNumberLabel(), "Building Number",
				"Building Number Label should present but it is not");
		Assert.assertEquals(manageTpPage.getBuildingNameLabel(), "Building Name",
				"Building Name Label should present but it is not");
		Assert.assertEquals(manageTpPage.getStreetNameLabel(), "Street Name",
				"Street Name Label should present but it is not");
		Assert.assertEquals(manageTpPage.getCopifTypeLabel(), "COPIF Type",
				"COPIF Type Label should present but it is not");
		Assert.assertTrue(manageTpPage.isUnitNumberLabelTextBoxDisable(),
				"Unit Number Text Box should Disable but it is not");
		Assert.assertTrue(manageTpPage.isPostalCodeLabelTextBoxDisable(),
				"Postal code Text Box should Disable but it is not");
		Assert.assertTrue(manageTpPage.isBuildingNumberDropdownDisable(),
				"Building Number Dropdown should Disable but it is not");
		Assert.assertTrue(manageTpPage.isBuildingNameTextBoxDisable(),
				"Building Name Text Box should Disable but it is not");
		Assert.assertTrue(manageTpPage.isStreetNameTextBoxDisable(),
				"Street Name Text Box should Disable but it is not");
		Assert.assertTrue(manageTpPage.isCopifTypeTextBoxDisable(), "COPIF Type Text Box should Disable but it is not");
	}

	@Test(enabled = true)
	public void enterManageTpDetailsForServiceRequest() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ManageTpPage manageTpPage = new ManageTpPage(driver);
		manageTpPage.clickOnManageTPButton();


		Assert.assertEquals(manageTpPage.getAriLabelTextBoxLabel(), "Application Reference Identifier*",
				"Application Reference Identifier should present but it is not");
		manageTpPage.enterARIInputValue();
		Assert.assertEquals(manageTpPage.getOperationToBePerformedLabel(), "Operation to be performed*",
				"Operation to be performed should present but it is not");
		manageTpPage.selectValueFromOperationToBePerformedDropDown();
		manageTpPage.selectCalendarDate();
		manageTpPage.clickSubmitButton();
	}
}