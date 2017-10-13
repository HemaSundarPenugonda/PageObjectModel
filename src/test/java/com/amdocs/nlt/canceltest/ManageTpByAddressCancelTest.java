package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class ManageTpByAddressCancelTest extends CommonCancelTest{
	
	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForManageTpByAddressSchedule1() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickManageTPByAddressLink().navigateToView_Pending(1);
		super.testCancelPopUpfuctionality();
	}
	
	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForManageTpByAddressSchedule2() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickManageTPByAddressLink().navigateToView_Pending(2);
		super.testCancelPopUpfuctionality();
	}

}
