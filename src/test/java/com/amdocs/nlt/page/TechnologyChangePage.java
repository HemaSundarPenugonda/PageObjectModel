package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class TechnologyChangePage extends CommonComponentPage {

	private final By orderRequestIdentifierLabel = By.xpath("//*[@data-qa='order_request_identifier_label']");
	private final By applicationReferenceIdentifierLabel = By.xpath("//label[@data-qa='application_reference_identifier_label']");
	private final By technologyLabel = By.xpath("//label[@data-qa='technology_label']");
	private final By oriValueLabel = By.xpath("//label[@data-qa='ori_value_label']");
	private final By ariValueLabel = By.xpath("//*[@data-qa='ari_value_label']");
	private final By technologyDropDownExisting = By.xpath("//*[@id='technology']");
	private final By ariLabelNewConnection = By.xpath("//*[@id='ariForm']/div[1]/label");
	private final By technologyNewConnectionLabel = By.xpath("//*[@id='existingConnectionForm']/div/div/label");
	private final By ariInputTextBox = By.xpath("//*[@data-qa='new_conn_ARI_input']");
	private final By technologyDropDown = By.xpath("//select[@data-qa='new_select_technology']");
	private final By submitButton = By.xpath("//*[@data-qa='btn_submit_tech_change']");
	private final By confirmButton = By.xpath("//*[@data-qa='yes-button']");
	private final By confirmConversionLabel = By.xpath("//*[@data-qa='modal-body");
	private final By orderConfirmation = By.xpath("//*[@data-qa='confirmation_header");
	
		
	
	public TechnologyChangePage(WebDriver driver) {
		super(driver);
	}

	public String getConfirmConversionLabel() {
		return ElementUtils.getText(driver, confirmConversionLabel);
	}
	
	public void clickOnconfirmButton(){
		ElementUtils.findElementForClick(driver, confirmButton).click();
	}
	
	public void clickOnsubmitButton(){
		ElementUtils.findElementForClick(driver, submitButton).click();
	}
	
	public TechnologyChangePage enterAri(){
		ElementUtils.getElement(driver, ariInputTextBox).sendKeys("TestARI");
		return this;
	}
	
	public TechnologyChangePage selectTechnology(){
		Select selectCoorinateSystem = new Select(ElementUtils.getElement(driver, technologyDropDown));
		selectCoorinateSystem.selectByIndex(2);
		return this;
	}
	
	public String getApplicationReferenceIdentifierNewConnectionLabel() {
		return ElementUtils.getText(driver, ariLabelNewConnection);
	}
	
	public String getTechnologyNewConnectionLabelLabel() {
		return ElementUtils.getText(driver, technologyNewConnectionLabel);
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
	
	public boolean isOriValueLabelPresent() {
		return ElementUtils.getElement(driver, oriValueLabel).isDisplayed();
	}
	
	public boolean isAriValueLabelDisable() {
		return !ElementUtils.getElement(driver, ariValueLabel).isEnabled();
	}
	
	public boolean isTechnologyDropDownExistingDisable() {
		return !ElementUtils.getElement(driver, technologyDropDownExisting).isEnabled();
	}
}
