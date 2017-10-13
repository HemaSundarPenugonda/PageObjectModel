package com.amdocs.nlt.relocationtest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.relocationpages.ResidentailEndUserRelocationPage;
import com.amdocs.nlt.createTest.CommonComponentPageTest;

public class BuildingMDFRoomToResidentialPremiseConnectionRelocationTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void populateMdfResiRelocateForm() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ResidentailEndUserRelocationPage resiRelocation = new ResidentailEndUserRelocationPage(driver);
		resiRelocation.clickRelocateButton();
		resiRelocation.populatevaluesInResiEndUserForm_relocate();
		Assert.assertEquals(resiRelocation.VerifyConfirmationMessage(),
				"The Residential Relocation Service request has been submitted successfully.");
	}

}
