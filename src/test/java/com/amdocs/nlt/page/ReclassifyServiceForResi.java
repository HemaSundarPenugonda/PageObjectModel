package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.OrderTestData;

public class ReclassifyServiceForResi extends NonResidentialOrderPage {

	public ReclassifyServiceForResi(WebDriver driver) {
		super(driver);
	}

	private final By reclassifyHeading = By
			.xpath("//span[text()='Request for Residential Reclassification as Non-Residential Service']");
	private final By reclassify_Yes_Button = By.xpath("// button[@data-qa='yes-button']");

	public String getReclassifyHeading() {
		return ElementUtils.getText(driver, reclassifyHeading);
	}

	public boolean isPostaCodeTextboxdisabled() {
		return (!ElementUtils.getElement(driver, postalCodeTextBox).isEnabled());
	}

	public boolean isUnitnumberTextboxdisabled() {
		return (!ElementUtils.getElement(driver, unitNumberTextBox).isEnabled());

	}

	public boolean isInstallationOptiondisabled() {
		return (!ElementUtils.getElement(driver, installationOptionDropdown).isEnabled());
	}

	public void clickReclassifyButton() throws InterruptedException {
		ElementUtils.findElementForClick(driver, reclassify_Yes_Button).click();
	}

	public void clickFeasiblityCheckButton() {
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();
	}

	public void populateCreateOrderForm() throws InterruptedException {
		OrderTestData data = new OrderTestData();
		ElementUtils.getElement(driver, ARITextBox).sendKeys(data.getAppRefNumber());

		Select salutionValue = new Select(ElementUtils.getElement(driver, salutationDropdown));
		salutionValue.selectByIndex(1);

		ElementUtils.getElement(driver, firstNametextbox_AR).sendKeys("120983028");
		ElementUtils.getElement(driver, lastNametextbox_AR).sendKeys("93012830812");
		ElementUtils.getElement(driver, ContactNumtextbox_AR).sendKeys("000000000000000000000");
		ElementUtils.getElement(driver, CompanyNametextbox_AR).sendKeys("Acc");
		ElementUtils.getElement(driver, altContTextbox_AR).sendKeys("111111111111");
		ElementUtils.getElement(driver, firstNametextbox_PC).sendKeys("120983028");
		ElementUtils.getElement(driver, lastNametextbox_PC).sendKeys("93012830812");
		ElementUtils.getElement(driver, contatcNumtextbox_PC).sendKeys("09228038");
		
		selectCalendarDate();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

}
