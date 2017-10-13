/**
 *
 */
package com.amdocs.nlt.oders;

/**
 * @author Hemsundar
 */
public class ManageTPRRRObject {

    private final String currentStatus;
    private final String ori;
    private final String cin;
    private String dateOfApplication;
    private String tentativeProvisonDate;
    private String timelineToComeplete;
    private String reasonForRejection;
    private String scheduleName;
    private String postalCode;
    private String unitNumber;
    private String coverageStatus;
    private String buildingNumber;
    private String buildingName;
    private String streetName;
    private String buildingType;
    private String copifType;
    private String installationCharge;
    private String salutation;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String alternateContactNumber;
    private String emailAddress;
    private String idType;
    private String idNumber;
    private String requestedDateOfActivation;
    private String preferredInstallationSession;
    private String billingPostalCode;
    private String billingUnitNumber;
    private String billingBuildingNumber;
    private String billingBuildingName;
    private String billingStreetName;
    private String billingBuildingType;
    private String billingSalutation;
    private String billingFirstName;
    private String billingLastName;
    private String billingContactNumber;
    private String billingAlternateContactNumber;
    private String billingEmailAddress;
    private String additionalInformation;
    private String orderType;
    private String csoName;
    private String csoDesignation;
    private String csoCompanyName;
    private String csoContactNumber;
    private String csoFaxNumber;
    private String csoEmailAddress;
    private String companyName;
    private String billingCompanyName;

    public static class Builder {

        private String currentStatus;
        private String ori;
        private String cin;
        private String dateOfApplication;
        private String tentativeProvisonDate;
        private String timelineToComeplete;
        private String reasonForRejection;
        private String scheduleName;
        private String postalCode;
        private String unitNumber;
        private String coverageStatus;
        private String buildingNumber;
        private String buildingName;
        private String streetName;
        private String buildingType;
        private String copifType;
        private String installationCharge;
        private String salutation;
        private String firstName;
        private String lastName;
        private String contactNumber;
        private String alternateContactNumber;
        private String emailAddress;
        private String idType;
        private String idNumber;
        private String requestedDateOfActivation;
        private String preferredInstallationSession;
        private String billingPostalCode;
        private String billingUnitNumber;
        private String billingBuildingNumber;
        private String billingBuildingName;
        private String billingStreetName;
        private String billingBuildingType;
        private String billingSalutation;
        private String billingFirstName;
        private String billingLastName;
        private String billingContactNumber;
        private String billingAlternateContactNumber;
        private String billingEmailAddress;
        private String additionalInformation;
        private String orderType;
        private String csoName;
        private String csoDesignation;
        private String csoCompanyName;
        private String csoContactNumber;
        private String csoFaxNumber;
        private String csoEmailAddress;
        private String companyName;
        private String billingCompanyName;

        public Builder(String scheduleName, String postalCode, String unitNumber) {

            this.scheduleName = scheduleName;
            this.postalCode = postalCode;
            this.unitNumber = unitNumber;
        }

        public Builder currentStatus(String val) {
            currentStatus = val;
            return this;
        }

        public Builder ori(String val) {
            ori = val;
            return this;
        }

        public Builder cin(String val) {
            cin = val;
            return this;
        }

        public Builder dateOfApplication(String val) {
            dateOfApplication = val;
            return this;
        }

        public Builder tentativeProvisonDate(String val) {
            tentativeProvisonDate = val;
            return this;
        }

        public Builder timelineToComeplete(String val) {
            timelineToComeplete = val;
            return this;
        }

        public Builder reasonForRejection(String val) {
            reasonForRejection = val;
            return this;
        }

        public Builder coverageStatus(String val) {
            coverageStatus = val;
            return this;
        }

        public Builder buildingNumber(String val) {
            buildingNumber = val;
            return this;
        }

        public Builder buildingName(String val) {
            buildingName = val;
            return this;
        }

        public Builder streetName(String val) {
            streetName = val;
            return this;
        }

        public Builder buildingType(String val) {
            buildingType = val;
            return this;
        }

        public Builder copifType(String val) {
            copifType = val;
            return this;
        }

        public Builder installationCharge(String val) {
            installationCharge = val;
            return this;
        }

        public Builder salutation(String val) {
            salutation = val;
            return this;
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder contactNumber(String val) {
            contactNumber = val;
            return this;
        }

        public Builder alternateContactNumber(String val) {
            alternateContactNumber = val;
            return this;
        }

        public Builder emailAddress(String val) {
            emailAddress = val;
            return this;
        }

        public Builder idType(String val) {
            idType = val;
            return this;
        }

        public Builder idNumber(String val) {
            idNumber = val;
            return this;
        }

        public Builder requestedDateOfActivation(String val) {
            requestedDateOfActivation = val;
            return this;
        }

        public Builder preferredInstallationSession(String val) {
            preferredInstallationSession = val;
            return this;
        }

        public Builder billingPostalCode(String val) {
            billingPostalCode = val;
            return this;
        }

        public Builder billingUnitNumber(String val) {
            billingUnitNumber = val;
            return this;
        }

        public Builder billingBuildingNumber(String val) {
            billingBuildingNumber = val;
            return this;
        }

        public Builder billingBuildingName(String val) {
            billingBuildingName = val;
            return this;
        }

        public Builder billingStreetName(String val) {
            billingStreetName = val;
            return this;
        }

        public Builder billingBuildingType(String val) {
            billingBuildingType = val;
            return this;
        }

        public Builder billingSalutation(String val) {
            billingSalutation = val;
            return this;
        }

        public Builder billingFirstName(String val) {
            billingFirstName = val;
            return this;
        }

        public Builder billingLastName(String val) {
            billingLastName = val;
            return this;
        }

        public Builder billingContactNumber(String val) {
            billingContactNumber = val;
            return this;
        }

        public Builder billingAlternateContactNumber(String val) {
            billingAlternateContactNumber = val;
            return this;
        }

        public Builder billingEmailAddress(String val) {
            billingEmailAddress = val;
            return this;
        }

        public Builder additionalInformation(String val) {
            additionalInformation = val;
            return this;
        }

        public Builder orderType(String val) {
            orderType = val;
            return this;
        }

        public Builder csoName(String val) {
            csoName = val;
            return this;
        }

        public Builder csoDesignation(String val) {
            csoDesignation = val;
            return this;
        }

        public Builder csoCompanyName(String val) {
            csoCompanyName = val;
            return this;
        }

        public Builder csoContactNumber(String val) {
            csoContactNumber = val;
            return this;
        }

        public Builder csoFaxNumber(String val) {
            csoFaxNumber = val;
            return this;
        }

        public Builder csoEmailAddress(String val) {
            csoEmailAddress = val;
            return this;
        }

        public Builder companyName(String val) {
            companyName = val;
            return this;
        }
        public Builder billingCompanyName(String val) {
            billingCompanyName = val;
            return this;
        }
        public ManageTPRRRObject build() {
            return new ManageTPRRRObject(this);
        }

    }

