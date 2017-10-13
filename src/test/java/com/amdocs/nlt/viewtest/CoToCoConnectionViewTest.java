package com.amdocs.nlt.viewtest;

import org.testng.annotations.Test;

import com.amdocs.nlt.viewpages.CoToCoConnectionViewPage;

public class CoToCoConnectionViewTest extends CommonCoViewTypeTest {

	@Test(enabled = true)
	public void testCOtoCOViewComponent() throws Exception {
		// StartPage startpage = new StartPage(driver);
		// startpage.login().clickOrderManagementLink().clickCoToCoLink().navigateToViewUrlForPending();
		dashboardPage.clickOrderManagementLink().clickCoToCoLink().navigateToView_Pending(4);
		CoToCoConnectionViewPage coToCoPage = new CoToCoConnectionViewPage(driver);
		super.checkApplicationDetailsComponent();
		coToCoPage.clickRequestingLincenseeComponent();
		super.testRequestingLicenseeFunc();
		super.checkTechnicalDetailsComponent();
	}
}