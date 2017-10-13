package com.amdocs.nlt.test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.ResidentialEndUserConnectionPage;
import com.amdocs.nlt.page.TechnologyChangePage;

public class TechnologyChangeTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testExistingConnectionDetailsComponent() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);

		ResidentialEndUserConnectionPage connectionTest = new ResidentialEndUserConnectionPage(driver);
		connectionTest.clickOnChangeTechButton();

		TechnologyChangePage technologyChangePage = new TechnologyChangePage(driver);
		Assert.assertEquals(technologyChangePage.getOrderRequestIdentifierLabel(), "Order Request Identifier",
				"Order Request Identifier Label should present but it is not");
		Assert.assertEquals(technologyChangePage.getApplicationReferenceIdentifierLabel(),
				"Application Reference Identifier",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertEquals(technologyChangePage.getTechnologyLabel(), "Technology",
				"Technology Label should present but it is not");
		Assert.assertTrue(technologyChangePage.isOriValueLabelPresent(), "Ori Label should be present but it is not");
		Assert.assertTrue(technologyChangePage.isAriValueLabelDisable(),
				"Ari Label should not be disable but it is not");
		Assert.assertTrue(technologyChangePage.isTechnologyDropDownExistingDisable(),
				"Ari Label should not be disable but it is not");
	}

	@Test(enabled = true)
	public void testNewConnectionDetailsComponentForResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);

		ResidentialEndUserConnectionPage connectionTest = new ResidentialEndUserConnectionPage(driver);
		connectionTest.clickOnChangeTechButton();
		TechnologyChangePage technologyChangePage = new TechnologyChangePage(driver);
		Assert.assertEquals(technologyChangePage.getApplicationReferenceIdentifierLabel(),
				"Application Reference Identifier",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertEquals(technologyChangePage.getTechnologyLabel(), "Technology",
				"Technology Label should present but it is not");
		technologyChangePage.enterAri().selectTechnology().selectCalendarDate();

		super.testRequestingLicenseeFunc();
		technologyChangePage.clickOnsubmitButton();
		technologyChangePage.clickOnconfirmButton();
		Assert.assertEquals(technologyChangePage.VerifyConfirmationMessage(),
				"The Technology Change request has been submitted successfully.");
	}

	@Test(enabled = true)
	public void testNewConnectionDetailsComponentForNonResi() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikNonResiLink().navigateToView_Completed(2);

		ResidentialEndUserConnectionPage connectionTest = new ResidentialEndUserConnectionPage(driver);
		connectionTest.clickOnChangeTechButton();
		TechnologyChangePage technologyChangePage = new TechnologyChangePage(driver);
		Assert.assertEquals(technologyChangePage.getApplicationReferenceIdentifierLabel(),
				"Application Reference Identifier",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertEquals(technologyChangePage.getTechnologyLabel(), "Technology",
				"Technology Label should present but it is not");
		technologyChangePage.enterAri().selectTechnology().selectCalendarDate();

		super.testRequestingLicenseeFunc();
		technologyChangePage.clickOnsubmitButton();
		technologyChangePage.clickOnconfirmButton();
		Assert.assertEquals(technologyChangePage.VerifyConfirmationMessage(),
				"The Technology Change request has been submitted successfully.");
	}

	@Test(enabled = true)
	public void testNewConnectionDetailsComponentForNbapConnection() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().nbapConnectionLink().navigateToView_Completed(3);

		ResidentialEndUserConnectionPage connectionTest = new ResidentialEndUserConnectionPage(driver);
		connectionTest.clickOnChangeTechButton();
		TechnologyChangePage technologyChangePage = new TechnologyChangePage(driver);
		Assert.assertEquals(technologyChangePage.getApplicationReferenceIdentifierLabel(),
				"Application Reference Identifier",
				"Application Reference Identifier Label should present but it is not");
		Assert.assertEquals(technologyChangePage.getTechnologyLabel(), "Technology",
				"Technology Label should present but it is not");
		technologyChangePage.enterAri().selectTechnology().selectCalendarDate();

		super.testRequestingLicenseeFunc();
		technologyChangePage.clickOnsubmitButton();
		technologyChangePage.clickOnconfirmButton();
		Assert.assertEquals(technologyChangePage.VerifyConfirmationMessage(),
				"The Technology Change request has been submitted successfully.");
	}

}
