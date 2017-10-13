package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class ManageTpByAddresViewPage  extends CommonViewPage{
	private final By postalCodeLabel = By.xpath("//label[@data-qa='postal_code_label']");
	private final By unitNumberLabel = By.xpath("//label[@data-qa='unit_number_label']");
	private final By scheduleNameLabel = By.xpath("//label[@data-qa='scheduleName_label']");

	private final By postalcodeandUnitNUmLabel = By.xpath("//div[@data-qa='view_feasibility_header']/h2/span");
	private final By enduserHeaderLabel = By.xpath("//div[@data-qa='enduser_header']/h2/span");
	private final By manageTPDetailsHeaderLabel = By.xpath("//div[@data-qa='manageTPDetails_header']/h2/span");
	private final By opearationLabel = By.xpath("//label[@data-qa='opearaion_label']");
	private final By networkAttributesLabel = By.xpath("//div[@data-qa='netAttr_header']/h2/span");
	private final By netAttrOrderTypeLabel = By.xpath("//label[@data-qa='netAttr_orderType_label']");
	private final By netAttrRedundancyORILabel = By.xpath("//label[@data-qa='netAttr_redundancyORI_label']");
	private final By activationDateLabel = By.xpath("//label[@data-qa='activation_date_label']");
	private final By installationSessionLabel = By.xpath("//label[@data-qa='installation_session_label']");
	private final By viewAdditionalInfoHeader = By.xpath("//div[@data-qa='view_additionalInfo_header']/h2/span");
	private final By additionalInfoLabel = By.xpath("//label[@data-qa='additional_info_label']");

	public ManageTpByAddresViewPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPostalcodeandUnitNumLabel() {
		return ElementUtils.getText(driver, postalcodeandUnitNUmLabel);
	}
	
	public String getEnduserHeaderLabel() {
		return ElementUtils.getText(driver, enduserHeaderLabel);
	}
	
	public String getManageTPDetailsHeaderLabel() {
		return ElementUtils.getText(driver, manageTPDetailsHeaderLabel);
	}
	
	public String getScheduleNameLabel() {
		return ElementUtils.getText(driver, scheduleNameLabel);
	}
	
	public String getPostalCodeLabel() {
		return ElementUtils.getText(driver, postalCodeLabel);
	}
	
	public String getUnitNumberLabel() {
		return ElementUtils.getText(driver, unitNumberLabel);
	}
	
	public String getOpearaionLabel() {
		return ElementUtils.getText(driver, opearationLabel);
	}
	
	public String getNetworkAttributesLabel() {
		return ElementUtils.getText(driver, networkAttributesLabel);
	}
	
	public String getNetAttrOrderTypeLabel() {
		return ElementUtils.getText(driver, netAttrOrderTypeLabel);
	}
	
	public String getNetAttrRedundancyORILabel() {
		return ElementUtils.getText(driver, netAttrRedundancyORILabel);
	}
	
	public String getActivationDateLabel() {
		return ElementUtils.getText(driver, activationDateLabel);
	}
	
	public String getInstallationSessionLabel() {
		return ElementUtils.getText(driver, installationSessionLabel);
	}
	
	public String getViewAdditionalInfoHeader() {
		return ElementUtils.getText(driver, viewAdditionalInfoHeader);
	}
	public String getAdditionalInfoLabel() {
		return ElementUtils.getText(driver, additionalInfoLabel);
	}
}
