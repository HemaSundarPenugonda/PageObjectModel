package com.amdocs.nlt.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;

public class CoToCoConnectionPage extends CommonComponentPage {

	private final String[] expSegmentFromCoDropdownValues = {
			"AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969",
			"AR:Ayer Rajah Telephone Exchange:1000 Dover Road:139652",
			"BD:Bedok Telephone Exchange:185 Upper East Coast Road:455282",
			"BP:Bukit Panjang Telephone Exchange:40 Woodlands Road:677919", "ES:East Exchange:9 French Road:209232",
			"HG: Hougang Telephone Exchange:11 Compassvale Bow:544996",
			"JW:Jurong West Telephone Exchange:2 Jurong West Street:649112",
			"OC:Orchard Telephone Exchange:31 Exeter Road:239732",
			"TP:Tampines Telephone Exchange:200 Tampines Avenue 5:529647",
			"TS:Tuas Telephone Exchange:9 Tuas Avenue 3:639408" };
	private final String[] expSegmentToCoDropdownValues = {
			"AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969",
			"AR:Ayer Rajah Telephone Exchange:1000 Dover Road:139652",
			"BD:Bedok Telephone Exchange:185 Upper East Coast Road:455282",
			"BP:Bukit Panjang Telephone Exchange:40 Woodlands Road:677919", "ES:East Exchange:9 French Road:209232",
			"HG: Hougang Telephone Exchange:11 Compassvale Bow:544996",
			"JW:Jurong West Telephone Exchange:2 Jurong West Street:649112",
			"OC:Orchard Telephone Exchange:31 Exeter Road:239732",
			"TP:Tampines Telephone Exchange:200 Tampines Avenue 5:529647",
			"TS:Tuas Telephone Exchange:9 Tuas Avenue 3:639408" };

	public CoToCoConnectionPage(WebDriver driver) {
		super(driver);
	}

	private final By coToCoConnectionDetailLabel = By.xpath("//span[text()='CO to CO Connection Details']");
	private final By segmentFromCoLabel = By.xpath("//label[@data-qa='segmentFrom_label']");
	private final By segmentToCoLabel = By.xpath("//label[@data-qa='segmentTo_label']");
	private final By segmentFromCODropdown = By.xpath(".//*[@id='segmenntfromco']");
	private final By segmentToCoDropdown = By.xpath(".//*[@id='segmennttoco']");
	// private final By segmentFromCODropdownValues=
	// By.xpath(".//*[@id='CoToCoForm']/div[1]/div/div/div/ul/li");
	private final By segmentToCODropdownValues = By.xpath(".//*[@id='CoToCoForm']/div[2]/div/div/div/ul/li");
	// Technical detail
	// rS=Redundancy Service
	private final By rS_Wireline_DiversityLabel = By.xpath("//label[@data-qa='redundancy_label_wireline']");
	private final By rS_Duct_DiversityLabel = By.xpath("//label[@data-qa='redundancy_label_duct']");
	private final By rS_Path_DiversityLabel = By.xpath("//label[@data-qa='redundancy_label_path']");
	private final By rS_unavailable_Label = By.xpath("//label[@data-qa='unavailable_label']");
	private final By requiredRadioButton_rS_Wireline_Diversity = By
			.xpath("//input[@data-qa='redundancy_wireline_required']");
	private final By requiredRadioButton_rS_Duct_Diversity = By
			.xpath("//input[@data-qa='redundancy_wireline_required']");
	private final By requiredRadioButton_rS_Path_Diversity = By
			.xpath("//input[@data-qa='redundancy_wireline_required']");
	private final By notRequiredRadioButton_rS_Wireline_Diversity = By
			.xpath("//input[@data-qa='redundancy_wireline_not_required']");
	private final By notRequiredRadioButton_rS_Duct_Diversity = By
			.xpath("//input[@data-qa='redundancy_wireline_not_required']");
	private final By notRequiredRadioButton_rS_Path_Diversity = By
			.xpath("//input[@data-qa='redundancy_wireline_not_required']");
	// label[@data-qa='rejectionLabel']

	// Requested date

	public String getCoToCoConnectionDetailLabel() {
		return ElementUtils.getText(driver, coToCoConnectionDetailLabel);
	}

	public String getsegmentFromCoLabel() {
		return ElementUtils.getText(driver, segmentFromCoLabel);
	}

	public String getsegmentToCoLabel() {
		return ElementUtils.getText(driver, segmentToCoLabel);
	}

