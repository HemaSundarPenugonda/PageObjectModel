package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.DropDowns;
import com.amdocs.nlt.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoLocationServicePage extends CommonComponentPage {

    public CoLocationServicePage(WebDriver driver) {
        super(driver);
    }

    private final By header = By.xpath("//h1");
    private final By coLocationServiceDetailsSection = By.xpath("//*[@data-qa='colocation_servicedetails']");
    private final By coLocationAddressLabel = By.xpath("//*[@data-qa='colocaionaddress_label']");
    private final By coLocationAddressDropdown = By.xpath("//*[@data-qa='coAddressList']");
    private final By coLocationRequestTypeLabel = By.xpath("//*[@data-qa='colocaionrequest_label']");
    private final By coLocationRequestTypeDropdown = By.xpath("//*[@data-qa='coRequestType']");
    private final By termOfLicenceLabel = By.xpath("//*[@data-qa='coterm_label']");
    private final By termOfLicenceDropdown = By.xpath("//*[@data-qa='coLicense']");
    private final By rackDetailsSection = By.xpath("//*[@data-qa='colocation_rack_details']");
    private final By equipmentTypeInstalledDropdown1 = By.xpath("//*[@id='equipment0']");
    private final By equipmentTypeInstalledDropdown2 = By.xpath("//*[@id='equipment1']");
    private final By equipmentTypeInstalledOthers1Textbox = By.xpath("//*[@data-qa='equipmentText0']");
    private final By equipmentTypeInstalledOthers2Textbox = By.xpath("//*[@data-qa='equipmentText1']");
    private final By coLocationSpaceWidth1 = By.xpath("//*[@data-qa='width0']");
    private final By coLocationSpaceWidth2 = By.xpath("//*[@data-qa='width1']");
    private final By coLocationSpaceDepth1 = By.xpath("//*[@data-qa='depth0']");
    private final By coLocationSpaceDepth2 = By.xpath("//*[@data-qa='depth1']");
    private final By powerRequirementAcDropdown1 = By.xpath("//*[@data-qa='powerAc0']");
    private final By powerRequirementAcDropdown2 = By.xpath("//*[@data-qa='powerAc1']");
    private final By powerRequirementAcQuantity1Textbox = By.xpath("//*[@data-qa='powerAcText0']");
    private final By powerRequirementAcQuantity2Textbox = By.xpath("//*[@data-qa='powerAcText1']");
    private final By powerRequirementDcDropdown1 = By.xpath("//*[@data-qa='powerDc0']");
    private final By powerRequirementDcDropdown2 = By.xpath("//*[@data-qa='powerDc1']");
    private final By powerRequirementDcQuantity1Textbox = By.xpath("//*[@data-qa='powerDcText0']");
    private final By powerRequirementDcQuantity2Textbox = By.xpath("//*[@data-qa='powerDcText1']");
    private final By plusIconForRackDetailsIcon = By.xpath("//*[@data-qa='plusIcon0']");
    private final By typeOfWorkLabel = By.xpath("//*[@data-qa='typeofwork_label']");
    private final By typeOfWorkDropdown = By.xpath("//*[@data-qa='select_typeofwork']");
    private final By drillingCheckbox = By.xpath("//*[@data-qa='colocation_drilling']//input");
    private final By drillingCheckboxLabel = By.xpath("//*[@data-qa='colocation_drilling']//label");
    private final By cableTrayCheckbox = By.xpath("//*[@data-qa='colocation_cable']//input");
    private final By cableTrayCheckboxLabel = By.xpath("//*[@data-qa='colocation_cable']//label");
    private final By earthCabelCheckbox = By.xpath("//*[@data-qa='colocation_earth']//input");
    private final By earthCabelCheckboxLabel = By.xpath("//*[@data-qa='colocation_earth']//label");
    private final By othersCheckbox = By.xpath("//*[@data-qa='colocation_others']//input");
    private final By othersCheckboxLabel = By.xpath("//*[@data-qa='colocation_others']//label");
    private final By othersCheckboxDetails = By.xpath("//*[@data-qa='specify_others']");
    private final By rackIdTextbox1 = By.xpath("//*[@data-qa='rackId0']");
    private final By rackIdTextbox2 = By.xpath("//*[@data-qa='rackId1']");
    private final By rackIdLabel = By.xpath("//*[@data-qa='corack_label']");
    private final By rackIdTextBox = By.xpath("//*[@data-qa='rack_value']");
    private final By tieCableFibreCoresLabel = By.xpath("//*[@data-qa='cotiecable_label']");
    private final By tieCableFibreCoresTypeLabel = By.xpath("//*[@data-qa='']");
    private final By tieCableFibreCoresTypeDropdown = By.xpath("//*[@data-qa='coTieCable']");
    private final By tieCableFibreCoresQuantityLabel = By.xpath("//*[@data-qa='']");
    private final By tieCableFibreCoresQuantityTextbox = By.xpath("//*[@data-qa='coTieCableinput']");
    private final By oduPortTypeLabel = By.xpath("//*[@data-qa='oduPort_label']");
    private final By oduPortTypeDropdown = By.xpath("//*[@data-qa='select_oduPort']");
    private final By startOfterminationLabel = By.xpath("//*[@data-qa='costartTermination_label']");
    private final By startOftermination_shelfLabel = By.xpath("//*[@data-qa='startTerminationSelf']/preceding-sibling::div");
    private final By startOftermination_portLabel = By.xpath("//*[@data-qa='startTerminationPort']/preceding-sibling::div");
    private final By startOftermination_fibreStrandLabel = By.xpath("//*[@data-qa='startTerminationStrand']/preceding-sibling::div");
    private final By endOfterminationLabel = By.xpath("//*[@data-qa='coendTermination_label']");
    private final By endOftermination_shelfLabel = By.xpath("//*[@data-qa='endTerminationSelf']/preceding-sibling::div");
    private final By endOftermination_portLabel = By.xpath("//*[@data-qa='endTerminationPort']/preceding-sibling::div");
    private final By endOftermination_fibreStrandLabel = By.xpath("//*[@data-qa='endTerminationStrand']/preceding-sibling::div");
    private final By startOftermination_shelfTextbox = By.xpath("//*[@data-qa='startTerminationSelf']");
    private final By startOftermination_portTextbox = By.xpath("//*[@data-qa='startTerminationPort']");
    private final By startOftermination_fibreStrandTextbox = By.xpath("//*[@data-qa='startTerminationStrand']");
    private final By endOftermination_shelfTextbox = By.xpath("//*[@data-qa='endTerminationSelf']");
    private final By endOftermination_portTextbox = By.xpath("//*[@data-qa='endTerminationPort']");
    private final By endOftermination_fibreStrandTextbox = By.xpath("//*[@data-qa='endTerminationStrand']");

    public String getHeader() {
        return ElementUtils.getText(driver, header);
    }

    public String getCoLocationServiceDetailsSectionName() {
        return ElementUtils.getText(driver, coLocationServiceDetailsSection);
    }

    public void selectCoLocationAddressDropdownDropdown(String valueToBeSelected) {
        ElementUtils.selectDropdownValue(driver, coLocationAddressDropdown, valueToBeSelected);
    }

    public String getCoLocationAddressLabel() {
        return ElementUtils.getText(driver, coLocationAddressLabel);
    }

    public boolean areCoLocationAddressDropdownValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, coLocationAddressDropdown, DropDowns.coLocationService_CoLocationAddress);
    }

    public String getCoLocationRequestTypeLabel() {
        return ElementUtils.getText(driver, coLocationRequestTypeLabel);
    }

    public boolean areCoLocationRequestTypeDropdownValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, coLocationRequestTypeDropdown, DropDowns.coLocationService_coLocationRequestType);
    }

    public void selectCoLocationRequestType(String valueToBeSelected) {
        ElementUtils.selectDropdownValue(driver, coLocationRequestTypeDropdown, valueToBeSelected);
    }

    public String getTermOfLicenceLabel() {
        return ElementUtils.getText(driver, termOfLicenceLabel);
    }

    public boolean areTermOfLicenceDropdownValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, termOfLicenceDropdown, DropDowns.coLocationService_termOfLicenceRequired);
    }
    public void selectTermOfLicenceDropdown(String valueToBeSelected) {
        ElementUtils.selectDropdownValue(driver, termOfLicenceDropdown, valueToBeSelected);
    }
    public String getRackDetailsSectionName() {
        return ElementUtils.getText(driver, rackDetailsSection);
    }

    public boolean areEquipmentTypeInstalledDropdown1ValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, equipmentTypeInstalledDropdown1, DropDowns.coLocationService_equipmentTypeInstalled);
    }

    public void selectEquipmentTypeInstalledDropdown1(String valueToSelect) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, equipmentTypeInstalledDropdown1, valueToSelect);
    }

    public void selectEquipmentTypeInstalledDropdown2(String valueToSelect) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, equipmentTypeInstalledDropdown2, valueToSelect);
    }

    public boolean isEquipmentTypeInstalledOthers2TextboxEnabled() {
        return ElementUtils.isEnabled(driver, equipmentTypeInstalledOthers2Textbox);
    }

    public void fillEquipmentTypeInstalledOthers2Textbox(String str) {
        ElementUtils.sendKeys(driver, equipmentTypeInstalledOthers2Textbox, str);
    }

    public boolean isEquipmentTypeInstalledOthers1TextboxEnabled() {
        return ElementUtils.isEnabled(driver, equipmentTypeInstalledOthers1Textbox);
    }

    public void fillEquipmentTypeInstalledOthers1Textbox(String str) {
        ElementUtils.sendKeys(driver, equipmentTypeInstalledOthers1Textbox, str);
    }

    public void fillCoLocationSpaceWidth1Textbox(String str) {
        ElementUtils.sendKeys(driver, coLocationSpaceWidth1, str);
    }

    public void fillCoLocationSpaceWidth2Textbox(String str) {
        ElementUtils.sendKeys(driver, coLocationSpaceWidth2, str);
    }

    public void fillCoLocationSpaceDepth1Textbox(String str) {
        ElementUtils.sendKeys(driver, coLocationSpaceDepth1, str);
    }

    public void fillCoLocationSpaceDepth2Textbox(String str) {
        ElementUtils.sendKeys(driver, coLocationSpaceDepth2, str);
    }

    public boolean arePowerRequirementAcDropdown1ValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, powerRequirementAcDropdown1, DropDowns.coLocationService_powerRequirementAc);
    }

    public void selectPowerRequirementAcDropdown1(String valueToEnter) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, powerRequirementAcDropdown1, valueToEnter);
    }

    public void selectPowerRequirementAcDropdown2(String valueToSelect) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, powerRequirementAcDropdown2, valueToSelect);
    }

    public boolean isPowerRequirementAcQuantity2TextboxEnabled() {
        return ElementUtils.isEnabled(driver, powerRequirementAcQuantity2Textbox);
    }

    public void fillPowerRequirementAcQuantity2Textbox(String ValueToBeFilled) {
        ElementUtils.sendKeys(driver, powerRequirementAcQuantity2Textbox, ValueToBeFilled);
    }

    public boolean isPowerRequirementAcQuantity1TextboxEnabled() {
        return ElementUtils.isEnabled(driver, powerRequirementAcQuantity1Textbox);
    }

    public void fillPowerRequirementAcQuantity1Textbox(String ValueToBeFilled) {
        ElementUtils.sendKeys(driver, powerRequirementAcQuantity1Textbox, ValueToBeFilled);
    }

    public boolean arePowerRequirementDcDropdown1ValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, powerRequirementDcDropdown1, DropDowns.coLocationService_powerRequirementDc);
    }

    public void selectPowerRequirementDcDropdown1(String valueToSelect) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, powerRequirementDcDropdown1, valueToSelect);
    }

    public void selectPowerRequirementDcDropdown2(String valueToSelect) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, powerRequirementDcDropdown2, valueToSelect);
    }

    public boolean isPowerRequirementDcQuantity2TextboxEnabled() {
        return ElementUtils.isEnabled(driver, powerRequirementDcQuantity2Textbox);
    }

    public void fillPowerRequirementDcQuantity2Textbox(String valueToBeFilled) {
        ElementUtils.sendKeys(driver, powerRequirementDcQuantity2Textbox, valueToBeFilled);
    }

    public boolean isPowerRequirementDcQuantity1TextboxEnabled() {
        return ElementUtils.isEnabled(driver, powerRequirementDcQuantity1Textbox);
    }

    public void fillPowerRequirementDcQuantity1Textbox(String valueToBeFilled) {
        ElementUtils.sendKeys(driver, powerRequirementDcQuantity1Textbox, valueToBeFilled);
    }

    public boolean isPlusIconForRackDetailsIconEnabled() {
        return ElementUtils.isEnabled(driver, plusIconForRackDetailsIcon);
    }

    public void clickPlusIconForRackDetailsIcon() {
        ElementUtils.clickObject(driver, plusIconForRackDetailsIcon);
    }

    public String getTypeOfWorkLabel() {
        return ElementUtils.getText(driver, typeOfWorkLabel);
    }

    public boolean areTypeOfWorkDropdownValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, typeOfWorkDropdown, DropDowns.coLocationService_typeOfWork);
    }

    public void selectTypeOfWorkDropdown(String visibleText) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, typeOfWorkDropdown, visibleText);
    }

    public void clickDrillingCheckbox() {
        ElementUtils.clickObject(driver, drillingCheckbox);
    }

    public String getDrillingCheckboxLabel() {
        return ElementUtils.getText(driver, drillingCheckboxLabel);
    }

    public void clickCableTrayCheckbox() {
        ElementUtils.clickObject(driver, cableTrayCheckbox);
    }

    public String getCableTrayCheckboxLabel() {
        return ElementUtils.getText(driver, cableTrayCheckboxLabel);
    }

    public void clickEarthCabelCheckbox() {
        ElementUtils.clickObject(driver, earthCabelCheckbox);
    }

    public String getEarthCabelCheckboxLabel() {
        return ElementUtils.getText(driver, earthCabelCheckboxLabel);
    }

    public void clickOthersCheckbox() {
        ElementUtils.clickObject(driver, othersCheckbox);
    }

    public String getOthersCheckboxLabel() {
        return ElementUtils.getText(driver, othersCheckboxLabel);
    }

    public void fillOthersCheckboxDetails(String str) {
        ElementUtils.sendKeys(driver, othersCheckboxDetails, str);
    }

    public void fillRackIdTextbox1(String str) {
        ElementUtils.sendKeys(driver, rackIdTextbox1, str);
    }

    public void fillRackIdTextbox2(String str) {
        ElementUtils.sendKeys(driver, rackIdTextbox2, str);
    }

    public String getRackIdLabel() {
        return ElementUtils.getText(driver, rackIdLabel);
    }

    public void fillRackIdTextBox(String str) {
        ElementUtils.sendKeys(driver, rackIdTextBox, str);
    }

    public String getTieCableFibreCoresLabel() {
        return ElementUtils.getText(driver, tieCableFibreCoresLabel);
    }

    public String getTieCableFibreCoresTypeLabel() {
        return ElementUtils.getText(driver, tieCableFibreCoresTypeLabel);
    }

    public void selectTieCableFibreCoresTypeDropdown(String valueToSelect) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, tieCableFibreCoresTypeDropdown, valueToSelect);
    }

    public boolean areTieCableFibreCoresTypeDropdownValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, tieCableFibreCoresTypeDropdown, DropDowns.coLocationService_tieCableFibreCoresType);
    }

    public String getTieCableFibreCoresQuantityLabel() {
        return ElementUtils.getText(driver, tieCableFibreCoresQuantityLabel);
    }

    public void fillTieCableFibreCoresQuantityTextbox(String str) {
        ElementUtils.sendKeys(driver, tieCableFibreCoresQuantityTextbox, str);
    }

    public String getOduPortTypeLabel() {
        return ElementUtils.getText(driver, oduPortTypeLabel);
    }

    public void selectOduPortTypeDropdown(String valueToSelect) throws InterruptedException {
        ElementUtils.selectDropdownValue(driver, oduPortTypeDropdown, valueToSelect);
    }

    public boolean areOduPortTypeDropdownValuesCorrect() throws InterruptedException {
        return ElementUtils.verifyDropdownValues(driver, oduPortTypeDropdown, DropDowns.coLocationService_oduPortType);
    }

    public String getStartOfterminationLabel() {
        return ElementUtils.getText(driver, startOfterminationLabel);
    }

    public String getStartOftermination_shelfLabel() {
        return ElementUtils.getText(driver, startOftermination_shelfLabel);
    }

    public String getStartOftermination_portLabel() {
        return ElementUtils.getText(driver, startOftermination_portLabel);
    }

    public String getStartOftermination_fibreStrandLabel() {
        return ElementUtils.getText(driver, startOftermination_fibreStrandLabel);
    }

    public String getEndOfterminationLabel() {
        return ElementUtils.getText(driver, endOfterminationLabel);
    }

    public String getEndOftermination_shelfLabel() {
        return ElementUtils.getText(driver, endOftermination_shelfLabel);
    }

    public String getEndOftermination_portLabel() {
        return ElementUtils.getText(driver, endOftermination_portLabel);
    }

    public String getEndOftermination_fibreStrandLabel() {
        return ElementUtils.getText(driver, endOftermination_fibreStrandLabel);
    }

    public void fillStartOftermination_shelfTextbox(String str) {
        ElementUtils.sendKeys(driver, startOftermination_shelfTextbox, str);
    }

    public void fillStartOftermination_portTextbox(String str) {
        ElementUtils.sendKeys(driver, startOftermination_portTextbox, str);
    }

    public void fillStartOftermination_fibreStrandTextbox(String str) {
        ElementUtils.sendKeys(driver, startOftermination_fibreStrandTextbox, str);
    }

    public void fillEndOftermination_shelfTextbox(String str) {
        ElementUtils.sendKeys(driver, endOftermination_shelfTextbox, str);
    }

    public void fillEndOftermination_portTextbox(String str) {
        ElementUtils.sendKeys(driver, endOftermination_portTextbox, str);
    }

    public void fillEndOftermination_fibreStrandTextbox(String str) {
        ElementUtils.sendKeys(driver, endOftermination_fibreStrandTextbox, str);
    }
}
