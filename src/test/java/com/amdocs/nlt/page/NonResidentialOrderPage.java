package com.amdocs.nlt.page;

import com.amdocs.nlt.oders.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.OrderTestData;

public class NonResidentialOrderPage extends CommonComponentPage {

	// private final By coverageStatusLabel =
	// By.xpath("//label[@data-qa='coverage_status_label']");

	public NonResidentialOrderPage(WebDriver driver) {
		super(driver);
	}

	// Authorized Representative component locators
	// AR=Authorized Representative
	// SC=Secondary Contact
	// PC=primary contact

	protected final By firstNametextbox_AR = By.xpath("//form[@id='Auth_form']//input[@name='fName']");
	protected final By lastNametextbox_AR = By.xpath("//form[@id='Auth_form']//input[@name='lName']");
	protected final By ContactNumtextbox_AR = By.xpath("//form[@id='Auth_form']//input[@name='contactNum']");
	protected final By CompanyNametextbox_AR = By.xpath("//form[@id='Auth_form']//input[@name='companyName']");
	protected final By altContTextbox_AR = By.xpath("//form[@id='Auth_form']//input[@name='altNumber']");
	protected final By emailAddTextbox_AR = By.xpath("//form[@id='Auth_form']//input[@name='emailAddress']");

	// primary contact detail
	protected final By firstNametextbox_PC = By.xpath("//form[@id='Primary_form']//input[@name='fName']");
	protected final By lastNametextbox_PC = By.xpath("//form[@id='Primary_form']//input[@name='lName']");
	protected final By contatcNumtextbox_PC = By.xpath("//form[@id='Primary_form']//input[@data-qa='contact_number']");
	protected final By emailAddTextbox_PC = By.xpath("//form[@id='Primary_form']//input[@data-qa='email_address']");
	protected final By altContTextbox_PC = By.xpath("//form[@id='Primary_form']//input[@name='altNumber']");
	protected final By CompanyNametextbox_PC = By.xpath("//form[@id='Primary_form']//input[@name='companyName']");

	// Secondary contact detail
	protected final By firstNametextbox_SC = By.xpath("//form[@id='Secondary_form']//input[@name='fName']");
	protected final By lastNametextbox_SC = By.xpath("//form[@id='Secondary_form']//input[@name='lName']");
	protected final By contatcNumtextbox_SC = By
			.xpath("//form[@id='Secondary_form']//input[@data-qa='contact_number']");
	protected final By emailAddTextbox_SC = By.xpath("//form[@id='Secondary_form']//input[@data-qa='email_address']");
	protected final By altContTextbox_SC = By.xpath("//form[@id='Secondary_form']//input[@name='altNumber']");
	protected final By CompanyNametextbox_SC = By.xpath("//form[@id='Secondary_form']//input[@name='companyName']");

	protected final By contractTermDropdown = By.xpath("//select[@data-qa='contract_term']");
	private final By contractTermLabel = By.xpath("//label[@data-qa='contract_term_label']");
	protected final By installationOptionDropdown = By.xpath("//select[@data-qa='installation_option']");
	protected final By salutationDropdown = By.xpath("//select[@data-qa='salutation']");
	protected final By addSecondaryContactLink = By.xpath("//span[text()='Add Secondary Contact']");

	protected final By radioButtonDataCenter_No = By.xpath("//input[@data-qa='data_center_no']");
	protected final By radioButtonDataCenter_Yes = By.xpath("//input[@data-qa='data_center_yes']");
	private final By dataCenterLabel = By.xpath("//label[@data-qa='data_center_yes']");
	protected final By externalDCRNLabel = By.xpath("//label[@data-qa='rack_number_label']");
	protected final By externalDCRNTextbox = By.xpath("//input[@data-qa='rack_number']");
	protected final By reserveButton = By.xpath("//*[@data-qa='rfa_timeslot_btn_reserve']");
	
	// public void check feasibility
	public void submitFeasibility() throws InterruptedException {
		OrderTestData data = new OrderTestData();
		ElementUtils.getElement(driver, postalCodeTextBox).sendKeys(data.getPostalCode_reconnect_nonresi());
		ElementUtils.getElement(driver, unitNumberTextBox).sendKeys(data.getUnitNum());

		Select installtionOptionValue = new Select(ElementUtils.getElement(driver, installationOptionDropdown));
		installtionOptionValue.selectByIndex(1);
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();

	}

	public void checkFeasibility_HomeReached() throws InterruptedException {
		OrderTestData data = new OrderTestData();
		ElementUtils.getElement(driver, postalCodeTextBox).sendKeys(data.getPostalCode_homeReached());
		ElementUtils.getElement(driver, unitNumberTextBox).sendKeys(data.getUnitNum());

		Select installtionOptionValue = new Select(ElementUtils.getElement(driver, installationOptionDropdown));
		installtionOptionValue.selectByIndex(1);
		ElementUtils.findElementForClick(driver, feasibiltyChkButton).click();

	}

