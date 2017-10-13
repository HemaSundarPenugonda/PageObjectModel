package com.amdocs.nlt.viewtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.page.FibreTakeOverServicePage;
import com.amdocs.nlt.page.ResidentialEndUserConnectionPage;

public class UpdatedViewTest extends CommonViewTest {

	@Test(enabled = true, description = "US1813")
	public void testUpdatedViewTest_FibreTakeover() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clickFibreTakeoverService().navigateToView_Updated(1);

		FibreTakeOverServicePage page = new FibreTakeOverServicePage(driver);
		checkAvailableButtons(page);

		dashboardPage.moveToOrderManagementLink().clickResiLink().navigateToView_Updated(1);

		ResidentialEndUserConnectionPage page1 = new ResidentialEndUserConnectionPage(driver);
		checkAvailableButtons(page1);

		dashboardPage.moveToOrderManagementLink().clickResiLink().navigateToView_Completed(1);
		page1.clickOnTerminateOrderButton();
		dashboardPage.navigateToView_Updated(1);

		checkAvailableButtons(page1);
	}

	private void checkAvailableButtons(CommonComponentPage page) throws InterruptedException {
		Assert.assertEquals(page.getCurrentSatus(), "Updated");

		Assert.assertEquals(page.totalNoButtonsInActionDropdown(), 2);
		Assert.assertTrue(page.isAmendOrderOptionExistsInActionDropdown());
		Assert.assertTrue(page.isCancelOrderOptionExistsInActionDropdown());

	}
}
