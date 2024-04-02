package com.exlservice.cobol2java.dto;

public class Parts {

    private static String FILLER="xxxxxxxxxxxxxx";

    private final String partNumber;
    private final String partName;
    private final String specNumber;
    private final String govtCommlCode;
    private final String blueprintNumber;
    private final String unitOfMeasure;
    private final String weekLeadTime;
    private final String vehicleMake;
    private final String vehicleModel;
    private final String vehicleYear;

    private boolean validWeekLeadTime;

//    public static final List<String> VEHICLE_MAKE_LIST = Arrays.asList("CHR","FOR","GM ","VW ","TOY","JAG","PEU","BMW");
    private boolean CHRYSLER;
    private boolean FORD;
    private boolean GM;
    private boolean VOLKSWAGON;
    private boolean TOYOTA;
    private boolean JAGUAR;
    private boolean PEUGEOT;
    private boolean BMW;

    private boolean validVehicleYear;

    public Parts(String dataLine) {
        this.partNumber = dataLine.substring(0,23);
        this.partName = dataLine.substring(23,37);
        this.specNumber = dataLine.substring(37,44);
        this.govtCommlCode = dataLine.substring(44,45);
        this.blueprintNumber = dataLine.substring(45,55);
        this.unitOfMeasure = dataLine.substring(55,58);
        this.weekLeadTime = dataLine.substring(58,61) ;
        this.vehicleMake = dataLine.substring(61,64);
        this.vehicleModel = dataLine.substring(64,74);
        this.vehicleYear = dataLine.substring(74,78);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartName() {
        return partName;
    }

    public String getSpecNumber() {
        return specNumber;
    }

    public String getGovtCommlCode() {
        return govtCommlCode;
    }

    public String getBlueprintNumber() {
        return blueprintNumber;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public String getWeekLeadTime() {
        return weekLeadTime;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleYear() {
        return vehicleYear;
    }

    public boolean isValidWeekLeadTime() {
        return validWeekLeadTime;
    }

    public void setValidWeekLeadTime(boolean validWeekLeadTime) {
        this.validWeekLeadTime = validWeekLeadTime;
    }

    public boolean isValidVehicleYear() {
        return validVehicleYear;
    }

    public void setValidVehicleYear(boolean validVehicleYear) {
        this.validVehicleYear = validVehicleYear;
    }
}
