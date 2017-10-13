package com.amdocs.nlt.page;

import com.amdocs.nlt.util.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amdocs.nlt.util.ElementUtils;
import com.amdocs.nlt.util.NavigationUtils;

import java.io.File;

public class StartPage {

	private final By loginButton = By.xpath("//button[@data-qa='login_btn']/span");
	private final By userNameTextBox = By.xpath("//input[@data-qa='user_id_textbox']");
	private final By passwordTextBox = By.xpath("//input[@data-qa='login_password_textbox']");
	private final By loginButtonInPopup = By.xpath(".//*[@id='loginDialog2']/div[3]/div/button");

	private final By orderManagementLink = By.xpath("//a[@data-qa='order']/span");
	private final By troubleTicket = By.xpath("//a[@data-qa='trouble_tkt']/span");

	//private final By orderManagementLink = By.xpath("//a[@data-qa='order']");

	private final By cotoMdfLink = By.xpath("//li[@data-qa='CO to Building MDF Room Connection']/span");
	private final By coTOCoLink = By.xpath("//li[@data-qa='CO to CO Connection']/span");
	private final By nonResiLink = By.xpath("//li[@data-qa='Non-Residential End User Connection']/span");
	private final By mdfTONonResiLink = By
			.xpath("//li[@data-qa='Building MDF Room to Non-Residential Premise Connection']/span");
	private final By ResiLink = By.xpath("//li[@data-qa='Residential End User Connection']/span");
	private final By mdfToResiLink = By
			.xpath("//li[@data-qa='Building MDF Room to Residential Premise Connection']/span");
	private final By mdfToFttbLink = By.xpath("//li[@data-qa='Building MDF Room to FTTB Node Connection']/span");
	private final By fttbToDpLink = By.xpath("//li[@data-qa='FTTB Node to DP Connection']/span");
	private final By patchingServiceLink = By.xpath("//li[@data-qa='Patching Service']/span");
	private final By nbapConnectionLink = By.xpath("//li[@data-qa='NBAP Connection']/span");
	private final By coTONbapDpConnectionLink = By.xpath("//li[@data-qa='CO to NBAP DP Connection']/span");
	private final By dashboardLink = By.xpath("	//span[text()='Dashboard']");

	private final By requestForPhysicalAccessConnectionLink = By
			.xpath("//li[@data-qa='locationSupplementaryCoolingService']");

	private final By searchLink = By.xpath("//div[@data-qa='dashboard_search_tile']");
	private final By nbapDpToNbapTpConnectionLink = By.xpath("//li[@data-qa='NBAP DP to NBAP TP']/span");
	private final By supportMenuLink = By.xpath("//a[@data-qa='support']/span");
	private final By manageFaqLink = By.xpath("//li[@data-qa='menu_item_manageFAQs']/span");
	private final By manageTPbyCoOrdinateLink = By.xpath("//li[@data-qa='Manage TP by Coordinate']/span");

	private final By rlRLInterconnectionServiceConnectionLink = By
			.xpath("//li[@data-qa='RL-RLInterconnectionService']/span");

	private final By fiberWithoutServiceLink = By.xpath("//li[@data-qa='Fibre Without Service']");
	private final By fibreTakeOverServiceLink = By.xpath("//li[@data-qa='Fibre Takeover Service']");
	private final By manageTPbyCoordinate = By.xpath("//a[@data-qa='Manage TP by Coordinate']/span");
	private final By manageTPByAddress = By.xpath("//li[@data-qa='Manage TP by Address']");

	private final By manageTPButton = By.xpath("//*[@data-qa='manageTp_button']");
	private final By terminateButton = By.xpath("//*[@data-qa='terminate_button']");
	private final By cancelButton = By.xpath("//*[@data-qa='cancel_button']");
	private final By relocateButton = By.xpath("//button[@data-qa='relocate_button']");
	private final By changeTechnologyButton = By.xpath("//button[@data-qa='changeTech_button']");
	private final By segmentOrders = By.xpath("//li[@data-qa='segments']/span");
	private final By coLocationServices = By.xpath("//li[@data-qa='CO Location Services']");
	private final By troubleTkt = By.xpath("//li[@data-qa='trouble_tkt']");
	private final By manageTPRRRLink = By.xpath("//li[@data-qa='Manage TP (RRR)']");
	protected By physicalAccessToCoLocationSpaceLink= By.xpath("//*[@data-qa='RequestforPhysicalAccess']");
	private final By troubleTicketLink = By.xpath("//*[@data-qa='trouble_tkt']");
	private final By troubleTicketMenuItem = By.xpath("//li[@data-qa='trouble_tkt']");
	private final By supplemenrtryCoolingServiceLink = By.xpath("//li[@data-qa='locationSupplementaryCoolingService']");
	private final By colocationServiceLink = By.xpath("//*[@data-qa='COLocationServices']");

