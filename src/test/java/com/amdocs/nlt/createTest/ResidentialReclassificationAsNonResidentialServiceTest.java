package com.amdocs.nlt.createTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.ReclassifyServiceForResi;

public class ResidentialReclassificationAsNonResidentialServiceTest extends CommonComponentPageTest {

	@Test(enabled = false)//TO DO : Need to test and check mock 
	public void testReclassificationServiceForResi() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink();
		ReclassifyServiceForResi resiReclassify = new ReclassifyServiceForResi(driver);
		resiReclassify.checkFeasibility_HomeReached();
		resiReclassify.clickReclassifyButton();
		Assert.assertEquals(resiReclassify.getReclassifyHeading(),
				"Request for Residential Reclassification as Non-Residential Service",
				"Label Request for Residential Reclassification as Non-Residential Service but it is not");
		Assert.assertTrue(resiReclassify.isPostaCodeTextboxdisabled(), "postal code text box should be disabled");
		Assert.assertTrue(resiReclassify.isUnitnumberTextboxdisabled(), "unit number text box should be disbaled ");
		Assert.assertTrue(resiReclassify.isInstallationOptiondisabled(),
				"Installtion option  dropdown should be disbaled ");
		resiReclassify.clickFeasiblityCheckButton();
		resiReclassify.populateCreateOrderForm();
		Assert.assertEquals(resiReclassify.VerifyConfirmationMessage(),
				"The Residential Reclassification as Non-Residential Service request has been submitted successfully.",
				"Label Request for Residential Reclassification as Non-Residential Service but it is not");

	}

}
