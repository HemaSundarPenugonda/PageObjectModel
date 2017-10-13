package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.OrderTestData;

public class PatchingServicePage extends CommonComponentPage {

	public PatchingServicePage(WebDriver driver) {
		super(driver);

	}

	OrderTestData data = new OrderTestData();
	// patching detail component locator
	private final By patchingDetailLabel = By.xpath("//div[@data-qa='patchingDetails_top_label']");
	private final By locationLabel = By.xpath("//label[@data-qa='loaction_label']");
	private final By addressLabel = By.xpath("//label[@data-qa='address_label']");
	private final By fromLabel = By.xpath("//label[@data-qa='from_label']");
	private final By toLabel = By.xpath("//label[@data-qa='to_label']");
	private final By locatiobDropdown = By.xpath(".//*[@id='location']");
	private final By addressTextbox = By.xpath(".//*[@id='address']");
	private final By fromTextbox = By.xpath(".//*[@id='from']");
	private final By toTextbox = By.xpath(".//*[@id='to']");
	private final By patchFrom = By.xpath("//*[@data-qa='patchFrom_input']");
	private final By patchTo = By.xpath("//*[@data-qa='patchTo_input']");

	public String getPatchingDetailLabel() {
		return ElementUtils.getText(driver, patchingDetailLabel);
	}

	public String getlocationLabel() {
		return ElementUtils.getText(driver, locationLabel);
	}

	public String getaddressLabel() {
		return ElementUtils.getText(driver, addressLabel);
	}

	public String getfromfieldLabel() {
		return ElementUtils.getText(driver, fromLabel);
	}

	public String gettofieldLabel() {
		return ElementUtils.getText(driver, toLabel);
	}

	public String getDefaultDropdownValueForLocationDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, locatiobDropdown);
	}

	public void populatePatchServiceForm() throws InterruptedException {

		ElementUtils.getElement(driver, ARITextBox).sendKeys(data.getAppRefNumber());

		selectCalendarDate();

		Select location = new Select(ElementUtils.getElement(driver, locatiobDropdown));
		location.selectByIndex(2);
		ElementUtils.getElement(driver, addressTextbox).sendKeys("this is address");
		Select patchFromOwner = new Select(ElementUtils.getElement(driver, patchFrom));
		patchFromOwner.selectByIndex(2);
		ElementUtils.getElement(driver, fromTextbox).sendKeys("this is from value");
		Select patchToOwner = new Select(ElementUtils.getElement(driver, patchTo));
		patchToOwner.selectByIndex(2);		
		ElementUtils.getElement(driver, toTextbox).sendKeys("this is to text box");
		ElementUtils.selectDropdownValue(driver, patchFrom, "NLT");
		ElementUtils.selectDropdownValue(driver, patchTo, "RL");

		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

	public boolean checkFormValidationForSubmitButton() throws InterruptedException {
		ElementUtils.getElement(driver, ARITextBox).sendKeys(data.getAppRefNumber());

		selectCalendarDate();
		return ElementUtils.getElement(driver, submitRequestButton).isEnabled();

	}

	public String getConfirmationMessage() {
		return ElementUtils.getText(driver, confirmationMessage);
	}

	public String getPatchToValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, patchTo);
	}

	public String getPatchFromValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, patchFrom);
	}
}
