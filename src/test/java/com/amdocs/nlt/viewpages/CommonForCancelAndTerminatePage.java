package com.amdocs.nlt.viewpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonForCancelAndTerminatePage extends CommonViewPage {

	public CommonForCancelAndTerminatePage(WebDriver driver) {
		super(driver);
	}

	protected final By exitingConnectionDetaillabel = By.xpath("//div[@data-qa='existing_connection_details_widget']");
	protected final By oRILabel = By.xpath("//label[@data-qa='order_request_identifier_label']");
	protected final By oRIValueLabel = By.xpath("//label[@data-qa='ori_value_label']");
	protected final By aRILabel = By.xpath("//label[@data-qa='application_reference_identifier_label']");
	protected final By aRIValueLabel = By.xpath("//input[@data-qa='ari_value_label']");
	protected final By yesButtton = By.xpath("//button[@data-qa='yes-button']");
	protected final By noButton = By.xpath("//button[@data-qa='no-button']");
	protected final By confirmationPopup = By.xpath("//div[@class='modal-content']");
	protected final By crossButtonInPopup = By.xpath("//button[@class='close']");
	protected final By PopupHeaderText = By.xpath("//h4[@class='modal-title']");
	protected final By PopupHeaderMessage = By.xpath("//div[@data-qa='modal-body']");

}
