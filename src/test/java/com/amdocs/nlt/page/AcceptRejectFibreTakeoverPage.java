package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.DropDowns;
import com.amdocs.nlt.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcceptRejectFibreTakeoverPage extends FibreTakeOverServicePage {
    public AcceptRejectFibreTakeoverPage(WebDriver driver) {
        super(driver);
    }

    protected final By acceptButton = By.xpath("//button[@data-qa='accept_button']");
    protected final By rejectButton = By.xpath("//button[@data-qa='reject_button']");
    protected final By takeOverAccordionHeading = By.xpath("//div[@data-qa='takeover_accordion_heading']");
    protected final By takeOverMessage = By.xpath("//*[@data-qa='takeover_message']");
    protected final By takeOverDateLabel = By.xpath("(//*[@data-qa='activation_date_label'])[2]");
    protected final By takeOverDateTextbox = By.xpath("//*[@id='daypicker_rfa']");
    protected final By takeOverTimeLabel = By.xpath("(//*[@data-qa='installation_session_label'])[2]");
    protected final By takeOverTimeDropdown = By.xpath("//*[@id='timepicker']");
    protected final By approveByDateLabel = By.xpath("(//*[@data-qa='activation_date_label'])[3]");
    protected final By approveByDateTextbox = By.xpath("//*[@id='daypicker_rfa']");
    protected final By popUpHeading = By.xpath("//*[@data-qa='modal-heading']");
    protected final By noButtonOnPopup = By.xpath("//*[@data-qa='no-button']");
    protected final By yesButtonOnPopup = By.xpath("//*[@data-qa='yes-button']");
    protected final By approveMessage = By.xpath("//*[@data-qa='takeover_approve_success']");
    protected final By rejectReasonDropdown = By.xpath("//*[@data-qa='reasonSelector']");
    protected final By rejectMessage = By.xpath("//*[@data-qa='takeover_reject_success']");
//    protected final By rejectReasonMessage = By.xpath("//*[@data-qa='takeover_rejection_reason']/div");
    protected final By rejectReasonMessage = By.xpath("//*[@data-qa='takeover-rejection-reason']/following-sibling::div");
    protected final By takeOverStatus = By.xpath("//*[@data-qa='takeover-status']");

    public String getTakeOverStatus() {
        return ElementUtils.getText(driver, takeOverStatus);
    }

    public String getRejectMessage() {
        return ElementUtils.getText(driver, rejectMessage);
    }

    public String getRejectReasonMessage() {
        return ElementUtils.getText(driver, rejectReasonMessage);
    }

    public boolean areRejectReasonDropDownValuesCorrect() throws InterruptedException {
        WebElement rejectReasonDropdownElement = driver.findElement(rejectReasonDropdown);
        return ElementUtils.verifyDropdownValues(rejectReasonDropdownElement, DropDowns.FTO_rejectReasonDropdownValues);
    }

    public void selectRejectReasonValue_DiffSubscriber() {
        ElementUtils.selectDropdownValue(driver, rejectReasonDropdown, "Different Subscriber Name");
    }

    public void selectRejectReasonValue(String val) {
        ElementUtils.selectDropdownValue(driver, rejectReasonDropdown, val);
    }

    public void selectRejectReasonValue_ServiveValid() {
        ElementUtils.selectDropdownValue(driver, rejectReasonDropdown, "Service still valid");
    }

    public void selectRejectReasonValue_Others() {
        ElementUtils.selectDropdownValue(driver, rejectReasonDropdown, "Others");
    }

    public String getPopupHeading() {
        return ElementUtils.getText(driver, popUpHeading);
    }

    public boolean isYesButtonEnabled() {
        return ElementUtils.isEnabled(driver, yesButtonOnPopup);
    }

    public boolean isNoButtonEnabled() {
        return ElementUtils.isEnabled(driver, noButtonOnPopup);
    }

    public void clickYesButtonOnPopup() {
        ElementUtils.clickObject(driver, yesButtonOnPopup);
    }

    public void clickNoButtonOnPopup() {
        ElementUtils.clickObject(driver, noButtonOnPopup);
    }

    public String getApproveMessage() {
        return ElementUtils.getText(driver, approveMessage);
    }

    public boolean isApproveMessageDisplayed() {
        return ElementUtils.isDisplayed(driver, approveMessage);
    }

    public boolean isAcceptButtonEnabled() {
        return ElementUtils.isEnabled(driver, acceptButton);
    }

    public void clickAcceptButton() {
        ElementUtils.clickObject(driver, acceptButton);
    }

    public boolean isRejectButtonEnabled() {
        return ElementUtils.isEnabled(driver, rejectButton);
    }

    public void clickRejectButton() {
        ElementUtils.clickObject(driver, rejectButton);
    }

    public String getTakeOverAccordionText() {
        return ElementUtils.getText(driver, takeOverAccordionHeading);
    }

    public boolean isTakeOverAccordionDisplayed() {
        return ElementUtils.isDisplayed(driver, takeOverAccordionHeading);
    }

    public String getTakeOverMessage() {
        return ElementUtils.getText(driver, takeOverMessage);
    }

    public String getTakeOverDateLabelText() {
        return ElementUtils.getText(driver, takeOverDateLabel);
    }

    public boolean isTakeOverDateTextboxDisplayed() {
        return ElementUtils.isDisplayed(driver, takeOverDateTextbox);
    }

    public boolean isTakeOverDateTextboxEnabled() {
        return ElementUtils.isEnabled(driver, takeOverDateTextbox);
    }

    public String getTakeOverTimeLabelText() {
        return ElementUtils.getText(driver, takeOverTimeLabel);
    }

    public boolean isTakeOverTimeDropdownDisplayed() {
        return ElementUtils.isDisplayed(driver, takeOverTimeDropdown);
    }

    public boolean isTakeOverTimeDropdownEnabled() {
        return ElementUtils.isEnabled(driver, takeOverTimeDropdown);
    }

    public String getApproveByDateLabelText() {
        return ElementUtils.getText(driver, approveByDateLabel);
    }

    public boolean isApproveByDateTextboxDisplayed() {
        return ElementUtils.isDisplayed(driver, approveByDateTextbox);
    }

    public boolean isApproveByDateTextboxEnabled() {
        return ElementUtils.isEnabled(driver, approveByDateTextbox);
    }
}
