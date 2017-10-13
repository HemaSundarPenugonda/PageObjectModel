package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.ManageTpByAddresViewPage;

public class ManageTpByAdressViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void checkApplicationDetailsComponentForSchedule1() throws Exception {

		dashboardPage.clickOrderManagementLink().clickManageTPByAddressLink().navigateToView_Pending(1);
		ManageTpByAddresViewPage manageTpByAddresViewPage = new ManageTpByAddresViewPage(driver);

		Assert.assertEquals(manageTpByAddresViewPage.getAppDetailsHeaderLabel(), "Application Details",
				"Application Details Label should present but it is not");
		super.checkApplicationDetailsComponent();

		Assert.assertEquals(manageTpByAddresViewPage.getPostalcodeandUnitNumLabel(), "Postal Code and Unit Number",
				"Postal Code and Unit Number Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getScheduleNameLabel(), "Schedule Name",
				"Schedule Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getPostalCodeLabel(), "Postal Code",
				"Postal Code Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getUnitNumberLabel(), "Unit Number",
				"Unit Number Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getEnduserHeaderLabel(), "End User Installation Details",
				"End User Installation Details Label should present but it is not");
		checkEndUserInstallationDetailsView(1);
		Assert.assertEquals(manageTpByAddresViewPage.getManageTPDetailsHeaderLabel(), "Manage TP Details",
				"Manage TP Details Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getOpearaionLabel(), "Operation to be performed",
				"Operation to be performed Label should present but it is not");		
		Assert.assertEquals(manageTpByAddresViewPage.getViewAdditionalInfoHeader(), "Additional Information",
				"Additional Information Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getAdditionalInfoLabel(), "Additional Information:",
				"Additional Information: Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getRequestedDateTimeSlotLabel(), "Requested Date & Time Slot",
				"Requested Date & Time Slot Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getActivationDateLabel(), "Requested Date of Activation",
				"Requested Date of Activation Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getInstallationSessionLabel(), "Preferred Installation Session",
				"Preferred Installation Session Label should present but it is not");
		manageTpByAddresViewPage.clickRequestingLincenseeComponent();
		//super.testRequestingLicenseeFunc();
	}
	
	@Test(enabled = true)
	public void checkApplicationDetailsComponentForSchedule2() throws Exception {

		dashboardPage.clickOrderManagementLink().clickManageTPByAddressLink().navigateToView_Pending(2);
		ManageTpByAddresViewPage manageTpByAddresViewPage = new ManageTpByAddresViewPage(driver);

		Assert.assertEquals(manageTpByAddresViewPage.getAppDetailsHeaderLabel(), "Application Details",
				"Application Details Label should present but it is not");
		super.checkApplicationDetailsComponent();

		Assert.assertEquals(manageTpByAddresViewPage.getPostalcodeandUnitNumLabel(), "Postal Code and Unit Number",
				"Postal Code and Unit Number Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getScheduleNameLabel(), "Schedule Name",
				"Schedule Name Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getPostalCodeLabel(), "Postal Code",
				"Postal Code Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getUnitNumberLabel(), "Unit Number",
				"Unit Number Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getEnduserHeaderLabel(), "End User Installation Details",
				"End User Installation Details Label should present but it is not");
		checkEndUserInstallationDetailsView(2);
		Assert.assertEquals(manageTpByAddresViewPage.getManageTPDetailsHeaderLabel(), "Manage TP Details",
				"Manage TP Details Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getOpearaionLabel(), "Operation to be performed",
				"Operation to be performed Label should present but it is not");		
		Assert.assertEquals(manageTpByAddresViewPage.getViewAdditionalInfoHeader(), "Additional Information",
				"Additional Information Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getAdditionalInfoLabel(), "Additional Information:",
				"Additional Information: Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getRequestedDateTimeSlotLabel(), "Requested Date & Time Slot",
				"Requested Date & Time Slot Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getActivationDateLabel(), "Requested Date of Activation",
				"Requested Date of Activation Label should present but it is not");
		Assert.assertEquals(manageTpByAddresViewPage.getInstallationSessionLabel(), "Preferred Installation Session",
				"Preferred Installation Session Label should present but it is not");
		manageTpByAddresViewPage.clickRequestingLincenseeComponent();
		//super.testRequestingLicenseeFunc();
	}
}
