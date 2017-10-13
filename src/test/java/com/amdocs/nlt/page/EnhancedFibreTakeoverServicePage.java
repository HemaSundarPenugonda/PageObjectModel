package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.CommonDataObject;
import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class EnhancedFibreTakeoverServicePage extends FibreTakeOverServicePage {
    public EnhancedFibreTakeoverServicePage(WebDriver driver) {
        super(driver);
    }

    protected final By enhancedFibreTakeoverHeader = By.xpath("//*[@data-qa='fibreTakeoverEnhance-header']");
    protected final By newARITextbox = By.xpath("//*[@data-qa='fto_enhanced_ari_input']");
    protected final By uploadReqDocsLabel = By.xpath("//*[@data-qa='file_input_label']");
    protected final By browseAndUploadButton = By.xpath("//*[@data-qa='fileBrowseUpload_data_qa']");
    protected final By totalUploadedFiles = By.xpath("//*[@data-qa='files']");

    public String getHeader() {
        return ElementUtils.getText(driver, enhancedFibreTakeoverHeader);
    }

    public boolean isUploadedFilesDisplayed() {
        return ElementUtils.isDisplayed(driver, totalUploadedFiles);
    }

    public void fillEnhancedFibreTakeOverForm() throws InterruptedException, IOException, URISyntaxException, AWTException {
        CommonDataObject userDetails = new Utilities().prepareCommonData();
        enterARI(userDetails.getApplicationReference_success());
        ElementUtils.selectDropdownValue(driver, existingRSPDropdown, "ViewQwest");
        fillEndUserDetailsForm();

        ElementUtils.performFileUplaod(driver, "Nbap.pdf");
        Thread.sleep(1000);

        fillTimeSlotDetailsForm();
        //Code for uploading files
        clickSubmitButton();
    }

    public boolean isNewAriTextboxEnabled() {
        return ElementUtils.isEnabled(driver, newARITextbox);
    }

    public void enterARI(String val) {
         ElementUtils.sendKeys(driver, newARITextbox, val);
    }

    public String getUploadReqDocsLabel() {
        return ElementUtils.getText(driver, uploadReqDocsLabel);
    }

    public boolean isBrowseAndUploadButtonEnabled() {
        return ElementUtils.isEnabled(driver, browseAndUploadButton);
    }

    public void clickBrowseAndUploadButton() {
        ElementUtils.clickObject(driver, browseAndUploadButton);
        ;
    }
}
