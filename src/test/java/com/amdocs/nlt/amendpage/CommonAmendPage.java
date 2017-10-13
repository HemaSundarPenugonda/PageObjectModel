package com.amdocs.nlt.amendpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amdocs.nlt.page.CommonComponentPage;
import com.amdocs.nlt.util.ElementUtils;

public class CommonAmendPage extends CommonComponentPage {

	public CommonAmendPage(WebDriver driver) {
		super(driver);
	}

	private final By newARIHeaderLabel = By.xpath("//*[@data-qa='new_ARI_header_label']");
	private final By appDetailsORILabel = By.xpath("//label[@data-qa='appDetails_ORI_label']");
	private final By newARIInput = By.xpath("//*[@data-qa='new_ARI_input']");
	private final By appDetailsORIValue = By.xpath("//label[@data-qa='appDetails_ORI_value']");
	private final By ariHeaderLabel = By.xpath("//*[@data-qa='ari_header_label']");

	protected final By appDetailsDOALabel = By.xpath("//label[@data-qa='appDetails_DOA_label']");
	protected final By appDetailsDOAValue = By.xpath("//label[@data-qa='appDetails_DOA_value']");
	protected final By appDetailsTPDLabel = By.xpath("//label[@data-qa='appDetails_TPD_label']");
	protected final By appDetailsTPDValue = By.xpath("//label[@data-qa='appDetails_TPD_value']");
	protected final By appDetailsRPDLabel = By.xpath("//label[@data-qa='appDetails_RPD_label']");
	protected final By appDetailsRPDValue = By.xpath("//label[@data-qa='appDetails_RPD_value']");
	protected final By appDetailsRORlabel = By.xpath("//label[@data-qa='appDetails_ROR_label']");
	protected final By appDetailsRORvalue = By.xpath("//label[@data-qa='appDetails_ROR_value']");
	
	public String getAppDetailsRORlabel() {
		return ElementUtils.getText(driver,appDetailsRORlabel);
	}

	public boolean isappDetailsRPDvaluePresent() {
		return ElementUtils.getElement(driver, appDetailsRPDValue).isDisplayed();
	}

	public boolean isAppDetailsRORPresent() {
		return ElementUtils.getElement(driver, appDetailsRORvalue).isDisplayed();
	}

	public boolean isAppDetailsRPDValuePresent() {
		return ElementUtils.getElement(driver, appDetailsRPDValue).isDisplayed();
	}
	public String getAppDetailsRPDLabel() {
		return ElementUtils.getText(driver,appDetailsRPDLabel);
	}

	public boolean isAppDetailsTPDValuePresent() {
		return ElementUtils.getElement(driver, appDetailsTPDValue).isDisplayed();
	}

	public String getAppDetailsTPDLabel() {
		return ElementUtils.getText(driver,appDetailsTPDLabel);
	}

	public boolean isAppDetailsDOAValuePresent() {
		return ElementUtils.getElement(driver, appDetailsDOAValue).isDisplayed();
	}

	public String getAppDetailsDOALabel() {
		return ElementUtils.getText(driver,appDetailsDOALabel);
	}

	public String getAriHeaderLabel() {
		return ElementUtils.getText(driver,ariHeaderLabel);
	}

	public boolean isAppDetailsORIValuePresent() {
		return ElementUtils.getElement(driver, appDetailsORIValue).isDisplayed();
	}

	public CommonAmendPage enterNewARI() {
		ElementUtils.getElement(driver, newARIInput).sendKeys("Test Terminate Amend");
		return this;
	}

	public String getNewARIHeaderLabel() {
		return ElementUtils.getText(driver,newARIHeaderLabel);
	}

	public String getAppDetailsORILabel() {
		return ElementUtils.getText(driver,appDetailsORILabel);
	}

}
