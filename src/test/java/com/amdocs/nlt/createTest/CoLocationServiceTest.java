package com.amdocs.nlt.createTest;

import com.amdocs.nlt.oders.CoLocationService;
import com.amdocs.nlt.page.CoLocationServicePage;
import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class CoLocationServiceTest extends CommonComponentPageTest {
    @Test
    public void testInputFields() throws InterruptedException {
        dashboardPage.clickOrderManagementLink().navigateToCoLocationService().navigateToCoLocationServiceLink();

        CoLocationServicePage page = new CoLocationServicePage(driver);
        Assert.assertEquals(page.getHeader(), "Request for Co-Location Service");
        Assert.assertEquals(page.getARILabel(), "Application Reference Identifier*");
        Assert.assertEquals(page.getCoLocationServiceDetailsSectionName(), "Co-Location Service Details");
        Assert.assertTrue(page.areCoLocationAddressDropdownValuesCorrect());
        Assert.assertEquals(page.getCoLocationRequestTypeLabel(), "Co-Location Request Type*");
        Assert.assertTrue(page.areCoLocationRequestTypeDropdownValuesCorrect());

        page.selectCoLocationRequestType("Co-location Space with Site Preparation");
        Assert.assertEquals(page.getTermOfLicenceLabel(), "Term of License Required*");
        Assert.assertTrue(page.areTermOfLicenceDropdownValuesCorrect());
        Assert.assertEquals(page.getRackDetailsSectionName(), "Rack Details");
//        Assert.assertTrue(page.areEquipmentTypeInstalledDropdownValuesCorrect());
        Assert.assertFalse(page.isEquipmentTypeInstalledOthers1TextboxEnabled());
//        Assert.assertTrue(page.arePowerRequirementAcDropdownValuesCorrect());
        Assert.assertFalse(page.isPowerRequirementAcQuantity1TextboxEnabled());
//        Assert.assertTrue(page.arePowerRequirementDcDropdownValuesCorrect());
        Assert.assertFalse(page.isPowerRequirementDcQuantity1TextboxEnabled());

        page.selectCoLocationRequestType("Site Preparation");
        Assert.assertEquals(page.getTypeOfWorkLabel(), "Type of Work to be Done*");
        Assert.assertTrue(page.areTypeOfWorkDropdownValuesCorrect());
        page.selectTypeOfWorkDropdown("General Site Preparation");
        Assert.assertEquals(page.getDrillingCheckboxLabel(), "Drilling");
        Assert.assertEquals(page.getCableTrayCheckboxLabel(), "Cable Tray, Cable Trunking, Cable Basket");
        Assert.assertEquals(page.getEarthCabelCheckboxLabel(), "Earth Cable");
        Assert.assertEquals(page.getOthersCheckboxLabel(), "Others");
        Assert.assertEquals(page.getRackDetailsSectionName(), "Rack Details");
        page.selectTypeOfWorkDropdown("Electrical Power");
        Assert.assertEquals(page.getRackDetailsSectionName(), "Rack Details");
        Assert.assertTrue(page.arePowerRequirementAcDropdown1ValuesCorrect());
//        Assert.assertTrue(page.isPowerRequirementAcQuantityTextboxEnabled());
//        Assert.assertTrue(page.arePowerRequirementDcDropdownValuesCorrect());
        Assert.assertFalse(page.isPowerRequirementDcQuantity1TextboxEnabled());

        page.selectCoLocationRequestType("Tie Fibre");
        Assert.assertEquals(page.getRackDetailsSectionName(), "Rack Details");
        Assert.assertEquals(page.getRackIdLabel(), "Rack ID*");
        Assert.assertEquals(page.getTieCableFibreCoresLabel(), "Tie Cable Fibre Cores*");
//        page.getTieCableFibreCoresTypeLabel();
        Assert.assertTrue(page.areTieCableFibreCoresTypeDropdownValuesCorrect());
//        page.getTieCableFibreCoresQuantityLabel();
        Assert.assertEquals(page.getOduPortTypeLabel(), "ODU Port Type(Optical Distribution Unit)");
//        Assert.assertTrue(page.areOduPortTypeDropdownValuesCorrect());
        Assert.assertEquals(page.getStartOfterminationLabel(), "Start of Termination*");
        Assert.assertEquals(page.getStartOftermination_shelfLabel(), "Shelf*");
        Assert.assertEquals(page.getStartOftermination_portLabel(), "Port*");
        Assert.assertEquals(page.getStartOftermination_fibreStrandLabel(), "Fibre Strand*");
        Assert.assertEquals(page.getEndOfterminationLabel(), "End of Termination*");
        Assert.assertEquals(page.getEndOftermination_shelfLabel(), "Shelf*");
        Assert.assertEquals(page.getEndOftermination_portLabel(), "Port*");
        Assert.assertEquals(page.getEndOftermination_fibreStrandLabel(), "Fibre Strand*");
    }

    @Test
    public void populateCoLocationService_CoLocationSpaceWithSitePreparation() throws InterruptedException, URISyntaxException, AWTException, IOException {
        dashboardPage.clickOrderManagementLink().navigateToCoLocationService().navigateToCoLocationServiceLink();

        CoLocationServicePage page = new CoLocationServicePage(driver);
        CoLocationService coLocationService = Utilities.prepareSchedule12Data();

        page.enterAmendARI(coLocationService.getApplicationReferenceIdentifier());
        page.selectCoLocationAddressDropdownDropdown(coLocationService.getCoLocationAddress());

        page.selectCoLocationRequestType("Co-location Space with Site Preparation");
        page.selectTermOfLicenceDropdown(coLocationService.getCoLocationSpaceWithSite_termOfLicenseRequired());

        page.selectEquipmentTypeInstalledDropdown1(coLocationService.getCoLocationSpaceWithSite_typeOfEquipmentInstalled1());
        if (!coLocationService.getCoLocationSpaceWithSite_typeOfEquipmentInstalled1_Others().equals(""))
            page.fillEquipmentTypeInstalledOthers1Textbox(coLocationService.getCoLocationSpaceWithSite_typeOfEquipmentInstalled1_Others());

        page.fillCoLocationSpaceWidth1Textbox(coLocationService.getCoLocationSpaceWithSite_coLocationSpaceWidth1());
        page.fillCoLocationSpaceDepth1Textbox(coLocationService.getCoLocationSpaceWithSite_coLocationSpaceDepth1());
        if (!coLocationService.getCoLocationSpaceWithSite_acPowerRequirement1().equals("Not Applicable")) {
            page.selectPowerRequirementAcDropdown1(coLocationService.getCoLocationSpaceWithSite_acPowerRequirement1());
            page.fillPowerRequirementAcQuantity1Textbox(coLocationService.getCoLocationSpaceWithSite_acPowerRequirementQuantity1());
        }
        if (!coLocationService.getCoLocationSpaceWithSite_dcPowerRequirement1().equals("Not Applicable")) {
            page.selectPowerRequirementDcDropdown1(coLocationService.getCoLocationSpaceWithSite_dcPowerRequirement1());
            page.fillPowerRequirementDcQuantity1Textbox(coLocationService.getCoLocationSpaceWithSite_dcPowerRequirementQuantity1());
        }

        page.clickPlusIconForRackDetailsIcon();

        page.selectEquipmentTypeInstalledDropdown2(coLocationService.getCoLocationSpaceWithSite_typeOfEquipmentInstalled2());
        if (!coLocationService.getCoLocationSpaceWithSite_typeOfEquipmentInstalled2_Others().equals(""))
            page.fillEquipmentTypeInstalledOthers2Textbox(coLocationService.getCoLocationSpaceWithSite_typeOfEquipmentInstalled2_Others());
        page.fillCoLocationSpaceWidth2Textbox(coLocationService.getCoLocationSpaceWithSite_coLocationSpaceWidth2());
        page.fillCoLocationSpaceDepth2Textbox(coLocationService.getCoLocationSpaceWithSite_coLocationSpaceDepth2());
        if (!coLocationService.getCoLocationSpaceWithSite_acPowerRequirement2().equals("Not Applicable")) {
            page.selectPowerRequirementAcDropdown2(coLocationService.getCoLocationSpaceWithSite_acPowerRequirement2());
            page.fillPowerRequirementAcQuantity2Textbox(coLocationService.getCoLocationSpaceWithSite_acPowerRequirementQuantity2());
        }
        if (!coLocationService.getCoLocationSpaceWithSite_dcPowerRequirement2().equals("Not Applicable")) {
            page.selectPowerRequirementDcDropdown2(coLocationService.getCoLocationSpaceWithSite_dcPowerRequirement2());
            page.fillPowerRequirementDcQuantity2Textbox(coLocationService.getCoLocationSpaceWithSite_dcPowerRequirementQuantity2());
        }

        ElementUtils.performFileUplaod(driver, coLocationService.getFileToBeUploaded());

        page.clickOnSubmitButton();

        testSuccessPage("The Co-Location Service request has been submitted successfully.");
    }

    @Test
    public void populateCoLocationService_SitePreparation_Genaral() throws InterruptedException, URISyntaxException, AWTException, IOException {
        dashboardPage.clickOrderManagementLink().navigateToCoLocationService().navigateToCoLocationServiceLink();

        CoLocationServicePage page = new CoLocationServicePage(driver);
        CoLocationService coLocationService = Utilities.prepareSchedule12Data();

        page.enterAmendARI(coLocationService.getApplicationReferenceIdentifier());
        page.selectCoLocationAddressDropdownDropdown(coLocationService.getCoLocationAddress());

        page.selectCoLocationRequestType("Site Preparation");
        page.selectTypeOfWorkDropdown("General Site Preparation");

        if (coLocationService.isGenaralSitePreparation_drillingCheckbox())
            page.clickDrillingCheckbox();
        if (coLocationService.isGenaralSitePreparation_cableTrayCheckbox())
            page.clickCableTrayCheckbox();
        if (coLocationService.isGenaralSitePreparation_earthCableCheckbox())
            page.clickEarthCabelCheckbox();
        if (coLocationService.isGenaralSitePreparation_othersCheckbox()) {
            page.clickOthersCheckbox();
            page.fillOthersCheckboxDetails(coLocationService.getGenaralSitePreparation_othersTextbox());
        }
        page.fillRackIdTextbox1(coLocationService.getGenaralSitePreparation_rackId1());
        page.clickPlusIconForRackDetailsIcon();
        page.fillRackIdTextbox2(coLocationService.getGenaralSitePreparation_rackId2());

        ElementUtils.performFileUplaod(driver, coLocationService.getFileToBeUploaded());

        page.clickOnSubmitButton();

        testSuccessPage("The Co-Location Service request has been submitted successfully.");
    }

    @Test
    public void populateCoLocationService_SitePreparation_ElectricalPower() throws InterruptedException, URISyntaxException, AWTException, IOException {
        dashboardPage.clickOrderManagementLink().navigateToCoLocationService().navigateToCoLocationServiceLink();

        CoLocationServicePage page = new CoLocationServicePage(driver);
        CoLocationService coLocationService = Utilities.prepareSchedule12Data();

        page.enterAmendARI(coLocationService.getApplicationReferenceIdentifier());
        page.selectCoLocationAddressDropdownDropdown(coLocationService.getCoLocationAddress());

        page.selectCoLocationRequestType("Site Preparation");
        page.selectTypeOfWorkDropdown("Electrical Power");

        page.fillRackIdTextbox1(coLocationService.getElectricalPower_rackId1());
        if (!coLocationService.getElectricalPower_acPowerRequirement1().equals("Not Applicable")) {
            page.selectPowerRequirementAcDropdown1(coLocationService.getElectricalPower_acPowerRequirement1());
            page.fillPowerRequirementAcQuantity1Textbox(coLocationService.getElectricalPower_acPowerRequirementQuantity1());
        }
        if (!coLocationService.getElectricalPower_dcPowerRequirement1().equals("Not Applicable")){
            page.selectPowerRequirementDcDropdown1(coLocationService.getElectricalPower_dcPowerRequirement1());
            page.fillPowerRequirementDcQuantity1Textbox(coLocationService.getElectricalPower_dcPowerRequirementQuantity1());
        }

        page.clickPlusIconForRackDetailsIcon();

        page.fillRackIdTextbox2(coLocationService.getElectricalPower_rackId2());
        if (!coLocationService.getElectricalPower_acPowerRequirement2().equals("Not Applicable")) {
            page.selectPowerRequirementAcDropdown2(coLocationService.getElectricalPower_acPowerRequirement2());
            page.fillPowerRequirementAcQuantity2Textbox(coLocationService.getElectricalPower_acPowerRequirementQuantity2());
        }
        if (!coLocationService.getElectricalPower_dcPowerRequirement2().equals("Not Applicable")){
            page.selectPowerRequirementDcDropdown2(coLocationService.getElectricalPower_dcPowerRequirement2());
            page.fillPowerRequirementDcQuantity2Textbox(coLocationService.getElectricalPower_dcPowerRequirementQuantity2());
        }

        ElementUtils.performFileUplaod(driver, coLocationService.getFileToBeUploaded());

        page.clickOnSubmitButton();

        testSuccessPage("The Co-Location Service request has been submitted successfully.");
    }

    @Test
    public void populateCoLocationService_TieFibre() throws InterruptedException, URISyntaxException, AWTException, IOException {
        dashboardPage.clickOrderManagementLink().navigateToCoLocationService().navigateToCoLocationServiceLink();

        CoLocationServicePage page = new CoLocationServicePage(driver);
        CoLocationService coLocationService = Utilities.prepareSchedule12Data();

        page.enterAmendARI(coLocationService.getApplicationReferenceIdentifier());
        page.selectCoLocationAddressDropdownDropdown(coLocationService.getCoLocationAddress());

        page.selectCoLocationRequestType("Tie Fibre");

        page.fillRackIdTextBox(coLocationService.getTieFibre_rackID());
        page.selectTieCableFibreCoresTypeDropdown(coLocationService.getTieFibre_fibreCores_Type());
        page.fillTieCableFibreCoresQuantityTextbox(coLocationService.getTieFibre_fibreCores_Quantity());

        page.fillStartOftermination_shelfTextbox(coLocationService.getTieFibre_startOfTermination_shelf());
        page.fillStartOftermination_portTextbox(coLocationService.getTieFibre_startOfTermination_port());
        page.fillStartOftermination_fibreStrandTextbox(coLocationService.getTieFibre_startOfTermination_fibreStrand());

        page.fillEndOftermination_shelfTextbox(coLocationService.getTieFibre_endOfTermination_shelf());
        page.fillEndOftermination_portTextbox(coLocationService.getTieFibre_endOfTermination_port());
        page.fillEndOftermination_fibreStrandTextbox(coLocationService.getTieFibre_endOfTermination_fibreStrand());

        ElementUtils.performFileUplaod(driver, coLocationService.getFileToBeUploaded());

        page.clickOnSubmitButton();

        testSuccessPage("The Co-Location Service request has been submitted successfully.");
    }
}
