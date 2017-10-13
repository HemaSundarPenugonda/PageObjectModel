package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.base.PageTest;
import com.amdocs.nlt.page.CoToBuildingMdfConnectionPage;
import com.amdocs.nlt.page.StartPage;

public class CoToMdfConnectionTest extends PageTest {

	@Test(enabled = true)
	public void TestCoToMdfRoomDetail() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink();
		CoToBuildingMdfConnectionPage order = new CoToBuildingMdfConnectionPage(driver);
		order.checkFeasiblity();
		Assert.assertEquals(order.getCotoMdfRoomDetail(), "Request for CO to Building MDF Room Connection",
				"label should be prsent but it is not ");
		Assert.assertEquals(order.getSegmentFromCOLabel(), "Segment from CO*", "label should be prsent but it is not ");
		Assert.assertEquals(order.getOrderOptionLabel(), "Order Option*", "label should be prsent but it is not ");
		Assert.assertEquals(order.getPostalCodeLabel(), "Postal Code*", "label should be prsent but it is not ");
		// Assert.assertEquals(order.getServingCabinetLabel(), "Serving
		// Cabinet*","label should be prsent but it is not ");
		Assert.assertEquals(order.getPostalCodeRadiobuttonLabel(), "Postal Code",
				"label should be prsent but it is not ");
		Assert.assertEquals(order.getServingCabinetRadiobuttonLabel(), "Serving Cabinet",
				"label should be prsent but it is not ");

		Assert.assertEquals(order.getCoverageStatusLabel(), "Coverage Status", "label should be prsent but it is not ");
		Assert.assertEquals(order.getUnitNumLabel(), "Unit Number", "label should be prsent but it is not ");
		Assert.assertEquals(order.getBuildingNumberLabel(), "Building Number*",
				"label should be prsent but it is not ");
		Assert.assertEquals(order.getBuildingNameLabel(), "Building Name", "label should be prsent but it is not ");
		Assert.assertEquals(order.getStreetNameLabel(), "Street Name", "label should be prsent but it is not ");
		Assert.assertEquals(order.getInstallationChargeLabel(), "Installation Charge",
				"label should be prsent but it is not ");
		Assert.assertEquals(order.getServiceActivationLabel(), "Service Activation Charge",
				"label should be prsent but it is not ");
		Assert.assertEquals(order.getCoverageStatus(), "Covered", "label should be prsent but it is not ");
		Assert.assertTrue(order.isInstalltionChargePresent(), "installation charge should not be null but it is");

	}

	@Test(enabled = true)
	public void TestRequestDetail() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCotoMdfLink();
		CoToBuildingMdfConnectionPage order = new CoToBuildingMdfConnectionPage(driver);
		order.checkFeasiblity();
		Assert.assertEquals(order.getRequestDetailLabel(), "Request Details", "label should be prsent but it is not ");
		Assert.assertEquals(order.getRLpatchLabel(), "RL to provide own Patch Cable*",
				"label should be prsent but it is not ");
		Assert.assertTrue(order.isRadioButtonNoDefaultSelected(),
				"Radio button with value No should be default selected");
		Assert.assertEquals(order.getRlFdfLabel(), "RL FDF Identification Number",
				"label should be prsent but it is not ");
		Assert.assertTrue(order.isRlFdfTextboxPresent(), "Text box should be present but it is not");
	}

}
