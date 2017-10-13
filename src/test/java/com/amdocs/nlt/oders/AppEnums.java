package com.amdocs.nlt.oders;

public class AppEnums {

    public interface LocalEnum {
        String getValue();
    }

    public enum coLocationService_termOfLicenceRequired implements LocalEnum {
        SELECT("Select"),
        TWOYEARS("2 Years"),
        TWENTYFIVEYEARS("25 Years");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        coLocationService_termOfLicenceRequired(String value){
            this.value = value;
        }
    }

    public enum coLocationService_coLocationRequestType implements LocalEnum {
        SELECT("Select") ,
        SPACEWITHSITEPREPARATION("Co-location Space with Site Preparation"),
        SITEPREPARATION("Site Preparation"),
        TIEFIBRE("Tie Fibre"),
        FIBRECROSSCONNECT("Fibre Cross Connect Installation Service");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        coLocationService_coLocationRequestType(String value){
            this.value = value;
        }
    }

    public enum EXPSALUTATION_VALUES implements LocalEnum {
        SELECT("Select"),
        DR("Dr."),
        MISS("Miss."),
        MR("Mr."),
        MRS("Mrs."),
        MS("Ms.");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        EXPSALUTATION_VALUES(String value){
            this.value = value;
        }
    }

    public enum EXPACTION_DROPDOWN_VALUES_FOR_CURRENT_STATUS_PENDING implements LocalEnum {
        SELECT("Select"),
        AMENDORDER("Amend Order"),
        CANCELORDER("Cancel Order");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        EXPACTION_DROPDOWN_VALUES_FOR_CURRENT_STATUS_PENDING(String value){
            this.value = value;
        }
    }

    public enum expSchedules_FTO implements LocalEnum {
        SELECT("Select"),
        SCHEDULE1("Schedule 1"),
        SCHEDULE2("Schedule 2");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        expSchedules_FTO(String value){
            this.value = value;
        }
    }

    public enum expRSP implements LocalEnum {
        SELECT("Select"),
        M1("M1"),
        STARHUB("Starhub"),
        MYREPUBLIC("My Republic"),
        VIEWQWEST("ViewQwest"),
        SUPERINTERNET("SuperInternet"),
        COLT("Colt"),
        TPG("TPG");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        expRSP(String value){
            this.value = value;
        }
    }

    public enum expEnhancedRSP implements LocalEnum {
        SELECT("Select"),
        VIEWQWEST("ViewQwest");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        expEnhancedRSP(String value){
            this.value = value;
        }
    }

    public enum FTO_rejectReasonDropdownValues implements LocalEnum {
        SELECTREJECTIONREASON("Select Rejection Reason"),
        DIFFERENTSUBSCRIBERNAME("Different Subscriber Name"),
        SERVICESTILLVALID("Service still valid"),
        OTHERS("Others");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        FTO_rejectReasonDropdownValues(String value){
            this.value = value;
        }
    }

    public enum MDFtoNonResi_expInstallationOption implements LocalEnum {
        INBUILDINGWIRINGTOTP("In-building wiring to TP (NLT to Install)"),
        TERMINATIONPOINTINVERTICALTELCORISER("Termination Point in Vertical Telco Riser");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        MDFtoNonResi_expInstallationOption(String value){
            this.value = value;
        }
    }

    public enum CoLocationSupplementaryService_coLocAddressDropdownValues implements LocalEnum {
        SELECT("Select"),
        AM("AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969"),
        AR("AR:Ayer Rajah Telephone Exchange:1000 Dover Road:139652"),
        BD("BD:Bedok Telephone Exchange:185 Upper East Coast Road:455282"),
        BP("BP:Bukit Panjang Telephone Exchange:40 Woodlands Road:677919"),
        ES("ES:East Exchange:9 French Road:209232"),
        HG("HG: Hougang Telephone Exchange:11 Compassvale Bow:544996"),
        JW("JW:Jurong West Telephone Exchange:2 Jurong West Street:649112"),
        OC("OC:Orchard Telephone Exchange:31 Exeter Road:239732"),
        TP("TP:Tampines Telephone Exchange:200 Tampines Avenue 5:529647"),
        TS("TS:Tuas Telephone Exchange:9 Tuas Avenue 3:639408");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        CoLocationSupplementaryService_coLocAddressDropdownValues(String value){
            this.value = value;
        }
    }

