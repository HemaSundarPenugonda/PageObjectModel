package com.amdocs.nlt.createTest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.BuildingMDFRoomToFTTBNodeConnectionPage;
import com.amdocs.nlt.page.NonResidentialEndUserConnectionPage;

public class MdftoFttbConnectioTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void populateFttbToDpCreateOrderForm() throws InterruptedException {
		dashboardPage.clickOrderManagementLink().clikMdfToFttbiLink();
		BuildingMDFRoomToFTTBNodeConnectionPage mdftofttb = new BuildingMDFRoomToFTTBNodeConnectionPage(driver);
		mdftofttb.populateForm();
	}
}
