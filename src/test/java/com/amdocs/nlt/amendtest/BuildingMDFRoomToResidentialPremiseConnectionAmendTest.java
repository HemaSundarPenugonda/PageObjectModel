package com.amdocs.nlt.amendtest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import com.amdocs.nlt.page.BuildingMDFRoomToResidentialPremiseConnectionPage;

public class BuildingMDFRoomToResidentialPremiseConnectionAmendTest extends CommonComponentPageTest {
	
	@Test(enabled = true)
	public void testBuildingMDFRoomToResidentialPremiseConnectionAmend() throws InterruptedException, IOException {
		dashboardPage.clickOrderManagementLink().clikMdfToResiLink().navigateToView_Pending(8);
		BuildingMDFRoomToResidentialPremiseConnectionPage mdfResiAmend = new BuildingMDFRoomToResidentialPremiseConnectionPage(driver);
		mdfResiAmend.clickAmendButton();
		mdfResiAmend.enterAmendARI("123456");
		mdfResiAmend.fillResidentialUserDetails();
		mdfResiAmend.clickAmendSubmitButton_1();
		testSuccessPage("The Building MDF Room to Residential Premise Connection : Amend request has been submitted successfully.");
	}

}
