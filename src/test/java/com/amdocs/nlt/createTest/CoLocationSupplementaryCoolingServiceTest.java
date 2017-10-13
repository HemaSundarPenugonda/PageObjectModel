package com.amdocs.nlt.createTest;

import java.awt.AWTException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.CoLocationSupplementaryCoolingServicePage;
import com.amdocs.nlt.page.StartPage;
import com.amdocs.nlt.util.ElementUtils;

public class CoLocationSupplementaryCoolingServiceTest extends CommonComponentPageTest {

    
    @Test(enabled = true)
    public void checkRequestDetailsComponent() throws Exception {
        dashboardPage.clickOrderManagementLink().navigateToCoLocationService().navigateToSupplemenrtryCoolingServiceLink();
        CoLocationSupplementaryCoolingServicePage coLocationSupplementaryCoolingServicePage = new CoLocationSupplementaryCoolingServicePage(
                driver);

        Assert.assertEquals(coLocationSupplementaryCoolingServicePage.getARILabel(),
                "Application Reference Identifier*",
                "Application Reference Identifier* label should be present but it is not ");
        Assert.assertEquals(coLocationSupplementaryCoolingServicePage.getCoLocationAddressLabel(),
                "Co-Location Address*", "Co-Location Address* label should be present but it is not ");
        Assert.assertEquals(coLocationSupplementaryCoolingServicePage.getRackHeatLoadLabelLabel(),
                "Racks which exceed heat load of 1.5 kW*");
        Assert.assertTrue(coLocationSupplementaryCoolingServicePage.verifyColocAdderssDropdownValues());
        Assert.assertTrue(coLocationSupplementaryCoolingServicePage.verifyRackTypeDropdownValues());
        Assert.assertFalse(coLocationSupplementaryCoolingServicePage.isOthersTextBoxEnabled());
        coLocationSupplementaryCoolingServicePage.populateOtherTextBox();
        Assert.assertTrue(coLocationSupplementaryCoolingServicePage.isOthersTextBoxEnabled());
        testAddtionalInfoComponent();
        coLocationSupplementaryCoolingServicePage.setAdditionalInfo("test");
        ElementUtils.performFileUplaod(driver, "Nbap.pdf");
        testRequestingLicenseeFunc();
        coLocationSupplementaryCoolingServicePage.populateCoLocAddressAndAri();
//		testRackData1(coLocationSupplementaryCoolingServicePage);
        coLocationSupplementaryCoolingServicePage.populateRackDetails1("1", "OLT", "100");
        coLocationSupplementaryCoolingServicePage.clickPlusButton();
        coLocationSupplementaryCoolingServicePage.populateRackDetails2("2", "DWDM", "200");
        coLocationSupplementaryCoolingServicePage.clickPlusButton();
        coLocationSupplementaryCoolingServicePage.populateRackDetails3("3", "ROUTERS", "300");
        Assert.assertFalse(coLocationSupplementaryCoolingServicePage.plusButtonDisplayed());
        coLocationSupplementaryCoolingServicePage.clickOnSubmitButton();
	    testSuccessPage("The Co-location Supplementary Cooling Service request has been submitted successfully.");

    }
}
