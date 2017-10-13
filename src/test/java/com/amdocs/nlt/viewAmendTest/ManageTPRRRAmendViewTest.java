package com.amdocs.nlt.viewAmendTest;

import com.amdocs.nlt.oders.SearchData;
import com.amdocs.nlt.page.ManageTPByRRRServiceRequest;
import com.amdocs.nlt.page.SearchResultPage;
import com.amdocs.nlt.util.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ManageTPRRRAmendViewTest extends CommonAmendViewTest {

    @Test
    public void testManageTPRRRAmendView_Schedule1() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_ManageTPRRR_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_manageTPRRR_schedule1_pending());

        ManageTPByRRRServiceRequest page = new ManageTPByRRRServiceRequest(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Manage TP (RRR) Service : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponentWothoutARI();
        testUserDetails();
        Assert.assertEquals(page.getBillingUserDetailsSectionHeader(), "User Billing Details");
        testBillingEndUserDetailsFieldLabels();

        testRequestedDateTimeSlotSection(page);
        testCSODetailsFieldLabels();
    }

    @Test
    public void testManageTPRRRAmendView_Schedule2() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_ManageTPRRR_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_manageTPRRR_schedule2_pending());

        ManageTPByRRRServiceRequest page = new ManageTPByRRRServiceRequest(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Manage TP (RRR) Service : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponentWothoutARI();
        testUserDetailsWithCompanyName();
        Assert.assertEquals(page.getBillingUserDetailsSectionHeader(), "User Billing Details");
        testBillingEndUserDetailsFieldLabelsWithCompanyName();

        testRequestedDateTimeSlotSection(page);
        testCSODetailsFieldLabels();
    }
}
