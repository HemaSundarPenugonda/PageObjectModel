package com.amdocs.nlt.amendtest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import com.amdocs.nlt.viewpages.ResidentialEndUserConnectionAmendPage;

public class ResidentialEndUserConnectionEndUserAmendTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testAllComponentOfResiAmend() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Pending(1);
		ResidentialEndUserConnectionAmendPage resiAmend = new ResidentialEndUserConnectionAmendPage(driver);
		resiAmend.clickAmendButton();
		Assert.assertEquals(resiAmend.getNewAriLabel(), "New Application Reference Identifier*",
				"Lable Option should be present but it is not");
		Assert.assertTrue(resiAmend.isOldAritextBoxIsEnabled(),
				"old ARI text box  should get enabled when user clicks on Amend Page");
		Assert.assertTrue(resiAmend.isPostalCodeTextBoxIsDisabledAndIsNotEmpty(),
				"postal code text box should be disbaled and it should conatin vaild value ");
		Assert.assertTrue(resiAmend.isUnitNumTextBoxIsDisabledAndIsNotEmpty(),
				"unit number text box should be disbaled and should contain valid value ");
		Assert.assertTrue(resiAmend.isFirstNameTextBoxIsEnabledAndIsNotEmpty(),
				"first name text box should be enabled  and should conatin  valid value ");
		Assert.assertTrue(resiAmend.isLastNameTextBoxIsEnabled(),
				"last name text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiAmend.isContactTextBoxIsEnabled(),
				"Contact number text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiAmend.isAlternateContactTextBoxIsEnabled(),
				"Alterate Contact number text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiAmend.isEmailAddTextBoxIsEnabled(),
				"Email Add text box should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiAmend.isSalutationDropdownIsEnabled(),
				" Salutation drop dwon should be disbaled  and should conatin  valid value ");
		Assert.assertTrue(resiAmend.isPreferredInstallationSessionDropdownEnabled(),
				" prefrred installation drop dwon should be disbaled   ");
		Assert.assertTrue(resiAmend.isCalendarTextboxdisabled(), " calendat text box should be disbaled  ");
		Assert.assertTrue(resiAmend.isTechnologyDropdownIsDisabled(), " technology dropdown should be disbaled  ");
		Assert.assertTrue(resiAmend.isSpiltDropdownIsDisabled(), " split ratio dropdown should be disbaled  ");
		Assert.assertTrue(resiAmend.isNormalSlotRadioButtonIsEnabled(),
				" normal slot radio button  should be disbaled  ");
		Assert.assertTrue(resiAmend.isSeasonalSlotRadioButtonIsEnabled(),
				" seasonal slot radio button should be disbaled  ");
		resiAmend.submitResiAmendForm();
		Assert.assertEquals(resiAmend.VerifyConfirmationMessage(),
				"The Residential End User Connection : Amend request has been submitted successfully.",
				"confrimation message should be present but it is not");

	}

}
