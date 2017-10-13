package com.amdocs.nlt.relocationpages;

import com.amdocs.nlt.oders.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.page.ResidentailOrderPage;
import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.OrderTestData;

public class ResidentailEndUserRelocationPage extends ResidentailOrderPage {

	public ResidentailEndUserRelocationPage(WebDriver driver) {
		super(driver);
	}

	private final By relocateButton = By.xpath("//button[@data-qa='relocate_button']");
	protected final By postalCodeTextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='postal_code']");
	protected final By unitNumberTextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='unit_number']");
	private final By firstNameTextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='first_name']");
	private final By lasttNameTextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='last_name']");
	private final By contactNumberTextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='contact_number']");
	private final By altcontactNumTextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='alt_number']");
	private final By emailAddTextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='email_address']");
	private final By ARITextBox = By.xpath("//div[@data-qa='relocate']//input[@data-qa='ari_input']");
	protected final By salutationDropdown_relocate = By
			.xpath("//div[@data-qa='relocate']//select[@data-qa='salutation']");
	private final By splitRatioDropdown = By.xpath("//div[@data-qa='relocate']//*[@id='splitratio']");
	private final By splitRatioLabel = By.xpath("//div[@data-qa='relocate']//label[@data-qa='split_ratio_label']");
	private final By tecnologyDropdown = By.xpath("//div[@data-qa='relocate']//*[@id='technology']");

	public String getDefaultValueOfPrefInstallationSessionForReconnect() throws InterruptedException {
		selectCalendarDate();
		return ElementUtils.getDefaultDropdownVlaue(driver, prefInstallSessionDropdown);
	}

	public void checkFeasibilityForReconnect_relocate() throws InterruptedException {
		OrderTestData orderData = new OrderTestData();
		ElementUtils.getElement(driver, postalCodeTextBox).sendKeys("422233");
		ElementUtils.getElement(driver, unitNumberTextBox).sendKeys(orderData.getUnitNum());
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();

		Thread.sleep(1000);
	}

	public void populatevaluesInResiEndUserForm_relocate() throws InterruptedException {

		populateResiDetail1();

		selectCalendarDate();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();

		// Thread.sleep(1000);
	}

	public void populateResiDetail1() throws InterruptedException {
		OrderTestData orderData = new OrderTestData();
		ElementUtils.getElement(driver, ARITextBox).sendKeys(orderData.getAppRefNumber());
		checkFeasibilityForReconnect_relocate();
		// Thread.sleep(1000);// Updating wait for salutation -- because test
		// cases
		// are failing --To do find a better finding
		// Select selectSalautation = new
		// Select(driver.findElement(salutationDropdown_relocate));
		Select selectSalautation = new Select(ElementUtils.getElement(driver, salutationDropdown_relocate));
		// Thread.sleep(1000);// Updating wait for salutation
		selectSalautation.selectByVisibleText("Mr.");
		ElementUtils.getElement(driver, firstNameTextBox).sendKeys(orderData.getFirstName());
		ElementUtils.getElement(driver, lasttNameTextBox).sendKeys(orderData.getLastName());
		ElementUtils.getElement(driver, contactNumberTextBox).sendKeys(orderData.getContactNum());
		ElementUtils.getElement(driver, altcontactNumTextBox).sendKeys(orderData.getAltContactNum());
		ElementUtils.getElement(driver, emailAddTextBox).sendKeys("abc@gmail.com");
	}

	public boolean areSalutationDropDownValuesCorrect() throws InterruptedException {
		WebElement salutationDropDownElement = ElementUtils.getElement(driver, salutationDropdown_relocate);
		return ElementUtils.verifyDropdownValues(salutationDropDownElement, DropDowns.EXPSALUTATION_VALUES);
	}

	public String getSplitRatioDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, splitRatioDropdown);
	}

	public boolean verifyActionWhenUserSelectOeAsTechnology() throws InterruptedException {
		Select selectDropdown = new Select(ElementUtils.getElement(driver, tecnologyDropdown));
		selectDropdown.selectByIndex(1);
		boolean isSplitRatioCorrect = getSplitRatioDropdownDefaultValue().equals("1:24");
		boolean isDropDownEnabled = !ElementUtils.getElement(driver, splitRatioDropdown).isEnabled();
		return isSplitRatioCorrect && isDropDownEnabled;
	}

	public String getSplitRatioLabel() {
		return ElementUtils.getText(driver, splitRatioLabel);
	}

	public String getTechnologyDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, tecnologyDropdown);
	}

}