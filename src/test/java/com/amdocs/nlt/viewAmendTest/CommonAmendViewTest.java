package com.amdocs.nlt.viewAmendTest;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.viewpages.CommonViewPage;
import com.amdocs.nlt.viewtest.CommonViewTest;
import org.testng.Assert;

public class CommonAmendViewTest extends CommonViewTest {

    void testUserDetails() {
        CommonViewPage viewPage = new CommonViewPage(driver);

        Assert.assertEquals(viewPage.getSalutationLabel(), "Salutation", "Salutation Label should present but it is not");
        Assert.assertEquals(viewPage.getFirstNameLabel(), "First Name", "First Name Label should present but it is not");
        Assert.assertEquals(viewPage.getLastNameLabel(), "Last Name", "Last Name Label should present but it is not");
        Assert.assertEquals(viewPage.getContactNumberLabel(), "Contact Number", "Contact Number Label should present but it is not");
        Assert.assertEquals(viewPage.getAltNumberLabel(), "Alternate Contact Number", "Alternate Contact Number Label should present but it is not");
        Assert.assertEquals(viewPage.getEmailAddressLabel(), "Email Address", "Email Address Label should present but it is not");

        Assert.assertFalse(viewPage.isUserDetailsCompanyNameLabelDisplayed());

    }

    void testUserDetailsWithCompanyName() {
        CommonViewPage viewPage = new CommonViewPage(driver);

        Assert.assertEquals(viewPage.getSalutationLabel(), "Salutation", "Salutation Label should present but it is not");
        Assert.assertEquals(viewPage.getFirstNameLabel(), "First Name", "First Name Label should present but it is not");
        Assert.assertEquals(viewPage.getLastNameLabel(), "Last Name", "Last Name Label should present but it is not");
        Assert.assertEquals(viewPage.getContactNumberLabel(), "Contact Number", "Contact Number Label should present but it is not");
        Assert.assertEquals(viewPage.getAltNumberLabel(), "Alternate Contact Number", "Alternate Contact Number Label should present but it is not");
        Assert.assertEquals(viewPage.getEmailAddressLabel(), "Email Address", "Email Address Label should present but it is not");
        Assert.assertEquals(viewPage.getUserDetailsCompanyNameLabel(), "Company Name", "Company Name Label should present but it is not");
    }

    void testRequestedDateTimeSlotSection(CommonComponentPage manageTpByAddresViewPage) {
        Assert.assertEquals(manageTpByAddresViewPage.getRequestedDateTimeSlotLabel(), "Requested Date & Time Slot",
                "Requested Date & Time Slot Label should present but it is not");
        Assert.assertEquals(manageTpByAddresViewPage.getReqDateOfActLabel(), "Requested Date of Activation",
                "Requested Date of Activation Label should present but it is not");
        Assert.assertEquals(manageTpByAddresViewPage.getPrefInstallLabel(), "Preferred Installation Session",
                "Preferred Installation Session Label should present but it is not");
    }

}
