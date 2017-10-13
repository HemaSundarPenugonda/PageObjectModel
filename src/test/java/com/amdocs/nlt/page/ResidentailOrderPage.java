/**
 * @author suryakac
 */
package com.amdocs.nlt.page;

import java.util.List;

import com.amdocs.nlt.oders.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.OrderTestData;

public class ResidentailOrderPage extends CommonComponentPage {

	public ResidentailOrderPage(WebDriver driver) {
		super(driver);
	}

	private final String installationChargeForHomePassFirstPassFree = "$000.00";
	// Res user details locator
	protected final By resiUserDetailLabel = By.xpath("//span[text()='Residential User Details']");
	protected final By coverageStatusLabel = By.xpath("//label[@data-qa='coverage_status_label']");
	protected final By buildingNameLabel = By.xpath("//label[@data-qa='building_name_label']");
	protected final By streetNameLabel = By.xpath("//label[@data-qa='street_name_label']");
	protected final By streetNameTextbox = By.xpath("//input[@data-qa='street_name']");
	protected final By buidlingTypeLabel = By.xpath("//label[@data-qa='building_type_label']");
	protected final By salutationLabel = By.xpath("//label[@data-qa='salutation_label']");
	protected final By firstNameLabel = By.xpath("//label[@data-qa='first_name_label']");
	protected final By lastNameLabel = By.xpath("//label[@data-qa='last_name_label']");
	protected final By contactNumberLabel = By.xpath("//label[@data-qa='contact_number_label']");
	protected final By alternateContactNumLabel = By.xpath("//label[@data-qa='alt_number_label']");
	protected final By emailAddLabel = By.xpath("//label[@data-qa='email_address_label']");
	protected final By coverageStausValue = By.xpath("//label[@ data-qa='cs_value_label']");
	protected final By installationChargeValue = By.xpath("//label[@data-qa='charges_value_label']");
	protected final By serviceActivationChargeValue = By.xpath("//label[@data-qa='activation_value']");
//	protected final By salutationDropdown = By.xpath("//select[@data-qa='salutation']");
//	protected final By buildingTypeTextbox = By.xpath("//input[@data-qa='building_type']");
	protected final By buildingNumberDropdown = By.xpath("//select[@data-qa='building_number']");
//	protected final By firstNameTextBox = By.xpath("//input[@data-qa='first_name']");
//	protected final By lastNameTextBox = By.xpath("//input[@data-qa='last_name']");
//	protected final By contactNumberTextBox = By.xpath("//input[@data-qa='contact_number']");
	protected final By altcontactNumTextBox = By.xpath("//input[@data-qa='alt_number']");
//	protected final By emailAddTextBox = By.xpath("//input[@data-qa='email_address']");
	protected final By installatonChargeTooltip = By.xpath(".//*[@id='resUserForm']/div[6]/label[2]/span[2]");
	protected final By radioButton_normalSlot = By.xpath("//input[@data-qa='normal']");
	protected final By radioButton_SeasonalSlot = By.xpath("//input[@data-qa='seasonal']");

	protected final By coifTypeLabel = By.xpath("//label[@data-qa='copif_type_label']");
	private final By buildingTypeTooltip = By.xpath(".//*[@id='resUserForm']/div[5]/div/span");
	private final By buildingNumberTooltip = By.xpath("//div[@class='tooltip-inner']");
	private final By informationMessage_firstpassFree = By.xpath("//p[@class='show infoMessage B4']");
	private final By installationChargeToolTip = By.xpath(".//*[@id='resUserForm']/div[7]/label[2]/span");
	protected final By reserveButton = By.xpath("//*[@data-qa='rfa_timeslot_btn_reserve']");

	public boolean isServiceActivationChargeValuePresent() {
		return checkChargeLength(serviceActivationChargeValue);
	}

	public boolean isInstallationChargeValuePresent() {
		return checkChargeLength(installationChargeValue);
	}

	public boolean isToolTipPtresentForBuildingType() {
		return ElementUtils.getElement(driver, buildingTypeTooltip).isDisplayed();
	}

	public boolean isToolTipPtresentForInstallationType() {
		return ElementUtils.getElement(driver, installationChargeToolTip).isDisplayed();
	}

	public String getBuildingNumberTooltipText() {
		return ElementUtils.getText(driver, buildingNumberTooltip);
	}

	public boolean isToolPresentdForBiuldingNumber() {
		WebElement selectElement = ElementUtils.getElement(driver, buildingNumberDropdown);
		Select select = new Select(selectElement);
		if (select.getOptions().size() > 1) {
			return ElementUtils.getElement(driver, buildingNumberTooltip).isDisplayed();
		}
		return false;
	}

