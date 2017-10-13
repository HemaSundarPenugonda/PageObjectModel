package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class CoToBuildingMDFConnectionViewPage extends CommonCoViewTypePage {

	public CoToBuildingMDFConnectionViewPage(WebDriver driver) {
		super(driver);
	}

	private final By segmentFromCoLabel = By.xpath("//*[@data-qa='segment_from_co_label']");
	private final By orderOptionLabel = By.xpath("//*[@data-qa='order_option_label']");
	private final By postalCodeLabel = By.xpath("//*[@data-qa='postal_code_label']");
	private final By segmentFromCoDropDown = By.xpath("//*[@id='segmentFromCo']");
	private final By postalCodeRadioButton = By.xpath("//*[@id='feasibilityForm']/div[2]/div/label[1]");
	private final By servingCabinetRadioButton = By.xpath("//*[@id='feasibilityForm']/div[2]/div/label[2]");
	private final By postalCodeTextBox = By
			.xpath("//*[@id='feasibilityForm']/div[3]/div[@class='col-sm-5']/input[@id='postalCode'][1]");

	private final By netAttrOrderTypeLabel = By.xpath("//*[@data-qa='netAttr_orderType_label']");
	private final By netAttrRlfdfTransmissionTieCablePortLabel = By
			.xpath("//*[@data-qa='netAttr_rlfdfTransmissionTieCablePort_label']");
	private final By netAttrOrderTypeValue = By.xpath("//*[@data-qa='netAttr_orderType_value']");
	private final By netAttrRlfdfTransmissionTieCablePortValue = By
			.xpath("//*[@data-qa='netAttr_rlfdfTransmissionTieCablePort_value']");

	private final By requestedDateOfActivationLabel = By.xpath("//*[@data-qa='activation_date_label']");
	private final By requestedDateOfActivationTextBox = By.xpath("//*[@id='daypicker_rfa']");

	private final By patchCableLabel = By.xpath("//*[@data-qa='patch_cable_label']");
	private final By patchCableRequiredRadioButton = By.xpath("//input[@data-qa='patch_cable_provided']");
	private final By patchCableNotProvidedRadioButton = By.xpath("//input[@data-qa='patch_cable_not_provided']");

	public String getPatchCableLabel() {
		return ElementUtils.getText(driver, patchCableLabel);
	}

	public boolean isPatchCableRequiredRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, patchCableRequiredRadioButton).isEnabled());
	}

	public boolean isRequestedDateOfActivationTextBoxDisable() {
		return (!ElementUtils.getElement(driver, requestedDateOfActivationTextBox).isEnabled());
	}

	public String getRequestedDateOfActivationLabel() {
		return ElementUtils.getText(driver, requestedDateOfActivationLabel);
	}

	public String getNetAttrOrderTypeLabel() {
		return ElementUtils.getText(driver, netAttrOrderTypeLabel);
	}

	public String getNetAttrRlfdfTransmissionTieCablePortLabel() {
		return ElementUtils.getText(driver, netAttrRlfdfTransmissionTieCablePortLabel);
	}

	public boolean isNetAttrOrderTypeValuePresent() {
		return ElementUtils.getElement(driver, netAttrOrderTypeValue).isEnabled();
	}

	public boolean isNetAttrRlfdfTransmissionTieCablePortValuePresent() {
		return ElementUtils.getElement(driver, netAttrRlfdfTransmissionTieCablePortValue).isEnabled();
	}

	public boolean isPostalCodeTextBoxPresent() {
		return (!ElementUtils.getElement(driver, postalCodeTextBox).isEnabled());
	}

	public boolean isServingCabinetRadioButtonPresent() {
		return ElementUtils.getElement(driver, servingCabinetRadioButton).isEnabled();
	}

	public boolean isPostalCodeRadioButtonPresent() {
		return ElementUtils.getElement(driver, postalCodeRadioButton).isEnabled();
	}

	public boolean isSegmentFromCoDropDownPresent() {
		return isDisabled(segmentFromCoDropDown);
	}

	public String getSegmentFromCoLabel() {
		return ElementUtils.getText(driver, segmentFromCoLabel);
	}

	public String getOrderOptionLabel() {
		return ElementUtils.getText(driver, orderOptionLabel);
	}

	public String getPostalCodeLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);
	}

	public boolean isDisabled(By element) {
		return (!ElementUtils.getElement(driver, element).isEnabled());

	}

	public boolean isPatchCableNotProvidedRadioButtonDisable() {
		return (!ElementUtils.getElement(driver, patchCableNotProvidedRadioButton).isEnabled());
	}

	public boolean isPatchCableRequiredRadioButtonSelected() {
		return ElementUtils.getElement(driver, patchCableRequiredRadioButton).isSelected();
	}

	public boolean isPatchCableNotRequiredRadioButtonSelected() {
		return ElementUtils.getElement(driver, patchCableNotProvidedRadioButton).isSelected();
	}
}
