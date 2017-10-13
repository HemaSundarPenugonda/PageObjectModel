package com.amdocs.nlt.page;

import java.awt.*;
import java.net.URISyntaxException;

import com.amdocs.nlt.oders.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class CoLocationSupplementaryCoolingServicePage extends RLtoRLInterconnectionServicePage{

	public CoLocationSupplementaryCoolingServicePage(WebDriver driver) {
		super(driver);
	}

	

	private final By ariTetxBox = By.xpath("//*[@data-qa='ari_input']");
	private final By requestDetailLabel = By.xpath("//*[@data-qa='colocooling_servicedetails']/h2/span");
	private final By coLocAddressDropDown = By.xpath("//*[@data-qa='coAddressList']");
	private final By rackHeatLoadLabel = By.xpath("//label[@data-qa='corackDetails_label']");
	private final By rackIdValueTextBox = By.xpath("//input[@data-qa='rackIdValue'][@id='rackId0']");
	private final By rackIdValueTextBox2 = By.xpath("//input[@data-qa='rackIdValue'][@id='rackId1']");
	private final By rackIdValueTextBox3 = By.xpath("//input[@data-qa='rackIdValue'][@id='rackId2']");
	private final By rackTypeValueDropdown = By.xpath("//*[@data-qa='rackTypeValue'][@id='rackType0']");
	private final By rackTypeValueDropdown2 = By.xpath("//*[@data-qa='rackTypeValue'][@id='rackType1']");
	private final By rackTypeValueDropdown3 = By.xpath("//*[@data-qa='rackTypeValue'][@id='rackType2']");
	private final By othersLabel = By.xpath("//*[@data-qa='rackOthersValue']");
	private final By othersTetxBox = By.xpath("//*[@data-qa='rackOthersValue']");
	private final By heatLoadValueTextBox = By.xpath("//input[@data-qa='heatLoadValue'][@id='heatLoad0']");
	private final By heatLoadValueTextBox2 = By.xpath("//input[@data-qa='heatLoadValue'][@id='heatLoad1']");
	private final By heatLoadValueTextBox3 = By.xpath("//input[@data-qa='heatLoadValue'][@id='heatLoad2']");
	private final By submitButton = By.xpath("//*[@data-qa='submit_button']");
	private final By additionalInfoTextbox = By.xpath(".//*[@id='additionalInfo']");
	private final By plusIconButton = By.xpath("//div[@data-qa='rackgroup_plusbutton']");
	//testAddtionalInfoComponent
	//testReqLiscee

	
	
	public String getRackHeatLoadLabelLabel() {
		return ElementUtils.getText(driver, rackHeatLoadLabel);
	}

	public boolean isPlusIconButtonDisable(){
		return (ElementUtils.getElement(driver, plusIconButton).isEnabled());
	}


	public String getRequestDetailLabel() {
		return ElementUtils.getText(driver, requestDetailLabel);
	}

	public String getOthersLabel() {
		return ElementUtils.getText(driver, othersLabel);
	}

	public boolean isOthersTextBoxEnabled(){
		return ElementUtils.isEnabled(driver,othersTetxBox);
	}

	public void populateCoLocAddressAndAri() throws InterruptedException, URISyntaxException, AWTException {
		ElementUtils.getElement(driver, ariTetxBox).sendKeys("6666");
		ElementUtils.selectDropdownValue(driver,coLocAddressDropDown,"AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969");
	}

	public void populateOtherTextBox(){
		ElementUtils.selectDropdownValue(driver,rackTypeValueDropdown,"Others");
	
	}

	public boolean plusButtonDisplayed(){
		return ElementUtils.isDisplayed(driver, plusIconButton);
	}

	public void clickPlusButton(){
		ElementUtils.clickObject(driver,plusIconButton);
	}
	
	public void clickSubmitButton(){
		ElementUtils.clickObject(driver,submitButton);
	}

	public void populateRackDetails1(String rackId, String rackType, String heatLoadValue) throws InterruptedException, URISyntaxException, AWTException {
		ElementUtils.getElement(driver, rackIdValueTextBox).sendKeys(rackId);
		ElementUtils.selectDropdownValue(driver,rackTypeValueDropdown, rackType);
		ElementUtils.getElement(driver, heatLoadValueTextBox).sendKeys(heatLoadValue);

	}
	
	public void populateRackDetails2(String rackId, String rackType, String heatLoadValue) throws InterruptedException, URISyntaxException, AWTException {
		ElementUtils.getElement(driver, rackIdValueTextBox2).sendKeys(rackId);
		ElementUtils.selectDropdownValue(driver,rackTypeValueDropdown2, rackType);
		ElementUtils.getElement(driver, heatLoadValueTextBox2).sendKeys(heatLoadValue);

	}
	
	public void populateRackDetails3(String rackId, String rackType, String heatLoadValue) throws InterruptedException, URISyntaxException, AWTException {
		ElementUtils.getElement(driver, rackIdValueTextBox3).sendKeys(rackId);
		ElementUtils.selectDropdownValue(driver,rackTypeValueDropdown3, rackType);
		ElementUtils.getElement(driver, heatLoadValueTextBox3).sendKeys(heatLoadValue);

	}
	
	public boolean verifyColocAdderssDropdownValues() throws InterruptedException {

		return ElementUtils.verifyDropdownValues(ElementUtils.getElement(driver, coLocAddressDropDown), DropDowns.CoLocationSupplementaryService_coLocAddressDropdownValues);
	}
	
	public boolean verifyRackTypeDropdownValues() throws InterruptedException {

		return ElementUtils.verifyDropdownValues(ElementUtils.getElement(driver, rackTypeValueDropdown), DropDowns.CoLocationSupplementaryService_rackTypeValues);
	}
	
	public void setAdditionalInfo(String info){
		ElementUtils.getElement(driver, additionalInfoTextbox).sendKeys(info);
	}


}
