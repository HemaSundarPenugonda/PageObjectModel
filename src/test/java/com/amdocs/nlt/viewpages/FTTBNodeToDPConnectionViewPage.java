package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class FTTBNodeToDPConnectionViewPage extends CommonViewPage {

	public FTTBNodeToDPConnectionViewPage(WebDriver driver) {
		super(driver);
	}

	/* Application Details page object */
	private final By applicationReferenceIdentifierLabel = By.xpath("//*[@id='newAriForm']/div/label");
	private final By orderRequestIdentifierLabel = By.xpath("//label[@data-qa='appDetails_ORI_label']");
	private final By circuitIdentifierNumber = By.xpath("//label[@data-qa='appDetails_CIN_label']");
	private final By appDetailsDOALabel = By.xpath("//label[@data-qa='appDetails_DOA_label']");
	private final By tentativeProvisionDate = By.xpath("//label[@data-qa='appDetails_TPD_label']");
	private final By timelineToCompleteLabel = By.xpath("//label[@data-qa='appDetails_RPD_label']");
	private final By appDetailsRORLabel = By.xpath("//label[@data-qa='appDetails_ROR_label']");
	private final By appDetailsORIValue = By.xpath("//label[@data-qa='appDetails_ORI_value']");
	private final By ariTextBox = By.xpath("//form[@id='newAriForm']/div/div[1]//*[@id='identifier']");
	private final By appDetailsCINValue = By.xpath("//label[@data-qa='appDetails_CIN_value']");
	private final By appDetailsDOAValue = By.xpath("//label[@data-qa='appDetails_DOA_value']");
	private final By appDetailsTPDValue = By.xpath("//label[@data-qa='appDetails_TPD_value']");
	private final By appDetailsRPDValue = By.xpath("//label[@data-qa='appDetails_RPD_value']");
	private final By appDetailsRORValue = By.xpath("//label[@data-qa='appDetails_ROR_value']");

	/* End User Premise Details page object */
	private final By postalCodeLabel = By.xpath("//*[@id='feasibilityForm']/div[1]/label");
	private final By unitNumberLabel = By.xpath("//label[@data-qa='unit_number_label']");
	private final By coverageStatusLabel = By.xpath("//label[@data-qa='coverage_status_label']");
	private final By buildingNumberLabel = By.xpath("//*[@id='fttbToDpForm']/div[2]/label");
	private final By buildingNameLabel = By.xpath("//label[@data-qa='building_name_label']");
	private final By streetNameLabel = By.xpath("//label[@data-qa='street_name_label']");
	private final By chargesLabel = By.xpath("//label[@data-qa='charges_label']");
	private final By activationCchargesLabel = By.xpath("//label[@data-qa='activation_charges_label']");
	private final By referenceScheduleLabel = By.xpath("//label[@data-qa='reference_schedule_label']");
	private final By postalCodeTextBox = By.xpath("//input[@data-qa='postal_code']");
	private final By unitNumberTextBox = By.xpath("//input[@data-qa='unit_number']");
	private final By csValueLabelValueLabel = By.xpath("//label[@data-qa='cs_value_label']");
	private final By buildingNumberDropDown = By.xpath("//select[@data-qa='building_number']");
	private final By buildingNameTextBox = By.xpath("//input[@data-qa='building_name']");
	private final By streetNameTextBox = By.xpath("//input[@data-qa='street_name']");
	private final By chargesValueLabel = By.xpath("//label[@data-qa='charges_value_label']");
	private final By activationValueLabel = By.xpath("//label[@data-qa='activation_value']");
	private final By referenceScheduleValueTextBox = By.xpath("//input[@data-qa='reference_schedule_value']");
	private final By installationChargeTooltip = By.xpath("//*[@id='fttbToDpForm']/div[5]/label[2]/span");
	private final By referenceSchedule6ORITooltip = By.xpath("//*[@id='fttbToDpForm']/div[7]/label[2]/span");

	/* Networks attribute page object */
	private final By netAttrOrderTypeLabel = By.xpath("//label[@data-qa='netAttr_orderType_label']");
	private final By fttbCabinetIdLabel = By.xpath("//label[@data-qa='fttb_cabinet_id_label']");
	private final By fttbNodeStreetNameLabel = By.xpath("//label[@data-qa='fttb_node_street_name_label']");
	private final By fttbNodeHouseNumberLabel = By.xpath("//label[@data-qa='fttb_node_house_number_label']");
	private final By fttbNodePostalCodeLabel = By.xpath("//label[@data-qa='fttb_node_postal_code_label']");
	private final By fttbNodeBuildingNameLabel = By.xpath("//label[@data-qa='fttb_node_building_name_label']");
	private final By fttbNodeBuildingTypeLabel = By.xpath("//label[@data-qa='fttb_node_building_type_label']");

	private final By netAttrOrderTypeValue = By.xpath("//label[@data-qa='netAttr_orderType_value']");
	private final By fttbCabinetIdValue = By.xpath("//label[@data-qa='fttb_cabinet_id_value']");
	private final By fttbNodeStreetNameValue = By.xpath("//label[@data-qa='fttb_node_street_name_value']");
	private final By fttbNodeHouseNumberValue = By.xpath("//label[@data-qa='fttb_node_house_number_value']");
	private final By fttbNodePostalCodeValue = By.xpath("//label[@data-qa='fttb_node_postal_code_value']");
	private final By fttbNodeBuildingNameValue = By.xpath("//label[@data-qa='fttb_node_building_name_value']");
	private final By fttbNodeBuildingTypeValue = By.xpath("//label[@data-qa='fttb_node_building_type_value']");

	/* Networks attribute page method */

	public boolean isNetAttrOrderTypeValuePresent() {
		return ElementUtils.getElement(driver, netAttrOrderTypeValue).isDisplayed();
	}

	public boolean isFttbCabinetIdValuePresent() {
		return ElementUtils.getElement(driver, fttbCabinetIdValue).isDisplayed();
	}

	public boolean isFttbNodeStreetNameValuePresent() {
		return ElementUtils.getElement(driver, fttbNodeStreetNameValue).isDisplayed();
	}

	public boolean isFttbNodeHouseNumberValuePresent() {
		return ElementUtils.getElement(driver, fttbNodeHouseNumberValue).isDisplayed();
	}

	public boolean isFttbNodePostalCodeValuePresent() {
		return ElementUtils.getElement(driver, fttbNodePostalCodeValue).isDisplayed();
	}

	public boolean isFttbNodeBuildingNameValuePresent() {
		return ElementUtils.getElement(driver, fttbNodeBuildingNameValue).isDisplayed();
	}

	public boolean isFttbNodeBuildingTypeValuePresent() {
		return ElementUtils.getElement(driver, fttbNodeBuildingTypeValue).isDisplayed();
	}

	public String getNetAttrOrderTypeLabel() {
		return ElementUtils.getText(driver, netAttrOrderTypeLabel);
	}

	public String getFttbCabinetIdLabel() {
		return ElementUtils.getText(driver, fttbCabinetIdLabel);
	}

	public String getFttbNodeStreetNameLabel() {
		return ElementUtils.getText(driver, fttbNodeStreetNameLabel);
	}

	public String getFttbNodeHouseNumberLabel() {
		return ElementUtils.getText(driver, fttbNodeHouseNumberLabel);
	}

	public String getFttbNodePostalCodeLabel() {
		return ElementUtils.getText(driver, fttbNodePostalCodeLabel);
	}

	public String getFttbNodeBuildingNameLabel() {
		return ElementUtils.getText(driver, fttbNodeBuildingNameLabel);
	}

	public String getFttbNodeBuildingTypeLabel() {
		return ElementUtils.getText(driver, fttbNodeBuildingTypeLabel);
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean isPostalCodeTextBoxDisable() {
		return checkTextBoxDisable(postalCodeTextBox);
	}

	public boolean isUnitNumberTextBoxDisable() {
		return checkTextBoxDisable(unitNumberTextBox);
	}

	public boolean isCsValueLabelValueLabelPresent() {
		return ElementUtils.getElement(driver, csValueLabelValueLabel).isDisplayed();
	}

	public boolean isBuildingNumberDropDownDisable() {
		return checkTextBoxDisable(buildingNumberDropDown);
	}

	public boolean isBuildingNameTextBoxDisable() {
		return checkTextBoxDisable(buildingNameTextBox);
	}

	public boolean isStreetNameTextBoxDisable() {
		return checkTextBoxDisable(streetNameTextBox);
	}

	public boolean isChargesValueLabelPresent() {
		return ElementUtils.getElement(driver, chargesValueLabel).isDisplayed();
	}

	public boolean isActivationValueLabelPresent() {
		return ElementUtils.getElement(driver, activationValueLabel).isDisplayed();
	}

	public boolean isReferenceScheduleValueTextBoxDisable() {
		return checkTextBoxDisable(referenceScheduleValueTextBox);
	}

	public boolean isInstallationChargeTooltipPresent() {
		return ElementUtils.getElement(driver, installationChargeTooltip).isDisplayed();
	}

	public boolean isReferenceSchedule6ORITooltipPresent() {
		return ElementUtils.getElement(driver, referenceSchedule6ORITooltip).isDisplayed();
	}

	public String getPostalCodeLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);
	}

	public String getUnitNumberLabel() {
		return ElementUtils.getText(driver, unitNumberLabel);
	}

	public String getCoverageStatusLabel() {
		return ElementUtils.getText(driver, coverageStatusLabel);
	}

	public String getBuildingNumberLabel() {
		return ElementUtils.getText(driver, buildingNumberLabel);
	}

	public String getBuildingNameLabel() {
		return ElementUtils.getText(driver, buildingNameLabel);
	}

	public String getStreetNameLabel() {
		return ElementUtils.getText(driver, streetNameLabel);
	}

	public String getInstallationChargesLabel() {
		return ElementUtils.getText(driver, chargesLabel);
	}

	public String getServiceActivationChargesLabel() {
		return ElementUtils.getText(driver, activationCchargesLabel);
	}

	public String getReferenceScheduleLabel() {
		return ElementUtils.getText(driver, referenceScheduleLabel);
	}

	public boolean isAriTextBoxPresent() {
		return checkTextBoxDisable(ariTextBox);
	}

	public boolean isAppDetailsRORPresent() {
		return ElementUtils.getElement(driver, appDetailsRORValue).isDisplayed();
	}

	public boolean isAppDetailsORIValuePresent() {
		return ElementUtils.getElement(driver, appDetailsORIValue).isDisplayed();
	}

	public boolean isAppDetailsCINValuePresent() {
		return ElementUtils.getElement(driver, appDetailsCINValue).isDisplayed();
	}

	public boolean isAppDetailsDOAValuePresent() {
		return ElementUtils.getElement(driver, appDetailsDOAValue).isDisplayed();
	}

	public boolean isAppDetailsTPDValuePresent() {
		return ElementUtils.getElement(driver, appDetailsTPDValue).isDisplayed();
	}

	public boolean isAppDetailsRPDValuePresent() {
		return ElementUtils.getElement(driver, appDetailsRPDValue).isDisplayed();
	}

	public String getAppDetailsRORLabel() {
		return ElementUtils.getText(driver, appDetailsRORLabel);
	}

	public String getApplicationReferenceIdentifierLabel() {
		return ElementUtils.getText(driver, applicationReferenceIdentifierLabel);
	}

	public String getOrderRequestIdentifierLabel() {
		return ElementUtils.getText(driver, orderRequestIdentifierLabel);
	}

	public String getCircuitIdentifierNumber() {
		return ElementUtils.getText(driver, circuitIdentifierNumber);

	}

	public String getAppDetailsDOALabel() {
		return ElementUtils.getText(driver, appDetailsDOALabel);

	}

	public String getTentativeProvisionDateLabel() {
		return ElementUtils.getText(driver, tentativeProvisionDate);

	}

	public String getTimelineToCompleteLabel() {
		return ElementUtils.getText(driver, timelineToCompleteLabel);

	}

	/**
	 * @param element
	 * @return This method is use to verify field is enable or disable on screen
	 */
	public boolean checkRadioButtonDisable(By element) {

		if (ElementUtils.getElement(driver, element).isEnabled()) {
			return false;
		} else {
			return true;
		}
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

}
