package com.amdocs.nlt.oders;

/**
 * @author Hemsundar
 */
public class AddressObject {

    private String scheduleName;
    private String postalCode;
    private String unitNumber;
    private String buildingNumber;
    private String buildingName;
    private String streetName;
    private String buildingType;
    private String copifType;
    private String coverageStatus;
    private boolean isReclassify;
    private boolean isRelocation;

    public static class Builder {
        private String scheduleName;
        private String postalCode;
        private String unitNumber;
        private String buildingNumber;
        private String buildingName;
        private String streetName;
        private String buildingType;
        private String copifType;
        private String coverageStatus;
        private boolean isReclassify;
        private boolean isRelocation;

        public Builder(String scheduleName, String postalCode, String unitNumber) {

            this.scheduleName = scheduleName;
            this.postalCode = postalCode;
            this.unitNumber = unitNumber;
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

        public Builder coverageStatus(String val) {
            coverageStatus = val;
            return this;
        }
        public Builder isReclassify(boolean val) {
            isReclassify = val;
            return this;
        }
        public Builder isRelocation(boolean val) {
            isRelocation = val;
            return this;
        }

        public AddressObject build() {
            return new AddressObject(this);
        }

    }

    private AddressObject(Builder builder) {
        this.scheduleName = builder.scheduleName;
        this.postalCode = builder.postalCode;
        this.unitNumber = builder.unitNumber;

        this.buildingNumber = builder.buildingNumber;
        this.buildingName = builder.buildingName;
        this.streetName = builder.streetName;
        this.buildingType = builder.buildingType;
        this.copifType = builder.copifType;
        this.coverageStatus = builder.coverageStatus;
        this.isReclassify = builder.isReclassify;
        this.isRelocation = builder.isRelocation;
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

    public String getCoverageStatus() {
        return coverageStatus;
    }

    public boolean isReclassify() {
        return isReclassify;
    }

    public boolean isRelocation() {
        return isRelocation;
    }
}
