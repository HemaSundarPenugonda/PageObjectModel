package com.amdocs.nlt.createTest;

import com.amdocs.nlt.oders.AddressObject;
import com.amdocs.nlt.page.EnhancedFibreTakeoverServicePage;
import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class EnhancedFibreTakeoverServiceTest extends CommonComponentPageTest {

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_HomeReached() throws InterruptedException, IOException, URISyntaxException, AWTException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "homereached");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule2_BuildingReached() throws InterruptedException, IOException, URISyntaxException, AWTException {
        AddressObject address = new Utilities().prepareAddress("schedule2", "buildingreached");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_InService() throws InterruptedException, IOException, URISyntaxException, AWTException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "inservice");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_Installation() throws InterruptedException, IOException, URISyntaxException, AWTException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "installation");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_Reconnect() throws InterruptedException, IOException, URISyntaxException, AWTException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "reconnect");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_HomePassed() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "homepassed");

        EnhancedFibreTakeoverServicePage eftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(eftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(eftsPage.getErrorVallidation(), "You Are not allowed to submit the EFTO Order");

    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_USO() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "uso");

        EnhancedFibreTakeoverServicePage eftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(eftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(eftsPage.getErrorVallidation(), "Address not found");
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_NoPortAvail() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "noportavail");

        EnhancedFibreTakeoverServicePage eftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(eftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(eftsPage.getErrorVallidation(), "Port Not Available");
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_FRC() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "frc");

        EnhancedFibreTakeoverServicePage eftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(eftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(eftsPage.getErrorVallidation(), "No FRC Readiness");
    }

    @Test(enabled = true)
    public void enhancedFibreTakeOverServiceCreateTest_Schedule1_Reclassify() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "homepassedfirstfree", false, true);

        EnhancedFibreTakeoverServicePage eftsPage = navigateAndSubmitFeasibility(address);
        Thread.sleep(1000);
        Assert.assertEquals(eftsPage.getReclassifyPopupHeader(), "Reclassify");
    }

    private void testCreateView(AddressObject address) throws InterruptedException, IOException, URISyntaxException, AWTException {
        EnhancedFibreTakeoverServicePage eftsPage = navigateAndSubmitFeasibility(address);

        Assert.assertEquals(eftsPage.getCoverageStatusValue(), address.getCoverageStatus());
//        Assert.assertFalse(eftsPage.isBuildingNumberEnabled());
        Assert.assertEquals(eftsPage.getBuildingNumberValue(), address.getBuildingNumber());
        Assert.assertFalse(eftsPage.isBuildingNameEnabled());
        Assert.assertEquals(eftsPage.getBuildingNameValue(), address.getBuildingName());
        Assert.assertFalse(eftsPage.isStreetNameEnabled());
        Assert.assertEquals(eftsPage.getStreetNameValue(), address.getStreetName());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(eftsPage.isBuildingTypeEnabled());
            Assert.assertEquals(eftsPage.getBuildingType(), address.getBuildingType());
            Assert.assertFalse(eftsPage.isCopifTypeEnabled());
            Assert.assertEquals(eftsPage.getCopifType(), address.getCopifType());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertFalse(eftsPage.isBuildingTypeDisplayed());
            Assert.assertFalse(eftsPage.isCopifTypeDisplayed());
        }

        Assert.assertTrue(eftsPage.isSalutationEnabled());
        Assert.assertTrue(eftsPage.areSalutationDropDownValuesCorrect());
        Assert.assertTrue(eftsPage.isFirstNameEnabled());
        Assert.assertTrue(eftsPage.isLastNameEnabled());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(eftsPage.isCompanyNameDisplayed());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertTrue(eftsPage.isCompanyNameDisplayed());
            Assert.assertTrue(eftsPage.isCompanyNameEnabled());
        }
        Assert.assertTrue(eftsPage.isContactNumberEnabled());
        Assert.assertTrue(eftsPage.isAlternateContactNumberEnabled());
        Assert.assertTrue(eftsPage.isEmailAddressEnabled());
        Assert.assertTrue(eftsPage.isEmailAddressMandatory());
        Assert.assertEquals(eftsPage.getUploadReqDocsLabel(), "Upload Required Documents*");

        testBrowseAndUpload(eftsPage);


        Assert.assertTrue(eftsPage.isCalenderIconPresent());

        eftsPage.fillEnhancedFibreTakeOverForm();

        testSuccessPage("The Enhanced Fibre Takeover Service request has been submitted successfully.");

    }

    private EnhancedFibreTakeoverServicePage navigateAndSubmitFeasibility(AddressObject address) throws InterruptedException {
//        Thread.sleep(1000);
        dashboardPage.clickEnhancedFibreTakeoverService();

        EnhancedFibreTakeoverServicePage eftsPage = new EnhancedFibreTakeoverServicePage(driver);
        Thread.sleep(1000);

        Assert.assertEquals(eftsPage.getHeader(), "Request for Enhanced Fibre Takeover Service");
        Assert.assertTrue(eftsPage.isNewAriTextboxEnabled());
        Assert.assertTrue(eftsPage.isExistingRspEnabled());

        eftsPage.submitFeasibility(address.getScheduleName(), address.getPostalCode(), address.getUnitNumber());
        return eftsPage;
    }

    private void testBrowseAndUpload(EnhancedFibreTakeoverServicePage eftsPage) throws InterruptedException, AWTException, URISyntaxException {
        Assert.assertTrue(eftsPage.isBrowseAndUploadButtonEnabled());
        ElementUtils.performFileUplaod(driver, "Nbap.pdf");
        Thread.sleep(1000);
        Assert.assertTrue(eftsPage.isBrowseAndUploadButtonEnabled());

    }
}
