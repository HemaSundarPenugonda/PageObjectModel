package com.amdocs.nlt.page;

import com.amdocs.nlt.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessPage extends CommonComponentPage {
    public SuccessPage(WebDriver driver) {
        super(driver);
    }

    protected final By confirmationMessage = By.xpath("//h1[@data-qa='confirmation_header']");
    protected final By oriLabel = By.xpath("//label[@data-qa='ori_label']");
    protected final By oriValue = By.xpath("//label[@data-qa='ori_label']/following-sibling::p");
    protected final By goToDashBoard = By.xpath("//a[span='Go To Dashboard']");

    public String getConfirmationMessage() {
        return ElementUtils.getText(driver, confirmationMessage);
    }

    public boolean isOriLabelDisplayed() {
        return ElementUtils.isDisplayed(driver, oriLabel);
    }

    public boolean isOriValueDisplayed() {
        return ElementUtils.isDisplayed(driver, oriValue);
    }

    public boolean isGoToDashBoardClickable() {
        return ElementUtils.isClickable(driver, goToDashBoard);
    }
    
    protected final By nltIncidentId = By.xpath("//*[@data-qa='incident_label']");
    protected final By opcoIncidentId = By.xpath("//*[@data-qa='opco_label']");
    
    public boolean isnltIncidentIdDisplayed() {
        return ElementUtils.isDisplayed(driver, nltIncidentId);
    }
    
    public boolean isOpcoIncidentIdDisplayed() {
        return ElementUtils.isDisplayed(driver, opcoIncidentId);
    }
    
    public String getNLTIncidentTicketIDLabel(){
    	return ElementUtils.getText(driver, nltIncidentId);	
    }
    
    public String getOpcoIncidentTicketIDLabel(){
    	return ElementUtils.getText(driver, opcoIncidentId);
    }
    
}
