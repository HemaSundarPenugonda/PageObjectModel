package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.NbapConnectionTestData;

import java.awt.*;
import java.net.URISyntaxException;

public class NBAPDPtoNBAPTPConnectionPage extends NBAPConnectionPage {

	public NBAPDPtoNBAPTPConnectionPage(WebDriver driver) {
		super(driver);
	}

	private final By ariTextBox = By.xpath("//input[@data-qa='ari_input']");
	private final By applicationReferenceIdentifierLabel = By.xpath("//label[@data-qa='ari_header_label']");
	private final By referenceSchedule10ORILabel = By.xpath("//label[@data-qa='ori_header_label']");
	private final By getDetailsButton = By.xpath("//button[@data-qa='submit_btn']");
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
	private final By chargesValueLabel = By.xpath("//label[@data-qa='charges_value_label']");
	private final By activationValueLabel = By.xpath("//label[@data-qa='activation_value']");
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
	private final By nbapDPDetailsServiceActivationChargeTooltip = By
			.xpath("//*[@id='nbapDPDetailsForm']/div[2]/label[2]/span");
	private final By nbapDpFormHeightTooltip = By.xpath("//*[@id='nbapDpForm']/div[2]/div[9]/div/div[2]/span/span[2]");

	/* NBAP Tp Detail Page Object */
	private final By descriptionAddressLabel = By.xpath("//label[@data-qa='description_address_label']");
	private final By heightLabel = By.xpath("//label[@data-qa='height']");
	private final By addressOptionServiceRadioButton = By.xpath("//input[@data-qa='address_description']");
	private final By descriptionAddressTextBox = By.xpath("//input[@data-qa='description_address']");
	private final By addressNbapRadioButton = By.xpath("//input[@data-qa='address_nbap']");
	private final By streetNameTPDetailsLabel = By.xpath("//label[@data-qa='street_name_label']");
	private final By streetNameTPDetaislsTextBox = By.xpath("//input[@data-qa='street_name']");
	private final By nearestPostalCodeTextBox = By.xpath("//input[@data-qa='nearest_postal_code']");
	private final By landmarkTextBox = By.xpath("//input[@data-qa='landmark']");
	private final By coordinateSystemDropDown = By.xpath("//select[@data-qa='coordinate_system']");
	private final By gpsCoordinateXTextBox = By.xpath("//input[@data-qa='gps_coordinate_x']");
	private final By gpsCoordinateYTextBox = By.xpath("//input[@data-qa='gps_coordinate_y']");
	private final By heightTextBox = By.xpath("//input[@data-qa='height']");
	private final By nbapTpFormHeightTooltip = By.xpath("//*[@id='feasibilityForm']/div[8]/div/div[2]/span/span[2]");

	/* Check Feasibility Page Object */
	private final By checkFeasibilityButton = By.xpath("//*[@id='feasibilityForm']/div[9]/div/button");
	private final By coverageStatusLabel = By.xpath("//*[@id='nbapFeasibilityForm']/div[1]/label[1]");
	private final By chargesLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By activationChargesLabel = By.xpath("//label[@data-qa='activation_charges_label']");
	private final By fileInputLabel = By.xpath("//label[@data-qa='file_input_label']");
	private final By csValueLabel = By.xpath("//*[@id='nbapFeasibilityForm']/div[1]/label[2]");
	private final By feasibilityInstallationChargesValueLabel = By
			.xpath("//*[@id='nbapFeasibilityForm']/div[2]/label[1]");
	private final By feasibilityActivationChargeValueLabel = By.xpath("//*[@id='nbapDPDetailsForm']/div[3]/label[2]");
	private final By feasibilityInstallationChargesTooltip = By
			.xpath("//*[@id='nbapFeasibilityForm']/div[2]/label[2]/span");
	private final By browseAndUploadTooltip = By.xpath(
			"//*[@id='app-container']/div/div/div[3]/div/div[1]/div[5]/div[2]/div/div/div/label[2]/div[2]/span[2]");

