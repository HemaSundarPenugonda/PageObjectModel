package com.amdocs.nlt.util;

import java.awt.AWTException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	public static WebElement findElementForClick(WebDriver driver, By xpath) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, PropertiesReader.getInstance().waitForSecondsHigh());
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
		} catch (StaleElementReferenceException ex) {
			element = driver.findElement(xpath);
		}
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		// jse.executeScript("arguments[0].scrollIntoView()", element);
		return element;
	}

//	public static WebElement getElement(WebDriver driver, By xpath) {
//		WebElement element = null;
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, PropertiesReader.getInstance().waitForSecondsHigh());
//			element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
//		} catch (StaleElementReferenceException ex) {
//			element = driver.findElement(xpath);
//		}
//		return element;
//	}

	public static boolean isEnabled(WebDriver driver, By by) {
		return getVisibleElement(driver, by).isEnabled();
	}

	public static void sendKeys(WebDriver driver, By by, String val) {
		getVisibleElement(driver, by).clear();
		getVisibleElement(driver, by).sendKeys(val);
	}

	public static boolean isDisabled(WebDriver driver, By by) {
		return !(getElement(driver, by).isEnabled());
	}

	public static WebElement getElement(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, PropertiesReader.getInstance().waitForSecondsLow());
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}


	public static WebElement getVisibleElement(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, PropertiesReader.getInstance().waitForSecondsLow());
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static List<WebElement> getElements(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, PropertiesReader.getInstance().waitForSecondsLow());
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	public static boolean isDisplayed(WebDriver driver, By by) {
		try {
			return getElement(driver, by).isDisplayed();
		} catch (NoSuchElementException | TimeoutException e) {
			return false;
		}
	}

	public static String getText(WebDriver driver, By by) {
		return getVisibleElement(driver, by).getText();
	}

	public static String getValue(WebDriver driver, By by) {
		return getVisibleElement(driver, by).getAttribute("value");
	}

	public static String getSelectedValue(WebDriver driver, By by) {
		return new Select(getVisibleElement(driver, by)).getFirstSelectedOption().getText();
	}
	/*Need to add waitForClickable code*/
	public static void clickObject(WebDriver driver, By by) {
		// wait.until(ExpectedConditions.elementToBeClickable(by));
		try {
			getVisibleElement(driver, by).click();
		} catch (WebDriverException e) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			getVisibleElement(driver, by).click();
		}
	}
	public static void clickObject(WebElement element) {
		// wait.until(ExpectedConditions.elementToBeClickable(by));
		element.click();
	}

	public static boolean isClickable(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, PropertiesReader.getInstance().waitForSecondsLow());
		wait.until(ExpectedConditions.elementToBeClickable(by));
		return true;
	}

	public static int getLengthOfTextBoxValue(WebDriver driver, By by) {
		return getValue(driver, by).length();
	}

	public static boolean verifyDropdownValues(WebElement dropDownElement, String[] exp) throws InterruptedException {

		List<String> expectedDropDownItems = Arrays.asList(exp);
		Thread.sleep(2000);
		Select selectElement = new Select(dropDownElement);
		List<WebElement> dropdownElements = selectElement.getOptions();
		if (!(expectedDropDownItems.size() == dropdownElements.size()))
			return false;
		for (WebElement indElement : dropdownElements) {
			if (!expectedDropDownItems.contains(indElement.getText()))
				return false;
		}
		return true;
	}

	public static boolean verifyDropdownValues(WebDriver driver, By dropDownElement, String[] exp) throws InterruptedException {
		return verifyDropdownValues(getVisibleElement(driver, dropDownElement), exp);
	}

//	public static boolean verifyDropdownValues(WebDriver driver, By dropDownElement, AppEnums.LocalEnum[] exp) throws InterruptedException {
//
//		List<String> actualDropDownItems = new ArrayList<>();
//		Thread.sleep(2000);
//
////		List<WebElement> actualElements = getVisibleElement(driver, dropDownElement).findElements(By.xpath(".//option/span"));
//		List<WebElement> actualElements = new Select(getVisibleElement(driver, dropDownElement)).getOptions();
//		for (WebElement indActual : actualElements) {
//			actualDropDownItems.add(indActual.getText());
//		}
//		if (!(exp.length == actualDropDownItems.size()))
//			return false;
//		for (AppEnums.LocalEnum indElement : exp) {
//			if (!actualDropDownItems.contains(indElement.getValue()))
//				return false;
//		}
//		return true;
//	}

	public static boolean verifyoptionExistsInDropdown(WebElement dropDownElement, String exp) throws InterruptedException {

		Thread.sleep(2000);
		Select selectElement = new Select(dropDownElement);
		List<WebElement> dropdownElements = selectElement.getOptions();
		List<String> actualDropDownValues = new ArrayList<>();
		for (WebElement indElement : dropdownElements) {
			actualDropDownValues.add(indElement.getText());
			if (exp.equals(indElement.getText()))
				return true;
		}
		return false;
	}

	public static int noOptionsInDropdown(WebDriver driver, By dropDownElement) throws InterruptedException {
		int size;
		Thread.sleep(2000);
		Select selectElement = new Select(getVisibleElement(driver, dropDownElement));
		List<WebElement> options = selectElement.getOptions();
		size = options.size();
		for (WebElement element : options) {
			if (element.getText().equalsIgnoreCase("select")) {
				size = size - 1;
				break;
			}
		}
		return size;
	}

	public static boolean verifyoptionExistsInDropdown(WebDriver driver, By by, String exp) throws InterruptedException {
		return verifyoptionExistsInDropdown(getVisibleElement(driver, by), exp);
	}

	public static boolean selectDropdownValue(WebDriver driver, By by, String val) {
		Select sel = new Select(getVisibleElement(driver, by));
		sel.selectByVisibleText(val);
		return true;
	}

	public static boolean isMandatory(WebDriver driver, By by) {
		return Boolean.parseBoolean(getVisibleElement(driver, by).getAttribute("required"));
	}

	public static void performFileUplaod(WebDriver driver, String fileName) throws URISyntaxException, InterruptedException, AWTException {
		performFileUplaod(driver, By.xpath("//input[@data-qa='required_file_value']"), fileName);
	}

	public static void performFileUplaod(WebDriver driver, By browseAndUpload_By, String fileName) throws URISyntaxException, InterruptedException, AWTException {
		String filePath = Paths.get(ElementUtils.class.getResource("/FileUploadData/" + fileName).toURI())
				.toAbsolutePath().toString();

		if (driver instanceof RemoteWebDriver)
			((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());

		WebElement upload = getElement(driver, browseAndUpload_By);
		upload.sendKeys(filePath);
	}

	public static String getDefaultDropdownVlaue(WebDriver driver, By element) throws InterruptedException {
		WebElement selectElement = ElementUtils.getVisibleElement(driver, element);
		Select select = new Select(selectElement);
		Thread.sleep(1000);
		return select.getFirstSelectedOption().getText();
	}

	public static String getPlaceholderText(WebDriver driver, By element) {
		return ElementUtils.getVisibleElement(driver, element).getAttribute("placeholder");
	}

	public static boolean waitForInvisibility(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
		return true;
	}
}