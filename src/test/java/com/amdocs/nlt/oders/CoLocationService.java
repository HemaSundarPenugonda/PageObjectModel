package com.amdocs.nlt.oders;

public class CoLocationService {

    private final String scheduleName;
    private final String applicationReferenceIdentifier;
    private final String coLocationAddress;
    private final String coLocationRequestType;
    private final String fileToBeUploaded;


    private final String coLocationSpaceWithSite_termOfLicenseRequired;
    private final String coLocationSpaceWithSite_typeOfEquipmentInstalled1;
    private final String coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others;
    private final String coLocationSpaceWithSite_coLocationSpaceWidth1;
    private final String coLocationSpaceWithSite_coLocationSpaceDepth1;
    private final String coLocationSpaceWithSite_acPowerRequirement1;
    private final String coLocationSpaceWithSite_acPowerRequirementQuantity1;
    private final String coLocationSpaceWithSite_dcPowerRequirement1;
    private final String coLocationSpaceWithSite_dcPowerRequirementQuantity1;
    private final String coLocationSpaceWithSite_typeOfEquipmentInstalled2;
    private final String coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others;
    private final String coLocationSpaceWithSite_coLocationSpaceWidth2;
    private final String coLocationSpaceWithSite_coLocationSpaceDepth2;
    private final String coLocationSpaceWithSite_acPowerRequirement2;
    private final String coLocationSpaceWithSite_acPowerRequirementQuantity2;
    private final String coLocationSpaceWithSite_dcPowerRequirement2;
    private final String coLocationSpaceWithSite_dcPowerRequirementQuantity2;
    private final boolean genaralSitePreparation_drillingCheckbox;
    private final boolean genaralSitePreparation_cableTrayCheckbox;
    private final boolean genaralSitePreparation_earthCableCheckbox;
    private final boolean genaralSitePreparation_othersCheckbox;
    private final String genaralSitePreparation_othersTextbox;
    private final String genaralSitePreparation_rackId1;
    private final String genaralSitePreparation_rackId2;
    private final String electricalPower_rackId1;
    private final String electricalPower_acPowerRequirement1;
    private final String electricalPower_acPowerRequirementQuantity1;
    private final String electricalPower_dcPowerRequirement1;
    private final String electricalPower_dcPowerRequirementQuantity1;
    private final String electricalPower_rackId2;
    private final String electricalPower_acPowerRequirement2;
    private final String electricalPower_acPowerRequirementQuantity2;
    private final String electricalPower_dcPowerRequirement2;
    private final String electricalPower_dcPowerRequirementQuantity2;
    private final String tieFibre_rackID;
    private final String tieFibre_fibreCores_Type;
    private final String tieFibre_fibreCores_Quantity;
    private final String tieFibre_startOfTermination_shelf;
    private final String tieFibre_startOfTermination_port;
    private final String tieFibre_startOfTermination_fibreStrand;
    private final String tieFibre_endOfTermination_shelf;
    private final String tieFibre_endOfTermination_port;
    private final String tieFibre_endOfTermination_fibreStrand;

    public static class Builder {
        private String scheduleName;
        private String applicationReferenceIdentifier;
        private String coLocationAddress;
        private String coLocationRequestType;
        private final String fileToBeUploaded;

