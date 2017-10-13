package com.amdocs.nlt.page;

import java.awt.*;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class RLtoRLInterconnectionServicePage extends NBAPConnectionPage {

	public RLtoRLInterconnectionServicePage(WebDriver driver) {
		super(driver);
	}

	protected final By coLocationAddressLabel = By.xpath("//label[@data-qa='colocaionaddress_label']");
	protected final By cableTypelabel = By.xpath("//label[@data-qa='cable_type_label']");
	protected final By fileInputLabel = By.xpath("//label[@data-qa='file_input_label']");
	protected final By fromRL1Label = By.xpath("//label[@data-qa='fromRL']");
	protected final By toRL2Label = By.xpath("//label[@data-qa='toRl']");
	protected final By coAddressListDropdown = By.xpath("//select[@data-qa='coAddressList']");

	private final By cableTypeValueTextBox = By.xpath("//input[@data-qa='cable_type_value']");

	private final By rl1RackidTextBox = By.xpath("//input[@data-qa='rl1rackid']");
	private final By rl1ShelfTextBox = By.xpath("//input[@data-qa='rl1shelf']");
	private final By rl1PortTextBox = By.xpath("//input[@data-qa='rl1port']");

	private final By rl2RackidTextBox = By.xpath("//input[@data-qa='rl2rackid']");
	private final By rl2ShelfTextBox = By.xpath("//input[@data-qa='rl2shelf']");
	private final By rl2PortTextBox = By.xpath("//input[@data-qa='rl2port']");

	protected final By confirmationHeaderLabel = By.xpath("//label[@data-qa='confirmation_header']");

	public String getCoLocationAddressLabel() {
		return ElementUtils.getText(driver, coLocationAddressLabel);
	}

	public String getTypeOfCableToBeDeployed() {
		return ElementUtils.getText(driver, cableTypelabel);
	}

	public String getFileInputLabel() {
		return ElementUtils.getText(driver, fileInputLabel);
	}

	public String getFromRL1Label() {
		return ElementUtils.getText(driver, fromRL1Label);
	}

	public String getToRL2Label() {
		return ElementUtils.getText(driver, toRL2Label);
	}

	public void rlToRLInterconnectionDetailsFunctional() throws InterruptedException, AWTException, URISyntaxException {
		ElementUtils.getElement(driver, ARITextBox).sendKeys("092808");
		Select selectCentralOffice = new Select(ElementUtils.getElement(driver, coAddressListDropdown));
		selectCentralOffice.selectByIndex(2);

		ElementUtils.getElement(driver, cableTypeValueTextBox).sendKeys("Test");
		ElementUtils.getElement(driver, rl1RackidTextBox).sendKeys("11");
		ElementUtils.getElement(driver, rl1ShelfTextBox).sendKeys("12");
		ElementUtils.getElement(driver, rl1PortTextBox).sendKeys("13");
		ElementUtils.getElement(driver, rl2RackidTextBox).sendKeys("21");
		ElementUtils.getElement(driver, rl2ShelfTextBox).sendKeys("22");

		ElementUtils.performFileUplaod(driver, "Nbap.pdf");
		ElementUtils.getElement(driver, rl2PortTextBox).sendKeys("23");

		ElementUtils.findElementForClick(driver, submitRequestButton).click();
		
	}

//	public void waitForPageElement(final By element, long timeOutInSeconds) {
//
//		new WebDriverWait(driver, timeOutInSeconds).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class).until(new Function<WebDriver, WebElement>() {
//					public WebElement apply(WebDriver driver) {
//						return driver.findElement(element);
//					}
//				});
//		// .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
//	}
}