	protected WebDriver driver;

	public StartPage(WebDriver driver) {
		this.driver = driver;
	}

	public StartPage clickOnCancelButton() throws InterruptedException {
		ElementUtils.findElementForClick(driver, cancelButton).click();
		return this;
	}


	public StartPage clickOnTerminateButton() throws InterruptedException {
		ElementUtils.findElementForClick(driver, terminateButton).click();
		Thread.sleep(3000);
		return this;
	}


	public StartPage clickRelocateButton() throws InterruptedException {
		ElementUtils.findElementForClick(driver, relocateButton).click();
		return this;
	}

	public StartPage clickChangeTechButton() throws InterruptedException {
		ElementUtils.findElementForClick(driver, changeTechnologyButton).click();
		return this;
	}

	public StartPage moveToOrderManagementLink() throws InterruptedException {
		waitForElementToVisible(orderManagementLink);
		new Actions(driver).moveToElement(driver.findElement(orderManagementLink)).perform();
		// driver.findElement(orderManagementLink).click();
		return this;
	}

	public StartPage clickFibreTakeoverService() {
		waitForElementToVisible(orderManagementLink);
		new Actions(driver).pause(1000).moveToElement(driver.findElement(orderManagementLink)).pause(1000)
				.moveToElement(driver.findElement(fibreTakeOverServiceLink)).click().perform();
		return this;
	}

