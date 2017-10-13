package com.amdocs.nlt.util;

import com.amdocs.nlt.oders.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class Utilities {

    private static CommonDataObject commonData;
    private static SearchData searchData;
    private static UserDetailsObject userDetails;
    private static AddressObject addressDetails;
    private static CoLocationService coLocationService;

    private static Properties loadAddressProperties(String path) throws IOException {
        File src = new File(path);
        FileInputStream fis = new FileInputStream(src);
        Properties properties = new Properties();
        properties.load(fis);
        return properties;
    }

    public static AddressObject prepareAddress(String scheduleAlias, String coverageStatusAlias) throws IOException {
        return prepareAddress(scheduleAlias, coverageStatusAlias, false, false);
    }

    public static AddressObject prepareAddress(String scheduleAlias, String coverageStatusAlias, boolean relocation, boolean reclassify) throws IOException {
        if (addressDetails == null) {
            synchronized (Utilities.class) {
                if (addressDetails == null) {
                    Properties properties = loadAddressProperties("./Data/Address.property");
                    String scheduleName;
                    if (scheduleAlias.equalsIgnoreCase("schedule1"))
                        scheduleName = "Schedule 1";
                    else if((scheduleAlias.equalsIgnoreCase("schedule2")))
                        scheduleName = "Schedule 2";
                    else if((scheduleAlias.equalsIgnoreCase("schedule8")))
                        scheduleName = "Schedule 8";
                    else
                        scheduleName="invalid schedule";

                    String coverageStatusKey, postalCodeKey, unitNumberKey, buildingNumberKey, buildingNameKey, streetNameKey, buildingTypeKey, copifTypeKey;
                    String relocationString;
                    if (relocation) {
                        relocationString = "relocation.";
                    } else {
                        relocationString = "";
                    }
                    String reclassifyString;
                    if (reclassify) {
                        reclassifyString = "reclassify.";
                    } else {
                        reclassifyString = "";
                    }
                    String coverageStatus = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".coveragestatus");
                    String postalCode = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".postalcode");
                    String unitNumber = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".unitnumber");
                    String buildingNumber = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".buildingnumber");
                    String buildingName = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".buildingname");
                    String streetName = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".streetname");
                    String buildingType = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".buildingtype");
                    String copifType = properties.getProperty(relocationString + reclassifyString + scheduleAlias.toLowerCase() + "." + coverageStatusAlias.toLowerCase() + ".copiftype");

                    return new AddressObject.Builder(scheduleName, postalCode, unitNumber).buildingNumber(buildingNumber)
                            .buildingName(buildingName).streetName(streetName).buildingType(buildingType)
                            .copifType(copifType).coverageStatus(coverageStatus).isReclassify(reclassify).isRelocation(relocation).build();
                }
            }
        }
        return addressDetails;
    }

    public static UserDetailsObject prepareUserDetails() throws IOException {
        if (userDetails == null) {
            synchronized (Utilities.class) {
                if (userDetails == null) {
                    Properties properties = loadAddressProperties("./Data/UserDetails.property");

                    return new UserDetailsObject.Builder().salutation(properties.getProperty("salutation"))
                            .firstName(properties.getProperty("firstname"))
                            .lastName(properties.getProperty("lastname"))
                            .companyName(properties.getProperty("companyname"))
                            .contactNumber(properties.getProperty("contactnumber"))
                            .alternateContactNumber(properties.getProperty("alternatecontactnumber"))
                            .emailAddress(properties.getProperty("emailaddress"))
                            .alternateEmailAddress(properties.getProperty("alternateemailaddress"))
                            .build();
                }
            }
        }
        return userDetails;
    }

    public static CommonDataObject prepareCommonData() throws IOException {
        if (commonData == null) {
            synchronized (Utilities.class) {
                if (commonData == null) {
                    Properties properties = loadAddressProperties("./Data/Common.property");

                    return new CommonDataObject.Builder()
                            .applicationReference_success(properties.getProperty("applicationReference.success"))
                            .applicationReference_fail(properties.getProperty("applicationReference.fail"))
                            .applicationReference_maxLength(properties.getProperty("applicationReference.maxLength"))
                            .applicationReference_maxLengthPlus1(properties.getProperty("applicationReference.maxLengthPlus1"))
                            .applicationReference_maxLengthMinus1(properties.getProperty("applicationReference.maxLengthMinus1"))
                            .applicationReference_minLength(properties.getProperty("applicationReference.minLength"))
                            .build();
                }
            }
        }
        return commonData;
    }

    public static CoLocationService prepareSchedule12Data() throws IOException {
        if (coLocationService == null) {
            synchronized (Utilities.class) {
                if (coLocationService == null) {
                    Properties properties = loadAddressProperties("./Data/Schedule12Create.properties");
/*                    final CoLocationService_TieFibre tieFibre = new CoLocationService_TieFibre.Builder()
                            .tieFibre_rackID(properties.getProperty("tieFibre.rackId"))
                            .tieFibre_fibreCores_Type(properties.getProperty("tieFibre.tieCableFibreCoresType"))
                            .tieFibre_fibreCores_Quantity(properties.getProperty("tieFibre.tieCableFibreCoresQuantity"))
                            .tieFibre_startOfTermination_shelf(properties.getProperty("tieFibre.startTerminationShelf"))
                            .tieFibre_startOfTermination_port(properties.getProperty("tieFibre.startTerminationPort"))
                            .tieFibre_startOfTermination_fibreStrand(properties.getProperty("tieFibre.startTerminationFibreStrand"))
                            .tieFibre_endOfTermination_shelf(properties.getProperty("tieFibre.endTerminationShelf"))
                            .tieFibre_endOfTermination_port(properties.getProperty("tieFibre.endTerminationPort"))
                            .tieFibre_endOfTermination_fibreStrand(properties.getProperty("tieFibre.endTerminationFibreStrand"))
                            .build();*/

                    return new CoLocationService.Builder(properties.getProperty("Schedule12"), properties.getProperty("applicationReferenceIdentifier"), properties.getProperty("coLocationAddress"), properties.getProperty("coLocationRequestType"), properties.getProperty("fileToBeUploaded"))
                            .coLocationSpaceWithSite_termOfLicenseRequired(properties.getProperty("coLocationSpaceWithSite.termOfLicenseRequired"))
                            .coLocationSpaceWithSite_typeOfEquipmentInstalled1(properties.getProperty("coLocationSpaceWithSite.typeOfEquipmentInstalled1"))
                            .coLocationSpaceWithSite_typeOfEquipmentInstalled1_Others(properties.getProperty("coLocationSpaceWithSite.typeOfEquipmentInstalled1.Others"))
                            .coLocationSpaceWithSite_coLocationSpaceWidth1(properties.getProperty("coLocationSpaceWithSite.coLocationSpaceWidth1"))
                            .coLocationSpaceWithSite_coLocationSpaceDepth1(properties.getProperty("coLocationSpaceWithSite.coLocationSpaceDepth1"))
                            .coLocationSpaceWithSite_acPowerRequirement1(properties.getProperty("coLocationSpaceWithSite.acPowerRequirement1"))
                            .coLocationSpaceWithSite_acPowerRequirementQuantity1(properties.getProperty("coLocationSpaceWithSite.acPowerRequirementQuantity1"))
                            .coLocationSpaceWithSite_dcPowerRequirement1(properties.getProperty("coLocationSpaceWithSite.dcPowerRequirement1"))
                            .coLocationSpaceWithSite_dcPowerRequirementQuantity1(properties.getProperty("coLocationSpaceWithSite.dcPowerRequirementQuantity1"))
                            .coLocationSpaceWithSite_typeOfEquipmentInstalled2(properties.getProperty("coLocationSpaceWithSite.typeOfEquipmentInstalled2"))
                            .coLocationSpaceWithSite_typeOfEquipmentInstalled2_Others(properties.getProperty("coLocationSpaceWithSite.typeOfEquipmentInstalled2.Others"))
                            .coLocationSpaceWithSite_coLocationSpaceWidth2(properties.getProperty("coLocationSpaceWithSite.coLocationSpaceWidth2"))
                            .coLocationSpaceWithSite_coLocationSpaceDepth2(properties.getProperty("coLocationSpaceWithSite.coLocationSpaceDepth2"))
                            .coLocationSpaceWithSite_acPowerRequirement2(properties.getProperty("coLocationSpaceWithSite.acPowerRequirement2"))
                            .coLocationSpaceWithSite_acPowerRequirementQuantity2(properties.getProperty("coLocationSpaceWithSite.acPowerRequirementQuantity2"))
                            .coLocationSpaceWithSite_dcPowerRequirement2(properties.getProperty("coLocationSpaceWithSite.dcPowerRequirement2"))
                            .coLocationSpaceWithSite_dcPowerRequirementQuantity2(properties.getProperty("coLocationSpaceWithSite.dcPowerRequirementQuantity2"))

                            .genaralSitePreparation_drillingCheckbox(properties.getProperty("genaralSitePreparation.drillingCheckbox"))
                            .genaralSitePreparation_cableTrayCheckbox(properties.getProperty("genaralSitePreparation.cableTrayCheckbox"))
                            .genaralSitePreparation_earthCableCheckbox(properties.getProperty("genaralSitePreparation.earthCableCheckbox"))
                            .genaralSitePreparation_othersCheckbox(properties.getProperty("genaralSitePreparation.othersCheckbox"))
                            .genaralSitePreparation_othersTextbox(properties.getProperty("genaralSitePreparation.othersTextbox"))
                            .genaralSitePreparation_rackId1(properties.getProperty("genaralSitePreparation.rackId1"))
                            .genaralSitePreparation_rackId2(properties.getProperty("genaralSitePreparation.rackId2"))

                            .electricalPower_rackId1(properties.getProperty("electricalPower.rackId1"))
                            .electricalPower_acPowerRequirement1(properties.getProperty("electricalPower.acPowerRequirement1"))
                            .electricalPower_acPowerRequirementQuantity1(properties.getProperty("electricalPower.acPowerRequirementQuantity1"))
                            .electricalPower_dcPowerRequirement1(properties.getProperty("electricalPower.dcPowerRequirement1"))
                            .electricalPower_dcPowerRequirementQuantity1(properties.getProperty("electricalPower.dcPowerRequirementQuantity1"))
                            .electricalPower_rackId2(properties.getProperty("electricalPower.rackId2"))
                            .electricalPower_acPowerRequirement2(properties.getProperty("electricalPower.acPowerRequirement2"))
                            .electricalPower_acPowerRequirementQuantity2(properties.getProperty("electricalPower.acPowerRequirementQuantity2"))
                            .electricalPower_dcPowerRequirement2(properties.getProperty("electricalPower.dcPowerRequirement2"))
                            .electricalPower_dcPowerRequirementQuantity2(properties.getProperty("electricalPower.dcPowerRequirementQuantity2"))

                            .tieFibre_rackID(properties.getProperty("tieFibre.rackId"))
                            .tieFibre_fibreCores_Type(properties.getProperty("tieFibre.tieCableFibreCoresType"))
                            .tieFibre_fibreCores_Quantity(properties.getProperty("tieFibre.tieCableFibreCoresQuantity"))
                            .tieFibre_startOfTermination_shelf(properties.getProperty("tieFibre.startTerminationShelf"))
                            .tieFibre_startOfTermination_port(properties.getProperty("tieFibre.startTerminationPort"))
                            .tieFibre_startOfTermination_fibreStrand(properties.getProperty("tieFibre.startTerminationFibreStrand"))
                            .tieFibre_endOfTermination_shelf(properties.getProperty("tieFibre.endTerminationShelf"))
                            .tieFibre_endOfTermination_port(properties.getProperty("tieFibre.endTerminationPort"))
                            .tieFibre_endOfTermination_fibreStrand(properties.getProperty("tieFibre.endTerminationFibreStrand"))
                            .build();

                }
            }
        }
        return coLocationService;
    }

    public static String timeConversion(long milliSeconds) {

        final int MINUTES_IN_AN_HOUR = 60;
        final int SECONDS_IN_A_MINUTE = 60;
        final int MIILLIS_IN_A_SEC = 1000;

        long seconds = milliSeconds/MIILLIS_IN_A_SEC;
        int minutes = (int) (seconds / SECONDS_IN_A_MINUTE);
        seconds -= minutes * SECONDS_IN_A_MINUTE;

        int hours = minutes / MINUTES_IN_AN_HOUR;
        minutes -= hours * MINUTES_IN_AN_HOUR;

        return hours + ":" + minutes + ":" + (int)seconds;
    }

    public static String dateConversion(long unixTimeStamp) {
        return new Date(unixTimeStamp).toString();
    }

    public static SearchData prepareSearchData() throws IOException {
        if (searchData == null) {
            synchronized (Utilities.class) {
                if (searchData == null) {
                    Properties properties = loadAddressProperties("./Data/Search.properties");

                    return new SearchData.Builder()
                            .searchByOri_Success(properties.getProperty("search.ori.success"))
                            .searchByOri_ManageTpbyAddress_Amend(properties.getProperty("search.ori.amend.managetpbyaddress"))
                            .ori_amend_manageTPbyAddress_schedule1_pending(properties.getProperty("ori.amend.managetpbyaddress.schedule1.pending"))
                            .ori_amend_manageTPbyAddress_schedule2_pending(properties.getProperty("ori.amend.managetpbyaddress.schedule2.pending"))
                            .ori_amend_manageTPbyAddress_schedule8_pending(properties.getProperty("ori.amend.managetpbyaddress.schedule8.pending"))
                            .ori_amend_manageTPbyAddress_schedule9_pending(properties.getProperty("ori.amend.managetpbyaddress.schedule9.pending"))

                            .searchByOri_Relocation_Amend(properties.getProperty("search.ori.amend.relocation"))
                            .ori_amend_relocation_schedule1_pending(properties.getProperty("ori.amend.relocation.schedule1.pending"))
                            .ori_amend_relocation_schedule2_pending(properties.getProperty("ori.amend.relocation.schedule2.pending"))
                            .ori_amend_relocation_schedule8_pending(properties.getProperty("ori.amend.relocation.schedule8.pending"))
                            .ori_amend_relocation_schedule9_pending(properties.getProperty("ori.amend.relocation.schedule9.pending"))

                            .searchByOri_ManageTPRRR_Amend(properties.getProperty("search.ori.amend.managetprrr"))
                            .ori_amend_manageTPRRR_schedule1_pending(properties.getProperty("ori.amend.managetprrr.schedule1.pending"))
                            .ori_amend_manageTPRRR_schedule2_pending(properties.getProperty("ori.amend.managetprrr.schedule2.pending"))

                            .searchByOri_DarkFibre_Amend(properties.getProperty("search.ori.amend.darkfibre"))
                            .ori_amend_darkFibre_schedule1_pending(properties.getProperty("ori.amend.darkfibre.schedule1.pending"))
                            .ori_amend_darkFibre_schedule2_pending(properties.getProperty("ori.amend.darkfibre.schedule2.pending"))
                            .build();
                }
            }
        }
        return searchData;
    }
}
