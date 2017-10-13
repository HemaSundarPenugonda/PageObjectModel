package com.amdocs.nlt.test;

import com.amdocs.nlt.createTest.CommonComponentPageTest;

public class SampleTest extends CommonComponentPageTest {
    /*@Test
    public void createSchedule1() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule1();

        ResidentialEndUserConnectionPage resiPage = new ResidentialEndUserConnectionPage(driver);
        OrderTestData orderData = new OrderTestData("populateResiCreateOrderForm", "ORDER", "SCHEDULE1", "PROVIDE");
        orderData.setQueryParam(orderData.getAppRefNumber());
        orderData.setSubmitBeforeTime(new Date());
        resiPage.populatevaluesInResiEndUserForm(orderData);
        orderData.setSubmitAfterTime(new Date());

        testSuccessPage("The Residential End User Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule2() throws InterruptedException {

        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule2();

        NonResidentialEndUserConnectionPage nonResiOrder = new NonResidentialEndUserConnectionPage(driver);
        OrderTestData orderData = new OrderTestData("populateNonresiCreateOrderForm", "ORDER", "SCHEDULE2", "PROVIDE");
        orderData.setQueryParam(orderData.getAppRefNumber());
        orderData.setSubmitBeforeTime(new Date());
        nonResiOrder.populateCreateOrderForm(orderData);
        orderData.setSubmitAfterTime(new Date());

        testSuccessPage("The Non-Residential End User Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule3() throws Exception {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule3();

        NBAPConnectionPage nBapConnection = new NBAPConnectionPage(driver);

        NbapConnectionTestData nbapOrderData = new NbapConnectionTestData("submitNbapForm", "ORDER", "SCHEDULE3",
                "PROVIDE");
//        nBapConnection.chekcFeasibilityWithPreinstalledNbapOption(nbapOrderData);
        nBapConnection.checkFeasibilityForNbapConnectionWithNltToInstallOption();


        nBapConnection.clickTechnicalDetail();

        nbapOrderData.setQueryParam(nbapOrderData.getAppRefNumber());
        nbapOrderData.setSubmitBeforeTime(new Date());
        nBapConnection.SelectDateAndClickSubmitButton();

        testSuccessPage("The NBAP Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule4() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule4();

        CoToCoConnectionPage order = new CoToCoConnectionPage(driver);
        
        order.populateCoToCoConnectionForm();

        testSuccessPage("The CO to CO Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule5() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule5();

        //TODO: need to implement
    }

    @Test
    public void createSchedule6() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule6();

        //TODO: need to implement
    }

    @Test
    public void createSchedule7() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule7();

        FTTBNodeToDPConnection fttbToDP = new FTTBNodeToDPConnection(driver);
        fttbToDP.populateForm();
        testSuccessPage("The FTTB Node to DP Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule8() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule8();

        BuildingMDFRoomToResidentialPremiseConnectionPage mdfResiPage = new BuildingMDFRoomToResidentialPremiseConnectionPage(
                driver);
        OrderTestData orderData = new OrderTestData();
        mdfResiPage.populatevaluesInResiEndUserForm(orderData);

        testSuccessPage("The Building MDF Room to Residential Premise Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule9() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule9();

        BuildingMDFRoomToNonResidentialPremiseConnectionPage mdfNonResiOrder = new BuildingMDFRoomToNonResidentialPremiseConnectionPage(
                driver);
        OrderTestData orderData = new OrderTestData("populateNonresiCreateOrderForm", "ORDER", "SCHEDULE2", "PROVIDE");
        mdfNonResiOrder.populateCreateOrderForm(orderData);

        testSuccessPage("The Building MDF Room to Non-Residential Premise Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule10() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule10();

        //TODO: need to implement
    }

    @Test
    public void createSchedule11() throws InterruptedException, URISyntaxException, AWTException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule11();

        NBAPDPtoNBAPTPConnectionPage nbapdPtoNBAPTPConnectionPage = new NBAPDPtoNBAPTPConnectionPage(driver);
        nbapdPtoNBAPTPConnectionPage.checkGetDetails();
        nbapdPtoNBAPTPConnectionPage.checkFeasibilityWithDescriptionofAddress();
        
        super.testRequestingLicenseeFunc();
        nbapdPtoNBAPTPConnectionPage.selectInstallationDateAndSubmitRequest();

        testSuccessPage("The NBAP DP to NBAP TP Connection request has been submitted successfully.");
    }

    @Test
    public void createSchedule12() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12();

        //TODO: need to implement
    }

    @Test
    public void createSchedule12A() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12A();

        //TODO: need to implement
    }

    @Test
    public void createSchedule12B() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12B();

        //TODO: need to implement
    }

    @Test
    public void createSchedule12C() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule12C();

        //TODO: need to implement
    }

    @Test
    public void createSchedule13() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToSchedule13();

        //TODO: need to implement
    }

    @Test
    public void createFTO() throws InterruptedException, IOException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToFTO();

        AddressObject address = new Utilities().prepareAddress("schedule1", "homereached");
        FibreTakeOverServicePage ftsPage = new FibreTakeOverServicePage(driver);

        Assert.assertTrue(ftsPage.isNewARILabelEnabled());
        Assert.assertTrue(ftsPage.isExistingRspEnabled());

        ftsPage.submitFeasibility(address.getScheduleName(), address.getPostalCode(), address.getUnitNumber());

        Assert.assertEquals(ftsPage.getCoverageStatusValue(), address.getCoverageStatus());
//        Assert.assertFalse(ftsPage.isBuildingNumberEnabled());
        Assert.assertEquals(ftsPage.getBuildingNumberValue(), address.getBuildingNumber());
        Assert.assertFalse(ftsPage.isBuildingNameEnabled());
        Assert.assertEquals(ftsPage.getBuildingNameValue(), address.getBuildingName());
        Assert.assertFalse(ftsPage.isStreetNameEnabled());
        Assert.assertEquals(ftsPage.getStreetNameValue(), address.getStreetName());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(ftsPage.isBuildingTypeEnabled());
            Assert.assertEquals(ftsPage.getBuildingType(), address.getBuildingType());
            Assert.assertFalse(ftsPage.isCopifTypeEnabled());
            Assert.assertEquals(ftsPage.getCopifType(), address.getCopifType());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertFalse(ftsPage.isBuildingTypeDisplayed());
            Assert.assertFalse(ftsPage.isCopifTypeDisplayed());
        }


        Assert.assertTrue(ftsPage.isSalutationEnabled());
        Assert.assertTrue(ftsPage.areSalutationDropDownValuesCorrect());
        Assert.assertTrue(ftsPage.isFirstNameEnabled());
        Assert.assertTrue(ftsPage.isLastNameEnabled());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(ftsPage.isCompanyNameDisplayed());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertTrue(ftsPage.isCompanyNameDisplayed());
            Assert.assertTrue(ftsPage.isCompanyNameEnabled());
        }


        Assert.assertTrue(ftsPage.isContactNumberEnabled());
        Assert.assertTrue(ftsPage.isAlternateContactNumberEnabled());
        Assert.assertTrue(ftsPage.isEmailAddressEnabled());
        Assert.assertTrue(ftsPage.isEmailAddressMandatory());
        Assert.assertTrue(ftsPage.isCalenderIconPresent());

        ftsPage.fillFibreTakeOverForm();
        testSuccessPage("The Fibre Takeover Service request has been submitted successfully.");
    }

    @Test
    public void createEFTO() throws InterruptedException, IOException, URISyntaxException, AWTException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToEFTO();

        AddressObject address = new Utilities().prepareAddress("schedule1", "homereached");

        EnhancedFibreTakeoverServicePage eftsPage = new EnhancedFibreTakeoverServicePage(driver);
        Thread.sleep(1000);

        Assert.assertEquals(eftsPage.getHeader(), "Request for Enhanced Fibre Takeover Service");
        Assert.assertTrue(eftsPage.isNewAriTextboxEnabled());
        Assert.assertTrue(eftsPage.isExistingRspEnabled());

        eftsPage.submitFeasibility(address.getScheduleName(), address.getPostalCode(), address.getUnitNumber());

        Assert.assertEquals(eftsPage.getCoverageStatusValue(), address.getCoverageStatus());
//        Assert.assertFalse(eftsPage.isBuildingNumberEnabled());
        Assert.assertEquals(eftsPage.getBuildingNumberValue(), address.getBuildingNumber());
        Assert.assertFalse(eftsPage.isBuildingNameEnabled());
        Assert.assertEquals(eftsPage.getBuildingNameValue(), address.getBuildingName());
        Assert.assertFalse(eftsPage.isStreetNameEnabled());
        Assert.assertEquals(eftsPage.getStreetNameValue(), address.getStreetName());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(eftsPage.isBuildingTypeEnabled());
            Assert.assertEquals(eftsPage.getBuildingType(), address.getBuildingType());
            Assert.assertFalse(eftsPage.isCopifTypeEnabled());
            Assert.assertEquals(eftsPage.getCopifType(), address.getCopifType());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertFalse(eftsPage.isBuildingTypeDisplayed());
            Assert.assertFalse(eftsPage.isCopifTypeDisplayed());
        }

        Assert.assertTrue(eftsPage.isSalutationEnabled());
        Assert.assertTrue(eftsPage.areSalutationDropDownValuesCorrect());
        Assert.assertTrue(eftsPage.isFirstNameEnabled());
        Assert.assertTrue(eftsPage.isLastNameEnabled());
        if (address.getScheduleName().equalsIgnoreCase("schedule 1")) {
            Assert.assertFalse(eftsPage.isCompanyNameDisplayed());
        } else if (address.getScheduleName().equalsIgnoreCase("schedule 2")) {
            Assert.assertTrue(eftsPage.isCompanyNameDisplayed());
            Assert.assertTrue(eftsPage.isCompanyNameEnabled());
        }
        Assert.assertTrue(eftsPage.isContactNumberEnabled());
        Assert.assertTrue(eftsPage.isAlternateContactNumberEnabled());
        Assert.assertTrue(eftsPage.isEmailAddressEnabled());
        Assert.assertTrue(eftsPage.isEmailAddressMandatory());
        Assert.assertEquals(eftsPage.getUploadReqDocsLabel(), "Upload Required Documents*");

        Assert.assertTrue(eftsPage.isBrowseAndUploadButtonEnabled());
        ElementUtils.performFileUplaod(driver, "Nbap.pdf");
        Thread.sleep(1000);
        Assert.assertTrue(eftsPage.isBrowseAndUploadButtonEnabled());


        Assert.assertTrue(eftsPage.isCalenderIconPresent());

        eftsPage.fillEnhancedFibreTakeOverForm();

        testSuccessPage("The Enhanced Fibre Takeover Service request has been submitted successfully.");
    }

    @Test
    public void createManageTPAddress() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToManageTPAddress();

        ManageTpByAddressPage manageTpByAddressPage = new ManageTpByAddressPage(driver);
        manageTpByAddressPage.enterAri();
        manageTpByAddressPage.checkFeasiabilityForSchedule1();
        manageTpByAddressPage.clickOnCheckFeasibility();

        manageTpByAddressPage.selectSalutationDropdown().enterFirstName().enterLastName().enterContactNumber()
                .enterAltContactNumber().enterEmail().selectIDTypeDropdown().enterIdNumber().selectOperationValueDropdown();

        manageTpByAddressPage.selectCalendarDate();
        
        manageTpByAddressPage.clickOnSubmitButton();

        //TODO: need to implement
    }

    @Test
    public void createManageTPCoordinate() throws Exception {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToManageCoOrdinate();

        RequestForManageTPbyCoOrdinateSystemServicePage manageTPbyCoOrdinate = new RequestForManageTPbyCoOrdinateSystemServicePage(
                driver);
        NbapConnectionTestData manageTpByCoOrdinateOrderData = new NbapConnectionTestData(
                "submitManageTpbyCordinateForm", "ORDER", "Schedule11", "PROVIDE");
        manageTPbyCoOrdinate.chekcFeasibility(manageTpByCoOrdinateOrderData);

        manageTPbyCoOrdinate.selectCalenderAndSubmitButton();
        //TODO: need to implement
    }

    @Test
    public void createManageTPRRR() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToManageTPRRR();


        //TODO: need to implement
    }

    @Test
    public void createDarkFibre() throws InterruptedException {
        NavigateToModulesByURL obj = new NavigateToModulesByURL(driver);
        obj.navigateToDarkFibre();

        RequestForFiberWithputServicePage darkFiber = new RequestForFiberWithputServicePage(driver);
		*//*
		 * darkFiber.checkDarkFiberFeasibilityForReconnect(1);
		 * Assert.assertEquals(darkFiber.getMessageForReconnectStatus(),
		 * "This is a case of Reconnect, please request Manage TP (RRR) order instead."
		 * , "message should be present but it is not ");
		 *//*
        darkFiber.checkDarkFiberFeasibility(1);
        
		*//* super.testRequestingLicenseeFunc(); *//*
        super.testRequetedDateAndTimeFunc();


        darkFiber.populateDarkFiberoForm();
        Assert.assertEquals(darkFiber.VerifyConfirmationMessage(),
                "The Fibre Without Service request has been submitted successfully.",
                "confirmation message should be present but it is not ");
        //TODO: need to implement
    }*/
}
