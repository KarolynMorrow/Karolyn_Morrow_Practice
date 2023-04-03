package OOP.homework;

import java.util.Arrays;

public class Customer extends Product {
    /*
    April 1st-
    Create “Customer” class with the following fields - choose appropriate data types - and appropriate methods
    customerName
    address
    email
    Product[] purchasedProducts
    Add “getCustomerInfo” method to the Customer class, which displays detailed customer information along with the products s/he purchased
    April 3rd-
    Add “Address[]” field to the “Customer” class
    The “Address” class has the following fields:
    boolean isPrimaryAddress
    streetNumber
    streetName
    city
    state
    The “Address” class should be in a sub-package
    Add “addAddress(Address address)” method to the “Customer” class
    Modify “getCustomerInfo” method to display the addresses of the customer as well
    In the “main” method of the “MainHomeworkMarch31st” class, please add a new address to a “Customer” object using “addAddress(Address address)” method
    */
    private String customerName;
    private String address;
    private String email;
    public Product[] purchasedProducts;

    //-----Constructor-----
    public Customer(String customerName, String address, String email, Product[] purchasedProducts) {
        super();
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public Customer(String customerName, String address, String email) {
        super();
        this.customerName = customerName;
        this.address = address;
        this.email = email;
    }

    //-----Getters and/or Setters----

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

//-----Methods------

    public void buyItems(Product product) {
        int purchasedLength = purchasedProducts.length;
        for (int i = 0; i < purchasedLength; i++) {
            purchasedProducts = getPurchasedProducts();

        }

    }

    public void getCustomerInfo() {
        System.out.println("Customer Information:\nCustomer Name: " + getCustomerName() + "\nCustomer address: " + getAddress() + "\nEmail address: " + getEmail() + "\nProducts purchased: ");
        for (Product product : purchasedProducts) {
            product.printProductInfo();
        }

    }


}
