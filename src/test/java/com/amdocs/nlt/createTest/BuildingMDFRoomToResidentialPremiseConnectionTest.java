package com.amdocs.nlt.createTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.BuildingMDFRoomToResidentialPremiseConnectionPage;
import com.amdocs.nlt.util.OrderTestData;

public class BuildingMDFRoomToResidentialPremiseConnectionTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void populateMdfResiCreateOrderForm() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToResiLink();
		BuildingMDFRoomToResidentialPremiseConnectionPage mdfResiPage = new BuildingMDFRoomToResidentialPremiseConnectionPage(
				driver);
		OrderTestData orderData = new OrderTestData();
		mdfResiPage.populatevaluesInResiEndUserForm(orderData);
		Assert.assertEquals(mdfResiPage.VerifyConfirmationMessage(),
				"The Building MDF Room to Residential Premise Connection request has been submitted successfully.");
	}
}