	public String getSegmentFromCoDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, segmentFromCODropdown);
	}

	public String getSegmentToCoDropdownDefaultValue() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, segmentToCoDropdown);
	}

	public boolean isSegmentTOAndsegmentFromDropdownWorkingInSync() throws InterruptedException {
		WebElement segmentFromCodropdwonvalues = ElementUtils.getElement(driver, segmentFromCODropdown);
		WebElement segmentTOCodropdwonvalues = ElementUtils.getElement(driver, segmentToCoDropdown);
		return verifyDropdownsAreWorkinginSync(segmentFromCodropdwonvalues, segmentTOCodropdwonvalues);
	}

	public String getRsWirelineDiversityLabel() throws InterruptedException {
		ElementUtils.findElementForClick(driver, technicalDetailLabel).click();
		return ElementUtils.getText(driver, rS_Wireline_DiversityLabel);
	}

	public String getRsDuctDiversityLabel() {
		return ElementUtils.getText(driver, rS_Duct_DiversityLabel);
	}

	public String getRSPathDiversityLabel() {
		return ElementUtils.getText(driver, rS_Path_DiversityLabel);
	}

	public boolean isRequiredButtonForWirelinePresent() {
		return ElementUtils.isDisplayed(driver, requiredRadioButton_rS_Wireline_Diversity);
	}

	public boolean isRequiredButtonForPathPresent() {
		return ElementUtils.isDisplayed(driver, requiredRadioButton_rS_Path_Diversity);

	}

	public boolean isNotRequiredButtonForWirelineCheckedDefault() {
		return ElementUtils.getElement(driver, requiredRadioButton_rS_Wireline_Diversity).isEnabled();
	}

	public boolean isNotRequiredButtonForWDuctCheckedDefault() {
		return ElementUtils.getElement(driver, requiredRadioButton_rS_Duct_Diversity).isEnabled();
	}

	public boolean isNotRequiredButtonForWirelinePresent() {
		return ElementUtils.isDisplayed(driver, notRequiredRadioButton_rS_Wireline_Diversity);

	}

	// private methods for this page class

	protected String getDefaultDropdownVlaue(By element) {
		WebElement ele = ElementUtils.getElement(driver, element);
		Select segmentFromCo = new Select(ele);
		return segmentFromCo.getFirstSelectedOption().getText();

	}

	private boolean verifyDropdownsAreWorkinginSync(WebElement segmentFromCodropdwonvalues,
			WebElement segmentTOCodropdwonvalues) throws InterruptedException {
		Select select = new Select(segmentFromCodropdwonvalues);
		select.selectByIndex(1);
		Thread.sleep(1000);
		Select selectTO = new Select(segmentTOCodropdwonvalues);
		selectTO.selectByIndex(2);
		List<WebElement> toDropdwonValues = selectTO.getOptions();
		for (WebElement ele : toDropdwonValues) {
			System.out.println(ele.getText());
			if (ele.getText().contains("AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969"))
				return false;
		}
		return true;
	}

	public void populateCoToCoConnectionForm() throws InterruptedException {
		WebElement ariInput = ElementUtils.getElement(driver, ARITextBox);
		ariInput.clear();
		ariInput.sendKeys("124");
		selectCalendarDate();
		WebElement ele = ElementUtils.getElement(driver,segmentFromCODropdown);
		Select segmentFromCo = new Select(ele);
		List<WebElement> fromDropdown = segmentFromCo.getOptions();
		for (WebElement value : fromDropdown) {
			if (value.getText().equals("JW:Jurong West Telephone Exchange:2 Jurong West Street:649112")) {
				value.click();
			}
		}
		WebElement ele1 = ElementUtils.getElement(driver, segmentToCoDropdown);
		Select segmentTOCo = new Select(ele1);
		List<WebElement> toDropdwon = segmentTOCo.getOptions();
		for (WebElement toValues : toDropdwon) {
			if (toValues.getText().equals("BP:Bukit Panjang Telephone Exchange:40 Woodlands Road:677919")) {
				toValues.click();
			}
		}
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

	public String verifyActionOnRequiredRadioButtonClick() {
		ElementUtils.findElementForClick(driver, requiredRadioButton_rS_Duct_Diversity).click();
		String redundancyLabel = ElementUtils.getElement(driver, rS_unavailable_Label).getText();
		return redundancyLabel;
	}

	public boolean verifyRadioButtonsAreDisabled() {
		ElementUtils.getElement(driver, By.xpath("//label [@class='radio-inline disabled']")).isDisplayed();
		return true;
	}
}
