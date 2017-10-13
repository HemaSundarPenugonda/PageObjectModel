package com.amdocs.nlt.viewtest;

import com.amdocs.nlt.page.NonResiReclassifyPagePage;
import com.amdocs.nlt.util.ElementUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.URISyntaxException;

public class NonResiReclassifyTest extends CommonViewTest {

    @Test(enabled = true)
    public void testFileUploadFunc_positive() throws InterruptedException, AWTException, URISyntaxException {
        testFileUploadFunc("Nbap.pdf", "Nbap.pdf", "Nbap.pdf", true);
    }

    @Test(enabled = true)
    public void testFileUploadFunc_Negative() throws InterruptedException, AWTException, URISyntaxException {
        testFileUploadFunc("README.md", "README.md", "README.md", false);
    }

    private void testFileUploadFunc(String file1, String file2, String file3, boolean isSunnyDay) throws InterruptedException, URISyntaxException, AWTException {
        dashboardPage = dashboardPage.clickOrderManagementLink().clikNonResiLink();
        NonResiReclassifyPagePage page = new NonResiReclassifyPagePage(driver);
        page.navigateToReclassifyPage();
        dashboardPage.navigateToViewUrl_TrueFileUpload();

        Assert.assertEquals(page.getUploadDocumentsSectionText(), "Upload Documents");
        Assert.assertEquals(page.getUploadReqDocumentsLabel(), "Upload Required Documents*");
        Assert.assertEquals(page.getNoteMessage(), "Note: You need to upload three documents before submitting the request.");
        Assert.assertFalse(page.isSubmitUploadedFilesButtonEnabled());

        ElementUtils.performFileUplaod( driver, file1);
        Thread.sleep(1000);

        ElementUtils.performFileUplaod(driver, file2);
        Thread.sleep(1000);

        ElementUtils.performFileUplaod(driver, file3);
        Thread.sleep(2000);
        if (isSunnyDay) {
//        Assert.assertFalse(page.isBrowseAndUploadButtonEnabled());
            page.clickSubmitUploadedFilesButton();
            Thread.sleep(5000);
            Assert.assertFalse(page.isBrowseAndUploadButtonDisplayed());

            Assert.assertFalse(page.isSubmitUploadedFilesButtonDisplayed());

            Assert.assertEquals(page.getFileUploadSuccessfulMessage(), "Files have been uploaded successfully.");
        } else {
            Assert.assertFalse(page.isSubmitUploadedFilesButtonEnabled());
        }
    }
}
