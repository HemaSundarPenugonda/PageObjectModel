package com.amdocs.nlt.page;

import com.amdocs.nlt.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NonResiReclassifyPagePage extends NonResidentialEndUserConnectionPage {
    public NonResiReclassifyPagePage(WebDriver driver) {
        super(driver);
    }

    protected final By uploadDocumentsSection = By.xpath("//*[@data-qa='file_upload_in_reclassify']");
    protected final By uploadReqDocumentsLabel = By.xpath("//*[@data-qa='file_input_label']");
    protected final By browseAndUploadButton = By.xpath("//*[@data-qa='fileBrowseUpload_data_qa']");
    protected final By submitUploadedFilesButton = By.xpath("//*[@data-qa='upload_submit_btn']");
    protected final By noteMessage = By.xpath("//*[contains(@class, 'NonResEndUser__marginLeft30')]/div");
    protected final By fileUploadSuccessfulMessage = By.xpath("//*[contains(@class, 'NonResEndUser__submit_success_msg')]");
    protected final By reclassifyButton = By.xpath("//*[@data-qa='yes-button']");

    public void clickReclassifyButton() {
        ElementUtils.clickObject(driver, reclassifyButton);
    }

    public String getUploadDocumentsSectionText() {
        return ElementUtils.getText(driver, uploadDocumentsSection);
    }

    public boolean isUploadDocumentsSectionDisplayed() {
        return ElementUtils.isDisplayed(driver, uploadDocumentsSection);
    }

    public String getUploadReqDocumentsLabel() {
        return ElementUtils.getText(driver, uploadReqDocumentsLabel);
    }

    public boolean isBrowseAndUploadButtonEnabled() {
        return ElementUtils.isEnabled(driver, browseAndUploadButton);
    }

    public boolean isBrowseAndUploadButtonDisplayed() {
        return ElementUtils.isDisplayed(driver, browseAndUploadButton);
    }

    public void clickBrowseAndUploadButton() {
        ElementUtils.clickObject(driver, browseAndUploadButton);
    }

    public boolean isSubmitUploadedFilesButtonEnabled() {
        return ElementUtils.isEnabled(driver, submitUploadedFilesButton);
    }

    public boolean isSubmitUploadedFilesButtonDisplayed() {
        return ElementUtils.isDisplayed(driver, submitUploadedFilesButton);
    }

    public void clickSubmitUploadedFilesButton() {
        ElementUtils.clickObject(driver, submitUploadedFilesButton);
    }

    public String getNoteMessage() {
        return ElementUtils.getText(driver, noteMessage);
    }

    public String getFileUploadSuccessfulMessage() {
        return ElementUtils.getText(driver, fileUploadSuccessfulMessage);
    }

    public void submitFeasibility(String postalCode, String unitNumber) {
        enterPostalCode(postalCode);
        enterUnitNumber(unitNumber);
        ElementUtils.clickObject(driver, feasibiltyChkButton);
    }

    public void navigateToReclassifyPage() {
        submitFeasibility("571111", "11-111");
        clickReclassifyButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickFeasibilityButton();
    }
}
