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

//    public void getNewAddress(){
//        Scanner input = new Scanner(System.in);
//        String question = input.nextLine();
//        String newAddress = new Address[];
//        System.out.println("Do you have a new address to input: y/n ");
//        if (question == "y"){
//            System.out.println("Please type in new address: ");
//            streetNumber = input.nextDouble();
//            input.next();
//            streetName = input.nextLine();
//            input.next();
//            city = input.nextLine();
//            input.next();
//            state = input.nextLine();
//            input.next();
//        } else {
//            System.out.println("No address on file");
//        }
//    }

    //--Getters and Setters
    public boolean isPrimaryAddress() {
        return isPrimaryAddress;
    }

    public void setPrimaryAddress(boolean primaryAddress) {
        isPrimaryAddress = primaryAddress;
    }

    public double getStreetNumber() {
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
