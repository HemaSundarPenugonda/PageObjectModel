package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.base.PageTest;
import com.amdocs.nlt.page.ManageFAQPage;
import com.amdocs.nlt.page.StartPage;

public class ManageFaqTest extends PageTest {

	@Test(enabled = false)
	public void testManageFaqCommonFuctinality() throws Exception {
		dashboardPage.openSupportMenu().clickManageFaqLink();
		ManageFAQPage manageFaq = new ManageFAQPage(driver);
		Thread.sleep(2000);
		Assert.assertEquals(manageFaq.getSearchFaqLabelText(), "Search FAQ", "Label should be availeb but it is not");
		Assert.assertTrue(manageFaq.isFaqCatergoryDropdownValuescorrect(),
				"manage faq dropdown values should be correct but they are not");
		Assert.assertTrue(manageFaq.isSearchTextboxPresent(), "Search text box should be Present but it is not");
		Assert.assertEquals(manageFaq.getDefaultDropdownValueForFaqCategeoryDropdown(), "All Categories",
				"default drop-dwon value should be present for manage fqa but is not");
		Assert.assertTrue(manageFaq.isFaqSearchButtonPresent(), "Search button should be Present but it is not");
		Assert.assertEquals(manageFaq.getClearSearchLabel(), "Clear Search",
				"label Clear Search should be present for manage fqa but is not");
		/*
		 * Assert.assertTrue(manageFaq.isClearSearchFuctionalityWorking(),
		 * "clear search fuctionality should be Present but it is not");
		 */

		Assert.assertTrue(manageFaq.isAddNewFqaButtonEnabledDefault(),
				"add new faq  should be enabled by defualt but it is not");
		Assert.assertFalse(manageFaq.isModifyFqaButtonDisabledDefault(),
				"modify new faq button  should be disbaled by defualt but it is not");
		Assert.assertFalse(manageFaq.isDeleteFqaButtonDisabledDefault(),
				"delete faq button  should be disbaled by defualt but it is not");
		manageFaq.VerifyAddNewFaqFucntionality();

		Assert.assertTrue(manageFaq.isSelectAllFaqLinkPresent(),
				"add new faq  should be enabled by defualt but it is not");

		Assert.assertTrue(manageFaq.isModifyFaqButtongGetEnbaleWhenSingleFaqCheckboxIsSelected(),
				" modify faq  should not   enabled when only one faq checbox is selected");
		Assert.assertTrue(manageFaq.isDeSelectAllFaqLinkPresent(),
				"add new faq  should be enabled by defualt but it is not");

		// This also covers the scenario when there are no results in Database

		/*
		 * Assert.assertTrue(manageFaq.isSelectDeselectFuctionalityWorking(),
		 * "add new faq  should be enabled by defualt but it is not");
		 */
	}

}
