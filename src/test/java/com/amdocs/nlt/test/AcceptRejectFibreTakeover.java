package com.amdocs.nlt.test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.AcceptRejectFibreTakeoverPage;

public class AcceptRejectFibreTakeover extends CommonComponentPageTest {

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Accept_Pending_Resi() throws InterruptedException {
		testAcceptFibreTakeoverService_Accept(false, false);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Accept_Approved_Resi() throws InterruptedException {
		testAcceptFibreTakeoverService_Accept(true, false);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Accept_NotRequested_Resi() throws InterruptedException {
		testAcceptFibreTakeoverService_Accept(null, false);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Reject_DiffSubscriber_Resi() throws InterruptedException {
		testAcceptFibreTakeoverService_Reject("Different Subscriber Name", "Different Subscriber Name", false);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Reject_ServiceValid_Resi() throws InterruptedException {
		testAcceptFibreTakeoverService_Reject("Service still valid", "Service still valid", false);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Reject_Others_Resi() throws InterruptedException {
		testAcceptFibreTakeoverService_Reject("Others", "Others", false);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Accept_Pending_nonResi() throws InterruptedException {
		testAcceptFibreTakeoverService_Accept(false, true);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Accept_Approved_nonResi() throws InterruptedException {
		testAcceptFibreTakeoverService_Accept(true, true);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Accept_NotRequested_nonResi() throws InterruptedException {
		testAcceptFibreTakeoverService_Accept(null, true);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Reject_DiffSubscriber_nonResi() throws InterruptedException {
		testAcceptFibreTakeoverService_Reject("Different Subscriber Name", "Different Subscriber Name", true);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Reject_ServiceValid_nonResi() throws InterruptedException {
		testAcceptFibreTakeoverService_Reject("Service still valid", "Service still valid", true);
	}

	@Test(enabled = true)
	public void testAcceptFibreTakeoverService_Reject_Others_nonResi() throws InterruptedException {
		testAcceptFibreTakeoverService_Reject("Others", "Others", true);
	}

	private void testAcceptFibreTakeoverService_Accept(Boolean isApproved, boolean isNonResi)
			throws InterruptedException {

		if (!isNonResi) {
			dashboardPage.clickOrderManagementLink().clickResiLink();
			if (isApproved == null)
				dashboardPage.navigateToView_Pending(1);
			else if (isApproved)
				dashboardPage.navigateToView_Approved_TakeOver_schedule1();
			else if (!isApproved)
				dashboardPage.navigateToView_Pending_TakeOver_schedule1();
		}else {
			dashboardPage.clickOrderManagementLink().clikNonResiLink();
			if (isApproved == null)
				dashboardPage.navigateToView_Pending(2);
			else if (isApproved)
				dashboardPage.navigateToView_Approved_TakeOver_schedule2();
			else if (!isApproved)
				dashboardPage.navigateToView_Pending_TakeOver_schedule2();
		}

		AcceptRejectFibreTakeoverPage ftsPage = new AcceptRejectFibreTakeoverPage(driver);
		Thread.sleep(1000);
		if (isApproved != null) {
			if (isApproved == true || isApproved == false) {
				Assert.assertEquals(ftsPage.getTakeOverAccordionText(), "Accept/Reject Fibre Takeover");

				Assert.assertEquals(ftsPage.getTakeOverDateLabelText(), "Takeover Date");
				Assert.assertTrue(ftsPage.isTakeOverDateTextboxDisplayed());
				Assert.assertFalse(ftsPage.isTakeOverDateTextboxEnabled());

				Assert.assertEquals(ftsPage.getTakeOverTimeLabelText(), "Takeover Time");
				Assert.assertTrue(ftsPage.isTakeOverTimeDropdownDisplayed());
				Assert.assertFalse(ftsPage.isTakeOverTimeDropdownEnabled());

				Assert.assertEquals(ftsPage.getApproveByDateLabelText(), "Approve By Date");
				Assert.assertTrue(ftsPage.isApproveByDateTextboxDisplayed());
				Assert.assertFalse(ftsPage.isApproveByDateTextboxEnabled());

				if (isApproved == false) {
					Assert.assertTrue(ftsPage.isAcceptButtonEnabled());
					Assert.assertTrue(ftsPage.isRejectButtonEnabled());

					ftsPage.clickAcceptButton();
					Thread.sleep(2000);
					Assert.assertEquals(ftsPage.getPopupHeading(), "Confirm Acceptance");
					Assert.assertTrue(ftsPage.isYesButtonEnabled());
					Assert.assertTrue(ftsPage.isNoButtonEnabled());

					ftsPage.clickNoButtonOnPopup();
					Assert.assertFalse(ftsPage.isApproveMessageDisplayed());

					ftsPage.clickAcceptButton();
					Thread.sleep(2000);
					ftsPage.clickYesButtonOnPopup();
					Thread.sleep(2000);
					Assert.assertEquals(ftsPage.getApproveMessage(),
							"Fibre Takeover Request has been successfully Accepted.");

				} else {
					Assert.assertEquals(ftsPage.getTakeOverStatus(), "APPROVED");
				}

			}
		} else {
			Assert.assertFalse(ftsPage.isTakeOverAccordionDisplayed());
		}
	}

	private void testAcceptFibreTakeoverService_Reject(String reason, String reasonMessage, boolean isNonResi)
			throws InterruptedException {

		if (!isNonResi) {
			dashboardPage.moveToOrderManagementLink().clickResiLink();
			dashboardPage.navigateToView_Pending_TakeOver_schedule1();
		} else {
			dashboardPage.moveToOrderManagementLink().clikNonResiLink();
			dashboardPage.navigateToView_Pending_TakeOver_schedule2();
		}


		AcceptRejectFibreTakeoverPage ftsPage = new AcceptRejectFibreTakeoverPage(driver);
		Thread.sleep(1000);

		ftsPage.clickRejectButton();
		Thread.sleep(2000);
		Assert.assertEquals(ftsPage.getPopupHeading(), "Confirm Rejection");
		ftsPage.areRejectReasonDropDownValuesCorrect();

		Assert.assertFalse(ftsPage.isYesButtonEnabled());
		Assert.assertTrue(ftsPage.isNoButtonEnabled());
		ftsPage.selectRejectReasonValue(reason);
		Assert.assertTrue(ftsPage.isYesButtonEnabled());
		Assert.assertTrue(ftsPage.isNoButtonEnabled());

		ftsPage.clickNoButtonOnPopup();
		Assert.assertFalse(ftsPage.isApproveMessageDisplayed());

		ftsPage.clickRejectButton();
		Thread.sleep(2000);
		ftsPage.selectRejectReasonValue(reason);
		ftsPage.clickYesButtonOnPopup();
		Thread.sleep(2000);
		Assert.assertEquals(ftsPage.getRejectMessage(), "Fibre Takeover Request has been successfully Rejected.");
		Assert.assertEquals(ftsPage.getRejectReasonMessage(), reasonMessage);
	}
}