	/* Site Survey Date & Time Slot page object */
	private final By activationDateLabel = By.xpath("//*[@id='rfaForm']/div[1]/div/label");
	private final By installationSessionLabel = By.xpath("//*[@id='rfaForm']/div[2]/div/label");
	private final By submitRequestButton = By.xpath("//button[@data-qa='submit_button']");
	private final By confirmationMessage = By.xpath("//*[@id='app-container']/div/div/div[3]/div/div[2]/div[2]/h1");
	private final By timeSlotDropDown = By.xpath("//select[@data-qa='timepicker']");

	/* For Test Data We need to create object of Nbap Connection Test Data */
	NbapConnectionTestData nbapTestData = new NbapConnectionTestData();

	public String getConfirmationMessageLabel() {
		return ElementUtils.getText(driver, confirmationMessage);
	}

	public String getApplicationReferenceIdentifierLabel() {
		return ElementUtils.getText(driver, applicationReferenceIdentifierLabel);
	}

	public String getSiteSurveyDateLabel() {
		return ElementUtils.getText(driver, activationDateLabel);
	}

	public String getPreferredSiteSurveySessionLabel() {
		return ElementUtils.getText(driver, installationSessionLabel);
	}

	public boolean isToolTipFeasibilityInstallationCharges() {
		return ElementUtils.getElement(driver, feasibilityInstallationChargesTooltip).isDisplayed();
	}

	public boolean isToolTipPtresentBrowseAndUpload() {
		return ElementUtils.getElement(driver, browseAndUploadTooltip).isDisplayed();
	}

	public boolean isToolTipPtresentForNbapTpFormHeight() {
		return ElementUtils.getElement(driver, nbapTpFormHeightTooltip).isDisplayed();
	}

	public boolean isToolTipPtresentForNbapDPDetailsServiceActivationCharge() {
		return ElementUtils.getElement(driver, nbapDPDetailsServiceActivationChargeTooltip).isDisplayed();
	}

	public boolean isToolTipPtresentForNbapDpFormHeight() {
		return ElementUtils.getElement(driver, nbapDpFormHeightTooltip).isDisplayed();
	}

	public boolean isCoverageStatusValuePresent() {
		return checkChargeLength(csValueLabel);
	}

	public boolean isFeasibilityInstallationChargeValuePresent() {
		return checkChargeLength(feasibilityInstallationChargesValueLabel);
	}

