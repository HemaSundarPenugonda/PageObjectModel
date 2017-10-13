package com.amdocs.nlt.createTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.nlt.page.NonResidentialEndUserConnectionPage;

public class NonresidentialOrderTest extends CommonComponentPageTest {

    @Test(enabled = false)
    public void TestFeasiblityCheckComponent() throws InterruptedException {
        NonResidentialEndUserConnectionPage nonResiOrder = new NonResidentialEndUserConnectionPage(driver);

        Assert.assertEquals(nonResiOrder.getPostalcodeLabel(), "Postal Code*",
                "Text should be Postal code but it is not");
        Assert.assertEquals(nonResiOrder.getPalceHolderText_PostalcodeField(), "Postal Code",
                "placeholder text for field" + " postal code should be present  but it is not");
        // This assertion check postal code field is mandatory
        Assert.assertEquals(nonResiOrder.getUnitNumLabel(), "Unit Number*",
                "Text shouold be Unit Number but it is not");
        Assert.assertEquals(nonResiOrder.getPalceHolderText_UnitNumberField(), "Unit Number",
                "placeholder text for field " + "Unit number should be present but it is not");
        Assert.assertEquals(nonResiOrder.getInstalltionOptionLabel(), "Unit Number",
                "placeholder text for field " + "Unit number should be present but it is not");
        Assert.assertEquals(nonResiOrder.getInstallationOptionDropdownValuesCount(), "3",
                "" + "Total dropdown count should be  3 but it is not");
        Assert.assertEquals(nonResiOrder.getFeasibiltiyCheckLabel(), "Feasibility Check",
                "Label should be FEASIBLITY CHECK but it is not ");

    }
}