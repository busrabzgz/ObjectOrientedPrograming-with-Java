package org.example.studies.oopApplications.rentACarApplication;

import java.util.EnumSet;

public enum VehicleType {
    TRUCK(5, "There is a license year limit to rent this vehicle"),
    VAN(4, "There is a license year limit to rent this vehicle"),
    CAR(2, "There is a license year limit to rent this vehicle");

    private final int minLicenceYear ;
    private final   String errorMessage;

    VehicleType(int minLicenceYear, String errorMessage) {
        this.minLicenceYear = minLicenceYear;
        this.errorMessage = errorMessage;
    }

    public int getMinLicenceYear() {
        return minLicenceYear;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public  static VehicleType getVehicleType(String type){
        EnumSet.allOf(VehicleType.class); //you can use stream api
       for (VehicleType vehicleType: EnumSet.allOf(VehicleType.class)){
           if (vehicleType.name().equalsIgnoreCase(type)){
               return vehicleType;
           }
       }
       return null;

    }
}
