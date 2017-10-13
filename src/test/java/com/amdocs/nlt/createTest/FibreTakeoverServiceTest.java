package com.amdocs.nlt.createTest;

import com.amdocs.nlt.oders.AddressObject;
import com.amdocs.nlt.oders.CommonDataObject;
import com.amdocs.nlt.page.FibreTakeOverServicePage;
import com.amdocs.nlt.util.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FibreTakeoverServiceTest extends CommonComponentPageTest {

    @Test(enabled = true)
    public void testFeasibilityCheck() throws InterruptedException, IOException {

        Thread.sleep(1000);
        dashboardPage.clickOrderManagementLink().clickFibreTakeoverService();

        FibreTakeOverServicePage ftsPage = new FibreTakeOverServicePage(driver);
        Thread.sleep(1000);
        Assert.assertEquals(ftsPage.getHeader(), "Request for Fibre Takeover Service");

        Assert.assertTrue(ftsPage.clickTopBackButton());
        dashboardPage.moveToOrderManagementLink().clickFibreTakeoverService();

        Assert.assertTrue(ftsPage.clickBottomBackButton());
        dashboardPage.moveToOrderManagementLink().clickFibreTakeoverService();

        Assert.assertTrue(ftsPage.isNewARILabelDisplayed());

        CommonDataObject userDetails = new Utilities().prepareCommonData();
        ftsPage.enterARI(userDetails.getApplicationReference_minLength());
        Assert.assertEquals(ftsPage.getARILength(), 1);
        ftsPage.enterARI(userDetails.getApplicationReference_maxLengthMinus1());
        Assert.assertEquals(ftsPage.getARILength(), 49);
        ftsPage.enterARI(userDetails.getApplicationReference_maxLength());
        Assert.assertEquals(ftsPage.getARILength(), 50);
        ftsPage.enterARI(userDetails.getApplicationReference_maxLengthPlus1());
        Assert.assertEquals(ftsPage.getARILength(), 50);

//        Assert.assertTrue(ftsPage.areRSPDropDownValuesCorrect());
        Assert.assertEquals(ftsPage.getDefaultValueForRSPDropdown(), "Select");
        // need to add test for same RSP check box

        Assert.assertTrue(ftsPage.isFeasibilityCheckSectionDisplayed());

        Assert.assertTrue(ftsPage.areScheduleDropDownValuesCorrect());
        Assert.assertEquals(ftsPage.getDefaultValueForScheduleDropdown(), "Select");
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_HomeReached() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "homereached");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule2_BuildingReached() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule2", "buildingreached");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_InService() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "inservice");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_Installation() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "installation");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_Reconnect() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "reconnect");

        testCreateView(address);
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_HomePassed() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "homepassed");

        FibreTakeOverServicePage ftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(ftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(ftsPage.getErrorVallidation(), "You Are not allowed to submit the FTO Order.");
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_USO() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "uso");

        FibreTakeOverServicePage ftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(ftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(ftsPage.getErrorVallidation(), "Address not found");
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_NoPortAvail() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "noportavail");

        FibreTakeOverServicePage ftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(ftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(ftsPage.getErrorVallidation(), "Port Not Available");
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_FRC() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "frc");

        FibreTakeOverServicePage ftsPage = navigateAndSubmitFeasibility(address);
        Assert.assertTrue(ftsPage.isErrorVallidationDisplayed());
        Assert.assertEquals(ftsPage.getErrorVallidation(), "No FRC Readiness");
    }

    @Test(enabled = true)
    public void fibreTakeOverServiceCreateTest_Schedule1_Reclassify() throws InterruptedException, IOException {
        AddressObject address = new Utilities().prepareAddress("schedule1", "homepassedfirstfree", false, true);

        FibreTakeOverServicePage ftsPage = navigateAndSubmitFeasibility(address);
        Thread.sleep(1000);
        Assert.assertEquals(ftsPage.getReclassifyPopupHeader(), "Reclassify");
    }

    private void testCreateView(AddressObject address) throws InterruptedException, IOException {
        FibreTakeOverServicePage ftsPage = navigateAndSubmitFeasibility(address);

        Assert.assertEquals(ftsPage.getCoverageStatusValue(), address.getCoverageStatus());
//        Assert.assertFalse(ftsPage.isBuildingNumberEnabled());
        Assert.assertEquals(ftsPage.getBuildingNumberValue(), address.getBuildingNumber());
        Assert.assertFalse(ftsPage.isBuildingNameEnabled());
        Assert.assertEquals(ftsPage.getBuildingNameValue(), address.getBuildingName());
        Assert.assertFalse(ftsPage.isStreetNameEnabled());
        Assert.assertEquals(ftsPage.getStreetNameValue(), address.getStreetName());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(ftsPage.isBuildingTypeEnabled());
            Assert.assertEquals(ftsPage.getBuildingType(), address.getBuildingType());
            Assert.assertFalse(ftsPage.isCopifTypeEnabled());
            Assert.assertEquals(ftsPage.getCopifType(), address.getCopifType());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertFalse(ftsPage.isBuildingTypeDisplayed());
            Assert.assertFalse(ftsPage.isCopifTypeDisplayed());
        }


        Assert.assertTrue(ftsPage.isSalutationEnabled());
        Assert.assertTrue(ftsPage.areSalutationDropDownValuesCorrect());
        Assert.assertTrue(ftsPage.isFirstNameEnabled());
        Assert.assertTrue(ftsPage.isLastNameEnabled());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(ftsPage.isCompanyNameDisplayed());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertTrue(ftsPage.isCompanyNameDisplayed());
            Assert.assertTrue(ftsPage.isCompanyNameEnabled());
        }


        Assert.assertTrue(ftsPage.isContactNumberEnabled());
        Assert.assertTrue(ftsPage.isAlternateContactNumberEnabled());
        Assert.assertTrue(ftsPage.isEmailAddressEnabled());
        Assert.assertTrue(ftsPage.isEmailAddressMandatory());
        Assert.assertTrue(ftsPage.isCalenderIconPresent());

        ftsPage.fillFibreTakeOverForm();
        testSuccessPage("The Fibre Takeover Service request has been submitted successfully.");
    }

    private FibreTakeOverServicePage navigateAndSubmitFeasibility(AddressObject address) throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.moveToOrderManagementLink().clickFibreTakeoverService();

        FibreTakeOverServicePage ftsPage = new FibreTakeOverServicePage(driver);

        Assert.assertTrue(ftsPage.isNewARILabelEnabled());
        Assert.assertTrue(ftsPage.isExistingRspEnabled());

        ftsPage.submitFeasibility(address.getScheduleName(), address.getPostalCode(), address.getUnitNumber());
        return ftsPage;
    }
}
