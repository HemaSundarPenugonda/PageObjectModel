package com.amdocs.nlt.viewpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.nlt.util.ElementUtils;
import com.google.common.base.Function;


public class NBAPDPtoNBAPTPConnectionViewPage extends CommonViewPage {
	/* NBAP DP Detail Page Object */
	private final By referenceSchedule10ORILabel = By.xpath("//label[@data-qa='ori_header_label']");
	private final By oriTextBox = By.xpath("//input[@data-qa='ori_input']");
	private final By dpNameLabel = By.xpath("//label[@data-qa='Name_label']");
	private final By descriptionOfAddressLabel = By.xpath("//label[@data-qa='dp_description_address_label']");
	private final By streetNameLabel = By.xpath("//label[@data-qa='dp_street_name_label']");
	private final By nearestPostalCodeLabel = By.xpath("//label[@data-qa='dp_nearest_postal_code_label']");
	private final By landmarkLabel = By.xpath("//label[@data-qa='dp_landmark_label']");
	private final By dpCoOrdinateSystemLabel = By.xpath("//label[@data-qa='dp_coordinate_system_label']");
	private final By dpGpsCoordinateXLabel = By.xpath("//label[@data-qa='dp_gps_coordinate_x_label']");
	private final By dpGpsCoordinateYLabel = By.xpath("//label[@data-qa='dp_gps_coordinate_y_label']");
	private final By dpHeightLabel = By.xpath("//label[@data-qa='dp_height']");
	private final By installationChargeLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By serviceActivationChargeLabel = By.xpath("//label[@data-qa='activation_charges_label']");
	private final By installationChargesValueLabel = By.xpath("//label[@data-qa='charges_value_label']");
	private final By serviceActivationValueLabel = By.xpath("//label[@data-qa='activation_value']");
	private final By installationChargeToolTip = By.xpath("//*[@id='nbapDPDetailsForm']/div[2]/label[2]/span");
	private final By dpNameValueTextBox = By.xpath("//input[@data-qa='dpName_value']");
	private final By dpDescriptionAddressValueTextBox = By.xpath("//input[@data-qa='dp_description_address']");
	private final By dpStreetNameValueTextBox = By.xpath("//input[@data-qa='dp_street_name']");
	private final By dpNearestPostalCodeValueTextBox = By.xpath("//input[@data-qa='dp_nearest_postal_code']");
	private final By dpLandmarkValueTextBox = By.xpath("//input[@data-qa='dp_landmark']");
	private final By dpCoordinateSystemDropDown = By.xpath("//*[@data-qa='dp_coordinate_system']");
	private final By dpGpsCoordinateXValueTextBox = By.xpath("//input[@data-qa='dp_gps_coordinate_x']");
	private final By dpGpsCoordinateYValueTextBox = By.xpath("//input[@data-qa='dp_gps_coordinate_y']");
	private final By dpHeightValueTextBox = By.xpath("//input[@data-qa='dp_height']");
	private final By descriptionOfAddLabel = By.xpath("//label[@data-qa='dp_description_address_label']");
	private final By nbapDPDetailsInstallationChargeTooltip = By
			.xpath("//*[@id='nbapFeasibilityForm']/div[2]/label[2]/span");
	private final By nbapDpFormHeightTooltip = By.xpath("//*[@id='nbapDpForm']/div[2]/div[9]/div/div[2]/span/span[2]");

	/* Network Attributes page object */
	private final By netAttrOrderTypeLabel = By.xpath("//label[@data-qa='netAttr_orderType_label']");
	private final By netAttrRlfdfTransmissionTieCablePortLabel = By
			.xpath("//label[@data-qa='netAttr_rlfdfTransmissionTieCablePort_label']");
	private final By netAttrMDFCabinetLabel = By.xpath("//label[@data-qa='netAttr_MDFCabinet_label']");

	private final By netAttrOrderTypeValue = By.xpath("//label[@data-qa='netAttr_orderType_value']");
	private final By netAttrRlfdfTransmissionTieCablePortValue = By
			.xpath("//label[@data-qa='netAttr_rlfdfTransmissionTieCablePort_value']");
	private final By netAttrMDFCabinetValue = By.xpath("//label[@data-qa='netAttr_MDFCabinet_value']");

