package OOP.homework;

import java.util.Arrays;

public class Customer extends Product {
    /*
    Create “Customer” class with the following fields - choose appropriate data types - and appropriate methods
    customerName
    address
    email
    Product[] purchasedProducts
    Add “getCustomerInfo” method to the Customer class, which displays detailed customer information along with the products s/he purchased
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
