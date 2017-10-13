package com.amdocs.nlt.test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.SearchResultPage;

public class SearchPageTest extends CommonComponentPageTest {

	//TODO: for some reason this test is not working when run as part of PR or master but is successful when run against chromedriver or grid from eclipse
	@Test(enabled = false)
	public void testSeachResultsWithOri() throws Exception {

		dashboardPage.clickdashbardLink().clickOnSeachResultLink();
		//Thread.sleep(1000);
		SearchResultPage searchPage = new SearchResultPage(driver);
		searchPage.populateSeachTextboxWithOri();
		//Thread.sleep(3000);
		int resultCount = searchPage.getSearchresultCount();
		Assert.assertEquals(searchPage.getSearchResultText(),
				"Showing 1-" + resultCount + " results for Order Request Identifier \"111111\"",
				"label should be prsent but it is not ");
		Assert.assertTrue(searchPage.iSPaginationPresentForMoreThanTenResult(),
				"pagination box should be present if more " + "than 10 results are prsent");

		Assert.assertEquals(searchPage.getSearchResultTableHeading_ORIText(), "Order Reference Identifier",
				"label should be prsent but it is not ");
		Assert.assertEquals(searchPage.getSearchResultTableHeading_ARIText(), "Application Reference Identifier",
				"label should be prsent but it is not ");
		Assert.assertEquals(searchPage.getSearchResultTableHeading_ScheduleNumberText(), "Schedule Number",
				"label should be prsent but it is not ");
		Assert.assertEquals(searchPage.getSearchResultTableHeading_StatusrText(), "Status",
				"label should be prsent but it is not ");
	}
}
