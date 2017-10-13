
package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.util.ElementUtils;

public class CommonCancelPage extends CommonViewPage {

	public CommonCancelPage(WebDriver driver) {
		super(driver);
	}

	private final By exitingConnectionDetaillabel = By.xpath("//div[@data-qa='existing_connection_details_widget']");
	private final By oRILabel = By.xpath("//label[@data-qa='order_request_identifier_label']");
	private final By oRIValueLabel = By.xpath("//label[@data-qa='ori_value_label']");
	private final By aRILabel = By.xpath("//label[@data-qa='application_reference_identifier_label']");
	private final By aRIValueLabel = By.xpath("//label[@data-qa='ari_value_label']");
	private final By yesButtton = By.xpath("//*[@data-qa='yes-button']");
	private final By noButton = By.xpath("//*[@data-qa='no-button']");
	private final By confirmationPopup = By.xpath("//div[@class='modal-content']");
	private final By crossButtonInPopup = By.xpath("//button[@class='close']");
	private final By PopupHeaderText = By.xpath("//*[@data-qa='modal-heading']");
	private final By PopupHeaderMessage = By.xpath("//div[@data-qa='modal-body']");

	public void populateCancelOderForm() throws InterruptedException {
		if(isARILabelDisplayed())
			enterAmendARI("8239217");
	}

	public boolean isCancelPopupPresent() throws InterruptedException {
		populateCancelOderForm();
		clickOnSubmitButton();
		return isConfirmationPopupDisplayed();
	}

	public boolean isYesButtonPresentInCancelPopup() {
		return ElementUtils.isDisplayed(driver, yesButtton);
	}

	public boolean isNoButtonPresentInCancelPopup() {
		return ElementUtils.isDisplayed(driver, noButton);
	}

	public void clickNoButtonOnCancelPopup() {
		ElementUtils.clickObject(driver, noButton);
	}

	public boolean isCancelPopupDisappearsWhenUserClicksOnNoButton() {
		clickNoButtonOnCancelPopup();
		if (waitForPopupNotDisplayed() && isSubmitRequestButtonEnabled())
			return true;
		return false;
	}

	public boolean isCrossButtonPresentInCancelPopup() throws InterruptedException {
		clickOnSubmitButton();
		return isSubmitRequestButtonDisplayed();
	}

	public boolean isCancelPopupDisappearsWhenUserClicksOnCrossButton() {
		clickCrossButtonOnCancelPopup();
		if (waitForPopupNotDisplayed() && isSubmitRequestButtonEnabled())
			return true;
		return false;
	}

	public boolean waitForPopupNotDisplayed(){
			return ElementUtils.waitForInvisibility(driver, yesButtton);
	}
	public String getPopupHeaderText() {
		return ElementUtils.getText(driver, PopupHeaderText);
	}

	public String getPopupTextMessage() {
		return ElementUtils.getText(driver, PopupHeaderMessage);
	}

	public String verifyOnclickingOnYesbuttonWeGetConfirmationPage() throws InterruptedException {
		clickOnSubmitButton();
		clickYesButtonOnCancelPopup();
		//Thread.sleep(1000);

		return VerifyConfirmationMessage();
	}

	public String getExistingConnectionDetailLabel() {
		return ElementUtils.getText(driver, exitingConnectionDetaillabel);
	}

	public String getOriLabel() {
		return ElementUtils.getText(driver, oRILabel);
	}

	public String getOriValueLabel() {
		return ElementUtils.getText(driver, oRIValueLabel);
	}

	public String getAriLabel() {
		return ElementUtils.getText(driver, aRILabel);
	}

	public String getAriValueLabel() {
		return ElementUtils.getText(driver, aRIValueLabel);
	}

	public boolean isConfirmationPopupDisplayed(){
		return ElementUtils.isDisplayed(driver, confirmationPopup);
	}

	public boolean isCrossButtonOnCancelPopupDisplayed(){
		return ElementUtils.isDisplayed(driver, crossButtonInPopup);
	}

	public void clickCrossButtonOnCancelPopup() {
		ElementUtils.clickObject(driver, crossButtonInPopup);
	}

	public void clickYesButtonOnCancelPopup(){
		ElementUtils.clickObject(driver, yesButtton);
	}
}
