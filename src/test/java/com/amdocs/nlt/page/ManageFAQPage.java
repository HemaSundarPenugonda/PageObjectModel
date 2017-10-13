package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class ManageFAQPage extends CommonComponentPage {

	public ManageFAQPage(WebDriver driver) {
		super(driver);

	}

	private final By searchFaqLabel = By.xpath("//label[@data-qa='label_Search_FAQ']");
	private final By faqCategoryDropdwon = By.xpath("//select[@data-qa='FAQ_category_selector']");
	private final By faqSearchTextBox = By.xpath("//input[@data-qa='search_FAQ_text']");
	private final By faqSearchbutton = By.xpath("//button[@data-qa='btn_search_FAQ']");
	private final By clearSearchLink = By.xpath("//a[@data-qa='clear_search']");
	private final By addNewFaqButton = By.xpath("//button[@data-qa='btn_add_new_FAQ']");
	private final By modifyFaqButton = By.xpath("//button[@data-qa='btn_modify_FAQ']");
	private final By deleteFaqButton = By.xpath("//button[@data-qa='btn_delete_FAQ']");
	private final By selectAllFaqLink = By.xpath("//a[@data-qa='select_FAQs']");
	private final By deselectAllFaqLink = By.xpath("//a[@data-qa='deselect_FAQs']");
	private final By faqQuestionTextBox = By.xpath("//textarea[@id='question']");
	private final By faqAnswerTextBox = By.xpath("//textarea[@id='answer']");
	private final By faqCategoryDropdwoninModal = By.xpath("//select[@id='category']");
	private final By saveButtonInModal = By.xpath("//button[@data-qa='save-button']");
	private final By faqCheckBox = By.xpath("	//input[@data-qa='select_a_FAQ_checkbox']");

	public String getSearchFaqLabelText() {
		return ElementUtils.getText(driver, searchFaqLabel);

	}

	public boolean isFaqCatergoryDropdownValuescorrect() throws InterruptedException {
		//WebElement faqCategoryDropDownElement = driver.findElement(faqCategoryDropdwon);
		WebElement faqCategoryDropDownElement = ElementUtils.getElement(driver, faqCategoryDropdwon);
		return ElementUtils.verifyDropdownValues(faqCategoryDropDownElement, DropDowns.FAQ_expFaqCategory);
	}

	public boolean getDefaultDropdownValueForFaqCategeoryDropdown() throws InterruptedException {
		WebElement faqCategoryDropDownElement = ElementUtils.getElement(driver, faqCategoryDropdwon);
		return ElementUtils.verifyDropdownValues(faqCategoryDropDownElement, DropDowns.FAQ_expFaqCategory);

	}

	public boolean isSearchTextboxPresent() {
		return ElementUtils.getElement(driver, faqSearchTextBox).isDisplayed();
	}

	public boolean isFaqSearchButtonPresent() {
		return ElementUtils.getElement(driver, faqSearchbutton).isDisplayed();

	}

	public String getClearSearchLabel() {
		return ElementUtils.getText(driver, clearSearchLink);

	}

	public boolean isClearSearchFuctionalityWorking() throws InterruptedException {
		ElementUtils.getElement(driver, faqSearchTextBox).sendKeys("abc");
		String textinSearchBox = ElementUtils.getElement(driver, faqSearchTextBox).getText();
		ElementUtils.findElementForClick(driver, clearSearchLink).click();
		return false;
	}

	public boolean isAddNewFqaButtonEnabledDefault() {
		return ElementUtils.getElement(driver, addNewFaqButton).isEnabled();
	}

	public boolean isModifyFqaButtonDisabledDefault() {
		return ElementUtils.getElement(driver, modifyFaqButton).isEnabled();
	}

	public boolean isDeleteFqaButtonDisabledDefault() {
		return ElementUtils.getElement(driver, deleteFaqButton).isEnabled();
	}

	public boolean isSelectAllFaqLinkPresent() {
		return ElementUtils.getElement(driver, selectAllFaqLink).isDisplayed();
	}

	public boolean isDeSelectAllFaqLinkPresent() {
		return ElementUtils.getElement(driver, deselectAllFaqLink).isDisplayed();
	}

	public void VerifyAddNewFaqFucntionality() throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			ElementUtils.findElementForClick(driver, addNewFaqButton).click();
			ElementUtils.getElement(driver, faqQuestionTextBox).sendKeys("who we(NLT) are");
			if (i >= 3 && i < 5) {
				ElementUtils.getElement(driver, faqAnswerTextBox).sendKeys(
						"NetLink Trust designs, builds, owns and operates the fibre network infrastructure which"
								+ " is the foundation of Singapore's Next Generation Nationwide Broadband Network (Next Gen NBN).Since 1 "
								+ "October 2014, NetLink Trust represents the birth of a single entity that brings together the core fibre"
								+ " infrastructure and resources such as the central offices, ducts "
								+ "and manhole network, as well as the capabilities of fibre network design, build and management. As the passive infrastruecture operaator in the");
				Select faqCategory = new Select(ElementUtils.getElement(driver, faqCategoryDropdwoninModal));
				faqCategory.selectByVisibleText("Others");

			} else {
				ElementUtils.getElement(driver, faqAnswerTextBox).sendKeys("sjhdgjwq");
				Select faqCategory = new Select(ElementUtils.getElement(driver, faqCategoryDropdwoninModal));
				faqCategory.selectByIndex(1);
			}
			ElementUtils.findElementForClick(driver, saveButtonInModal).click();
		}
	}

	public boolean isSelectDeselectFuctionalityWorking() throws InterruptedException {
		ElementUtils.findElementForClick(driver, selectAllFaqLink).click();
		ElementUtils.findElementForClick(driver, deleteFaqButton).click();
		ElementUtils.findElementForClick(driver, By.xpath("//button[@data-qa='yes-button']")).click();
		return ElementUtils.getElement(driver, By.xpath("//span[@data-qa='showing_FAQ_txt']")).getText()
				.equals("There are no FAQ available");

	}

	public boolean isModifyFaqButtongGetEnbaleWhenSingleFaqCheckboxIsSelected() throws InterruptedException {
		ElementUtils.findElementForClick(driver, faqCheckBox).click();
		return ElementUtils.getElement(driver, modifyFaqButton).isEnabled();
	}
}