	public boolean isFeasibilityServiceActivationChargeValuePresent() {
		return checkChargeLength(feasibilityActivationChargeValueLabel);
	}

	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}

	public String getChargesLabel() {
		return ElementUtils.getText(driver, chargesLabel);
	}

	public String getActivationChargesLabel() {
		return ElementUtils.getText(driver, activationChargesLabel);
	}

	public String getFileInputLabel() {
		return ElementUtils.getText(driver, fileInputLabel);
	}

	public String getHeightTpLabel() {
		return ElementUtils.getText(driver, heightLabel);
	}

	public String getDescriptionAddressLabel() {
		return ElementUtils.getText(driver, descriptionAddressLabel);
	}

	public String getNbapAddressLabel() {
		return ElementUtils.getText(driver, streetNameTPDetailsLabel);
	}

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
		return checkChargeLength(chargesValueLabel);
	}

	public boolean isServiceActivationChargeValuePresent() {
		return checkChargeLength(activationValueLabel);
	}

	public boolean isToolTipPtresentForInstallationType() {
		return ElementUtils.getElement(driver, installationChargeToolTip).isDisplayed();
	}

	public boolean isDpNameValueTextBoxDisable() {
		return checkTextBoxDisable(dpNameValueTextBox);
	}

	public boolean isDpGpsCoordinateXValueTextBoxDisable() {
		return checkTextBoxDisable(dpGpsCoordinateXValueTextBox);
	}

	public boolean isDpGpsCoordinateYValueTextBoxDisable() {
		return checkTextBoxDisable(dpGpsCoordinateYValueTextBox);
	}

	public boolean isDpHeightValueTextBoxDisable() {
		return checkTextBoxDisable(dpHeightValueTextBox);
	}

	public boolean isDpCoordinateSystemDropDownDisable() {
		return checkTextBoxDisable(dpCoordinateSystemDropDown);
	}

	public boolean isDpDescriptionAddressValueTextBoxDisable() {
		return checkTextBoxDisable(dpDescriptionAddressValueTextBox);
	}

	public boolean isDpStreetNameValueTextBoxDisable() {
		return checkTextBoxDisable(dpStreetNameValueTextBox);
	}

	public boolean isDpNearestPostalCodeValueTextBoxDisable() {
		return checkTextBoxDisable(dpNearestPostalCodeValueTextBox);
	}

	public boolean isDpLandmarkValueTextBoxDisable() {
		return checkTextBoxDisable(dpLandmarkValueTextBox);
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
		if (serviceActivationCharge.length() < 1) {
			return false;
		} else
			return true;
	}

	/**
	 * @param element
	 * @return This method is use to verify field is enable or disable on screen
	 */
	public boolean checkTextBoxDisable(By element) {
		if (ElementUtils.getElement(driver, element).isEnabled()) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * @author manuc
	 * @return This method is use to check get details with Schedule 10 ORI
	 */

	public void checkGetDetails() {
		ElementUtils.getElement(driver, oriTextBox).sendKeys("10101010");
		ElementUtils.findElementForClick(driver, getDetailsButton).click();
	}

	/**
	 * @author manuc
	 * @return This method is use to enter details for check feasibility with
	 *         Description of Address.
	 */

	public void checkFeasibilityWithDescriptionofAddress() throws InterruptedException, AWTException, URISyntaxException {
		ElementUtils.findElementForClick(driver, addressOptionServiceRadioButton).click();
		ElementUtils.getElement(driver, descriptionAddressTextBox).sendKeys(nbapTestData.getDescriptionOFAddress());
		ElementUtils.getElement(driver, nearestPostalCodeTextBox).sendKeys(nbapTestData.getNearestPostalCode());
		ElementUtils.getElement(driver, landmarkTextBox).sendKeys(nbapTestData.getLandmark());
		Select selectCentralOffice = new Select(ElementUtils.getElement(driver, coordinateSystemDropDown));
		selectCentralOffice.selectByIndex(1);

		ElementUtils.getElement(driver, gpsCoordinateXTextBox).sendKeys(nbapTestData.getXcoordinate());
		ElementUtils.getElement(driver, gpsCoordinateYTextBox).sendKeys(nbapTestData.getYcoordinate());
		ElementUtils.getElement(driver, heightTextBox).sendKeys(nbapTestData.getHeight());
		ElementUtils.findElementForClick(driver, checkFeasibilityButton).click();
		ElementUtils.performFileUplaod(driver, "Nbap.pdf");
	}

	public void checkFeasibilityWithNbapAddress() throws InterruptedException, AWTException, URISyntaxException {
		ElementUtils.findElementForClick(driver, addressNbapRadioButton).click();
		ElementUtils.getElement(driver, streetNameTPDetaislsTextBox).sendKeys(nbapTestData.getDescriptionOFAddress());
		ElementUtils.getElement(driver, nearestPostalCodeTextBox).sendKeys(nbapTestData.getNearestPostalCode());
		ElementUtils.getElement(driver, nearestPostalCodeTextBox).sendKeys(nbapTestData.getLandmark());
		Select selectCentralOffice = new Select(ElementUtils.getElement(driver, coordinateSystemDropDown));
		
		selectCentralOffice.selectByIndex(2);
		ElementUtils.getElement(driver, gpsCoordinateXTextBox).sendKeys(nbapTestData.getXcoordinate());
		ElementUtils.getElement(driver, gpsCoordinateYTextBox).sendKeys(nbapTestData.getYcoordinate());
		ElementUtils.getElement(driver, heightTextBox).sendKeys(nbapTestData.getHeight());
		ElementUtils.findElementForClick(driver, checkFeasibilityButton).click();

		ElementUtils.performFileUplaod(driver, "Nbap.pdf");
	}

	public void selectInstallationDateAndSubmitRequest() throws InterruptedException {
		selectCalendarDate();
		ElementUtils.getElement(driver, ariTextBox).sendKeys("Test ARI");
		Select selectTimeSlot = new Select(ElementUtils.getElement(driver, timeSlotDropDown));
		selectTimeSlot.selectByIndex(1);
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

}
