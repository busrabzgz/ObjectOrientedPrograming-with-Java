package org.example.studies.oopApplications.rentACarApplication;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Vehicle {

//     interface must be  everything is public
    private final String vehicleId;
    private  String brand;
    private String year;
    private VehicleType vehicleType;

    private BigDecimal priceForDay;
    private boolean isAvailable=true;
    private Customer customer;
    private BigDecimal totalPrice=BigDecimal.ZERO;
    private int countOfRentDay;

    public Vehicle(String brand, String year, VehicleType vehicleType, BigDecimal priceForDay) {
        this.vehicleId = UUID.randomUUID().toString();
        this.brand = brand;
        this.year = year;
        this.vehicleType = vehicleType;
        this.priceForDay = priceForDay;

    }

    public String getVehicleId() {
        return vehicleId;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public BigDecimal getPriceForDay() {
        return priceForDay;
    }

    public void setPriceForDay(BigDecimal priceForDay) {
        this.priceForDay = priceForDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCountOfRentDay() {
        return countOfRentDay;
    }

    public void setCountOfRentDay(int countOfRentDay) {
        this.countOfRentDay = countOfRentDay;
    }

    public void rent(Customer customer,int countOfRentDay){
        this.countOfRentDay=countOfRentDay;
        if (!isAvailable){
            System.out.println(vehicleId+"This vehicle not available!");
        }
        if (customer.getLicenceYear() < vehicleType.getMinLicenceYear()){
            System.out.println(vehicleType.getErrorMessage());
            return;

        }
        //new BigDecimal("4")
        //total price=50;

        var priceForRent=priceForDay.multiply(BigDecimal.valueOf(countOfRentDay));
        totalPrice=totalPrice.add(priceForRent);
        isAvailable=false;
        System.out.println(
                "Vehicle Number:"+vehicleId
                + "was rented by"+customer.getName()
                +"Total prince:"+totalPrice);
    }
    public abstract void returnVehicleId();


}
