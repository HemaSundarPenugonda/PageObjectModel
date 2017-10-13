package com.amdocs.nlt.amendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.createTest.CommonComponentPageTest;

public class CommonAmendTest extends CommonComponentPageTest{

	public void testRequetedDateAndTimeFunc() throws InterruptedException {
		CommonComponentPage order = new CommonComponentPage(driver);
		Assert.assertTrue(order.isCalendarIconPresent(), "Calendar icon should be present but it is not");
		Assert.assertEquals(order.getReqDateOfActLabel(), "Requested Date of Activation",
				"Text should be Requested Date of Activation but it is not");
		Assert.assertTrue(order.isRequestedDateTextBoxDisplayed(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertFalse(order.isRequestedDateTextBoxEnabled(), "Date field is enabled which is wrong");
		
		Assert.assertEquals(order.getPrefInstallLabel(), "Takeover Timeslot", "time slot label is displayed wrong");
		Assert.assertTrue(order.isPrefInstallSessionDropdownEnabled(), "time slot is not enabled which is wrong");
	}
}