	/* NBAP Tp Detail Page Object */
	private final By addressOptionLabel = By.xpath("//label[@data-qa='addressOption_label']");
	private final By descriptionAddressLabel = By.xpath("//label[@data-qa='description_address_label']");
	private final By nearestTpPostalCodeLabel = By.xpath("//label[@data-qa='nearest_postal_code_label']");
	private final By landmarkTpLabel = By.xpath("//label[@data-qa='landmark_label']");
	private final By CoOrdinateSystemTpLabel = By.xpath("//label[@data-qa='coordinate_system_label']");
	private final By GpsCoordinateXTpLabel = By.xpath("//label[@data-qa='gps_coordinate_x_label']");
	private final By GpsCoordinateYTpLabel = By.xpath("//label[@data-qa='gps_coordinate_y_label']");
	private final By heightLabel = By.xpath("//label[@data-qa='height']");
	private final By coverageStatusLabel = By.xpath("//*[@id='nbapFeasibilityForm']/div[1]/label[1]");
	private final By chargesLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By activationChargesLabel = By.xpath("//label[@data-qa='activation_charges_label']");
	private final By fileInputLabel = By.xpath("//label[@data-qa='file_input_label']");

	private final By addressDescriptionRadioButton = By.xpath("//*[@data-qa='address_description']");
	private final By addressNbapRadioButton = By.xpath("//*[@data-qa='address_nbap']");

	private final By descriptionAddressTextBox = By.xpath("//input[@data-qa='description_address']");
	private final By nearestPostalCodeTextBox = By.xpath("//input[@data-qa='nearest_postal_code']");
	private final By landmarkTextBox = By.xpath("//input[@data-qa='landmark']");
	private final By coordinateSystemDropDown = By.xpath("//select[@data-qa='coordinate_system']");
	private final By gpsCoordinateXTextBox = By.xpath("//input[@data-qa='gps_coordinate_x']");
	private final By gpsCoordinateYTextBox = By.xpath("//input[@data-qa='gps_coordinate_y']");
	private final By heightTextBox = By.xpath("//input[@data-qa='height']");

	private final By csValueLabel = By.xpath("//*[@id='nbapFeasibilityForm']/div[1]/label[2]");
	private final By chargesValueLabel = By.xpath("//label[@data-qa='charges_value_label']");
	private final By activationValueLabel = By.xpath("//label[@data-qa='activation_value']");
	private final By filesLabel = By.xpath("//label[@data-qa='files']");

	public NBAPDPtoNBAPTPConnectionViewPage(WebDriver driver) {
		super(driver);

	}

	public boolean isFilesLabel() {
		return ElementUtils.getElement(driver, filesLabel).isDisplayed();
	}

	public boolean isActivationValueLabel() {
		return ElementUtils.getElement(driver, activationValueLabel).isDisplayed();
	}

	public boolean isChargesValueLabelPresent() {
		return ElementUtils.getElement(driver, chargesValueLabel).isDisplayed();
	}

	public boolean isCsValueLabelPresent() {
		waitForPageElement(csValueLabel, 5);
		return ElementUtils.getElement(driver, csValueLabel).isDisplayed();
	}

	public boolean isGpsCoordinateXTextBoxDisable() {
		return isDisabled(gpsCoordinateXTextBox);
	}

	public boolean isGpsCoordinateYTextBoxDisable() {
		return isDisabled(gpsCoordinateYTextBox);
	}

	public boolean isHeightTextBoxDisable() {
		return isDisabled(heightTextBox);
	}

	public boolean isDescriptionAddressTextBoxDisable() {
		return isDisabled(descriptionAddressTextBox);
	}

	public boolean isNearestPostalCodeTextBoxDisable() {
		return isDisabled(nearestPostalCodeTextBox);
	}

	public boolean isLandmarkTextBoxDisable() {
		return isDisabled(landmarkTextBox);
	}

