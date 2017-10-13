package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.RLtoRLInterconnectionServicePage;

import java.awt.*;
import java.net.URISyntaxException;

public class RLtoRLInterconnectionServiceTest extends CommonComponentPageTest {

	@Test(enabled = true)
	public void checkRLtoRInterconnectionDetailsComponent() throws InterruptedException, URISyntaxException, AWTException {
		dashboardPage.clickOrderManagementLink().rLRLInterconnectionServiceConnectionLink();
		RLtoRLInterconnectionServicePage interconnectionServicePage = new RLtoRLInterconnectionServicePage(driver);
		Assert.assertEquals(interconnectionServicePage.getARILabel(), "Application Reference Identifier*",
				"Application Reference Identifier* label should be present but it is not ");
		Assert.assertEquals(interconnectionServicePage.getCoLocationAddressLabel(), "Co-Location Address*",
				"Co-Location Address* label should be present but it is not ");
		Assert.assertEquals(interconnectionServicePage.getTypeOfCableToBeDeployed(), "Type of Cable to be Deployed*",
				"Type of Cable to be Deployed* label should be present but it is not ");
		Assert.assertEquals(interconnectionServicePage.getFileInputLabel(), "Upload Required Documents*",
				"Upload Required Documents* label should be present but it is not ");
		Assert.assertEquals(interconnectionServicePage.getFromRL1Label(), "From RL1",
				"From RL1* label should be present but it is not ");
		Assert.assertEquals(interconnectionServicePage.getToRL2Label(), "To RL2",
				"To RL2* label should be present but it is not ");
		super.testRequestingLicenseeFunc();
		super.testAddtionalInfoComponent();
		interconnectionServicePage.rlToRLInterconnectionDetailsFunctional();
		/*Assert.assertEquals(interconnectionServicePage.VerifyConfirmationMessage(),
				"The RL-RL Interconnection Service request has been submitted successfully.","Label should be present but it is not ");*/
	}

}
