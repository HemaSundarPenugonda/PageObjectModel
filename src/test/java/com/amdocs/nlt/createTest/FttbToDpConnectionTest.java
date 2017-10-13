package com.amdocs.nlt.createTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.FTTBNodeToDPConnection;

public class FttbToDpConnectionTest extends CommonComponentPageTest {

	@Test(enabled = false)
	public void testTechnicalDetailFunc_Resi() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clikFttbToDpLink();
		FTTBNodeToDPConnection fttbToDP = new FTTBNodeToDPConnection(driver);
		fttbToDP.submitFeasibility();
		super.testTechnicalDetailFunc();
		super.testAddtionalInfoComponent();
	}

	@Test(enabled = true)
	public void populateFttbToDpCreateOrderForm() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikFttbToDpLink();
		FTTBNodeToDPConnection fttbToDP = new FTTBNodeToDPConnection(driver);
		fttbToDP.populateForm();
	}
}
