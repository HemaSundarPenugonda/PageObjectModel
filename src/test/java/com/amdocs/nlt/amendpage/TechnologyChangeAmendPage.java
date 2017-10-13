package com.amdocs.nlt.amendpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class TechnologyChangeAmendPage extends CommonAmendPage{

	public TechnologyChangeAmendPage(WebDriver driver) {
		super(driver);
	}
	
	protected final By orderRequestIdentifierLabel = By.xpath("//*[@data-qa='order_request_identifier_label']");
	protected final By oriValueLabel = By.xpath("//*[@data-qa='ori_value_label']");
	protected final By applicationRreferenceIdentifierLabel = By.xpath("//*[@data-qa='application_reference_identifier_label']");
	protected final By technologyLabel = By.xpath("//*[@data-qa='technology_label']");
	protected final By ariValueTextBox = By.xpath("//*[@data-qa='ari_value_label']");
	protected final By selectTechnologyDropDown = By.xpath("//*[@data-qa='select_technology']");
	protected final By newSelectTechnologyDropDown = By.xpath("//*[@data-qa='new_select_technology']");
	protected final By daypickerRfa = By.xpath("//*[@id='daypicker_rfa']");
	
	public boolean getdaypickerRfaCalender() {
		return(!ElementUtils.getElement(driver, daypickerRfa).isEnabled());
	}
	
	public boolean getNewSelectTechnologyDropDown() {
		return(!ElementUtils.getElement(driver, newSelectTechnologyDropDown).isEnabled());
	}
	
	public boolean getSelectTechnologyDropDown() {
		return(!ElementUtils.getElement(driver, selectTechnologyDropDown).isEnabled());
	}
	
	public boolean getAriValueTextBoxIsDisabled() {
		return(!ElementUtils.getElement(driver, ariValueTextBox).isEnabled());
	}
	
	public String getTechnologyLabel() {
		return ElementUtils.getText(driver,technologyLabel);
	}
	
	public String getApplicationRreferenceIdentifierLabel() {
		return ElementUtils.getText(driver,applicationRreferenceIdentifierLabel);
	}
	
	public boolean getOriValueLabel() {
		return ElementUtils.getElement(driver, oriValueLabel).isDisplayed();
	}
	
	public String getOrderRequestIdentifierLabel() {
		return ElementUtils.getText(driver,orderRequestIdentifierLabel);
	}
	
}
