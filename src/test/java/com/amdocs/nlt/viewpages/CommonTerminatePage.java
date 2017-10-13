package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.nlt.util.ElementUtils;

public class CommonTerminatePage extends CommonForCancelAndTerminatePage {

	private final By currentStatusLabel = By.xpath("//*[@data-qa='currentStatus']");
	private final By appDetailsORIlabel = By.xpath("//*[@data-qa='appDetails_ORI_label']");
	private final By ariHeaderLabel = By.xpath("//*[@data-qa='ari_header_label']");
	private final By appDetailsDOALabel = By.xpath("//*[@data-qa='appDetails_DOA_label']");
	private final By appDetailsTPDLabel = By.xpath("//*[@data-qa='appDetails_TPD_label']");
	private final By appDetailsTimeLineLabel = By.xpath("//*[@data-qa='appDetails_RPD_label']");
	private final By appDetailsRORLabel = By.xpath("//*[@data-qa='appDetails_ROR_label']");

	private final By currentStatusValue = By.xpath("//*[@data-qa='currentStatus_value']");
	private final By appDetailsORIValue = By.xpath("//*[@data-qa='appDetails_ORI_value']");
	private final By ariHeader = By.xpath("//*[@data-qa='ari_input']");
	private final By appDetailsDOAValue = By.xpath("//*[@data-qa='appDetails_DOA_value']");
	private final By appDetailsTPDValue = By.xpath("//*[@data-qa='appDetails_TPD_value']");
	private final By appDetailsTimeLineValue = By.xpath("//*[@data-qa='appDetails_RPD_value']");
	private final By appDetailsRORValue = By.xpath("//*[@data-qa='appDetails_ROR_value']");

	private final By orderRequestIdentifierLabel = By.xpath("//*[@data-qa='order_request_identifier_label']");
	private final By applicationReferenceIdentifierLabel = By
			.xpath("//*[@data-qa='application_reference_identifier_label']");
	private final By oriValueLabel = By.xpath("//*[@data-qa='ori_value_label']");
	private final By ariValueLabel = By.xpath("//*[@data-qa='ari_value_label']");

	private final By activationDateLabel = By.xpath("//*[@data-qa='activation_date_label']");
	private final By daypickerRfa = By.xpath("//*[@id='daypicker_rfa']");
	private final By amendButton = By.xpath("//*[@data-qa='activate_amend_button']");
	private final By newARIInput = By.xpath("//*[@data-qa='new_ARI_input']");

	public String getActivationDateLabel() {
		return ElementUtils.getText(driver, activationDateLabel);
	}

	public CommonTerminatePage enterNewARI() {
		ElementUtils.getElement(driver, newARIInput).sendKeys("Test Terminate Amend");
		;
		return this;
	}

	public boolean isDaypickerRfaDisabled() {
		return (!ElementUtils.getElement(driver, daypickerRfa).isEnabled());
	}

	public String getOrderRequestIdentifierLabel() {
		return ElementUtils.getText(driver, orderRequestIdentifierLabel);
	}

	public String getApplicationReferenceIdentifierLabel() {
		return ElementUtils.getText(driver, applicationReferenceIdentifierLabel);
	}

	public boolean isAriValueLabelDisabled() {
		return (!ElementUtils.getElement(driver, ariValueLabel).isEnabled());
	}

	public boolean isOriValueLabelPresent() {
		return ElementUtils.getElement(driver, oriValueLabel).isDisplayed();
	}

	public boolean isAriHeaderDisabled() {
		return (!ElementUtils.getElement(driver, ariHeader).isEnabled());
	}

	public boolean isAppDetailsTPDValuePresent() {
		return ElementUtils.getElement(driver, appDetailsTPDValue).isDisplayed();
	}

	public boolean isAppDetailsTimeLineValuePresent() {
		return ElementUtils.getElement(driver, appDetailsTimeLineValue).isDisplayed();
	}

	public boolean isAppDetailsRORValuePresent() {
		return ElementUtils.getElement(driver, appDetailsRORValue).isDisplayed();
	}

	public boolean isCurrentStatusValuePresent() {
		return ElementUtils.getElement(driver, currentStatusValue).isDisplayed();
	}

	public boolean isAppDetailsORIValuePresent() {
		return ElementUtils.getElement(driver, appDetailsORIValue).isDisplayed();
	}

	public boolean isAppDetailsDOAValue() {
		return ElementUtils.getElement(driver, appDetailsDOAValue).isDisplayed();
	}

	public CommonTerminatePage(WebDriver driver) {
		super(driver);
	}

	public String getAppDetailsORIlabel() {
		return ElementUtils.getText(driver, appDetailsORIlabel);
	}

	public String getAriHeaderLabel() {
		return ElementUtils.getText(driver, ariHeaderLabel);
	}

	public String getAppDetailsDOALabel() {
		return ElementUtils.getText(driver, appDetailsDOALabel);
	}

	public String getAppDetailsTPDLabel() {
		return ElementUtils.getText(driver, appDetailsTPDLabel);
	}

	public String getAppDetailsTimeLineLabel() {
		return ElementUtils.getText(driver, appDetailsTimeLineLabel);
	}

	public String getAppDetailsRORLabel() {
		return ElementUtils.getText(driver, appDetailsRORLabel);
	}

	public String getCurrentStatusLabel() {
		return ElementUtils.getText(driver, currentStatusLabel);
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------
	public void populateTermianteOderForm() throws InterruptedException {
		ElementUtils.getElement(driver, ARITextBox_Terminate).sendKeys("8239217");
		selectCalendarDate();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
		// Thread.sleep(1000);
	}

	public boolean isTerminatePopupPresent() throws InterruptedException {
		populateTermianteOderForm();
		return ElementUtils.getElement(driver, confirmationPopup).isDisplayed();

	}

	public boolean isYesButtonPresentInTerminatePopup() {
		return ElementUtils.getElement(driver, yesButtton).isDisplayed();

	}

	public boolean isNoButtonPresentInTermiantePopup() {
		return ElementUtils.getElement(driver, noButton).isDisplayed();
	}

	public boolean isTerminatePopupDisappearsWhenUserClicksOnNoButton() {
		ElementUtils.findElementForClick(driver, noButton).click();
		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(yesButtton));
		return ElementUtils.getElement(driver, submitRequestButton).isEnabled();
	}

	public boolean isCrossButtonPresentInCancelPopup() throws InterruptedException {
		//populateTermianteOderForm();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
		return ElementUtils.getElement(driver, crossButtonInPopup).isDisplayed();

	}

	public boolean isTerminatePopupDisappearsWhenUserClicksOnCrossButton() {
		ElementUtils.findElementForClick(driver, crossButtonInPopup).click();
		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(yesButtton));
		return ElementUtils.getElement(driver, submitRequestButton).isEnabled();
	}

	public String getPopupHeaderText() {
		return ElementUtils.getText(driver, PopupHeaderText);

	}

	public String getPopupHeaderTextMessage() {
		return ElementUtils.getText(driver, PopupHeaderMessage);
	}

	public String verifyOnclickingOnYesbuttonWeGetConfirmationPage() throws InterruptedException {
		//populateTermianteOderForm();
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
		ElementUtils.findElementForClick(driver, yesButtton).click();
		// Thread.sleep(700);

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

	public boolean getAriValueLabel() {

		return ElementUtils.getElement(driver, aRIValueLabel).getAttribute("value").equals("123456");
	}
}