        private String coLocationSpaceWithSite_termOfLicenseRequired;
        private String coLocationSpaceWithSite_typeOfEquipmentInstalled1;
        private String coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others;
        private String coLocationSpaceWithSite_coLocationSpaceWidth1;
        private String coLocationSpaceWithSite_coLocationSpaceDepth1;
        private String coLocationSpaceWithSite_acPowerRequirement1;
        private String coLocationSpaceWithSite_acPowerRequirementQuantity1;
        private String coLocationSpaceWithSite_dcPowerRequirement1;
        private String coLocationSpaceWithSite_dcPowerRequirementQuantity1;
        private String coLocationSpaceWithSite_typeOfEquipmentInstalled2;
        private String coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others;
        private String coLocationSpaceWithSite_coLocationSpaceWidth2;
        private String coLocationSpaceWithSite_coLocationSpaceDepth2;
        private String coLocationSpaceWithSite_acPowerRequirement2;
        private String coLocationSpaceWithSite_acPowerRequirementQuantity2;
        private String coLocationSpaceWithSite_dcPowerRequirement2;
        private String coLocationSpaceWithSite_dcPowerRequirementQuantity2;
        private boolean genaralSitePreparation_drillingCheckbox;
        private boolean genaralSitePreparation_cableTrayCheckbox;
        private boolean genaralSitePreparation_earthCableCheckbox;
        private boolean genaralSitePreparation_othersCheckbox;
        private String genaralSitePreparation_othersTextbox;
        private String genaralSitePreparation_rackId1;
        private String genaralSitePreparation_rackId2;
        private String electricalPower_rackId1;
        private String electricalPower_acPowerRequirement1;
        private String electricalPower_acPowerRequirementQuantity1;
        private String electricalPower_dcPowerRequirement1;
        private String electricalPower_dcPowerRequirementQuantity1;
        private String electricalPower_rackId2;
        private String electricalPower_acPowerRequirement2;
        private String electricalPower_acPowerRequirementQuantity2;
        private String electricalPower_dcPowerRequirement2;
        private String electricalPower_dcPowerRequirementQuantity2;
        private String tieFibre_rackID;
        private String tieFibre_fibreCores_Type;
        private String tieFibre_fibreCores_Quantity;
        private String tieFibre_startOfTermination_shelf;
        private String tieFibre_startOfTermination_port;
        private String tieFibre_startOfTermination_fibreStrand;
        private String tieFibre_endOfTermination_shelf;
        private String tieFibre_endOfTermination_port;
        private String tieFibre_endOfTermination_fibreStrand;

        public Builder(String scheduleName, String applicationReferenceIdentifier, String coLocationAddress, String coLocationRequestType, String fileToBeUploaded) {

            this.scheduleName = scheduleName;
            this.applicationReferenceIdentifier = applicationReferenceIdentifier;
            this.coLocationAddress = coLocationAddress;
            this.coLocationRequestType = coLocationRequestType;
            this.fileToBeUploaded = fileToBeUploaded;
        }

