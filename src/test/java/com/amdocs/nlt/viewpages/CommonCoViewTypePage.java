package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class CommonCoViewTypePage extends CommonViewPage {

	public CommonCoViewTypePage(WebDriver driver) {
		super(driver);
	}

	private final By redundancyWirelineLabel = By.xpath("//*[@data-qa='redundancy_label_wireline']");
	private final By redundancyDuctLabel = By.xpath("//*[@data-qa='redundancy_label_duct']");
	private final By redundancyPathLabel = By.xpath("//*[@data-qa='redundancy_label_path']");
	private final By unavailableLabel = By.xpath("//*[@data-qa='unavailable_label']");
	private final By redundancyWirelineRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[1]/div/label[1]/input");
	private final By redundancyWirelineNotRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[1]/div/label[2]/input");

	private final By redundancyDuctRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[2]/div/label[1]/input");
	private final By redundancyDuctNotRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[2]/div/label[2]/input");

	private final By redundancyPathRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[3]/div/label[1]/input");
	private final By redundancyPathNotRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[3]/div/label[2]/input");

	private final By unavailableRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[4]/div/label[1]/input");
	private final By unavailableNotRequiredRadioButton = By
			.xpath("//*[@id='technologyDetailForm']/div[4]/div/label[2]/input");

	public boolean isUnavailableRequiredRadioButtonDisable() {
		//return (!driver.findElement(unavailableRequiredRadioButton).isEnabled());
		return (!ElementUtils.getElement(driver, unavailableRequiredRadioButton).isEnabled());
	}

	public boolean isUnavailableNotRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, unavailableNotRequiredRadioButton).isEnabled());
	}

	public boolean isRedundancyPathRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, redundancyPathRequiredRadioButton).isEnabled());
	}

	public boolean isRedundancyPathNotRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, redundancyPathNotRequiredRadioButton).isEnabled());
	}

	public boolean isRedundancyDuctRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, redundancyDuctRequiredRadioButton).isEnabled());
	}

	public boolean isRedundancyDuctNotRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, redundancyDuctNotRequiredRadioButton).isEnabled());
	}

	public boolean isRedundancyWirelineRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, redundancyWirelineRequiredRadioButton).isEnabled());
	}

	public boolean isRedundancyWirelineNotRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, redundancyWirelineNotRequiredRadioButton).isEnabled());
	}

	public String getRedundancyWirelineLabel() {
		return ElementUtils.getText(driver, redundancyWirelineLabel);
	}

	public String getRedundancyDuctLabel() {
		return ElementUtils.getText(driver, redundancyDuctLabel);
	}

	public String getRedundancyPathLabel() {
		return ElementUtils.getText(driver, redundancyPathLabel);
	}

	public String getUnavailableLabel() {
		return ElementUtils.getText(driver, unavailableLabel);
	}
}
