package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;
import com.amdocs.nlt.viewpages.TechnologyChangeViewPage;

public class TechnologyChangeViewTest extends CommonViewTest {

	@Test(enabled = true)
	public void checkExistingConnectionDetailsComponent() throws Exception {

		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickResiLink().navigateToResiViewUrl();
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(1);
		super.checkApplicationDetailsComponentForChangeTechnologyView();
		Assert.assertEquals(technologyChangePage.getOrderRequestIdentifierLabel(), "Order Request Identifier",
				"Order Request Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangePage.getApplicationReferenceIdentifierLabel(), "Application Reference Identifier",
				"Application Reference Identifier label should be present but it is not ");
		Assert.assertEquals(technologyChangePage.getTechnologyLabel(), "Technology",
				"Technology label should be present but it is not ");
		Assert.assertTrue(technologyChangePage.oriLabelIsDisplay(), "Order Request Identifie value lable should present while it is not");
		Assert.assertTrue(technologyChangePage.ariValueTextBoxIsDisable(), "Application Reference Identifier value text box should be disable but it is not");
		Assert.assertTrue(technologyChangePage.technologyDropDownIsDisable(), "Technology dropdown should be disable but it is not");
		
	}
	
	@Test(enabled = true)
	public void checkNewConnectionDetailsComponent() throws Exception {
		
		//StartPage startpage = new StartPage(driver);
		//startpage.login().clickOrderManagementLink().clickResiLink().navigateToResiViewUrl();
		dashboardPage.clickOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		TechnologyChangeViewPage  technologyChangePage = new TechnologyChangeViewPage(driver);
		technologyChangePage.clickOnChangeTechButton();
		dashboardPage.navigateToView_Completed(1);
		Assert.assertEquals(technologyChangePage.getactivationDateLabel(), "Requested Date of Activation",
				" Requested Date of Activation label should be present but it is not ");
		Assert.assertTrue(technologyChangePage.daypickerBoxIsDisable(), "Date picker should be disable but it is not");
		super.testRequestingLicenseeFunc();
	
		}
	
}
