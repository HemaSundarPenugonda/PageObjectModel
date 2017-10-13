package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.ManageTPRRRObject;
import com.amdocs.nlt.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageTpRrrPage extends CommonComponentPage {
    public ManageTpRrrPage(WebDriver driver) {
        super(driver);
    }

    private final By header = By.xpath("//h1[@data-qa='ManageTPbrRRR-header']");

    public String getHeader() {
        return ElementUtils.getText(driver, header);
    }

    public ManageTPRRRObject fillManageTPRRRObject() {

        //Postal code and Unit number
        ManageTPRRRObject.Builder builder = new ManageTPRRRObject.Builder(ElementUtils.getSelectedValue(driver, scheduleNameDropdown), ElementUtils.getValue(driver, postalCodeTextBox), ElementUtils.getValue(driver, unitNumberTextBox));
        //End user installation details
        builder = builder.buildingNumber(getBuildingNumberValue())
                .buildingName(getBuildingNameValue())
                .streetName(getStreetNameValue())
//				.buildingType(getBuildingType()) Commented becvause of bug
//				.copifType(getCopifType()) Commented becvause of bug
                .salutation(ElementUtils.getSelectedValue(driver, salutationDropdown))
                .firstName(ElementUtils.getValue(driver, firstNameTextBox))
                .lastName(ElementUtils.getValue(driver, lastNameTextBox))
                .contactNumber(ElementUtils.getValue(driver, contactNumberTextBox))
                .alternateContactNumber(ElementUtils.getValue(driver, alternateContactNumberValue))
                .emailAddress(ElementUtils.getValue(driver, emailAddTextBox))
                .idType(ElementUtils.getSelectedValue(driver, idTypeDropdown))
                .idNumber(ElementUtils.getValue(driver, idNumberTextBox));
        if (isCompanyNameDisplayed()) {
            builder = builder.companyName(getCompanyName());
        }
        if (isBillingCompanyNameDisplayed()) {
            builder = builder.billingCompanyName(getBillingCompanyName());
        }
        builder = builder.requestedDateOfActivation(ElementUtils.getValue(driver, reqDateOfActTextbox))
                .preferredInstallationSession(ElementUtils.getSelectedValue(driver, prefInstallSessionDropdown));
        //End user billing details
        builder = builder.billingPostalCode(ElementUtils.getValue(driver, billingPostalCode))
                .billingUnitNumber(ElementUtils.getValue(driver, billingUnitNumber))
                .billingBuildingNumber(ElementUtils.getValue(driver, billingBuildingNumber))
                .billingBuildingName(ElementUtils.getValue(driver, billingBuildingName))
                .billingStreetName(ElementUtils.getValue(driver, billingStreetName))
//				.billingBuildingType(getSelectedValue(billingBuildingType)) Commented becvause of bug
                .billingSalutation(ElementUtils.getSelectedValue(driver, billingSalutation))
                .billingFirstName(ElementUtils.getValue(driver, billingFirstName))
                .billingLastName(ElementUtils.getValue(driver, billingLastName))
                .billingContactNumber(ElementUtils.getValue(driver, billingContactNumber))
                .billingAlternateContactNumber(ElementUtils.getValue(driver, billingAlternateContactNumber))
                .billingEmailAddress(ElementUtils.getValue(driver, billingEmailAddress));

        ManageTPRRRObject order = builder.build();

        return order;


    }
}
