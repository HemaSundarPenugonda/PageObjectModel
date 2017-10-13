package com.amdocs.nlt.test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import com.amdocs.nlt.page.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageByPostalCodeTest extends CommonComponentPageTest {

    @Test(enabled = true)
    public void searchByPostalCode_6Digits() {
        String searchValue = "111111";
        searchByPostalCode_SunnyDay(searchValue);
    }

    @Test(enabled = true)
    public void searchByPostalCode_lessThan6Digits() {
        String searchValue = "111";
        searchByPostalCode_SunnyDay(searchValue);
    }

    @Test(enabled = true)
    public void searchByPostalCode_withNoResults() {
        String searchValue = "000000";
        searchByPostalCode_NoResults(searchValue);
    }

    @Test(enabled = true)
    public void searchByPostalCode_withErrorResult() {
        String searchValue = "222222";
        searchByPostalCode_NoResults(searchValue);
    }

    @Test(enabled = true)
    public void searchByPostalCode_InvalidValue() {
        String searchValue = "abc";

        dashboardPage.clickdashbardLink().clickOnSeachResultLink();
        SearchResultPage searchPage = new SearchResultPage(driver);

        searchPage.selectSearchCriteria_PostalCode();
        Assert.assertFalse(searchPage.isSearchButtonEnabled(), "Search button is enabled which is wrong");
        searchPage.enterSearchCriteriaValue(searchValue);
        Assert.assertFalse(searchPage.isSearchButtonEnabled(), "Search button is enabled which is wrong");
    }

    private void searchByPostalCode_SunnyDay(String searchValue) {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();
        SearchResultPage searchPage = new SearchResultPage(driver);

        searchPage.selectSearchCriteria_PostalCode();
        Assert.assertFalse(searchPage.isSearchButtonEnabled(), "Search button is enabled which is wrong");
        searchPage.enterSearchCriteriaValue(searchValue);
        Assert.assertTrue(searchPage.isSearchButtonEnabled(), "Search button is disabled which is wrong");
        searchPage.clickSearchButton();

        final int searchresultCount = searchPage.getSearchresultCount();
        if (searchresultCount >= 10) {
            Assert.assertEquals(searchPage.getSearchResultText(),"Showing 1-10 results for Postal Code \""+searchValue+"\"",  "Search results message is not displayed properly");
        } else {
            Assert.assertEquals(searchPage.getSearchResultText(), "Showing "+searchresultCount+" results for Postal Code \""+searchValue+"\"", "Search results message is not displayed properly");
        }
        Assert.assertTrue(searchPage.verifySearchResultColumnNames());
    }

    private void searchByPostalCode_NoResults(String searchValue) {
        dashboardPage.clickdashbardLink().clickOnSeachResultLink();
        SearchResultPage searchPage = new SearchResultPage(driver);

        searchPage.selectSearchCriteria_PostalCode();
        Assert.assertFalse(searchPage.isSearchButtonEnabled(), "Search button is enabled which is wrong");
        searchPage.enterSearchCriteriaValue(searchValue);
        Assert.assertTrue(searchPage.isSearchButtonEnabled(), "Search button is disabled which is wrong");
        searchPage.clickSearchButton();

        Assert.assertEquals(searchPage.getSearchresultCount(), 0, "Results are displayed which is wrong");
        Assert.assertEquals(searchPage.getSearchResultText(), "Showing 0 results for Postal Code \""+searchValue+"\"", "Search results message is not displayed properly");
    }

}
