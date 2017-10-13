package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class EnhancedFibreTakeoverServiceCancel extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForFibreTakeoverService_Pending_Schedule1() throws InterruptedException {
		testCancelPopUpfuctionalityForEnhancedFibreTakeOverService(false, false);
	}

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForFibreTakeoverService_Pending_Schedule2() throws InterruptedException {
		testCancelPopUpfuctionalityForEnhancedFibreTakeOverService(false, true);
	}

	private void testCancelPopUpfuctionalityForEnhancedFibreTakeOverService(boolean isCompleted, boolean isSchedule2) throws InterruptedException {
		dashboardPage.clickEnhancedFibreTakeoverService();
		if (!isCompleted && !isSchedule2)
			dashboardPage.navigateToView_Pending(1);
		else if (!isCompleted && isSchedule2)
			dashboardPage.navigateToView_Pending(2);

		testCancelPopUpfuctionality("01-01-07022017-101837-?");
	}
}
