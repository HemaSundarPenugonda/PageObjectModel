package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amdocs.nlt.util.ElementUtils;

public class BuildingMDFRoomToNonResidentialPremiseConnectionPage extends NonResidentialOrderPage {
	
	private final By confirmationHeader = By.xpath("//h1[@data-qa='confirmation_header']");

	public BuildingMDFRoomToNonResidentialPremiseConnectionPage(WebDriver driver) {
		super(driver);
	}



	public String VerifyConfirmationMessage() {

		//String confirmation_Message = driver.findElement(By.xpath("//h1[@data-qa='confirmation_header']")).getText();
		String confirmation_Message = ElementUtils.getElement(driver, confirmationHeader).getText();
		return confirmation_Message;
	}

	public void clickTechnicaDetai() throws InterruptedException {
		//driver.findElement(technicalDetailLabel).click();
		ElementUtils.findElementForClick(driver, technicalDetailLabel).click();
	}

	public boolean areDropdownValuesCorrectForInstallationOption() throws InterruptedException {
		//WebElement installationDropdownVlaues = driver.findElement(installationOptionDropdown);
		WebElement installationDropdownVlaues = ElementUtils.getElement(driver, installationOptionDropdown);
		return ElementUtils.verifyDropdownValues(installationDropdownVlaues, DropDowns.MDFtoNonResi_expInstallationOption);

	}

	public String getDefaulttValueForInstallationDrdownFormdfNonresi() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, installationOptionDropdown);
	}
}
