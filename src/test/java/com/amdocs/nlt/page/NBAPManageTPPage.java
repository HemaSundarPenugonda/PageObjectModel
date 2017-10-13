package com.amdocs.nlt.page;

import com.amdocs.nlt.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NBAPManageTPPage extends NBAPConnectionPage {

	public NBAPManageTPPage(WebDriver driver) {
		super(driver);
	}

	protected final By option2Dropdown = By.xpath("(//*[@data-qa='option'])[2]");
	protected final By operationToBePerformedDropDown = By.xpath("//*[@data-qa='opearation_to_be_performed_select']");
	protected final By nBapAddressRadioButton = By.xpath("(//input[@data-qa='address_nbap'])[2]");
	protected final By DescriptionRadioButton = By.xpath("(//input[@data-qa='address_description'])[2]");
	protected final By addressOptionTextbox = By.xpath("(//input[@data-qa='description_address'])[2]");
	protected final By NearestPostalCodeTextbox = By.xpath("(//input[@data-qa='nearest_postal_code'])[2]");
	protected final By landmarkTextbox = By.xpath("(//input[@data-qa='landmark'])[2]");
	protected final By coordinateSysDropDpown = By.xpath("(//select[@data-qa='coordinate_system'])[2]");
	protected final By xCoordinateTextbox = By.xpath("(//input[@data-qa='gps_coordinate_x'])[2]");
	protected final By yCoordinateTextbox = By.xpath("(//input[@data-qa='gps_coordinate_y'])[2]");
	protected final By heightTextbox = By.xpath("(//input[@data-qa='height'])[2]");
	
	public boolean isOption2DropdownEnabled() {
		return ElementUtils.isEnabled(driver, option2Dropdown);
	}

	public boolean isoperationToBePerformedDropDownEnabled() {
		return ElementUtils.isEnabled(driver, operationToBePerformedDropDown);
	}
	public boolean isDescriptionRadioButtonEnabled() {
		return ElementUtils.isEnabled(driver, DescriptionRadioButton);
	}
	public boolean isNBapAddressRadioButtonEnabled(){
		return ElementUtils.isEnabled(driver, nBapAddressRadioButton);
	}
	public boolean isAddressOptionTextboxEnabled(){
		return ElementUtils.isEnabled(driver, addressOptionTextbox);
	}
	public boolean isNearestPostalCodeTextboxEnabled(){
		return ElementUtils.isEnabled(driver, NearestPostalCodeTextbox);
	}
	public boolean isLandmarkTextboxEnable(){
		return ElementUtils.isEnabled(driver, landmarkTextbox);
	}
	public boolean isCoordinateSysDropDpownEnabled(){
		return ElementUtils.isEnabled(driver, coordinateSysDropDpown);
	}
	public boolean isxCoordinateTextboxEnabled(){
		return ElementUtils.isEnabled(driver, xCoordinateTextbox);
	}
	public boolean isyCoordinateTextboxEnabled(){
		return ElementUtils.isEnabled(driver, yCoordinateTextbox);
	}
	public boolean isHeightTextboxEnabled(){
		return ElementUtils.isEnabled(driver, heightTextbox);
	}
}
