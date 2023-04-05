package OOP.homework;

public class Product {
    /*
Create “Product” class with the following fields - choose appropriate data types - and appropriate methods
productName
price


Create “MainHomework” class, in which you do the following in the “main” method
Create 2 Product instances using test productName such as “TV” or “Laptop” with test prices
Create a Customer object instance with test customerName, address, email, and the two products created above
Invoke “getCustomerInfo” method of the Customer object instance
    * */

    private String productName;
    private double price;

    //---Constructors---

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product() {

    }

    //--Getters and/or Setters

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    //---Methods---

    public void printProductInfo() {
        System.out.printf("Product information: %s - $%.2f\n", getProductName(), getPrice());
    }

}
