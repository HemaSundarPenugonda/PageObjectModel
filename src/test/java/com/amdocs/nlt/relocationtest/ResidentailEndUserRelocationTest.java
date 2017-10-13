package com.amdocs.nlt.relocationtest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.relocationpages.ResidentailEndUserRelocationPage;
import com.amdocs.nlt.createTest.CommonComponentPageTest;

public class ResidentailEndUserRelocationTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void populateResiRelocateForm() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ResidentailEndUserRelocationPage resiRelocation = new ResidentailEndUserRelocationPage(driver);
		resiRelocation.clickRelocateButton();
		resiRelocation.populatevaluesInResiEndUserForm_relocate();
		Assert.assertEquals(resiRelocation.VerifyConfirmationMessage(),
				"The Residential Relocation Service request has been submitted successfully.");
	}

	@Test(enabled = true)
	public void testAllComponentOfResiRelocate() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		ResidentailEndUserRelocationPage resiRelocation = new ResidentailEndUserRelocationPage(driver);
		resiRelocation.clickRelocateButton();
		resiRelocation.checkFeasibilityForReconnect_relocate();
		Assert.assertTrue(resiRelocation.areSalutationDropDownValuesCorrect(),
				"Salutation dropdown values should be valid");
		Assert.assertEquals(resiRelocation.getTechnologyLabel(), "Technology*",
				"For TechnicalDetail component:Label technology* " + "should be present but it is not");
		Assert.assertEquals(resiRelocation.getSplitRatioLabel(), "Split Ratio*",
				"For TechnicalDetail component:Label technology* " + "should be present but it is not");
		Assert.assertEquals(resiRelocation.getSplitRatioDropdownDefaultValue(), "1:24",
				"default value in the technology dropdown " + "should be 1:24 but it is not");
		Assert.assertEquals(resiRelocation.getTechnologyDropdownDefaultValue(), "GPON",
				"For TechnicalDetail component:default value in the technology dropdown "
						+ "should be GPON but it is not");
		Assert.assertTrue(resiRelocation.verifyActionWhenUserSelectOeAsTechnology(),
				"When User selects technology as OE then split ratio dropdwon gets disbaled with Default vaule as 1:24");
		/*
		 * Assert.assertEquals(resiRelocation.
		 * getDefaultValueOfPrefInstallationSessionForReconnect(),
		 * "08:00-22:00",
		 * "default value in prefered installation  should be 00:00 - 23:59 but it is not "
		 * );
		 */
	}

}
