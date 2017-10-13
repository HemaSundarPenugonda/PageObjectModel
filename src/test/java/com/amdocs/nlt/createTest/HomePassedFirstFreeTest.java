package com.amdocs.nlt.createTest;

import com.amdocs.nlt.oders.AddressObject;
import com.amdocs.nlt.page.ResidentialEndUserConnectionPage;
import com.amdocs.nlt.util.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePassedFirstFreeTest extends CommonComponentPageTest {
    @Test(enabled = true)
    public void homePassed_YES_Schedule1() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfree");
        testHomePassFirstFree_Positive(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_NO_Schedule1() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfreeno");
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_Invalid_Schedule1() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfreeinvalid");
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_YES_Schedule1_Reclassify() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfree", false, true);
        testHomePassFirstFree_Positive(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_NO_Schedule1_Reclassify() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfreeno", false, true);
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_Invalid_Schedule1_Reclassify() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfreeinvalid", false, true);
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_YES_Schedule1_Relocation() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfree", true, false);
        testHomePassFirstFree_Positive(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_NO_Schedule1_Relocation() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfreeno", true, false);
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_Invalid_Schedule1_Relocation() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule1", "homepassedfirstfreeinvalid", true, false);
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_YES_Schedule8() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfree");
        testHomePassFirstFree_Positive(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_NO_Schedule8() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfreeno");
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_Invalid_Schedule8() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfreeinvalid");
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_YES_Schedule8_Reclassify() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfree", false, true);
        testHomePassFirstFree_Positive(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_NO_Schedule8_Reclassify() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfreeno", false, true);
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_Invalid_Schedule8_Reclassify() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfreeinvalid", false, true);
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_YES_Schedule8_Relocation() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfree", true, false);
        testHomePassFirstFree_Positive(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_NO_Schedule8_Relocation() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfreeno", true, false);
        testHomePassFirstFree_Negative(addressObject);
    }

    @Test(enabled = true)
    public void homePassed_Invalid_Schedule8_Relocation() throws IOException, InterruptedException {
        final AddressObject addressObject = Utilities.prepareAddress("schedule8", "homepassedfirstfreeinvalid", true, false);
        testHomePassFirstFree_Negative(addressObject);
    }

    private void testHomePassFirstFree_Positive(AddressObject addressObject) throws InterruptedException {
        ResidentialEndUserConnectionPage page = testHomePassFirstFree(addressObject);
        Assert.assertEquals(page.getInformationMessageForFirstPassFree(), "This is a case of 'first pass free', hence installation charge is zero", "info message for home pass first free is displayed wrong");
    }

    private void testHomePassFirstFree_Negative(AddressObject addressObject) throws InterruptedException {
        ResidentialEndUserConnectionPage page = testHomePassFirstFree(addressObject);
        Assert.assertFalse(page.isInformationMessageForFirstPassFreeDisplayed(), "info message for home pass first free is displayed which is wrong");
    }

    private ResidentialEndUserConnectionPage testHomePassFirstFree(AddressObject addressObject) throws InterruptedException {
        if (addressObject.getScheduleName().equalsIgnoreCase("schedule 1")) {
            navigateToSchedule1Provide();
        } else if (addressObject.getScheduleName().equalsIgnoreCase("schedule 8")) {
            navigateToSchedule8Provide();
        }

        ResidentialEndUserConnectionPage page = new ResidentialEndUserConnectionPage(driver);
        page.submitFeasibility(addressObject);

        Assert.assertEquals(page.getCoverageStatusValue(), "Home Passed", "Coverage status value is displayed wrong");
        return page;
    }

    private void navigateToSchedule1Provide() {
        dashboardPage.clickOrderManagementLink().clickResiLink();
    }

    private void navigateToSchedule8Provide() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().clikMdfToResiLink();
    }
}
