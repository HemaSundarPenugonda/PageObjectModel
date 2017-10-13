package com.amdocs.nlt.page;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amdocs.nlt.util.ElementUtils;

public class SearchResultPage extends CommonComponentPage {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	private final By searchButton = By.xpath("//button[@data-qa='submit_btn']");
	private final By searchTextbox = By.xpath("//input[@data-qa='ari_input']");
	private final By searchOptionDropdown = By.xpath("//select[@data-qa='select_orderType_selector']");
	private final By seachTableRowCount = By.xpath("//tbody/tr");
	private final By searchResultText = By.xpath("//p[@data-qa='results_count_txt']");
	private final By paginationBox = By.xpath("//ul[@class='pagination']");
	private final By searchResultTableHeading_ORI = By.xpath("//th[@data-qa='Order Reference Identifier']");
	private final By searchResultTableHeading_ARI = By.xpath("//th[@data-qa='Application Reference Identifier']");
	private final By searchResultTableHeading_ScheduleNumber = By.xpath("//th[@data-qa='Schedule Number']");
	private final By searchResultTableHeading_Status = By.xpath("//th[@data-qa='Status']");
	private final By searchResults_oriLinks = By.xpath("//*[@data-qa='search_results_table']//a");

	public void populateSeachTextboxWithOri() {
		performSeachByOri("111111");
	}

	public void clickOnOri(String ori){
		List<WebElement> allResults = ElementUtils.getElements(driver, searchResults_oriLinks);
		for (WebElement indResult: allResults) {
			if (indResult.getText().equalsIgnoreCase(ori)) {
				ElementUtils.clickObject(indResult);
				break;
			}
		}
	}
	public void performSeachByOri(String ori) {
		ElementUtils.sendKeys(driver, searchTextbox, ori);
		ElementUtils.clickObject(driver, searchButton);
	}

	public void VerifyThatSearchResultsPresentInTabularFormat() {
		List<WebElement> ele = driver.findElements(seachTableRowCount);
		if (ele.size() >= 10) { }
	}

	public int getSearchresultCount() {
		try {
			ElementUtils.getElement(driver, seachTableRowCount);
			List<WebElement> ele = driver.findElements(seachTableRowCount);
			return ele.size();
		} catch (TimeoutException e){
			return 0;
		}
	}

	public boolean iSSearchResultTextPresent() {
		return ElementUtils.getElement(driver, searchResultText).isDisplayed();
	}

	public String getSearchResultText() {
		return ElementUtils.getElement(driver, searchResultText).getText();
	}

	public boolean iSPaginationPresentForMoreThanTenResult() {
		if (getSearchresultCount() >= 10) {
			return ElementUtils.getElement(driver, paginationBox).isDisplayed();
		}
		return false;
	}

	public String getSearchResultTableHeading_ORIText() {
		return ElementUtils.getText(driver, searchResultTableHeading_ORI);

	}

	public String getSearchResultTableHeading_ARIText() {
		return ElementUtils.getText(driver, searchResultTableHeading_ARI);

	}

	public String getSearchResultTableHeading_ScheduleNumberText() {
		return ElementUtils.getText(driver, searchResultTableHeading_ScheduleNumber);

	}

	public String getSearchResultTableHeading_StatusrText() {
		return ElementUtils.getText(driver, searchResultTableHeading_Status);

	}

	public void selectSearchCriteria_PostalCode(){
		ElementUtils.selectDropdownValue(driver, searchOptionDropdown, "By Postal Code");
	}

	public void enterSearchCriteriaValue(String val){
		 ElementUtils.sendKeys(driver, searchTextbox,val);
	}

	public boolean isSearchButtonEnabled(){
		return ElementUtils.isEnabled(driver, searchButton);
	}

	public void clickSearchButton(){
		ElementUtils.clickObject(driver, searchButton);
	}

	private final String[] expColumns = { "Order Reference Identifier", "Application Reference Identifier", "Schedule Number", "Status" };
	protected final By allColumns_searchResults= By.xpath("//*[@data-qa='search_results_table']//th");

	public boolean verifySearchResultColumnNames(){
		final List<WebElement> elements = ElementUtils.getElements(driver, allColumns_searchResults);
		for (WebElement indElement : elements) {
			final String currentColumnName = indElement.getText();
			if (!Arrays.asList(expColumns).contains(currentColumnName))
				return false;
		}
		return true;
	}
}