package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.ManageTpByAddressPage;

public class ManageTpByAddressTest extends CommonComponentPageTest {
	
	@Test(enabled = true)
	public void testFeasibilityComponentForSchedule1() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickManageTPByAddressLink();
		
		ManageTpByAddressPage manageTpByAddressPage = new ManageTpByAddressPage(driver);
		Assert.assertEquals(manageTpByAddressPage.getOrderRequestIdentifierLabel(), "Schedule Name*",
				"Schedule Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getPostalCodeLabel(), "Postal Code*",
				"Schedule Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getUnitNumberLabel(), "Unit Number*",
				"Schedule Name Label should present but it is not");
		manageTpByAddressPage.checkFeasiabilityForSchedule1();
		manageTpByAddressPage.clickOnCheckFeasibility();
	}
	
	@Test(enabled = true)
	public void testFeasibilityComponentForSchedule2() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickManageTPByAddressLink();
		
		ManageTpByAddressPage manageTpByAddressPage = new ManageTpByAddressPage(driver);
		Assert.assertEquals(manageTpByAddressPage.getOrderRequestIdentifierLabel(), "Schedule Name*",
				"Schedule Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getPostalCodeLabel(), "Postal Code*",
				"Schedule Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getUnitNumberLabel(), "Unit Number*",
				"Schedule Name Label should present but it is not");
		manageTpByAddressPage.checkFeasiabilityForSchedule2();
		manageTpByAddressPage.clickOnCheckFeasibility();
	}
	
	@Test(enabled = true )
	public void testEndUserInstallationDetailsComponent() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickManageTPByAddressLink();
		
		ManageTpByAddressPage manageTpByAddressPage = new ManageTpByAddressPage(driver);
		manageTpByAddressPage.enterAri();
		manageTpByAddressPage.checkFeasiabilityForSchedule1();
		manageTpByAddressPage.clickOnCheckFeasibility();
		Assert.assertEquals(manageTpByAddressPage.getARILabel(), "Application Reference Identifier*",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getCoverageStatusLabel(), "Coverage Status",
				"Coverage Status Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getBuildingNumberLabel(), "Building Number",
				"Building Number Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getBuildingNameLabel(), "Building Name",
				"Building Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getStreetNameLabel(), "Street Name",
				"Street Name Label should present but it is not");
		//Assert.assertEquals(manageTpByAddressPage.getBuildingTypeLabel(), "Building Type",
			//	"Building Type Label should present but it is not");
		//Assert.assertEquals(manageTpByAddressPage.getCopifTypeLabel(), "COPIF Type",
				//"COPIF Type Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getInstallationChargeLabel(), "Installation Charge",
				"Installation Charge Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getSalutationLabel(), "Salutation*",
				"Salutation Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getFirstNameLabel(), "First Name*",
				"First Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getLastNameLabel(), "Last Name*",
				"Last Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getContactNumberLabel(), "Contact Number*",
				"Contact Number* Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getAltNumberLabel(), "Alternate Contact Number",
				"Alternate Contact Number Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getEmailAddressLabel(), "Email Address*",
				"Email Address* Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getIdTypeLabel(), "ID Type*",
				"Email Address Label should present but it is not");
		Assert.assertEquals(manageTpByAddressPage.getIdNumberLabel(), "ID Number*",
				"Email Address Label should present but it is not");
		Assert.assertTrue(manageTpByAddressPage.isCsValueLabelDisplay(),
				"Coverage Status Value should present but it is not");
		Assert.assertTrue(manageTpByAddressPage.isBuildingNumberDropdownPresent(),
				"Building Number dropdown should disable but it is not");
		Assert.assertTrue(manageTpByAddressPage.isBuildingNameInputBoxPresent(),
				"Building Name text box should disable but it is not");
		Assert.assertTrue(manageTpByAddressPage.isStreetNameInputBoxPresent(),
				"Street Name text box should disable but it is not");
		/*Assert.assertTrue(manageTpByAddressPage.isBuildingTypeInputBoxPresent(),
				"Building type text box should disable but it is not");
		Assert.assertTrue(manageTpByAddressPage.isCopifTypeInputBoxPresent(),
				"Street Name text box should disable but it is not");*/
		Assert.assertTrue(manageTpByAddressPage.isChargesValueLabelPresent(),
				"Charge Value should display but it is not");
		manageTpByAddressPage.selectSalutationDropdown().enterFirstName().enterLastName().enterContactNumber()
				.enterAltContactNumber().enterEmail().selectIDTypeDropdown().enterIdNumber().selectOperationValueDropdown();
		Assert.assertEquals(manageTpByAddressPage.getOpearaionLabel(), "Operation to be performed*",
				"Operation to be performed* Label should present but it is not");
		manageTpByAddressPage.selectCalendarDate();
		//super.testRequestingLicenseeFunc();
		super.testAddtionalInfoComponent();
		manageTpByAddressPage.clickOnSubmitButton();
		testSuccessPage("The Manage TP by Address request has been submitted successfully.");
	}
}