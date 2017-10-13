package com.amdocs.nlt.viewAmendTest;

import com.amdocs.nlt.oders.SearchData;
import com.amdocs.nlt.page.SearchResultPage;
import com.amdocs.nlt.util.Utilities;
import com.amdocs.nlt.viewpages.ManageTpByAddresViewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RelocationAmendViewTest extends CommonAmendViewTest {

    @Test
    public void testRelocationAmendView_Schedule1() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_Relocation_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_relocation_schedule1_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request For Relocation : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection(page);
        testUserDetails();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    @Test
    public void testRelocationAmendView_Schedule2() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_Relocation_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_relocation_schedule2_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request For Relocation : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection_2or9(page);
        testUserDetailsWithCompanyName();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    @Test
    public void testRelocationAmendView_Schedule8() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_Relocation_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_relocation_schedule8_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request For Relocation : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection_2or9(page);
        testUserDetails();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    @Test
    public void testRelocationAmendView_Schedule9() throws IOException, InterruptedException {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_Relocation_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_relocation_schedule9_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request For Relocation : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection(page);
        testUserDetailsWithCompanyName();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    private void testRequestDetailsSection(ManageTpByAddresViewPage page) {
        // ToDo: need to add data-qa for Request details section header
        Assert.assertEquals(page.getAriHeaderLabel(), "Application Reference Identifier");
    }

    private void testRequestDetailsSection_2or9(ManageTpByAddresViewPage page) {
        // ToDo: need to add data-qa for Request details section header and Unit number
        Assert.assertEquals(page.getAriHeaderLabel(), "Application Reference Identifier");
    }
}
