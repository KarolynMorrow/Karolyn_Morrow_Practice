package OOP.homework;

import java.util.Scanner;

public class Address extends Product {

    /*April 3rd-
    Add “Address[]” field to the “Customer” class
    The “Address” class has the following fields:
    boolean isPrimaryAddress
    streetNumber
    streetName
    city
    state
    The “Address” class should be in a sub-package */

    private boolean isPrimaryAddress;
    //best practice in financial production byte decimal is preferred instead of double
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;


    public Address(boolean isPrimaryAddress, int streetNumber, String streetName, String city, String state) {
        this.isPrimaryAddress = isPrimaryAddress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }
    public Address(){

    }

//--Methods--


    //--Getters and Setters
    public boolean isPrimaryAddress() {
        return isPrimaryAddress;
    }

    public void setPrimaryAddress(boolean primaryAddress) {
        isPrimaryAddress = primaryAddress;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
