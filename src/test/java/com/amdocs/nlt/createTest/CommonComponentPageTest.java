package com.amdocs.nlt.createTest;

import java.io.IOException;

import com.amdocs.nlt.page.SuccessPage;
import org.testng.Assert;

import com.amdocs.nlt.base.PageTest;
import com.amdocs.nlt.page.CommonComponentPage;

public class CommonComponentPageTest extends PageTest {

	public void testRequetedDateAndTimeFunc() throws InterruptedException {
		CommonComponentPage order = new CommonComponentPage(driver);
		Assert.assertTrue(order.isCalendarIconPresent(), "Calendar icon should be present but it is not");
		Assert.assertEquals(order.getReqDateOfActLabel(), "Requested Date of Activation",
				"Text should be Requested Date of Activation*but it is not");
		Assert.assertTrue(order.isRequestedDateTextBoxDisplayed(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertEquals(order.getDefaulPlaceholderForCalendarTextbox(), "DD/MM/YYYY",
				"label should be prsent but it is not ");

	}

	public void testRequestingLicenseeFunc() throws InterruptedException {
		CommonComponentPage order = new CommonComponentPage(driver);
		Assert.assertEquals(order.clickAndGetRequestinglicenseeLabel(), "Requesting Licensee Name",
				"For REQUESTING LICENSEE component:Label Requesting Licensee Name*  "
						+ "should be present but it is not ");
		Assert.assertEquals(order.getDesignationLabel(), "Designation",
				"For REQUESTING LICENSEE component:Label Designation* " + "should be present but it is not ");
		Assert.assertEquals(order.getRlCompanyNameLabel(), "Company Name",
				"For REQUESTING LICENSEE component:Label Company Name* " + "should be present but it is not ");
		Assert.assertEquals(order.getContactNumber_RL_Label(), "Contact Number",
				"For REQUESTING LICENSEE component:Label  contactNumber* " + "should be present but it is not ");
		Assert.assertEquals(order.getFaxNumberLabel(), "Fax Number",
				"For REQUESTING LICENSEE component:Label faxNumber* " + "should be present but it is not ");
		Assert.assertEquals(order.getEmailAddress_RL_Label(), "Email Address",
				"For REQUESTING LICENSEE component:Label emailAddress " + "should be present but it is not ");
	}

	public void testTechnicalDetailFunc() throws InterruptedException, IOException {
		CommonComponentPage order = new CommonComponentPage(driver);
		Assert.assertEquals(order.getRedundancyServiceLabel(), "Redundancy Service*",
				"Label should be present but it is not");
		Assert.assertEquals(order.getRequiredRadioButtonLabel(), "Required", "Label should be present but it is not");
		Assert.assertEquals(order.getNotRequiredRadioButtonLabel(), "Not Required",
				"Label should be present but it is not");
		Assert.assertEquals(order.clickRequiredAndGetIncaseOfreduandanycSeviceLabel(), "In case redundancy service is unavailable*",
				"Label should be present but it is not");
		Assert.assertTrue(order.iSRequiredRadioButtonDefaultSelected(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertFalse(order.iSNotRequiredRadioButtonNotDefaultSelected(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertTrue(order.isrejectRequetRadioButtonDefualtSelected(),
				"Requated Date of activation text box to choose date should be displayed but it is not");
		Assert.assertFalse(order.iNotsrejectRequetRadioButtonNotDefualtSelected(),
				"Requated Date of activation text box to choose date should be displayed but it is not");

	}

	public void testAddtionalInfoComponent() throws InterruptedException {
		CommonComponentPage order = new CommonComponentPage(driver);
		/*
		 * Assert.assertEquals(order.getARILabel(),
		 * "Application Reference Identifier*",
		 * "Text should be ARI  but it is not ");
		 */
		Assert.assertTrue(order.iSadditionalInfoLinkPresent(),
				"Additional information link should be present but it is not");
		Assert.assertEquals(order.getAdditionalInfoLabel(), "Additional Information:",
				"Label should be present but it is not");
		Assert.assertTrue(order.iSadditionalInfoTextBoxPresent(),
				"Additional info text should be present but it is not");

	}

	public void testSuccessPage(String expMessage){
		SuccessPage successPage = new SuccessPage(driver);

		Assert.assertEquals(successPage.getConfirmationMessage(), expMessage);
		Assert.assertTrue(successPage.isOriLabelDisplayed());
		Assert.assertTrue(successPage.isOriValueDisplayed());
		Assert.assertTrue(successPage.isGoToDashBoardClickable());
	}

	public void testBillingEndUserDetailsFieldLabelsWithCompanyName() {
		CommonComponentPage page = new CommonComponentPage(driver);
		testBillingEndUserDetailsFieldLabels();
		Assert.assertEquals(page.getBillingCompanyNameLabel(), "Company Name");
	}

	public void testBillingEndUserDetailsFieldLabels() {
		CommonComponentPage page = new CommonComponentPage(driver);
		Assert.assertEquals(page.getBillingPostalCodeLabel(), "Postal Code");
		Assert.assertEquals(page.getBillingUnitNumberLabel(), "Unit Number");
		Assert.assertEquals(page.getBillingBuildingNumberLabel(), "Building Number");
		Assert.assertEquals(page.getBillingBuildingNameLabel(), "Building Name");
		Assert.assertEquals(page.getBillingStreetNameLabel(), "Street Name");
		Assert.assertEquals(page.getBillingSalutationLabel(), "Salutation");
		Assert.assertEquals(page.getBillingFirstNameLabel(), "First Name");
		Assert.assertEquals(page.getBillingLastNameLabel(), "Last Name");
		Assert.assertEquals(page.getBillingContactNumberLabel(), "Contact Number");
		Assert.assertEquals(page.getBillingAlternateContactNumberLabel(), "Alternate Contact Number");
		Assert.assertEquals(page.getBillingEmailAddressLabel(), "Email Address");
	}

}
