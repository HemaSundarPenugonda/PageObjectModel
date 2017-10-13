package com.amdocs.nlt.page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.NbapConnectionTestData;

public class RequestForManageTPbyCoOrdinateSystemServicePage extends CommonComponentPage {

	public RequestForManageTPbyCoOrdinateSystemServicePage(WebDriver driver) {
		super(driver);
	}

	NbapConnectionTestData nbapTestData = new NbapConnectionTestData();

	private final String[] scheduleName = { "Select", "Schedule 3", "Schedule 11" };
	private final String[] coOrdinateSystem = { "Select", "WGS84", "SVY21" };
	private final String[] opearaionPerformed = { "Select", "TP Removal" };

	protected final By scheduleNameLabel = By.xpath("//label[@data-qa='scheduleName_label']");
	protected final By coordinatesystemLabel = By.xpath("//label[@data-qa='coordinate_system_label']");
	protected final By gpsCoordinatexLabel = By.xpath("//label[@data-qa='gps_coordinate_x_label']");
	protected final By gpsCoordinateyLabel = By.xpath("//label[@data-qa='gps_coordinate_y_label']");
	protected final By nearestPostalCodeLabel = By.xpath("//label[@data-qa='nearest_postal_code_label']");
	protected final By opearationLabel = By.xpath("//label[@data-qa='opearaion_label']");
	protected final By scheduleNameDropdown = By.xpath("//select[@data-qa='scheduleName_value']");
	protected final By coOrdinateSystemDropdown = By.xpath("//select[@data-qa='coordinate_system']");
	protected final By OperationTobePerformedDropdown = By.xpath("//select[@data-qa='operation_value']");
	protected final By xCoordinateTextbox = By.xpath("//input[@data-qa='gps_coordinate_x']");
	protected final By yCoordinateTextbox = By.xpath("//input[@data-qa='gps_coordinate_y']");
	protected final By NearestPostalCodeTextbox = By.xpath("//input[@data-qa='nearest_postal_code']");
	protected final By opearationPerformedDropdown = By.xpath("//select[@data-qa='operation_value']");
	protected final By coveredStatusLabel = By.xpath("//div[@data-qa='coverage_status']");

	public String getScheduleNameLabel() {
		return ElementUtils.getText(driver, scheduleNameLabel);
	}

	public String getCoOrdinateSystemLabel() {
		return ElementUtils.getText(driver, coordinatesystemLabel);
	}

	public String getDefaultDropdownValueForScheduleNameDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, scheduleNameDropdown);
	}

	public String getDefaultDropdownValueForOperationToBePerformedDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, scheduleNameDropdown);
	}

	public String getDefaultDropdownValueForCoOrdinateSystemDropdown() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, coOrdinateSystemDropdown);
	}

	public String getGpsCoordinatexLabel() {
		return ElementUtils.getText(driver, gpsCoordinatexLabel);
	}

	public String getGpsCoordinateyLabel() {
		return ElementUtils.getText(driver, gpsCoordinateyLabel);
	}

	public String getNearestPostalCodeLabel() {
		return ElementUtils.getText(driver, nearestPostalCodeLabel);
	}

	public String getOpearationPerformedLabel() {
		return ElementUtils.getText(driver, opearationLabel);
	}

	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coveredStatusLabel);
	}

	public void chekcFeasibility(NbapConnectionTestData data) throws Exception {
		ElementUtils.getElement(driver, ARITextBox).sendKeys(data.getAppRefNumber());
		Select schedule = new Select(ElementUtils.getElement(driver, scheduleNameDropdown));
		schedule.selectByValue(data.getEntitySubtype());
		commonFieldForFeasibilityCheck(new Random().nextInt(2) + 1);
	}

	private void commonFieldForFeasibilityCheck(int index) throws Exception {
		Select selectCoorinateSystem = new Select(ElementUtils.getElement(driver, coOrdinateSystemDropdown));
		selectCoorinateSystem.selectByIndex(index);
		ElementUtils.getElement(driver, xCoordinateTextbox).sendKeys(nbapTestData.getXcoordinate());
		ElementUtils.getElement(driver, yCoordinateTextbox).sendKeys(nbapTestData.getYcoordinate());
		ElementUtils.getElement(driver, NearestPostalCodeTextbox).sendKeys(nbapTestData.getNearestPostalCode());
		Select opearationPerformedSystem = new Select(ElementUtils.getElement(driver, opearationPerformedDropdown));
		opearationPerformedSystem.selectByIndex(1);
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();
	}

}
