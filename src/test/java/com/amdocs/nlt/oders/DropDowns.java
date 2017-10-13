package com.amdocs.nlt.oders;

public class DropDowns {

    public static final String[] EXPSALUTATION_VALUES = { "Select", "Dr.", "Miss.", "Mr.", "Mrs.", "Ms." };
    public static final String[] EXPACTION_DROPDOWN_VALUES_FOR_CURRENT_STATUS_PENDING = { "Select", "Amend Order",
            "Cancel Order" };
    public static final String[] expSchedules_FTO = { "Select", "Schedule 1", "Schedule 2" };
    public static final String[] expRSP = { "Select", "M1", "Starhub", "My Republic", "ViewQwest", "SuperInternet", "Colt",
            "TPG" };
    public static final String[] expEnhancedRSP = { "Select", "ViewQwest" };

    public static final String[] FTO_rejectReasonDropdownValues = {"Select Rejection Reason", "Different Subscriber Name", "Service still valid", "Others"};
    public static final String[] MDFtoNonResi_expInstallationOption = { "In-building wiring to TP (NLT to Install)",
            "Termination Point in Vertical Telco Riser" };

    public static String[] CoLocationSupplementaryService_coLocAddressDropdownValues = { "Select",
            "AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969",
            "AR:Ayer Rajah Telephone Exchange:1000 Dover Road:139652",
            "BD:Bedok Telephone Exchange:185 Upper East Coast Road:455282",
            "BP:Bukit Panjang Telephone Exchange:40 Woodlands Road:677919", "ES:East Exchange:9 French Road:209232",
            "HG: Hougang Telephone Exchange:11 Compassvale Bow:544996",
            "JW:Jurong West Telephone Exchange:2 Jurong West Street:649112",
            "OC:Orchard Telephone Exchange:31 Exeter Road:239732",
            "TP:Tampines Telephone Exchange:200 Tampines Avenue 5:529647",
            "TS:Tuas Telephone Exchange:9 Tuas Avenue 3:639408" };
    public static String[] CoLocationSupplementaryService_rackTypeValues= {"Select","OLT","DWDM","ROUTERS","FDF/ODF","DC Rectifier/Battery","Others"};
    public static final String[] FAQ_expFaqCategory = { "All Categories", "Billing", "Others", "Mr." };
    public static final String[] NBAP_expOderDropdownValue = { "NLT to install", "Self-Provide NBAP TP", "Pre-installed NBAP" };
    public static final String[] NBAP_expCordinateSystemDropdownValue = { "Select", "WGS84", "SVY21" };
    public static final String[] NonResi_expContractTermsVlaues = { "12 Months", "1 Month" };
    public static final String[] NonResi_expInstallationOptionValues = { "In-building wiring to TP (NLT to Install)",
            "In-building wiring to TP (Self Provide)", "Termination Point in Vertical Telco Riser" };
    public static final String[] Resi_expNumber = { "01", "02", "03" };

    public static final String[] coLocationService_CoLocationAddress = {"Select",
            "AM:Ang Mo Kio Telephone Exchange:25 Ang Mo Kio Avenue 1:569969",
            "AR:Ayer Rajah Telephone Exchange:1000 Dover Road:139652",
            "BD:Bedok Telephone Exchange:185 Upper East Coast Road:455282",
            "BP:Bukit Panjang Telephone Exchange:40 Woodlands Road:677919",
            "ES:East Exchange:9 French Road:209232",
            "JW:Jurong West Telephone Exchange:2 Jurong West Street:649112",
            "OC:Orchard Telephone Exchange:31 Exeter Road:239732",
            "TP:Tampines Telephone Exchange:200 Tampines Avenue 5:529647",
            "TS:Tuas Telephone Exchange:9 Tuas Avenue 3:639408"};
    public static final String[] coLocationService_coLocationRequestType = {"Select", "Co-location Space with Site Preparation", "Site Preparation", "Tie Fibre", "Fibre Cross Connect Installation Service"};
    public static final String[] coLocationService_termOfLicenceRequired = {"Select", "2 Years", "25 Years"};
    public static final String[] coLocationService_equipmentTypeInstalled = {"Select", "OLT", "DWDM", "Routers", "FDF/ODF", "DC Rectifier/Battery", "Others"};
    public static final String[] coLocationService_powerRequirementAc = {"Not Applicable", "16 Amps- Single Phase"/*, "63 Amps- Three Phase"*/};
    public static final String[] coLocationService_powerRequirementDc = {"Not Applicable", "20 Amps", "32 Amps", "40 Amps", "63 Amps"};
    public static final String[] coLocationService_typeOfWork = {"Select", "General Site Preparation", "Electrical Power"};
    public static final String[] coLocationService_tieCableFibreCoresType = {"Select", "96", "288"};
    public static final String[] coLocationService_oduPortType = {"Select", "48", "96", "120", "192", "Others"};
}
