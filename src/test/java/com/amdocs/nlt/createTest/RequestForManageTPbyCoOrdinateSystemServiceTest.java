package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.page.RequestForManageTPbyCoOrdinateSystemServicePage;
import com.amdocs.nlt.util.NbapConnectionTestData;

public class RequestForManageTPbyCoOrdinateSystemServiceTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testManageTPbyCoOrdinateSubmitFormSchedule3() throws Exception {
		dashboardPage.clickOrderManagementLink().manageTPbyCoordinateLink();

		RequestForManageTPbyCoOrdinateSystemServicePage manageTPbyCoOrdinate = new RequestForManageTPbyCoOrdinateSystemServicePage(
				driver);
		Assert.assertEquals(manageTPbyCoOrdinate.getScheduleNameLabel(), "Schedule Name*",
				"Label Schedule Name should be present but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getDefaultDropdownValueForScheduleNameDropdown(), "Select",
				"Default dropdown value for option dropdown should be Select  but it is not");

		Assert.assertEquals(manageTPbyCoOrdinate.getCoOrdinateSystemLabel(), "Co-ordinate System*",
				"Label Co-ordinate System should be present but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getDefaultDropdownValueForCoOrdinateSystemDropdown(), "Select",
				"Default dropdown value for Co-ordinate System dropdown should be Select  but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getGpsCoordinatexLabel(), "GPS Co-ordinate X*",
				"Label GPS Co-ordinate X should be present but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getGpsCoordinateyLabel(), "GPS Co-ordinate Y*",
				"Label GPS Co-ordinate Y should be present but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getNearestPostalCodeLabel(), "Nearest Postal Code",
				"Label Nearest Postal Code should be present but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getOpearationPerformedLabel(), "Operation to be performed*",
				"Label Operation to be performed should be present but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getDefaultDropdownValueForOperationToBePerformedDropdown(), "Select",
				"Default dropdown value for option Operation to be performed should be Select  but it is not");

		NbapConnectionTestData manageTpByCoOrdinateOrderData = new NbapConnectionTestData(
				"submitManageTpbyCordinateForm", "ORDER", "Schedule3", "PROVIDE");
		manageTPbyCoOrdinate.chekcFeasibility(manageTpByCoOrdinateOrderData);

		Assert.assertEquals(manageTPbyCoOrdinate.getCoverageStatusLabel(), "Coverage Status",
				"Label Coverage Status should be present but it is not");

		Assert.assertEquals(manageTPbyCoOrdinate.getReqDateOfActLabel(), "Requested Date of Activation",
				"Text should be Requested Date of Activation* but it is not");

		Assert.assertTrue(manageTPbyCoOrdinate.isRequestedDateTextBoxDisplayed(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getDefaulPlaceholderForCalendarTextbox(), "DD/MM/YYYY",
				"label should be prsent but it is not ");
		Assert.assertEquals(manageTPbyCoOrdinate.getDefaultValueForPreferedInstallationDropdown(),
				CommonComponentPage.PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE,
				"label should be prsent but it is not ");
		Assert.assertEquals(manageTPbyCoOrdinate.getPrefInstallLabel(), "Preferred Installation Session",
				"label should be prsent but it is not ");

		testAddtionalInfoComponent();
		testRequestingLicenseeFunc();

		manageTPbyCoOrdinate.selectCalendarDate();
		manageTPbyCoOrdinate.clickSubmitButton();

		testSuccessPage("The Manage TP by Co-ordinate System Service request has been submitted successfully.");
	}

	// TODO: Failing with error - org.openqa.selenium.WebDriverException:
	// unknown error: Element <span>...</span> is not clickable at point (237,
	// 310). Other element would receive the click: <div
	// class="LoadingIndicator__loadingIndicatorWrapper___1Efhx"
	// data-qa="loading_indicator">...</div>
	@Test(enabled = false)
	public void testManageTPbyCoOrdinateSubmitFormSchedule11() throws Exception {
		dashboardPage.clickOrderManagementLink().manageTPbyCoordinateLink();
		RequestForManageTPbyCoOrdinateSystemServicePage manageTPbyCoOrdinate = new RequestForManageTPbyCoOrdinateSystemServicePage(driver);
		NbapConnectionTestData manageTpByCoOrdinateOrderData = new NbapConnectionTestData(
				"submitManageTpbyCordinateForm", "ORDER", "Schedule11", "PROVIDE");
		manageTPbyCoOrdinate.chekcFeasibility(manageTpByCoOrdinateOrderData);
		Assert.assertEquals(manageTPbyCoOrdinate.getCoverageStatusLabel(), "Coverage Status",
				"Label Coverage Status should be present but it is not");

		Assert.assertEquals(manageTPbyCoOrdinate.getReqDateOfActLabel(), "Requested Date of Activation",
				"Text should be Requested Date of Activation* but it is not");

		Assert.assertTrue(manageTPbyCoOrdinate.isRequestedDateTextBoxDisplayed(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertEquals(manageTPbyCoOrdinate.getDefaulPlaceholderForCalendarTextbox(), "DD/MM/YYYY",
				"label should be prsent but it is not ");

		Assert.assertEquals(manageTPbyCoOrdinate.getDefaultValueForPreferedInstallationDropdown(),
				CommonComponentPage.PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE,
				"label should be prsent but it is not ");
		Assert.assertEquals(manageTPbyCoOrdinate.getPrefInstallLabel(), "Preferred Installation Session",
				"label should be prsent but it is not ");

		manageTPbyCoOrdinate.selectCalendarDate();
		manageTPbyCoOrdinate.clickSubmitButton();

		testSuccessPage("The Manage TP by Co-ordinate System Service request has been submitted successfully.");
	}
}
