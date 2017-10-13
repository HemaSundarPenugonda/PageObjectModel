package com.amdocs.nlt.createTest;

import org.testng.annotations.Test;

import com.amdocs.nlt.page.NBAPConnectionPage;

import java.awt.*;
import java.net.URISyntaxException;

public class COToNBADPConnectionTest extends CommonComponentPageTest {

	@Test(enabled = false)
	public void testNbapDetails() throws InterruptedException, URISyntaxException, AWTException {
		dashboardPage.clickOrderManagementLink().coToNbapDpconnectionLink();
		NBAPConnectionPage nBapConnection = new NBAPConnectionPage(driver);
		nBapConnection.checkFeasibilityForNbapConnectionWithNltToInstallOption();

	}

}
