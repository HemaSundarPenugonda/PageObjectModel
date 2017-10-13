package com.amdocs.nlt.viewAmendTest;

import com.amdocs.nlt.oders.SearchData;
import com.amdocs.nlt.page.SearchResultPage;
import com.amdocs.nlt.util.Utilities;
import com.amdocs.nlt.viewpages.ManageTpByAddresViewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ManageTPbyAddressAmendViewTest extends CommonAmendViewTest {

    @Test
    public void testManageTPbyAddressAmendView_Schedule1() throws InterruptedException, IOException {

        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_ManageTpbyAddress_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_manageTPbyAddress_schedule1_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Manage TP by Address : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection(page);
        testUserDetails();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    @Test
    public void testManageTPbyAddressAmendView_Schedule2() throws InterruptedException, IOException {

        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_ManageTpbyAddress_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_manageTPbyAddress_schedule2_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Manage TP by Address : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection(page);
        testUserDetails();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    @Test
    public void testManageTPbyAddressAmendView_Schedule8() throws InterruptedException, IOException {

        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_ManageTpbyAddress_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_manageTPbyAddress_schedule8_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Manage TP by Address : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection(page);
        testUserDetails();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    @Test
    public void testManageTPbyAddressAmendView_Schedule9() throws InterruptedException, IOException {

        dashboardPage.clickdashbardLink().clickOnSeachResultLink();

        SearchResultPage searchPage = new SearchResultPage(driver);
        SearchData searchData = Utilities.prepareSearchData();
        searchPage.performSeachByOri(searchData.getSearchByOri_ManageTpbyAddress_Amend());
        searchPage.clickOnOri(searchData.getOri_amend_manageTPbyAddress_schedule9_pending());

        ManageTpByAddresViewPage page = new ManageTpByAddresViewPage(driver);
        Assert.assertEquals(page.getPageHeaderForViewAmendScreen(), "Request for Manage TP by Address : Amend");

        Assert.assertEquals(page.getAppDetailsHeaderLabel(), "Application Details", "Application Details Label should present but it is not");
        checkApplicationDetailsComponent();
        testRequestDetailsSection(page);
        testUserDetails();
        testRequestedDateTimeSlotSection(page);
        testRequestingLicenseeFunc();
    }

    private void testRequestDetailsSection(ManageTpByAddresViewPage page) {
        // ToDo: need to add data-qa for Request details section header
        Assert.assertEquals(page.getAriHeaderLabel(), "Application Reference Identifier");
    }
}
