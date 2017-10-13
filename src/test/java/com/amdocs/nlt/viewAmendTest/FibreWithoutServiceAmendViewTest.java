package com.amdocs.nlt.viewAmendTest;

import com.amdocs.nlt.oders.SearchData;
import com.amdocs.nlt.page.RequestForFiberWithputServicePage;
import com.amdocs.nlt.page.SearchResultPage;
import com.amdocs.nlt.util.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FibreWithoutServiceAmendViewTest extends CommonAmendViewTest {

    @Test
    public void testDarkFibreAmendView_Schedule1() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_DarkFibre_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_darkFibre_schedule1_pending());

        RequestForFiberWithputServicePage page = new RequestForFiberWithputServicePage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Fibre Without Service : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponentWothoutARI();
        testUserDetails();
        Assert.assertEquals(page.getBillingUserDetailsSectionHeader(), "User Billing Details");
        testBillingEndUserDetailsFieldLabels();

        testRequestedDateTimeSlotSection(page);
        testCSODetailsFieldLabels();
    }

    @Test
    public void testDarkFibreAmendView_Schedule2() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_DarkFibre_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_darkFibre_schedule2_pending());

        RequestForFiberWithputServicePage page = new RequestForFiberWithputServicePage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Fibre Without Service : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponentWothoutARI();
        testUserDetailsWithCompanyName();
        Assert.assertEquals(page.getBillingUserDetailsSectionHeader(), "User Billing Details");
        testBillingEndUserDetailsFieldLabelsWithCompanyName();

        testRequestedDateTimeSlotSection(page);
        testCSODetailsFieldLabels();
    }
}
