package com.amdocs.nlt.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonAmendPage extends CommonComponentPage {
    public CommonAmendPage(WebDriver driver) {
        super(driver);
    }

    private final By submitAmendButton = By.xpath("//button[@data-qa='modify_button']");

    public void navigateToAmendPage() {
        driver.findElement(submitAmendButton).click();
    }
}