    public enum coLocationService_CoLocationAddress implements LocalEnum {
        SELECT("Select"),
        AM("AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969"),
        AR("AR:Ayer Rajah Telephone Exchange:1000 Dover Road:139652"),
        BD("BD:Bedok Telephone Exchange:185 Upper East Coast Road:455282"),
        BP("BP:Bukit Panjang Telephone Exchange:40 Woodlands Road:677919"),
        ES("ES:East Exchange:9 French Road:209232"),
        JW("JW:Jurong West Telephone Exchange:2 Jurong West Street:649112"),
        OC("OC:Orchard Telephone Exchange:31 Exeter Road:239732"),
        TP("TP:Tampines Telephone Exchange:200 Tampines Avenue 5:529647"),
        TS("TS:Tuas Telephone Exchange:9 Tuas Avenue 3:639408");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        coLocationService_CoLocationAddress(String value){
            this.value = value;
        }

    }

    public enum CoLocationSupplementaryService_rackTypeValues implements LocalEnum {
        SELECT("Select"),
        OLT("OLT"),
        DWDM("DWDM"),
        ROUTERS("ROUTERS"),
        FDFODF("FDF/ODF"),
        DCRECTIFIERBATTERY("DC Rectifier/Battery"),
        OTHERS("Others");

        private String value;
        CoLocationSupplementaryService_rackTypeValues(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

    public enum FAQ_expFaqCategory implements LocalEnum {
        ALLCATEGORIES("All Categories"),
        BILLING("Billing"),
        OTHERS("Others"),
        MR("Mr.");

        private String value;
        FAQ_expFaqCategory(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

    public enum NBAP_expOderDropdownValue implements LocalEnum {
        NLTTOINSTALL("NLT to install"),
        SELFPROVIDENBAPTP("Self-Provide NBAP TP"),
        PREINSTALLEDNBAP("Pre-installed NBAP");

        private String value;
        @Override
        public String getValue(){
            return this.value;
        }
        NBAP_expOderDropdownValue(String value){
            this.value = value;
        }
    }

    public enum NBAP_expCordinateSystemDropdownValue implements LocalEnum {
        SELECT("Select"),
        WGS84("WGS84"),
        SVY21("SVY21");

        private String value;
        NBAP_expCordinateSystemDropdownValue(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

    public enum coLocationService_equipmentTypeInstalled implements LocalEnum {
        SELECT("Select"),
        OLT("OLT"),
        DWDM("DWDM"),
        ROUTERS("Routers"),
        FDFODF("FDF/ODF"),
        DCRECTIFIERBATTERY("DC Rectifier/Battery"),
        OTHERS("Others");

        private String value;
        coLocationService_equipmentTypeInstalled(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

    public enum coLocationService_powerRequirementAc implements LocalEnum {
        NOTAPPLICABLE("Not Applicable"),
        SIXTEENAMPSSINGLEPHASE("16 Amps- Single Phase");
//        SIXTYTHREEAMPSTHREEPHASE("63 Amps- Three Phase");

        private String value;
        coLocationService_powerRequirementAc(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

    public enum coLocationService_powerRequirementDc implements LocalEnum {
        NOTAPPLICABLE("Not Applicable"),
        TWENTYAMPS("20 Amps"),
        THIRTYTWOAMPS("32 Amps"),
        FORTYAMPS("40 Amps"),
        SIXTYTHREEAMPS("63 Amps");

        private String value;
        coLocationService_powerRequirementDc(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }

    }

    public enum coLocationService_typeOfWork implements LocalEnum {
        SELECT("Select"),
        GENERALSITEPREPARATION("General Site Preparation"),
        ElectricalPower("Electrical Power");

        private String value;
        coLocationService_typeOfWork(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

    public enum coLocationService_tieCableFibreCoresType implements LocalEnum {
        Select("Select"),
        NintySix("96"),
        TWOEIGHTYEIGHT("288");

        private String value;
        coLocationService_tieCableFibreCoresType(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

    public enum coLocationService_oduPortType implements LocalEnum {
        Select("Select"),
        FORTYEIGHT("48"),
        NINTYSIX("96"),
        ONETWENTY("120"),
        ONENINTYTWO("192"),
        Others("Others");

        private String value;
        coLocationService_oduPortType(String value){
            this.value = value;
        }

        @Override
        public String getValue(){
            return this.value;
        }
    }

}




