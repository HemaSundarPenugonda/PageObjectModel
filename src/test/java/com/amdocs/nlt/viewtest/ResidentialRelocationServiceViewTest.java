package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.ResidentialEndUserConnectionViewPage;

public class ResidentialRelocationServiceViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void populateResiRelocateForm() throws Exception {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ResidentialEndUserConnectionViewPage resiViewPage = new ResidentialEndUserConnectionViewPage(driver);
		resiViewPage.clickRelocateButton();
		dashboardPage.navigateToView_Pending(1);


		Assert.assertEquals(resiViewPage.getPostalCodeLabel(), "Postal Code",
				"Lable postal code should be present but it is not");
		Assert.assertEquals(resiViewPage.getUnitNumLabel(), "Unit Number",
				"Lable Unit Number should be present but it is not");
		super.checkApplicationDetailsComponent();
		super.checkTechnicalDetailComponent();
		resiViewPage.clickRequestingLincenseeComponent();
		super.testRequestingLicenseeFunc();
		Assert.assertEquals(resiViewPage.getCoverageStatusLabel(), "Coverage Status",
				"For Residential User Details component:Label Coverage Status " + "should be present but it is not ");
		Assert.assertEquals(resiViewPage.getBuildingNumberLabel(), "Building Number",
				"For Residential User Details component:Label Building Number* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getBuildingNameLabel(), "Building Name",
				"For Residential User Details component:Label Building Name " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getStreetNameLabel(), "Street Name",
				"For Residential User Details component:Label Street Name " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getBuildingTypeLabel(), "Building Type",
				"For Residential User Details component:Label Building Type " + "should be present but it is not");
		Assert.assertTrue(resiViewPage.isBuildingTypeTextboxdDisplayed(),
				"Building Type text box should   be displayed but it is not");
		Assert.assertTrue(resiViewPage.isStreetNameTextboxPresent(),
				"Street Name text box should   be displayed but it is not");
		Assert.assertEquals(resiViewPage.getInstallationChargeLabel(), "Installation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(resiViewPage.getServiceActivationChargeLabel(), "Service Activation Charge",
				"For Residential User Details component:Label Installation Charge "
						+ "should be present but it is not");
		Assert.assertEquals(resiViewPage.getSalutationLabel(), "Salutation",
				"For Residential User Details component:Label Salutation* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getFirstNameLabel(), "First Name",
				"For Residential User Details component:Label First Name* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getLastNameLabel(), "Last Name",
				"For Residential User Details component:Label Last Name* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getContactNumberLabel(), "Contact Number",
				"For Residential User Details component:Label Contact Number* " + "should be present but it is not");
		Assert.assertEquals(resiViewPage.getAlternateContactNumberLabel(), "Alternate Contact Number",
				"For Residential User Details component:Label Alternate Contact Number "
						+ "should be present but it is not");
		Assert.assertEquals(resiViewPage.getEmailAddressLabel(), "Email Address",
				"For Residential User Details component:Label Email Address* " + "should be present but it is not");
		Assert.assertTrue(resiViewPage.isPostalCodeTextBoxIsDisabledAndIsNotEmpty(),
				"postal code text box should be disbaled and it should conatin vaild value ");
		Assert.assertTrue(resiViewPage.isUnitNumTextBoxIsDisabledAndIsNotEmpty(),
				"unit number text box should be disbaled and should contain valid value ");
		Assert.assertTrue(resiViewPage.isFirstNameTextBoxIsDisabledAndIsNotEmpty(),
				"first name text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isLastNameTextBoxIsDisabled(),
				"last name text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isContactTextBoxIsDisabled(),
				"Contact number text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isAlternateContactTextBoxIsDisabled(),
				"Alterate Contact number text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isEmailAddTextBoxIsDisabled(),
				"Email Add text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isSalutationDropdownIsDisabled(),
				" Salutation drop dwon should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiViewPage.isPreferredInstallationSessionDropdowndisabled(),
				" prefrred installation drop dwon should be disbaled   ");
		Assert.assertTrue(resiViewPage.isCalendarTextboxdisabled(), " calendat text box should be disbaled  ");
		Assert.assertTrue(resiViewPage.isTechnologyDropdownIsDisabled(), " technology dropdown should be disbaled  ");
		Assert.assertTrue(resiViewPage.isSpiltDropdownIsDisabled(), " split ratio dropdown should be disbaled  ");

	}

}
