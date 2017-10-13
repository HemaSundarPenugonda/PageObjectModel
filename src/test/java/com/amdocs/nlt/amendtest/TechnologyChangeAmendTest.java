package com.amdocs.nlt.amendtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.amendpage.TechnologyChangeAmendPage;
import com.amdocs.nlt.createTest.CommonComponentPageTest;
import com.amdocs.nlt.viewpages.TechnologyChangeViewPage;

public class TechnologyChangeAmendTest extends CommonComponentPageTest {
	
	@Test(enabled = true)
	public void checkApplicationDetailsComponentForSc1() throws Exception {

		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(1);
		technologyChangePage.clickAmendButton();
		TechnologyChangeAmendPage technologyChangeAmendPage = new TechnologyChangeAmendPage(driver);
		
		Assert.assertEquals(technologyChangeAmendPage.getNewARIHeaderLabel(), "New Application Reference Identifier*",
				"New Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsORIValuePresent(),
				"ORI value should present but it is not");
		Assert.assertEquals(technologyChangeAmendPage.getAriHeaderLabel(), "Application Reference Identifier*",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsRORPresent(),
				"Reason for Rejection should be present but it is not ");
	}
	
	@Test(enabled = true)
	public void checkApplicationDetailsComponentForSc2() throws Exception {

		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(1);
		technologyChangePage.clickOnAmendOrderButton();
		TechnologyChangeAmendPage technologyChangeAmendPage = new TechnologyChangeAmendPage(driver);
		
		Assert.assertEquals(technologyChangeAmendPage.getNewARIHeaderLabel(), "New Application Reference Identifier*",
				"New Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsORIValuePresent(),
				"ORI value should present but it is not");
		Assert.assertEquals(technologyChangeAmendPage.getAriHeaderLabel(), "Application Reference Identifier*",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsRORPresent(),
				"Reason for Rejection should be present but it is not ");
	}
	
	@Test(enabled = true)
	public void checkApplicationDetailsComponentForSc3() throws Exception {

		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(3);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(3);
		technologyChangePage.clickOnAmendOrderButton();
		TechnologyChangeAmendPage technologyChangeAmendPage = new TechnologyChangeAmendPage(driver);
		
		Assert.assertEquals(technologyChangeAmendPage.getNewARIHeaderLabel(), "New Application Reference Identifier*",
				"New Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsORILabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsORIValuePresent(),
				"ORI value should present but it is not");
		Assert.assertEquals(technologyChangeAmendPage.getAriHeaderLabel(), "Application Reference Identifier*",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsDOALabel(), "Date of Application",
				"Date of Application label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsTPDLabel(), "Tentative Provision Date",
				"Tentative Provision Date label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsRPDLabel(), "Timeline to Complete",
				"Timeline to Complete label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getAppDetailsRORlabel(), "Reason for Rejection",
				"Reason for Rejection label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsDOAValuePresent(),
				"Date of Application value should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsTPDValuePresent(),
				"Tentative Provision Date should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isappDetailsRPDvaluePresent(),
				"Timeline to Complete should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.isAppDetailsRORPresent(),
				"Reason for Rejection should be present but it is not ");
	}
	
	@Test(enabled = true)
	public void checkExistingConnectionDetailsComponentForSc1() throws Exception {

		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(1);
		technologyChangePage.clickOnAmendOrderButton();
		TechnologyChangeAmendPage technologyChangeAmendPage = new TechnologyChangeAmendPage(driver);
		
		Assert.assertEquals(technologyChangeAmendPage.getOrderRequestIdentifierLabel(),"Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getApplicationRreferenceIdentifierLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getTechnologyLabel(), "Technology",
				"Technology label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getOriValueLabel(),
				"ORI Value should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getAriValueTextBoxIsDisabled(),
				"Application Reference Identifier Text Box should be Disable but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getSelectTechnologyDropDown(),
				"Select Technology Drop Down should be Disable but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getNewSelectTechnologyDropDown(),
				"Select Technology Drop Down should be Disable but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getReqDateOfActLabel(), "Requested Date of Activation",
				"Requested Date of Activation label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getdaypickerRfaCalender(),
				" Requested Date of Activation calender should be Disable but it is not ");
		super.testRequestingLicenseeFunc();
	}
	
	@Test(enabled = true)
	public void checkExistingConnectionDetailsComponentForSc2() throws Exception {

		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(2);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(2);
		technologyChangePage.clickOnAmendOrderButton();
		TechnologyChangeAmendPage technologyChangeAmendPage = new TechnologyChangeAmendPage(driver);
		
		Assert.assertEquals(technologyChangeAmendPage.getOrderRequestIdentifierLabel(),"Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getApplicationRreferenceIdentifierLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getTechnologyLabel(), "Technology",
				"Technology label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getOriValueLabel(),
				"ORI Value should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getAriValueTextBoxIsDisabled(),
				"Application Reference Identifier Text Box should be Disable but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getSelectTechnologyDropDown(),
				"Select Technology Drop Down should be Disable but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getNewSelectTechnologyDropDown(),
				"Select Technology Drop Down should be Disable but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getReqDateOfActLabel(), "Requested Date of Activation",
				"Requested Date of Activation label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getdaypickerRfaCalender(),
				" Requested Date of Activation calender should be Disable but it is not ");
		super.testRequestingLicenseeFunc();
	}
	
	@Test(enabled = true)
	public void checkExistingConnectionDetailsComponentForSc3() throws Exception {

		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(3);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(3);
		technologyChangePage.clickOnAmendOrderButton();
		TechnologyChangeAmendPage technologyChangeAmendPage = new TechnologyChangeAmendPage(driver);
		
		Assert.assertEquals(technologyChangeAmendPage.getOrderRequestIdentifierLabel(),"Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getApplicationRreferenceIdentifierLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getTechnologyLabel(), "Technology",
				"Technology label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getOriValueLabel(),
				"ORI Value should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getAriValueTextBoxIsDisabled(),
				"Application Reference Identifier Text Box should be Disable but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getSelectTechnologyDropDown(),
				"Select Technology Drop Down should be Disable but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getNewSelectTechnologyDropDown(),
				"Select Technology Drop Down should be Disable but it is not ");
		Assert.assertEquals(technologyChangeAmendPage.getReqDateOfActLabel(), "Requested Date of Activation",
				"Requested Date of Activation label should be present but it is not ");
		Assert.assertTrue(technologyChangeAmendPage.getdaypickerRfaCalender(),
				" Requested Date of Activation calender should be Disable but it is not ");
		super.testRequestingLicenseeFunc();
	}

}
