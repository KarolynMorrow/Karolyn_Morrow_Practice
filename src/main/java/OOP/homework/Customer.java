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

    Add “addAddress(Address address)” method to add address to array the “Customer” class
    Modify “getCustomerInfo” method to display the addresses of the customer as well
    In the “main” method of the “MainHomeworkMarch31st” class, please add a new address to a “Customer” object using “addAddress(Address address)” method
    */
    private String customerName;
    private Address[] addresses;
    private String email;
    private Product[] purchasedProducts = new Product[10];


    //-----Constructor-----
    public Customer(String customerName, Address[] addresses, String email, Product[] purchasedProducts) {
        super();
        this.customerName = customerName;
        this.addresses = addresses;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public Customer(String customerName, Address[] addresses, String email) {
        super();
        this.customerName = customerName;
        this.addresses = addresses;
        this.email = email;
    }

    public Customer() {

    }

    //-----Getters and/or Setters----

    public String getCustomerName() {
        return customerName;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public String getEmail() {
        return email;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

//-----Methods------

    //Add purchasedItem(product) to Product[] without printing
    public void buyItems(Product product) {
        int purchasedArrayLength = purchasedProducts.length;
        for (int i = 0; i < purchasedArrayLength; i++) {

            if(purchasedProducts[i] == null) {
                break;
            }
            getPurchasedProducts();
        }

    }


    /* METHOD WORKS FOR PRINTING CUSTOMER INFO AND ARRAY OF PRODUCTS NO SOUT NEEDED PRINTS UNTIL BREAK IS HIT*/
    public void getCustomerInfo() {
        System.out.println("Customer Information:\nCustomer Name: " + getCustomerName() + "\nCustomer address: " + getAddresses() + "\nEmail address: " + getEmail() + "\nProducts purchased: ");
        for (Product product : purchasedProducts) {
            if (product == null){
                break;
        }
            product.printProductInfo();
        }
    }

/*METHOD ALSO WORKS FOR PRINTING OUT BUT NEED TO USE A SOUT PRINTS UNTIL BREAK IS HIT
    public String getCustomerInfo() {
        String result = "Customer Information: \nCustomer name: " + getCustomerName() + "\nCustomer address: " + getAddresses() + "\nCustomer email: " + getEmail();

        for (Product purchasedProduct : purchasedProducts) {
            if (purchasedProduct == null) {
                break;
            }
            result += "\nProduct Information: " + purchasedProduct.getProductName() + " - " + purchasedProduct.getPrice();
        }

        return result;
    }
*/

    /*Need to check what the current array is*/
    //Add FULL address to Address[]
    public Address addAddress(Address address) {
        System.out.println("Customer Addresses: " + getAddresses());
        //for (Address customerAddress : addresses){
        //  System.out.println(address);
        //}
        return address;
    }


}
