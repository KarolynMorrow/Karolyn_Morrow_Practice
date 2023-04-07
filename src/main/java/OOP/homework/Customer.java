package OOP.homework;

public class Customer extends CustomerName {
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

    April 5th-
    Remove existing “customerName” field (and its getter and setter) from the Customer class
    Create “CustomerName” class with the following fields:
    firstName
    middleName
    lastName
    Refactor affected code accordingly
    */
    private CustomerName name;
    private Address[] addresses = new Address[10];
    private String email;
    private Product[] purchasedProducts = new Product[10];
    private int currentProductIndex = 0;
    private int currentAddressIndex = 0;


    //-----Constructor-----

    public Customer() {

    }

    public Customer(CustomerName name, Address[] addresses, String email, Product[] purchasedProducts) {
        this.name = name;
        this.addresses = addresses;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }
//-----Methods------

    //Add purchasedItem(product) to Product[] without printing
    public void buyItems(Product product) {
       /* for (int i = 0; i < purchasedProducts.length; i++) {
            if (purchasedProducts[i] == null) {
                break;
            }
            purchasedProducts[i] = product;
         }
            */

            purchasedProducts[currentProductIndex++] = product;

    }


    /* METHOD WORKS FOR PRINTING CUSTOMER INFO AND ARRAY OF PRODUCTS NO SOUT NEEDED PRINTS UNTIL BREAK IS HIT*/
    public String getCustomerInfo() {
        String result = name.getFullName() + " "
                + "Email: " + email;

        for (int i = 0; i < purchasedProducts.length; i++) {
            if (purchasedProducts[i] == null) {
                break;
            }
            result += "\n"
                    + " Product Details: "
                    + purchasedProducts[i].getProductName() + "- $" + purchasedProducts[i].getPrice();
        }

        for (int ii = 0; ii < addresses.length; ii++) {
            if (addresses[ii] == null) {
                break;
            }
            result += "\n"
                    + " Address: "
                    + addresses[ii].getStreetNumber() + " " + addresses[ii].getStreetName() + " "
                    + addresses[ii].getCity() + " " + addresses[ii].getState();
        }

        return result;
    }


    public CustomerName returnFullName(){

        return null;
    }

    //-----Getters and/or Setters----

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
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

    public CustomerName getName() {
        return name;
    }

    public void setName(CustomerName name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
