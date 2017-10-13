package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class ManageTPByRRRServiceRequest extends CommonComponentPage {

	public ManageTPByRRRServiceRequest(WebDriver driver) {
		super(driver);

	}

	private final By pageHeading = By.xpath("//span[text()='Request for Manage TP (RRR) Service']");
	private final By scheduleNameLabel = By.xpath("//label[@data-qa='scheduleName_label']");
	private final By scheduleNameDropdown = By.xpath("//select[@data-qa='scheduleName_value']");
	private final By postalcodeLabel = By.xpath("//label[@data-qa='postal_code_label']");
	private final By unitNumLabel = By.xpath("//label[@data-qa='unit_number_label']");
	private final By coverageStatusLabel = By.xpath("//label[@data-qa='coverage_status_label']");
	private final By coverageStatusValue = By.xpath("//label[@data-qa='cs_value_label']");
	private final By buildingNumDropdown = By.xpath("//select[@data-qa='building_number']");
	private final By buildingNametextBox = By.xpath("//input[@data-qa='building_name']");
	private final By amendViewScreenHeader = By.xpath("//*[@data-qa='managetpbyrrr_amendview_header']");

	public String getPageHeadingText() {
		return ElementUtils.getText(driver, pageHeading);
	}

	public String getScheduleNameText() {
		return ElementUtils.getText(driver, scheduleNameLabel);
	}

	public String getDefaultDropDownValueForScheduleNameDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, scheduleNameDropdown);
	}

	public String getPostalcodeLabel() {
		return ElementUtils.getText(driver, postalcodeLabel);
	}

	public String getUnitNumLabel() {
		return ElementUtils.getText(driver, unitNumLabel);
	}

	public String getCoverageStatuslabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}

	public boolean isCovergaeStatusVlauePresent() {
		return ElementUtils.getElement(driver, coverageStatusValue).isDisplayed();

	}

	public boolean isBuildingNumDropdownPresent() {
		return ElementUtils.getElement(driver, buildingNumDropdown).isDisplayed();
	}

	public boolean isBuidlingNameTextbox() {
		return ElementUtils.getElement(driver, buildingNametextBox).isDisplayed();
	}

	public String getPageHeaderForViewAmendScreen(){
		return ElementUtils.getText(driver, amendViewScreenHeader);
	}
}
