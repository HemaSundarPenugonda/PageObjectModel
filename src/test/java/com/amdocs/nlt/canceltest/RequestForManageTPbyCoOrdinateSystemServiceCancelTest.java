package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.StartPage;

public class RequestForManageTPbyCoOrdinateSystemServiceCancelTest extends CommonCancelTest {
	
	@Test
	public void testCancelPopUpfuctionalityForManageTPbyCoOrdinateSystemService() throws InterruptedException{
		dashboardPage.clickOrderManagementLink().manageTPbyCoordinateLink().navigateToView_Pending(1);
		super.testCancelPopUpfuctionality();
	}

}
