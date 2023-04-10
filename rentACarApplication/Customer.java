package org.example.studies.oopApplications.rentACarApplication;


import java.util.UUID;

public class Customer {
//    we created  UUID for customer ıd
    private final String customerId;
//    final yaparak set etme  özelliğini devre dışı bıraktım çünkü bunu bize otomatik olusturuyor
    private String  name;
    private int licenceYear;

    public Customer (String name, int licenceYear){
        this.customerId= UUID.randomUUID().toString();
        this.name=name;
        this.licenceYear=licenceYear;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLicenceYear() {
        return licenceYear;
    }

    public void setLicenceYear(int licenceYear) {
        this.licenceYear = licenceYear;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", licenceYear='" + licenceYear + '\'' +
                '}';
    }
}
