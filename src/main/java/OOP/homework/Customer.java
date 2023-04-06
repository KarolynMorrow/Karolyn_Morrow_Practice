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
    private Customer customerName;
    private Address[] addresses = new Address[10];
    private String email;
    private Product[] purchasedProducts = new Product[10];
    private int currentProductIndex = 0;
    private int currentAddressIndex = 0;


    //-----Constructor-----
    public Customer(Customer customerName, Address[] addresses, String email, Product[] purchasedProducts) {
        super();
        this.customerName = customerName;
        this.addresses = addresses;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public Customer(Customer customerName, Address[] addresses, String email) {
        super();
        this.customerName = customerName;
        this.addresses = addresses;
        this.email = email;
    }

    public Customer() {

    }

    public Customer(CustomerName customerName, Address address, String email, Product[] purchasedProducts) {
    }

//-----Methods------

    //Add purchasedItem(product) to Product[] without printing
    public void buyItems(Product product) {
        for (int i = 0; i < purchasedProducts.length; i++) {
            if (purchasedProducts[i] == null) {
                break;
            }
            getPurchasedProducts();
        }
    }


    /* METHOD WORKS FOR PRINTING CUSTOMER INFO AND ARRAY OF PRODUCTS NO SOUT NEEDED PRINTS UNTIL BREAK IS HIT*/
    public void getCustomerInfo() {
        System.out.println("Customer Information:\nCustomer Name: " + getFullName()
                + "\n" + "\nEmail address: " + getEmail() + "\nProducts purchased: ");
        for (Product product : purchasedProducts) {
            if (product == null) {
                break;
            }
            product.printProductInfo();
        }
    }

    /*Need to check what the current array is*/
    //Add FULL address to Address[]
    public Address addAddress(Address address) {
        Address[] newAddresses = new Address[addresses.length + 1];
        for (int i = 0; i < addresses.length; i++) {
            newAddresses[i] = this.addresses[i];
        }

        newAddresses[addresses.length] = address;
        this.addresses = newAddresses;

        return address;
    }

    /*
    public void addAddress(Address address){
        addresses[currentAddressIndex++] = address;
    }*/


    public String returnFullName(){
        return customerName.getFullName();
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

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