	private StartPage waitForElementToVisible(By orderManagementLink) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(orderManagementLink));
		return this;
	}

	public StartPage login() throws InterruptedException {
		ElementUtils.getElement(driver, userNameTextBox).sendKeys(PropertiesReader.getInstance().getUserName());
		ElementUtils.getElement(driver, passwordTextBox).sendKeys(PropertiesReader.getInstance().getPassword());
		ElementUtils.findElementForClick(driver, loginButton).click();
		return this;
	}

	public StartPage clickOrderManagementLink() {
		ElementUtils.findElementForClick(driver, orderManagementLink).click();
		return this;
	}
	
	public StartPage clickOnTroubleTicket() throws InterruptedException {
		
		ElementUtils.findElementForClick(driver, troubleTicket).click();
		return this;
	}
	
	public StartPage clickOnTroubleTkt() throws InterruptedException {
		
		ElementUtils.findElementForClick(driver, troubleTkt).click();
		return this;
	}
	
	public StartPage clickCotoMdfLink() throws InterruptedException {
		clickSegmentsMenu();
		Thread.sleep(1000);
		ElementUtils.clickObject(driver, cotoMdfLink);
		return this;
	}

	public void clickSegmentsMenu() {
		ElementUtils.findElementForClick(driver, segmentOrders).click();
	}

	public StartPage clickCoToCoLink() throws InterruptedException {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, coTOCoLink).click();
		return this;
	}

	public StartPage clikNonResiLink() throws InterruptedException {
		ElementUtils.findElementForClick(driver, nonResiLink).click();
		return this;
	}

	public StartPage clikMdfToNonResiLink() throws InterruptedException {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, mdfTONonResiLink).click();
		return this;
	}

	public StartPage clickResiLink() {
		ElementUtils.findElementForClick(driver, ResiLink).click();
		return this;
	}

	public StartPage clikMdfToResiLink() throws InterruptedException {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, mdfToResiLink).click();
		return this;
	}

	public StartPage clikMdfToFttbiLink() throws InterruptedException {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, mdfToFttbLink).click();
		return this;
	}

	public StartPage clikFttbToDpLink() {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, fttbToDpLink).click();
		return this;
	}

	public StartPage clickPatchingServiceLink() throws InterruptedException {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, patchingServiceLink).click();
		return this;
	}

	public StartPage nbapConnectionLink() throws InterruptedException {
		ElementUtils.findElementForClick(driver, nbapConnectionLink).click();
		Thread.sleep(1000);
		return this;
	}

	public StartPage coToNbapDpconnectionLink() throws InterruptedException {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, coTONbapDpConnectionLink).click();
		return this;
	}

	public StartPage clickdashbardLink() {
		ElementUtils.findElementForClick(driver, dashboardLink).click();
		return this;
	}

	public StartPage clickOnSeachResultLink() {
		ElementUtils.findElementForClick(driver, searchLink).click();
		return this;

	}

	public StartPage nbapDpToNbapTpConnectionLink() throws InterruptedException {
		clickSegmentsMenu();
		ElementUtils.findElementForClick(driver, nbapDpToNbapTpConnectionLink).click();
		return this;

	}

	public StartPage rLRLInterconnectionServiceConnectionLink() throws InterruptedException {
		ElementUtils.findElementForClick(driver, coLocationServices).click();
		ElementUtils.findElementForClick(driver, rlRLInterconnectionServiceConnectionLink).click();
		return this;

	}

	public StartPage navigateToPhysicalAccessConnectionLink() throws InterruptedException {
		ElementUtils.findElementForClick(driver, coLocationServices).click();
		ElementUtils.findElementForClick(driver, requestForPhysicalAccessConnectionLink).click();
		return this;

	}

	public StartPage navigateToView_Pending(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch" + scheduleNo + "P");
		return this;
	}

	public StartPage navigateToViewUrlForNonResiReclassify() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/nonresidentialreclassify/sch2P");
		return this;
	}

	public StartPage navigateToViewUrlForMdfNonResiReclassify() throws InterruptedException {
		NavigationUtils.navigateTo(driver, driver.getCurrentUrl().substring(0, driver.getCurrentUrl().lastIndexOf("/"))
				+ "/ordermanagement" + "/mdftononresidentialreclassify/sch9P");
		return this;
	}

	public StartPage openSupportMenu() {
		ElementUtils.findElementForClick(driver, supportMenuLink).click();
		return this;
	}

	public void clickManageFaqLink() {
		ElementUtils.findElementForClick(driver, manageFaqLink).click();
	}

	public void clickFiberWithServiceLink() {
		ElementUtils.findElementForClick(driver, fiberWithoutServiceLink).click();

	}

	public StartPage clickManageTPByAddressLink() {
		ElementUtils.findElementForClick(driver, manageTPByAddress).click();
		return this;

	}

	public StartPage manageTPbyCoordinateLink() throws InterruptedException {
		ElementUtils.findElementForClick(driver, manageTPbyCoOrdinateLink).click();
		return this;
	}

	public StartPage clickOnManageTPButton() throws InterruptedException {
		ElementUtils.findElementForClick(driver, manageTPButton).click();
		return this;
	}

	

	public StartPage clickManageTPRRRLink() throws InterruptedException {
		driver.findElement(manageTPRRRLink).click();
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToView_Pending_TakeOver_schedule2() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch2_fibretakeoverapproval_pending");
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToView_Approved_TakeOver_schedule2() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch2_fibretakeoverapproval_approved");
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToView_Rejected_TakeOver_schedule2() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch2_fibretakeoverapproval_rejected");
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToView_Pending_TakeOver_schedule1() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch1_fibretakeoverapproval_pending");
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToView_Approved_TakeOver_schedule1() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch1_fibretakeoverapproval_approved");
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToView_Rejected_TakeOver_schedule1() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch1_fibretakeoverapproval_rejected");
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToView_NotRequested_TakeOver() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/ViewFT4");
		Thread.sleep(4000);
		return this;
	}

	public StartPage navigateToViewUrl_TrueFileUpload() throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/ViewFU1");
		Thread.sleep(4000);
		return this;
	}

	private final By enhancedFiberWithoutServiceLink = By.xpath("//li[@data-qa='Enhanced Fibre Takeover Service']");

	public StartPage clickEnhancedFibreTakeoverService() {
		waitForElementToVisible(orderManagementLink);
		new Actions(driver).pause(1000).moveToElement(driver.findElement(orderManagementLink)).pause(1000)
				.moveToElement(driver.findElement(enhancedFiberWithoutServiceLink)).click().perform();
		return this;
	}

	public void navigateToView_Updated(int scheduleNumber) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch" + scheduleNumber + "U");
	}

	public void navigateToViewKIV(int scheduleNumber) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNumber+"P_KIV");
	}

	public StartPage navigateToView_Completed(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch" + scheduleNo+"T");
		Thread.sleep(2000);
		return this;
	}
	
	public void navigateToTroubleTktViewUrl(String viewURL) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, viewURL);
	}
	
	public StartPage navigateToCoLocationService() throws InterruptedException {
		
		ElementUtils.findElementForClick(driver, coLocationServices).click();
		return this;
	}
	
	public StartPage navigateToPhysicalAccessToCoLocationSpaceLink() throws InterruptedException {
		ElementUtils.findElementForClick(driver, physicalAccessToCoLocationSpaceLink).click();
		return this;
	}
	
	public StartPage navigateToTroubleTicketHeader() throws InterruptedException {

			ElementUtils.findElementForClick(driver, troubleTicketLink).click();
			return this;
		}
	public StartPage navigateToTroubleTicketLink() throws InterruptedException {

		ElementUtils.findElementForClick(driver, troubleTicketMenuItem).click();
		return this;
	}

	public StartPage navigateToSupplemenrtryCoolingServiceLink() throws InterruptedException {

		ElementUtils.findElementForClick(driver, supplemenrtryCoolingServiceLink).click();
		return this;
	}

	public StartPage navigateToReclassify(int scheduleNo) throws InterruptedException {
		clickdashbardLink();
		Thread.sleep(2000);
		String targetUrl;
		switch (scheduleNo) {
			case 1:
				targetUrl = driver.getCurrentUrl().substring(0, driver.getCurrentUrl().lastIndexOf("/"))
						+ "/ordermanagement" + "/residentialreclassify";
				break;
			case 2:
				targetUrl = driver.getCurrentUrl().substring(0, driver.getCurrentUrl().lastIndexOf("/"))
						+ "/ordermanagement" + "/nonresidentialreclassify";
				break;
			case 8:
				targetUrl = driver.getCurrentUrl().substring(0, driver.getCurrentUrl().lastIndexOf("/"))
						+ "/ordermanagement" + "/residentialreclassify";
				break;
			default :
				targetUrl = driver.getCurrentUrl().substring(0, driver.getCurrentUrl().lastIndexOf("/"))
						+ "/ordermanagement" + "/residentialreclassify";
				break;
		}
		NavigationUtils.navigateTo(driver, targetUrl);
		return this;
	}

	public StartPage navigateToCoLocationServiceLink(){
		ElementUtils.clickObject(driver, colocationServiceLink);
		return this;
	}

	public StartPage navigateToView_HomePassFirstFree_Yes(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch" + scheduleNo + "p_homepassfirstfree");
		return this;
	}
	public StartPage navigateToView_HomePassFirstFree_No(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch" + scheduleNo + "p_homepassfirstfree_no");
		return this;
	}
	public StartPage navigateToView_FileUploadIndicator_Yes(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_fileuploadindicator_yes");
		return this;
	}

	public StartPage navigateToView_FileUploadIndicator_No(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_fileuploadindicator_no");
		return this;
	}

	public StartPage navigateToView_FileUploadIndicator_No_UploadedFiles_No(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_fileuploadindicator_no_uploadedfiles_no");
		return this;
	}

	public StartPage navigateToView_Reconnect_RequestForExpress_Yes(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_reconnect_requestforexpress_yes");
		return this;
	}

	public StartPage navigateToView_Reconnect_RequestForExpress_No(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_reconnect_requestforexpress_no");
		return this;
	}

	public StartPage navigateToView_AmendUnitNumberInd_True(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_amendunitnumberind_true");
		return this;
	}

	public StartPage navigateToView_AmendUnitNumberInd_False(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_amendunitnumberind_false");
		return this;
	}

	public StartPage navigateToView_TimeSlot_Normal(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_timeslot_normal");
		return this;
	}

	public StartPage navigateToView_TimeSlot_Seasonal(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_timeslot_seasonal");
		return this;
	}

	public StartPage navigateToView_KeepOrderOpenInd_True(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_keeporderopenind_true");
		return this;
	}

	public StartPage navigateToView_KeepOrderOpenInd_False(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_keeporderopenind_false");
		return this;
	}

	public StartPage navigateToView_KivInd_True(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_kivind_true");
		return this;
	}

	public StartPage navigateToView_KivInd_False(int scheduleNo) throws InterruptedException {
		NavigationUtils.navigateToExtn(driver, "/sch"+scheduleNo+"p_kivind_false");
		return this;
	}
}
