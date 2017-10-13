package com.amdocs.nlt.canceltest;

import org.testng.annotations.Test;

public class FibreTakeoverServiceCancel extends CommonCancelTest {

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForFibreTakeoverService_Pending_Schedule1() throws InterruptedException {
		testCancelPopUpfuctionalityForFibreTakeoverService(false, false);
	}

	@Test(enabled = true)
	public void testCancelPopUpfuctionalityForFibreTakeoverService_Pending_Schedule2() throws InterruptedException {
		testCancelPopUpfuctionalityForFibreTakeoverService(false, true);
	}

	private void testCancelPopUpfuctionalityForFibreTakeoverService(boolean isCompleted, boolean isSchedule2) throws InterruptedException {

		dashboardPage.moveToOrderManagementLink().clickFibreTakeoverService();
		if (!isCompleted && !isSchedule2)
			dashboardPage.navigateToView_Pending(1);
		else if (!isCompleted && isSchedule2)
			dashboardPage.navigateToView_Pending(2);

		testCancelPopUpfuctionality("01-01-07022017-101837-?");
	}

}
