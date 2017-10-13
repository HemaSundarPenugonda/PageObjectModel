package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.PatchingServicePage;

public class PatchingServiceTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testAllCoponentOfCreatePatchService() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();
		PatchingServicePage patchService = new PatchingServicePage(driver);
		Assert.assertEquals(patchService.getPatchingDetailLabel(), "Patching Details",
				"label Patching Details should be present but it is not");
		Assert.assertEquals(patchService.getlocationLabel(), "Location*",
				"label Location* should be present but it is not");
		Assert.assertEquals(patchService.getaddressLabel(), "Address", "label Address should be present but it is not");
		Assert.assertEquals(patchService.getfromfieldLabel(), "From*", "label From* should be present but it is not");
		Assert.assertEquals(patchService.gettofieldLabel(), "To*", "label To* should be present but it is not");
		testRequetedDateAndTimeFunc();
		Assert.assertFalse(patchService.checkFormValidationForSubmitButton(),
				"submit request button should not get enbaled before all mandatory field filling");

		testAddtionalInfoComponent();
		testRequestingLicenseeFunc();
	}

	@Test(enabled = true)
	public void populateCreatePatchServiceForm() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickPatchingServiceLink();

		PatchingServicePage patchService = new PatchingServicePage(driver);
		patchService.populatePatchServiceForm();
		Assert.assertEquals(patchService.getConfirmationMessage(),
				"The Patching Service request has been submitted successfully.",
				"confirmation message should be present but it is not");
	}
}