	public void populateCreateOrderForm(OrderTestData data) throws InterruptedException {
		ElementUtils.getElement(driver, ARITextBox).sendKeys(data.getAppRefNumber());
		submitFeasibility();

		Select salutionValue = new Select(ElementUtils.getElement(driver, salutationDropdown));
		salutionValue.selectByIndex(1);

		ElementUtils.getElement(driver, firstNametextbox_AR).sendKeys(data.getFirstName());
		ElementUtils.getElement(driver, lastNametextbox_AR).sendKeys(data.getLastName());
		ElementUtils.getElement(driver, ContactNumtextbox_AR).sendKeys(data.getContactNum());
		ElementUtils.getElement(driver, CompanyNametextbox_AR).sendKeys(data.getCompanyName());
		ElementUtils.getElement(driver, emailAddTextbox_AR).sendKeys(data.getEmailAdd());
		ElementUtils.getElement(driver, altContTextbox_AR).sendKeys(data.getAltContactNum());
		ElementUtils.getElement(driver, firstNametextbox_PC).sendKeys(data.getFirstName());
		ElementUtils.getElement(driver, lastNametextbox_PC).sendKeys(data.getLastName());
		ElementUtils.getElement(driver, contatcNumtextbox_PC).sendKeys(data.getContactNum());
		ElementUtils.getElement(driver, emailAddTextbox_PC).sendKeys(data.getEmailAdd());
		ElementUtils.getElement(driver, altContTextbox_PC).sendKeys(data.getAltContactNum());
		ElementUtils.getElement(driver, CompanyNametextbox_PC).sendKeys(data.getCompanyName());
		
		ElementUtils.findElementForClick(driver, addSecondaryContactLink).click();
		
		ElementUtils.getElement(driver, firstNametextbox_SC).sendKeys(data.getFirstName());
		ElementUtils.getElement(driver, lastNametextbox_SC).sendKeys(data.getLastName());
		ElementUtils.getElement(driver, contatcNumtextbox_SC).sendKeys(data.getContactNum());
		ElementUtils.getElement(driver, emailAddTextbox_SC).sendKeys(data.getEmailAdd());
		ElementUtils.getElement(driver, altContTextbox_SC).sendKeys(data.getAltContactNum());
		ElementUtils.getElement(driver, CompanyNametextbox_SC).sendKeys(data.getCompanyName());
		
		
		selectCalendarDate();
		//driver.findElement(reserveButton).click();
		//driver.findElement(reserveButton).click();
		//TODO: Need to implement logic for to click on Reseserve only incase coverage status not equal to RECONNECT. Commenting it for now
//		ElementUtils.findElementForClick(driver, reserveButton).click();
		
		/*String value = getCoverageStatusValue();
		if(!("Reconnect".equals(value) || "Home Reached".equals(value))){
			//driver.findElement(reserveButton).click();			
		}	*/	
		ElementUtils.findElementForClick(driver, submitRequestButton).click();
	}

	public boolean areContractTermDropdownVlauesAreCorrect() throws InterruptedException {
		WebElement contractTerm = ElementUtils.getElement(driver, contractTermDropdown);
		return ElementUtils.verifyDropdownValues(contractTerm, DropDowns.NonResi_expContractTermsVlaues);

	}

	public boolean isRadioButtonNoDefaultSelectedForDataCenter() {
		return ElementUtils.getElement(driver, radioButtonDataCenter_No).isSelected();
	}

	public String getExternalDRCNLabel() throws InterruptedException {
		ElementUtils.findElementForClick(driver, radioButtonDataCenter_Yes).click();
		Thread.sleep(2000);
		return ElementUtils.getText(driver, externalDCRNLabel);
	}

	public String getContractLabel() {
		return ElementUtils.getText(driver, contractTermLabel);

	}

	public String getDataCenterLabel() {
		return ElementUtils.getText(driver, dataCenterLabel);

	}

	public String getDefaultDropdownValueForContractTerm() throws InterruptedException {
		return ElementUtils.getDefaultDropdownVlaue(driver, contractTermDropdown);
	}

	public boolean areInstallationOptionDropDownValuesCorrect() throws InterruptedException {
		WebElement installationOptionDropdownValues = ElementUtils.getElement(driver, installationOptionDropdown);
		return ElementUtils.verifyDropdownValues(installationOptionDropdownValues, DropDowns.NonResi_expInstallationOptionValues);
	}

	public String getDefaultValueOfPrefInstallationSessionForReconnect() throws InterruptedException {
		selectCalendarDate();
		return ElementUtils.getDefaultDropdownVlaue(driver, prefInstallSessionDropdown);
	}

}