        public Builder coLocationSpaceWithSite_termOfLicenseRequired(String val) {
            coLocationSpaceWithSite_termOfLicenseRequired = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_typeOfEquipmentInstalled1(String val) {
            coLocationSpaceWithSite_typeOfEquipmentInstalled1 = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others(String val) {
            coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_coLocationSpaceWidth1(String val) {
            coLocationSpaceWithSite_coLocationSpaceWidth1 = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_coLocationSpaceDepth1(String val) {
            coLocationSpaceWithSite_coLocationSpaceDepth1 = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_acPowerRequirement1(String val) {
            coLocationSpaceWithSite_acPowerRequirement1 = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_acPowerRequirementQuantity1(String val) {
            coLocationSpaceWithSite_acPowerRequirementQuantity1 = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_dcPowerRequirement1(String val) {
            coLocationSpaceWithSite_dcPowerRequirement1 = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_dcPowerRequirementQuantity1(String val) {
            coLocationSpaceWithSite_dcPowerRequirementQuantity1 = val;
            return this;
        }

        public Builder coLocationSpaceWithSite_typeOfEquipmentInstalled2(String val) {
            coLocationSpaceWithSite_typeOfEquipmentInstalled2 = val;
            return this;
        }
        public Builder coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others(String val) {
            coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others = val;
            return this;
        }
        public Builder coLocationSpaceWithSite_coLocationSpaceWidth2(String val) {
            coLocationSpaceWithSite_coLocationSpaceWidth2 = val;
            return this;
        }
        public Builder coLocationSpaceWithSite_coLocationSpaceDepth2(String val) {
            coLocationSpaceWithSite_coLocationSpaceDepth2 = val;
            return this;
        }
        public Builder coLocationSpaceWithSite_acPowerRequirement2(String val) {
            coLocationSpaceWithSite_acPowerRequirement2 = val;
            return this;
        }
        public Builder coLocationSpaceWithSite_acPowerRequirementQuantity2(String val) {
            coLocationSpaceWithSite_acPowerRequirementQuantity2 = val;
            return this;
        }
        public Builder coLocationSpaceWithSite_dcPowerRequirement2(String val) {
            coLocationSpaceWithSite_dcPowerRequirement2 = val;
            return this;
        }
        public Builder coLocationSpaceWithSite_dcPowerRequirementQuantity2(String val) {
            coLocationSpaceWithSite_dcPowerRequirementQuantity2 = val;
            return this;
        }

        public Builder genaralSitePreparation_drillingCheckbox(String val) {
            genaralSitePreparation_drillingCheckbox = Boolean.valueOf(val);
            return this;
        }

        public Builder genaralSitePreparation_cableTrayCheckbox(String val) {
            genaralSitePreparation_cableTrayCheckbox = Boolean.valueOf(val);
            return this;
        }

        public Builder genaralSitePreparation_earthCableCheckbox(String val) {
            genaralSitePreparation_earthCableCheckbox = Boolean.valueOf(val);
            return this;
        }

        public Builder genaralSitePreparation_othersCheckbox(String val) {
            genaralSitePreparation_othersCheckbox = Boolean.valueOf(val);
            return this;
        }

        public Builder genaralSitePreparation_othersTextbox(String val) {
            genaralSitePreparation_othersTextbox = val;
            return this;
        }

        public Builder genaralSitePreparation_rackId1(String val) {
            genaralSitePreparation_rackId1 = val;
            return this;
        }

        public Builder genaralSitePreparation_rackId2(String val) {
            genaralSitePreparation_rackId2 = val;
            return this;
        }

        public Builder electricalPower_rackId1(String val) {
            electricalPower_rackId1 = val;
            return this;
        }
        public Builder electricalPower_acPowerRequirement1(String val) {
            electricalPower_acPowerRequirement1 = val;
            return this;
        }
        public Builder electricalPower_acPowerRequirementQuantity1(String val) {
            electricalPower_acPowerRequirementQuantity1 = val;
            return this;
        }
        public Builder electricalPower_dcPowerRequirement1(String val) {
            electricalPower_dcPowerRequirement1 = val;
            return this;
        }
        public Builder electricalPower_dcPowerRequirementQuantity1(String val) {
            electricalPower_dcPowerRequirementQuantity1 = val;
            return this;
        }
        public Builder electricalPower_rackId2(String val) {
            electricalPower_rackId2 = val;
            return this;
        }
        public Builder electricalPower_acPowerRequirement2(String val) {
            electricalPower_acPowerRequirement2 = val;
            return this;
        }
        public Builder electricalPower_acPowerRequirementQuantity2(String val) {
            electricalPower_acPowerRequirementQuantity2 = val;
            return this;
        }
        public Builder electricalPower_dcPowerRequirement2(String val) {
            electricalPower_dcPowerRequirement2 = val;
            return this;
        }
        public Builder electricalPower_dcPowerRequirementQuantity2(String val) {
            electricalPower_dcPowerRequirementQuantity2 = val;
            return this;
        }

        public Builder tieFibre_rackID(String val) {
            tieFibre_rackID = val;
            return this;
        }

        public Builder tieFibre_fibreCores_Type(String val) {
            tieFibre_fibreCores_Type = val;
            return this;
        }

        public Builder tieFibre_fibreCores_Quantity(String val) {
            tieFibre_fibreCores_Quantity = val;
            return this;
        }

        public Builder tieFibre_startOfTermination_shelf(String val) {
            tieFibre_startOfTermination_shelf = val;
            return this;
        }

        public Builder tieFibre_startOfTermination_port(String val) {
            tieFibre_startOfTermination_port = val;
            return this;
        }

        public Builder tieFibre_startOfTermination_fibreStrand(String val) {
            tieFibre_startOfTermination_fibreStrand = val;
            return this;
        }

        public Builder tieFibre_endOfTermination_shelf(String val) {
            tieFibre_endOfTermination_shelf = val;
            return this;
        }

        public Builder tieFibre_endOfTermination_port(String val) {
            tieFibre_endOfTermination_port = val;
            return this;
        }

        public Builder tieFibre_endOfTermination_fibreStrand(String val) {
            tieFibre_endOfTermination_fibreStrand = val;
            return this;
        }

        public CoLocationService build() {
            return new CoLocationService(this);
        }

    }

    private CoLocationService(Builder builder) {
        this.scheduleName = builder.scheduleName;
        this.applicationReferenceIdentifier = builder.applicationReferenceIdentifier;
        this.coLocationAddress = builder.coLocationAddress;
        this.coLocationRequestType = builder.coLocationRequestType;
        this.fileToBeUploaded = builder.fileToBeUploaded;

        this.coLocationSpaceWithSite_termOfLicenseRequired = builder.coLocationSpaceWithSite_termOfLicenseRequired;
        this.coLocationSpaceWithSite_typeOfEquipmentInstalled1 = builder.coLocationSpaceWithSite_typeOfEquipmentInstalled1;
        this.coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others = builder.coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others;
        this.coLocationSpaceWithSite_coLocationSpaceWidth1 = builder.coLocationSpaceWithSite_coLocationSpaceWidth1;
        this.coLocationSpaceWithSite_coLocationSpaceDepth1 = builder.coLocationSpaceWithSite_coLocationSpaceDepth1;
        this.coLocationSpaceWithSite_acPowerRequirement1 = builder.coLocationSpaceWithSite_acPowerRequirement1;
        this.coLocationSpaceWithSite_acPowerRequirementQuantity1 = builder.coLocationSpaceWithSite_acPowerRequirementQuantity1;
        this.coLocationSpaceWithSite_dcPowerRequirement1 = builder.coLocationSpaceWithSite_dcPowerRequirement1;
        this.coLocationSpaceWithSite_dcPowerRequirementQuantity1 = builder.coLocationSpaceWithSite_dcPowerRequirementQuantity1;
        this.coLocationSpaceWithSite_typeOfEquipmentInstalled2 = builder.coLocationSpaceWithSite_typeOfEquipmentInstalled2;
        this.coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others = builder.coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others;
        this.coLocationSpaceWithSite_coLocationSpaceWidth2 = builder.coLocationSpaceWithSite_coLocationSpaceWidth2;
        this.coLocationSpaceWithSite_coLocationSpaceDepth2 = builder.coLocationSpaceWithSite_coLocationSpaceDepth2;
        this.coLocationSpaceWithSite_acPowerRequirement2 = builder.coLocationSpaceWithSite_acPowerRequirement2;
        this.coLocationSpaceWithSite_acPowerRequirementQuantity2 = builder.coLocationSpaceWithSite_acPowerRequirementQuantity2;
        this.coLocationSpaceWithSite_dcPowerRequirement2 = builder.coLocationSpaceWithSite_dcPowerRequirement2;
        this.coLocationSpaceWithSite_dcPowerRequirementQuantity2 = builder.coLocationSpaceWithSite_dcPowerRequirementQuantity2;

        this.genaralSitePreparation_drillingCheckbox = builder.genaralSitePreparation_drillingCheckbox;
        this.genaralSitePreparation_cableTrayCheckbox = builder.genaralSitePreparation_cableTrayCheckbox;
        this.genaralSitePreparation_earthCableCheckbox = builder.genaralSitePreparation_earthCableCheckbox;
        this.genaralSitePreparation_othersCheckbox = builder.genaralSitePreparation_othersCheckbox;
        this.genaralSitePreparation_othersTextbox = builder.genaralSitePreparation_othersTextbox;
        this.genaralSitePreparation_rackId1 = builder.genaralSitePreparation_rackId1;
        this.genaralSitePreparation_rackId2 = builder.genaralSitePreparation_rackId2;
        this.electricalPower_rackId1 = builder.electricalPower_rackId1;
        this.electricalPower_acPowerRequirement1 = builder.electricalPower_acPowerRequirement1;
        this.electricalPower_acPowerRequirementQuantity1 = builder.electricalPower_acPowerRequirementQuantity1;
        this.electricalPower_dcPowerRequirement1 = builder.electricalPower_dcPowerRequirement1;
        this.electricalPower_dcPowerRequirementQuantity1 = builder.electricalPower_dcPowerRequirementQuantity1;
        this.electricalPower_rackId2 = builder.electricalPower_rackId2;
        this.electricalPower_acPowerRequirement2 = builder.electricalPower_acPowerRequirement2;
        this.electricalPower_acPowerRequirementQuantity2 = builder.electricalPower_acPowerRequirementQuantity2;
        this.electricalPower_dcPowerRequirement2 = builder.electricalPower_dcPowerRequirement2;
        this.electricalPower_dcPowerRequirementQuantity2 = builder.electricalPower_dcPowerRequirementQuantity2;

        this.tieFibre_rackID = builder.tieFibre_rackID;
        this.tieFibre_fibreCores_Type = builder.tieFibre_fibreCores_Type;
        this.tieFibre_fibreCores_Quantity = builder.tieFibre_fibreCores_Quantity;
        this.tieFibre_startOfTermination_shelf = builder.tieFibre_startOfTermination_shelf;
        this.tieFibre_startOfTermination_port = builder.tieFibre_startOfTermination_port;
        this.tieFibre_startOfTermination_fibreStrand = builder.tieFibre_startOfTermination_fibreStrand;
        this.tieFibre_endOfTermination_shelf = builder.tieFibre_endOfTermination_shelf;
        this.tieFibre_endOfTermination_port = builder.tieFibre_endOfTermination_port;
        this.tieFibre_endOfTermination_fibreStrand = builder.tieFibre_endOfTermination_fibreStrand;
    }

    public String getCoLocationSpaceWithSite_termOfLicenseRequired() {
        return coLocationSpaceWithSite_termOfLicenseRequired;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public String getFileToBeUploaded() {
        return fileToBeUploaded;
    }

    public String getApplicationReferenceIdentifier() {
        return applicationReferenceIdentifier;
    }

    public String getCoLocationAddress() {
        return coLocationAddress;
    }

    public String getCoLocationRequestType() {
        return coLocationRequestType;
    }

    public String getCoLocationSpaceWithSite_typeOfEquipmentInstalled1() {
        return coLocationSpaceWithSite_typeOfEquipmentInstalled1;
    }

    public String getCoLocationSpaceWithSite_typeOfEquipmentInstalled1_Others() {
        return coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others;
    }

    public String getCoLocationSpaceWithSite_coLocationSpaceWidth1() {
        return coLocationSpaceWithSite_coLocationSpaceWidth1;
    }

    public String getCoLocationSpaceWithSite_coLocationSpaceDepth1() {
        return coLocationSpaceWithSite_coLocationSpaceDepth1;
    }

    public String getCoLocationSpaceWithSite_acPowerRequirement1() {
        return coLocationSpaceWithSite_acPowerRequirement1;
    }

    public String getCoLocationSpaceWithSite_acPowerRequirementQuantity1() {
        return coLocationSpaceWithSite_acPowerRequirementQuantity1;
    }

    public String getCoLocationSpaceWithSite_dcPowerRequirement1() {
        return coLocationSpaceWithSite_dcPowerRequirement1;
    }

    public String getCoLocationSpaceWithSite_dcPowerRequirementQuantity1() {
        return coLocationSpaceWithSite_dcPowerRequirementQuantity1;
    }

    public String getCoLocationSpaceWithSite_typeOfEquipmentInstalled2() {
        return coLocationSpaceWithSite_typeOfEquipmentInstalled2;
    }

    public String getCoLocationSpaceWithSite_typeOfEquipmentInstalled2_Others() {
        return coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others;
    }

    public String getCoLocationSpaceWithSite_coLocationSpaceWidth2() {
        return coLocationSpaceWithSite_coLocationSpaceWidth2;
    }

    public String getCoLocationSpaceWithSite_coLocationSpaceDepth2() {
        return coLocationSpaceWithSite_coLocationSpaceDepth2;
    }

    public String getCoLocationSpaceWithSite_acPowerRequirement2() {
        return coLocationSpaceWithSite_acPowerRequirement2;
    }

    public String getCoLocationSpaceWithSite_acPowerRequirementQuantity2() {
        return coLocationSpaceWithSite_acPowerRequirementQuantity2;
    }

    public String getCoLocationSpaceWithSite_dcPowerRequirement2() {
        return coLocationSpaceWithSite_dcPowerRequirement2;
    }

    public String getCoLocationSpaceWithSite_dcPowerRequirementQuantity2() {
        return coLocationSpaceWithSite_dcPowerRequirementQuantity2;
    }

    public boolean isGenaralSitePreparation_drillingCheckbox() {
        return genaralSitePreparation_drillingCheckbox;
    }

    public boolean isGenaralSitePreparation_cableTrayCheckbox() {
        return genaralSitePreparation_cableTrayCheckbox;
    }

    public boolean isGenaralSitePreparation_earthCableCheckbox() {
        return genaralSitePreparation_earthCableCheckbox;
    }

    public boolean isGenaralSitePreparation_othersCheckbox() {
        return genaralSitePreparation_othersCheckbox;
    }

    public String getGenaralSitePreparation_othersTextbox() {
        return genaralSitePreparation_othersTextbox;
    }

    public String getGenaralSitePreparation_rackId1() {
        return genaralSitePreparation_rackId1;
    }

    public String getGenaralSitePreparation_rackId2() {
        return genaralSitePreparation_rackId2;
    }

    public String getElectricalPower_rackId1() {
        return electricalPower_rackId1;
    }

    public String getElectricalPower_acPowerRequirement1() {
        return electricalPower_acPowerRequirement1;
    }

    public String getElectricalPower_acPowerRequirementQuantity1() {
        return electricalPower_acPowerRequirementQuantity1;
    }

    public String getElectricalPower_dcPowerRequirement1() {
        return electricalPower_dcPowerRequirement1;
    }

    public String getElectricalPower_dcPowerRequirementQuantity1() {
        return electricalPower_dcPowerRequirementQuantity1;
    }

    public String getElectricalPower_rackId2() {
        return electricalPower_rackId2;
    }

    public String getElectricalPower_acPowerRequirement2() {
        return electricalPower_acPowerRequirement2;
    }

    public String getElectricalPower_acPowerRequirementQuantity2() {
        return electricalPower_acPowerRequirementQuantity2;
    }

    public String getElectricalPower_dcPowerRequirement2() {
        return electricalPower_dcPowerRequirement2;
    }

    public String getElectricalPower_dcPowerRequirementQuantity2() {
        return electricalPower_dcPowerRequirementQuantity2;
    }


    public String getTieFibre_rackID() {
        return tieFibre_rackID;
    }

    public String getTieFibre_fibreCores_Type() {
        return tieFibre_fibreCores_Type;
    }

    public String getTieFibre_fibreCores_Quantity() {
        return tieFibre_fibreCores_Quantity;
    }

    public String getTieFibre_startOfTermination_shelf() {
        return tieFibre_startOfTermination_shelf;
    }

    public String getTieFibre_startOfTermination_port() {
        return tieFibre_startOfTermination_port;
    }

    public String getTieFibre_startOfTermination_fibreStrand() {
        return tieFibre_startOfTermination_fibreStrand;
    }

    public String getTieFibre_endOfTermination_shelf() {
        return tieFibre_endOfTermination_shelf;
    }

    public String getTieFibre_endOfTermination_port() {
        return tieFibre_endOfTermination_port;
    }

    public String getTieFibre_endOfTermination_fibreStrand() {
        return tieFibre_endOfTermination_fibreStrand;
    }

}