	public boolean isResiUserDetailSectionClikable() {
		ElementUtils.findElementForClick(driver, resiUserDetailLabel).click();
		return ElementUtils.getElement(driver, buildingNameLabel).isDisplayed();
	}

	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}

	public String getBuildingNameLabel() {
		return ElementUtils.getText(driver, buildingNameLabel);
	}

	public String getStreetNameLabel() {
		return ElementUtils.getText(driver, streetNameLabel);
	}

	public String getBuildingTypeLabel() {
		return ElementUtils.getText(driver, buidlingTypeLabel);
	}

	public String getSalutationLabel() {
		return ElementUtils.getText(driver, salutationLabel);
	}

	public String getFirstNameLabel() {
		return ElementUtils.getText(driver, firstNameLabel);
	}

	public String getLastNameLabel() {
		return ElementUtils.getText(driver, lastNameLabel);
	}

	public String getContactNumberLabel() {
		return ElementUtils.getText(driver, contactNumberLabel);
	}

	public String getAlternateContactNumberLabel() {
		return ElementUtils.getText(driver, alternateContactNumLabel);
	}

	public String getEmailAddressLabel() {
		return ElementUtils.getText(driver, emailAddLabel);
	}

	public String getCoverageStatusValue() {
		return ElementUtils.getText(driver, coverageStausValue);
	}

	public boolean IsInstallationChargeValueCorrectForFirstPassFree() {
		if (ElementUtils.getText(driver, installationChargeValue) != null) {
			Reporter.log("instllation charge is missing");
		}
		return ElementUtils.getText(driver, installationChargeValue).contains(installationChargeForHomePassFirstPassFree);
	}

	public boolean areBuildingNumberDropDownValuesCorrect() {
		WebElement buildingNumberDropDownElement = ElementUtils.getElement(driver, buildingNumberDropdown);
		try {
			return ElementUtils.verifyDropdownValues(buildingNumberDropDownElement, DropDowns.Resi_expNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean isBuildingTypeTextboxdDisplayed() {
		return ElementUtils.getElement(driver, buildingTypeTextbox).isDisplayed();
	}

	public String getDefaultValueForSalutationDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, salutationDropdown);
	}

	public boolean isInstallationChargeTooltipPresent() {
		return ElementUtils.getElement(driver, installatonChargeTooltip).isDisplayed();
	}

	public boolean isBuildingTypeTooltipPresent() {
		return ElementUtils.getElement(driver, buildingTypeTooltip).isDisplayed();
	}

	public String getredundancyServiceLabel() {
		ElementUtils.findElementForClick(driver, technicalDetailLabel).click();
		ElementUtils.getElement(driver, redundancyServiceLabel);
		return ElementUtils.getText(driver, redundancyServiceLabel);
	}

	public String getRequiredRadioButtonLabel() {
		return ElementUtils.getText(driver, requriedRadioButtonLabel);
	}

	public String getNotrequiredRadioButtonLabel() {
		return ElementUtils.getText(driver, notRequriedRadioButtonLabel);
	}

	public String getRsUnavailbleLabel() {
		ElementUtils.findElementForClick(driver, requriedRadioButton).click();
		ElementUtils.getElement(driver, rcServiceUnavailableLabel);
		return ElementUtils.getText(driver, rcServiceUnavailableLabel);
	}

	public String getRejectrequestRadioButtonLabel() {
		return ElementUtils.getText(driver, rejectRadioButtonLabel);
	}

	public String getDoNotRejRequestdRadioButtonLabel() {
		return ElementUtils.getText(driver, notRejectRadioButtonLabel);
	}

	public boolean isRequiredRadioButtonPresent() {
		return ElementUtils.isDisplayed(driver, requriedRadioButton);
	}

	public boolean isNotrequiredRadioButtonPresent() {
		return ElementUtils.isDisplayed(driver, notRequriedRadioButton);
	}

	public boolean isNotRequiredButtonCheckedDefault() {
		return ElementUtils.getElement(driver, notRequriedRadioButton).getAttribute("value").equals("0");
	}

	public boolean isRejectrequestRadioButtonPresent() {
		return ElementUtils.isDisplayed(driver, rejectRadioButton);
	}

	public boolean isDoNotRejRequestdRadioButtonPresent() {
		return ElementUtils.isDisplayed(driver, notRejectRadioButton);
	}

	public boolean isRejectRequestdButtonCheckedDefault() {
		return ElementUtils.getElement(driver, rejectRadioButton).getAttribute("value").equals("1");
	}

	public void checkFeasibilityForHomeReached() throws InterruptedException {
		checkFeasibility(false);
	}

	public void checkFeasibilityForHomePassFree() throws InterruptedException {
		checkFeasibility(true);
	}

	private void checkFeasibility(boolean firstPassFree) throws InterruptedException {
		OrderTestData orderData = new OrderTestData();
		if (firstPassFree) {
			ElementUtils.getElement(driver, postalCodeTextBox).sendKeys(orderData.getPostalCode_firstPassFree());
		} else {
			ElementUtils.getElement(driver, postalCodeTextBox).sendKeys(orderData.getPostalCode_homeReached());
		}
		ElementUtils.getElement(driver, unitNumberTextBox).sendKeys(orderData.getUnitNum());
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();

	}

	public void checkFeasibilityForReconnect() throws InterruptedException {
		OrderTestData orderData = new OrderTestData();

		ElementUtils.getElement(driver, postalCodeTextBox).sendKeys(orderData.getPostalCode_reconnect());
		ElementUtils.getElement(driver, unitNumberTextBox).sendKeys(orderData.getUnitNum());
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();
	}

	public void selectCalendarDate() throws InterruptedException {

		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		Thread.sleep(1000);
		int retryCalendarRetry = 0;
		while (allDates.isEmpty()) {
			retryCalendarRetry++;
			ElementUtils.findElementForClick(driver, calederIcon).click();
			Thread.sleep(1000);
			allDates = driver.findElements(calederDates);
			if (retryCalendarRetry > 5) {
				break;
			}
		}
		allDates.get(0).click();
	}

	public void populatevaluesInResiEndUserForm(OrderTestData orderData) throws InterruptedException {
		populateResiDetail(orderData);

		selectCalendarDate();
		ElementUtils.findElementForClick(driver, reserveButton).click();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();

	}

	public void populateResiDetail(OrderTestData orderData) throws InterruptedException {

		ElementUtils.getElement(driver, ARITextBox).sendKeys(orderData.getAppRefNumber());
		checkFeasibilityForHomePassFree();
		Select selectSalautation = new Select(ElementUtils.getElement(driver, salutationDropdown));
		selectSalautation.selectByVisibleText("Mr.");

		ElementUtils.getElement(driver, firstNameTextBox).sendKeys(orderData.getFirstName());
		ElementUtils.getElement(driver, lastNameTextBox).sendKeys(orderData.getLastName());
		ElementUtils.getElement(driver, contactNumberTextBox).sendKeys(orderData.getContactNum());
		ElementUtils.getElement(driver, altcontactNumTextBox).sendKeys(orderData.getAltContactNum());
		ElementUtils.getElement(driver, emailAddTextBox).sendKeys("abc@gmail.com");
	}

	public void poulateResiUserDeatil() throws InterruptedException {
		ElementUtils.getElement(driver, firstNameTextBox).sendKeys("suryakant");
		ElementUtils.getElement(driver, lastNameTextBox).sendKeys("chavan");
		ElementUtils.getElement(driver, contactNumberTextBox).sendKeys("893891784979");
		ElementUtils.getElement(driver, altcontactNumTextBox).sendKeys("980938120981209");
		ElementUtils.getElement(driver, emailAddTextBox).sendKeys("as@gmail.com");
		Select selectSalautation = new Select(ElementUtils.getElement(driver, salutationDropdown));
		selectSalautation.selectByVisibleText("Mr.");
	}

	public String getDefaultValueOfPrefInstallationSessionForReconnect() throws InterruptedException {
		checkFeasibilityForReconnect();
		selectCalendarDate();
		return ElementUtils.getDefaultDropdownVlaue(driver, prefInstallSessionDropdown);
	}

	public String getDefaultValueOfPrefInstallationSessionForHomeReached() throws InterruptedException {
		checkFeasibilityForHomeReached();
		selectCalendarDate();
		return ElementUtils.getDefaultDropdownVlaue(driver, prefInstallSessionDropdown);
	}

	public String getInformationMessageForFirstPassFree() throws InterruptedException {
		return ElementUtils.getText(driver, informationMessage_firstpassFree);
	}

	public boolean isInformationMessageForFirstPassFreeDisplayed() throws InterruptedException {
		return ElementUtils.isDisplayed(driver, informationMessage_firstpassFree);
	}

	public boolean checkChargeLength(By element) {
		String serviceActivationCharge = ElementUtils.getText(driver, element);
		if (serviceActivationCharge.length() < 1) {
			return false;
		} else
			return true;
	}

	// add tech detial
	public boolean isPageBelowFeasibilityResetsOnDoubleFeasibilityCheck() throws InterruptedException {

		OrderTestData orderData = new OrderTestData();
		populateResiDetail(orderData);
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();

		return ElementUtils.getElement(driver, emailAddTextBox).getAttribute("value").equals("");
	}

	public boolean isStreetNameTextboxPresent() {
		return ElementUtils.getElement(driver, streetNameTextbox).isDisplayed();
	}

	public String getCopifTypelabel() {
		return ElementUtils.getText(driver, coifTypeLabel);
	}
}