	public boolean isCoordinateSystemDropDownDisable() {
		return isDisabled(coordinateSystemDropDown);
	}

	public boolean isAddressNbapRadioButtonDisable() {
		return checkRadioButtonDisable(addressNbapRadioButton);
	}

	public boolean isAddressDescriptionRadioButtonDisable() {
		return checkRadioButtonDisable(addressDescriptionRadioButton);
	}

	public String getAddressOptionLabel() {
		return ElementUtils.getText(driver, addressOptionLabel);
	}

	public String getDescriptionAddressLabel() {
		return ElementUtils.getText(driver, descriptionAddressLabel);
	}

	public String getNearestTpPostalCodeLabel() {
		return ElementUtils.getText(driver, nearestTpPostalCodeLabel);
	}

	public String getLandmarkTpLabel() {
		return ElementUtils.getText(driver, landmarkTpLabel);
	}

	public String getCoOrdinateSystemTpLabel() {
		return ElementUtils.getText(driver, CoOrdinateSystemTpLabel);
	}

	public String getGpsCoordinateXTpLabel() {
		return ElementUtils.getText(driver, GpsCoordinateXTpLabel);
	}

	public String getHeightTpLabel() {
		return ElementUtils.getText(driver, heightLabel);
	}

	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}

	public String getChargesLabel() {
		return ElementUtils.getText(driver, chargesLabel);
	}

	public String gerActivationChargesLabel() {
		return ElementUtils.getText(driver, activationChargesLabel);
	}

	public String getFileInputLabel() {
		return ElementUtils.getText(driver, fileInputLabel);
	}

	public String getGpsCoordinateYTpLabel() {
		return ElementUtils.getText(driver, GpsCoordinateYTpLabel);
	}

	public boolean isNetAttrOrderTypeValuePresent() {
		return ElementUtils.getElement(driver, netAttrOrderTypeValue).isDisplayed();
	}

	public boolean isNetAttrRlfdfTransmissionTieCablePortValuePresent() {
		return ElementUtils.getElement(driver, netAttrRlfdfTransmissionTieCablePortValue).isDisplayed();
	}

	public boolean isNetAttrMDFCabinetValuePresent() {
		return ElementUtils.getElement(driver, netAttrMDFCabinetValue).isDisplayed();
	}

	public String getNetAttrOrderTypeLabel() {
		return ElementUtils.getText(driver, netAttrOrderTypeLabel);
	}

	public String getNetAttrRlfdfTransmissionTieCablePortLabel() {
		return ElementUtils.getText(driver, netAttrRlfdfTransmissionTieCablePortLabel);
	}

	public String getNetAttrMDFCabinetLabel() {
		return ElementUtils.getText(driver, netAttrMDFCabinetLabel);
	}

	public String getRedundancyLabel() {
		return ElementUtils.getText(driver, redundancyServiceLabel);
	}

	public String getRedundancyUnavailableLabel() {
		return ElementUtils.getText(driver, rcServiceUnavailableLabel);
	}

	public String getDescriptionOfAddLabel() {
		return ElementUtils.getText(driver, descriptionOfAddLabel);

	}

	public boolean isToolTipPtresentForNbapDPDetailsInstallationCharge() {
		return ElementUtils.getElement(driver, nbapDPDetailsInstallationChargeTooltip).isDisplayed();
	}

	public boolean isToolTipPtresentForNbapDpFormHeight() {
		return ElementUtils.getElement(driver, nbapDpFormHeightTooltip).isDisplayed();
	}

	/* NBAP DP details - methods */

	public String getReferenceSchedule10ORILabel() {
		return ElementUtils.getText(driver, referenceSchedule10ORILabel);

	}

	public String getDpNameLabel() {
		return ElementUtils.getText(driver, dpNameLabel);

	}

	public String getDescriptionOfAddressLabel() {
		return ElementUtils.getText(driver, descriptionOfAddressLabel);

	}

	public String getStreetNameLabel() {
		return ElementUtils.getText(driver, streetNameLabel);

	}

	public String getNearestPostalCodeLabel() {
		return ElementUtils.getText(driver, nearestPostalCodeLabel);

	}

	public String getLandmarkLabel() {
		return ElementUtils.getText(driver, landmarkLabel);

	}

	public String getDPCoOrdinateSystemLabel() {
		return ElementUtils.getText(driver, dpCoOrdinateSystemLabel);

	}

	public String getGpsCoOrdinateXLabel() {
		return ElementUtils.getText(driver, dpGpsCoordinateXLabel);

	}

	public String getGpsCoOrdinateYLabel() {
		return ElementUtils.getText(driver, dpGpsCoordinateYLabel);

	}

	public String getHeightLabel() {
		return ElementUtils.getText(driver, dpHeightLabel);

	}

	public String getInstallationChargeLabel() {
		return ElementUtils.getText(driver, installationChargeLabel);

	}

	public String getServiceActivationChargeLabel() {
		return ElementUtils.getText(driver, serviceActivationChargeLabel);

	}

	public boolean isInstallationChargeValuePresent() {
		return checkChargeLength(installationChargesValueLabel);
	}

	public boolean isServiceActivationChargeValuePresent() {
		return checkChargeLength(serviceActivationValueLabel);
	}

	public boolean isToolTipPtresentForInstallationType() {
		return ElementUtils.getElement(driver, installationChargeToolTip).isDisplayed();
	}

	public boolean isDpNameValueTextBoxDisable() {
		return isDisabled(dpNameValueTextBox);
	}

	public boolean isDpGpsCoordinateXValueTextBoxDisable() {
		return isDisabled(dpGpsCoordinateXValueTextBox);
	}

	public boolean isDpGpsCoordinateYValueTextBoxDisable() {
		return isDisabled(dpGpsCoordinateYValueTextBox);
	}

	public boolean isDpHeightValueTextBoxDisable() {
		return isDisabled(dpHeightValueTextBox);
	}

	public boolean isDpCoordinateSystemDropDownDisable() {
		return isDisabled(dpCoordinateSystemDropDown);
	}

	public boolean isDpDescriptionAddressValueTextBoxDisable() {
		return isDisabled(dpDescriptionAddressValueTextBox);
	}

	public boolean isDpStreetNameValueTextBoxDisable() {
		return isDisabled(dpStreetNameValueTextBox);
	}

	public boolean isDpNearestPostalCodeValueTextBoxDisable() {
		return isDisabled(dpNearestPostalCodeValueTextBox);
	}

	public boolean isDpLandmarkValueTextBoxDisable() {
		return isDisabled(dpLandmarkValueTextBox);
	}

	public boolean isOriTextBoxDisable() {
		return isDisabled(oriTextBox);
	}

	public boolean isSubmitButtonDisable() {
		if (ElementUtils.getElement(driver, submitRequestButton).isEnabled()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkChargeLength(By element) {
		String serviceActivationCharge = ElementUtils.getText(driver, element);
		if (serviceActivationCharge.length() < 1)
			return false;
		else
			return true;
	}

	/**
	 * @param element
	 * @return This method is use to verify field is enable or disable on screen
	 */
	public boolean checkRadioButtonDisable(By element) {
		return (!ElementUtils.getElement(driver, element).isEnabled());

	}

	/*
	 * @Override protected void load() { String url = driver.getCurrentUrl();
	 * driver.get(url + "/view"); }
	 * 
	 * @Override protected void isLoaded() throws Error { String url =
	 * driver.getCurrentUrl();
	 * 
	 * }
	 */
	public void waitForPageElement(final By element, long timeOutInSeconds) {

		new WebDriverWait(driver, timeOutInSeconds)
					.withTimeout(20, TimeUnit.SECONDS)
						.pollingEvery(2, TimeUnit.SECONDS)
							.ignoring(NoSuchElementException.class)
								.until(new Function<WebDriver,WebElement>() {
										public  WebElement apply(WebDriver driver){
											return ElementUtils.getElement(driver, element);
										}
									});
									//.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}

}
