package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class TechnologyChangeViewPage extends CommonViewPage {

	
	private final By changeTechnologyButton = By.xpath("//*[@data-qa='changeTech_button']");
	private final By orderRequestIdentifierLabel = By.xpath("//label[@data-qa='order_request_identifier_label']");
	private final By applicationReferenceIdentifierLabel = By.xpath("//label[@data-qa='application_reference_identifier_label']");
	private final By technologyLabel = By.xpath("//*[@id='existingConnectionForm']/div[3]/div/label");
	private final By oriLabel = By.xpath("//label[@data-qa='ori_value_label']");
	private final By ariValueTextBox = By.xpath("//*[@data-qa='ari_value_label']");
	private final By technologyDropDown = By.xpath("//*[@id='technology']");
	private final By activationDateLabel = By.xpath("//*[@data-qa='activation_date_label']");
	private final By daypickerBox = By.xpath("//*[@id='daypicker_rfa']");
	private final By activateAmendButton = By.xpath("//*[@data-qa='activate_amend_button']");
	
	
	
	public TechnologyChangeViewPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnAmendOrderButton() {

		//ElementUtils.getElement(driver, changeTechnologyButton).click();
		ElementUtils.findElementForClick(driver, activateAmendButton).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getOrderRequestIdentifierLabel() {
		return ElementUtils.getText(driver, orderRequestIdentifierLabel);
	}
	
	public String getApplicationReferenceIdentifierLabel() {
		return ElementUtils.getText(driver, applicationReferenceIdentifierLabel);
	}
	
	public String getTechnologyLabel() {
		return ElementUtils.getText(driver, technologyLabel);
	}
	
	public boolean oriLabelIsDisplay() {
		return (ElementUtils.getElement(driver, oriLabel).isDisplayed());
	}
	
	public boolean ariValueTextBoxIsDisable() {
		return (!ElementUtils.getElement(driver, ariValueTextBox).isEnabled());
	}
	
	public boolean technologyDropDownIsDisable() {
		return (!ElementUtils.getElement(driver, technologyDropDown).isEnabled());
	}
	
	public String getactivationDateLabel() {
		return ElementUtils.getText(driver, activationDateLabel);
	}
	
	public boolean daypickerBoxIsDisable() {
		return (!ElementUtils.getElement(driver, daypickerBox).isEnabled());
	}
}
