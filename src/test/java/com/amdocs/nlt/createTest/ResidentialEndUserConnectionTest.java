
/**
 * @author suryakac
 * 
 */
package com.amdocs.nlt.createTest;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.page.ResidentialEndUserConnectionPage;
import com.amdocs.nlt.util.OrderTestData;

public class ResidentialEndUserConnectionTest extends ResidentialOrderPageTest {
	//Not used this method anywhere
	public void testRequetedDateAndTimeFunc() throws InterruptedException {
		ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
		resiPage.checkFeasibilityForHomeReached();
		Assert.assertEquals(resiPage.getTimeSlotOptionLabel(), "Time Slot Option*",
				"label should be prsent but it is not ");
		Assert.assertTrue(resiPage.isNormalSlotRadioButtonDefaultSelected(),
				"Normal slot radio button should be selected default but it is not");

		Assert.assertFalse(resiPage.isSeasonalSlotRadioButtonSelected(),
				"Seasaonla slot radio button should not  be selected default but it is ");
		Assert.assertEquals(resiPage.getDefaulPlaceholderForCalendarTextbox(), "DD/MM/YYYY",
				"place holder DD/MM/YY  should be prsent but it is not ");

		Assert.assertEquals(resiPage.getDefaultValueForPreferedInstallationDropdown(),
				CommonComponentPage.PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE,
				"label should be prsent but it is not ");
		Assert.assertTrue(resiPage.verifyResetOpeartionForNoramalAndSeasonalslot(),
				"when user toggle between normal and seasonal slot calendar date and time should get refreshed ");
	}

	@Test(enabled = true)
	public void populateResiCreateOrderForm() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink();
		ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
		OrderTestData orderData = new OrderTestData("populateResiCreateOrderForm", "ORDER", "SCHEDULE1", "PROVIDE");
		orderData.setQueryParam(orderData.getAppRefNumber());
		orderData.setSubmitBeforeTime(new Date());
		resiPage.populatevaluesInResiEndUserForm(orderData);
		orderData.setSubmitAfterTime(new Date());
		testSuccessPage("The Residential End User Connection request has been submitted successfully.");
	}

	//Need to check functionality for Assertion step
	@Test(enabled = false)
	public void testForCoverageStatusHomeReached() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink();
		ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);

		Assert.assertEquals(resiPage.getDefaultValueOfPrefInstallationSessionForHomeReached(),
				CommonComponentPage.PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE,
				"default value in prefered installation  should be 00:00 - 23:59 but it is not ");
	}

	@Test(enabled = true)
	public void testForCoverageStatusReconnect() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink();
		ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
		// resiPage.iSPrefInstallationDropdownDisabledBeforeUserSelectCalendarDate();

		Assert.assertEquals(resiPage.getDefaultValueOfPrefInstallationSessionForReconnect(),
				CommonComponentPage.PREFERRED_INSTALLATION_SESSION_DEFAULT_VALUE,

				"default value in prefered installation  should be 08:00-22:00 but it is not ");

		Assert.assertTrue(resiPage.isToolPresentdForBiuldingNumber(),
				"Tooltip for building number should be present if there are more than 1 value in dropdown");
		Assert.assertTrue(resiPage.isToolTipPtresentForBuildingType(),
				"Tooltip for building type should be present but it is not");

		Assert.assertTrue(resiPage.isToolTipPtresentForInstallationType(),
				"Tooltip for installation charge should be present but it is not");

		Assert.assertEquals(resiPage.getBuildingNumberTooltipText(),
				"Please select the correct building number from the list of available building numbers");
		Assert.assertTrue(resiPage.isInstallationChargeValuePresent(),
				"Installation charge value should be present but it is not");
		Assert.assertTrue(resiPage.isServiceActivationChargeValuePresent(),
				"Service activation charge value should be present but it is not");
	}

}

