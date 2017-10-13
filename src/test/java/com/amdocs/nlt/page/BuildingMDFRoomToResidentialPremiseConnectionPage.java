package com.amdocs.nlt.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.oders.UserDetailsObject;
import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.Utilities;

public class BuildingMDFRoomToResidentialPremiseConnectionPage extends ResidentailOrderPage {
	
	protected final By salutation = By.xpath("//select[@data-qa='salutation']");
	protected final By firstName = By.xpath("//input[@data-qa='first_name']");
	protected final By lastName = By.xpath("//input[@data-qa='last_name']");
	protected final By contactNumber = By.xpath("//input[@data-qa='contact_number']");
	protected final By altNumber = By.xpath("//input[@data-qa='alt_number']");
	protected final By emailAddress = By.xpath("//input[@data-qa='email_address']");
	
	public BuildingMDFRoomToResidentialPremiseConnectionPage(WebDriver driver) {
		super(driver);
	}

	public void clickTechnicaDetai() throws InterruptedException {
		ElementUtils.findElementForClick(driver, technicalDetailLabel).click();
	}
	
	public void fillResidentialUserDetails() throws IOException{
		UserDetailsObject dataForm = Utilities.prepareUserDetails();
		ElementUtils.selectDropdownValue(driver, salutation, dataForm.getSalutation());
		ElementUtils.sendKeys(driver, firstName, dataForm.getFirstName());
		ElementUtils.sendKeys(driver, lastName, dataForm.getLastName());
		ElementUtils.sendKeys(driver, contactNumber, dataForm.getContactNumber());
		ElementUtils.sendKeys(driver, altNumber, dataForm.getAlternateContactNumber());
		ElementUtils.sendKeys(driver, emailAddress, dataForm.getEmailAddress());
		
	}

}
