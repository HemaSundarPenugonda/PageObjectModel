package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.CommonDataObject;
import com.amdocs.nlt.oders.UserDetailsObject;
import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class FibreTakeOverServicePage extends CommonComponentPage {

    public FibreTakeOverServicePage(WebDriver driver) {
        super(driver);
    }

    protected final By fibreTakeOverHeader = By.xpath("//h1[@data-qa='fibreTakeover-header']");
    protected final By reclassifyPopupHeader = By.xpath("//*[@data-qa='modal-heading']");

    public String getReclassifyPopupHeader() {
        return ElementUtils.getText(driver, reclassifyPopupHeader);
    }

    public String getHeader() {
        return driver.findElement(fibreTakeOverHeader).getText();
    }

    public void submitFeasibility(String schedule, String postalCode, String unitNumber) {
        ElementUtils.selectDropdownValue(driver, scheduleDropdownValue, schedule);
        ElementUtils.sendKeys(driver, postalCodeTextBox, postalCode);
        ElementUtils.sendKeys(driver, unitNumberTextBox, unitNumber);
        ElementUtils.clickObject(driver, feasibiltyChkButton);
    }

    public void fillEndUserDetailsForm() throws IOException {
        UserDetailsObject userDetails = new Utilities().prepareUserDetails();
        ElementUtils.selectDropdownValue(driver, salutationDropdown, userDetails.getSalutation());
        ElementUtils.sendKeys(driver, firstNameTextBox, userDetails.getFirstName());
        ElementUtils.sendKeys(driver, lastNameTextBox, userDetails.getLastName());
        if (isCompanyNameDisplayed())
            ElementUtils.sendKeys(driver, companyName, userDetails.getCompanyName());
        ElementUtils.sendKeys(driver, contactNumberTextBox, userDetails.getContactNumber());
        ElementUtils.sendKeys(driver, alternateContactNumberValue, userDetails.getAlternateContactNumber());
        ElementUtils.sendKeys(driver, emailAddTextBox, userDetails.getEmailAddress());
    }

    public void fillTimeSlotDetailsForm() throws InterruptedException {
        selectCalendarDate();
    }

    public void fillFibreTakeOverForm() throws InterruptedException, IOException {
        CommonDataObject userDetails = new Utilities().prepareCommonData();
        enterARI(userDetails.getApplicationReference_success());
        ElementUtils.selectDropdownValue(driver, existingRSPDropdown, "M1");
//        submitFeasibility("Schedule 1", "211111", "11-111");
        fillEndUserDetailsForm();
        fillTimeSlotDetailsForm();
        clickSubmitButton();
    }

}
