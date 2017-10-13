package com.amdocs.nlt.createTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.RequestForFiberWithputServicePage;

public class RequestForFiberWithputServiceTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testAllComponentDarkFiberForResi() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clickFiberWithServiceLink();
		RequestForFiberWithputServicePage darkFiber = new RequestForFiberWithputServicePage(driver);
		/*
		 * darkFiber.checkDarkFiberFeasibilityForReconnect(1);
		 * Assert.assertEquals(darkFiber.getMessageForReconnectStatus(),
		 * "This is a case of Reconnect, please request Manage TP (RRR) order instead."
		 * , "message should be present but it is not ");
		 */
		darkFiber.checkDarkFiberFeasibility(1);
		super.testAddtionalInfoComponent();
		/* super.testRequestingLicenseeFunc(); */
		super.testRequetedDateAndTimeFunc();
		Assert.assertEquals(darkFiber.getDarkFiberPageHeadingText(), "Request for Fibre without Service",
				"label Request for Fibre without Service should  be present but it is not ");
		Assert.assertEquals(darkFiber.getScheduleNameLabelText(), "Schedule Name*",
				"label Schedule Name* should  be present but it is not ");
		Assert.assertEquals(darkFiber.getCSODetailLabel(), "CSO Details",
				"label CSO Details should  be present but it is not ");
		Assert.assertEquals(darkFiber.getBuildingTypeLabel(), "Building Type",
				"label CSO Details should  be present but it is not ");
		Assert.assertEquals(darkFiber.getCoverageStatusLabel(), "Coverage Status",
				"label CSO Details should  be present but it is not ");
		Assert.assertEquals(darkFiber.getCoverageStatusValue(), "Home Passed",
				"label CSO Details should  be present but it is not ");

		darkFiber.populateDarkFiberoForm();
		Assert.assertEquals(darkFiber.VerifyConfirmationMessage(),
				"The Fibre Without Service request has been submitted successfully.",
				"confirmation message should be present but it is not ");
	}

	@Test(enabled = true)
	public void testAllComponentDarkFiberForNonResi() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clickFiberWithServiceLink();
		RequestForFiberWithputServicePage darkFiber = new RequestForFiberWithputServicePage(driver);
		darkFiber.checkDarkFiberFeasibility(2);
		super.testRequetedDateAndTimeFunc();
		Assert.assertEquals(darkFiber.getCoverageStatusLabel(), "Coverage Status",
				"label CSO Details should  be present but it is not ");
		Assert.assertEquals(darkFiber.getCoverageStatusValue(), "Building Reached",
				"label CSO Details should  be present but it is not ");
		super.testAddtionalInfoComponent();
		/* super.testRequestingLicenseeFunc(); */
		darkFiber.populateDarkFiberoForm();
		Assert.assertEquals(darkFiber.VerifyConfirmationMessage(),
				"The Fibre Without Service request has been submitted successfully.",
				"confirmation message should be present but it is not ");
	}
}