    private ManageTPRRRObject(Builder builder) {
        this.scheduleName = builder.scheduleName;
        this.postalCode = builder.postalCode;
        this.unitNumber = builder.unitNumber;

        this.currentStatus = builder.currentStatus;
        this.ori = builder.ori;
        this.cin = builder.cin;
        this.dateOfApplication = builder.dateOfApplication;
        this.tentativeProvisonDate = builder.tentativeProvisonDate;
        this.timelineToComeplete = builder.timelineToComeplete;
        this.reasonForRejection = builder.reasonForRejection;
        this.coverageStatus = builder.coverageStatus;
        this.buildingNumber = builder.buildingNumber;
        this.buildingName = builder.buildingName;
        this.streetName = builder.streetName;
        this.buildingType = builder.buildingType;
        this.copifType = builder.copifType;
        this.installationCharge = builder.installationCharge;
        this.salutation = builder.salutation;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.companyName = builder.companyName;
        this.contactNumber = builder.contactNumber;
        this.alternateContactNumber = builder.alternateContactNumber;
        this.emailAddress = builder.emailAddress;
        this.idType = builder.idType;
        this.idNumber = builder.idNumber;
        this.requestedDateOfActivation = builder.requestedDateOfActivation;
        this.preferredInstallationSession = builder.preferredInstallationSession;
        this.billingPostalCode = builder.billingPostalCode;
        this.billingUnitNumber = builder.billingUnitNumber;
        this.billingBuildingNumber = builder.billingBuildingNumber;
        this.billingBuildingName = builder.billingBuildingName;
        this.billingStreetName = builder.billingStreetName;
        this.billingBuildingType = builder.billingBuildingType;
        this.billingSalutation = builder.billingSalutation;
        this.billingFirstName = builder.billingFirstName;
        this.billingLastName = builder.billingLastName;
        this.billingCompanyName = builder.billingCompanyName;
        this.billingContactNumber = builder.billingContactNumber;
        this.billingAlternateContactNumber = builder.billingAlternateContactNumber;
        this.billingEmailAddress = builder.billingEmailAddress;
        this.additionalInformation = builder.additionalInformation;
        this.orderType = builder.orderType;
        this.csoName = builder.csoName;
        this.csoDesignation = builder.csoDesignation;
        this.csoCompanyName = builder.csoCompanyName;
        this.csoContactNumber = builder.csoContactNumber;
        this.csoFaxNumber = builder.csoFaxNumber;
        this.csoEmailAddress = builder.csoEmailAddress;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public String getOri() {
        return ori;
    }

    public String getCin() {
        return cin;
    }

    public String getDateOfApplication() {
        return dateOfApplication;
    }

    public String getTentativeProvisonDate() {
        return tentativeProvisonDate;
    }

    public String getTimelineToComeplete() {
        return timelineToComeplete;
    }

    public String getReasonForRejection() {
        return reasonForRejection;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public String getCoverageStatus() {
        return coverageStatus;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public String getCopifType() {
        return copifType;
    }

    public String getInstallationCharge() {
        return installationCharge;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAlternateContactNumber() {
        return alternateContactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getIdType() {
        return idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getRequestedDateOfActivation() {
        return requestedDateOfActivation;
    }

    public String getPreferredInstallationSession() {
        return preferredInstallationSession;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public String getBillingUnitNumber() {
        return billingUnitNumber;
    }

    public String getBillingBuildingNumber() {
        return billingBuildingNumber;
    }

    public String getBillingBuildingName() {
        return billingBuildingName;
    }

    public String getBillingStreetName() {
        return billingStreetName;
    }

    public String getBillingBuildingType() {
        return billingBuildingType;
    }

    public String getBillingSalutation() {
        return billingSalutation;
    }

    public String getBillingFirstName() {
        return billingFirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public String getBillingContactNumber() {
        return billingContactNumber;
    }

    public String getBillingAlternateContactNumber() {
        return billingAlternateContactNumber;
    }

    public String getBillingEmailAddress() {
        return billingEmailAddress;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getCsoName() {
        return csoName;
    }

    public String getCsoDesignation() {
        return csoDesignation;
    }

    public String getCsoCompanyName() {
        return csoCompanyName;
    }

    public String getCsoContactNumber() {
        return csoContactNumber;
    }

    public String getCsoFaxNumber() {
        return csoFaxNumber;
    }

    public String getCsoEmailAddress() {
        return csoEmailAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }
}

