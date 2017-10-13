package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class ManageTpRRRServiceCancelTest extends CommonCancelTest{
	
	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForManageTpRRRSchedule1() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickManageTPRRRLink().navigateToView_Pending(1);
		super.testCancelPopUpfuctionalityManageTPRRR();
	}	
	
	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForManageTpRRRSchedule2() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickManageTPRRRLink().navigateToView_Pending(2);
		super.testCancelPopUpfuctionalityManageTPRRR();
	}

}
