package com.amdocs.nlt.createTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.ResidentailOrderPage;

public class ResidentialOrderPageTest extends CommonComponentPageTest {

    private ResidentailOrderPage getOrderPage() {
        ResidentailOrderPage order = new ResidentailOrderPage(driver);
        return order;
    }

    @Test(enabled = false)
    public void testFeasibiltyCheckFunc() throws InterruptedException, IOException {
        ResidentailOrderPage order = getOrderPage();
        // order.login();
        // This assertion check postal code field is mandatory
        Assert.assertEquals(order.getPostalcodeLabel(), "Postal Code*", "Text should be Postal code but it is not");
		/*
		 * Assert.assertEquals(order.getMandatroyFieldLabel()
		 * ,"Mandatory Fields",
		 * "Text should be *Mandatory Field  but it is not");
		 */
        Assert.assertEquals(order.getPalceHolderText_PostalcodeField(), "Postal Code",
                "placeholder text for field" + " postal code should be present  but it is not");
        // This assertion check postal code field is mandatory
        Assert.assertEquals(order.getUnitNumLabel(), "Unit Number*", "Text shouold be Unit Number but it is not");
        Assert.assertEquals(order.getPalceHolderText_UnitNumberField(), "Unit Number",
                "placeholder text for field " + "Unit number should be present but it is not");
        Assert.assertEquals(order.getPalceHolderText_ARIField(), "Application Reference Identifier",
                "placeholder text for" + " field ARI should be present but it is not");
        Assert.assertEquals(order.getFeasibiltiyCheckLabel(), "Feasibility Check",
                "Label should be Feasibility Check but it is not ");
    }

    @Test(enabled = false)
    public void testResdentialUserDetailFunc() throws InterruptedException, IOException {
        ResidentailOrderPage order = getOrderPage();
        Assert.assertEquals(order.getCoverageStatusLabel(), "Coverage Status",
                "For Residential User Details component:Label Coverage Status " + "should be present but it is not ");
        Assert.assertEquals(order.getBuildingNumberLabel(), "Building Number",
                "For Residential User Details component:Label Building Number* " + "should be present but it is not");
        Assert.assertEquals(order.getBuildingNameLabel(), "Building Name",
                "For Residential User Details component:Label Building Name " + "should be present but it is not");
        Assert.assertEquals(order.getStreetNameLabel(), "Street Name",
                "For Residential User Details component:Label Street Name " + "should be present but it is not");
        Assert.assertEquals(order.getBuildingTypeLabel(), "Building Type",
                "For Residential User Details component:Label Building Type " + "should be present but it is not");
        Assert.assertTrue(order.isBuildingTypeTextboxdDisplayed(),
                "Building Type text box should   be displayed but it is not");
        Assert.assertTrue(order.isStreetNameTextboxPresent(),
                "Street Name text box should   be displayed but it is not");
        Assert.assertEquals(order.getInstallationChargeLabel(), "Installation Charge",
                "For Residential User Details component:Label Installation Charge "
                        + "should be present but it is not");
        Assert.assertEquals(order.getServiceActivationChargeLabel(), "Service Activation Charge",
                "For Residential User Details component:Label Installation Charge "
                        + "should be present but it is not");
        Assert.assertEquals(order.getSalutationLabel(), "Salutation*",
                "For Residential User Details component:Label Salutation* " + "should be present but it is not");
        Assert.assertEquals(order.getFirstNameLabel(), "First Name*",
                "For Residential User Details component:Label First Name* " + "should be present but it is not");
        Assert.assertEquals(order.getLastNameLabel(), "Last Name*",
                "For Residential User Details component:Label Last Name* " + "should be present but it is not");
        Assert.assertEquals(order.getContactNumberLabel(), "Contact Number*",
                "For Residential User Details component:Label Contact Number* " + "should be present but it is not");
        Assert.assertEquals(order.getAlternateContactNumberLabel(), "Alternate Contact Number",
                "For Residential User Details component:Label Alternate Contact Number "
                        + "should be present but it is not");
        Assert.assertEquals(order.getCopifTypelabel(), "COPIF Type",
                "For Residential User Details component:Label COPIF Type " + "should be present but it is not");
        Assert.assertEquals(order.getEmailAddressLabel(), "Email Address*",
                "For Residential User Details component:Label Email Address* " + "should be present but it is not");
        Assert.assertEquals(order.getCoverageStatusValue(), "Home Passed",
                "For Residential User Details component: the value of coverage status "
                        + "should be Home Passed but it is not");
        Assert.assertTrue(order.areSalutationDropDownValuesCorrect(), "values should match but they are not matching ");

        Assert.assertEquals(order.getDefaultValueForSalutationDropdown(), "Select",
                "default value should be Selected but it is not");

    }

}