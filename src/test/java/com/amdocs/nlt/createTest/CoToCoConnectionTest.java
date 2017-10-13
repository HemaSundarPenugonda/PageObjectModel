package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.CoToCoConnectionPage;

public class CoToCoConnectionTest extends CommonComponentPageTest {

	private CoToCoConnectionPage getOrderPage() {
		CoToCoConnectionPage order = new CoToCoConnectionPage(driver);
		return order;
	}

	@Test(enabled = false)//TO DO : Need to test and check mock 
	public void testCotoCoConnectionPageAllComponenet() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickCoToCoLink();
		CoToCoConnectionPage order = getOrderPage();
		Assert.assertEquals(order.getsegmentFromCoLabel(), "Segment From CO*", "label should be prsent");
		Assert.assertEquals(order.getsegmentToCoLabel(), "Segment To CO*", "label should be prsent");
		Assert.assertTrue(order.isSegmentTOAndsegmentFromDropdownWorkingInSync(),
				"segmentTOAndsegmentFromDropdown should be working in sync");
		Assert.assertEquals(order.getRsWirelineDiversityLabel(), "Redundancy Service with Wireline Diversity*",
				"label should be prsent but it is not ");
		Assert.assertEquals(order.getRsDuctDiversityLabel(), "Redundancy Service with Duct Diversity*",
				"label should be prsent but it is not");
		Assert.assertEquals(order.getRSPathDiversityLabel(), "Redundancy Service with Path Diversity*",
				"label should be prsent but it is not ");
		Assert.assertTrue(order.isRequiredButtonForWirelinePresent(), "it should be present but it is not ");

		Assert.assertTrue(order.isRequiredButtonForPathPresent(), "it should be present but it is not ");
		Assert.assertTrue(order.isNotRequiredButtonForWirelinePresent(), "it should be present but it is not ");

		Assert.assertTrue(order.isNotRequiredButtonForWirelineCheckedDefault(),
				"it should be checked default but it is not ");
		Assert.assertTrue(order.isNotRequiredButtonForWDuctCheckedDefault(),
				"it should be checked default but it is not ");

		Assert.assertEquals(order.verifyActionOnRequiredRadioButtonClick(),
				"In case redundancy service is unavailable*", "When user clicks on Required"
						+ " radio button the In case redundancy service is unavailable* appears on screen");
		Assert.assertTrue(order.verifyRadioButtonsAreDisabled(),
				"When user clicks on Required radio button then other  two radio "
						+ "buttons are disabled for selection ");
		super.testRequetedDateAndTimeFunc();
		super.testRequestingLicenseeFunc();
		super.testAddtionalInfoComponent();
		order.populateCoToCoConnectionForm();
		testSuccessPage("The CO to CO Connection request has been submitted successfully.");
		Assert.assertEquals(order.VerifyConfirmationMessage(),
				"The CO to CO Connection request has been submitted successfully.",
				"label should be prsent but it is not ");
	}

}
