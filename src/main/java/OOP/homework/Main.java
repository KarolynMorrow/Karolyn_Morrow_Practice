package OOP.homework;

public class Main {
    public static void main(String[] args) {

        Product playStation5 = new Product("PlayStation 5", 599.99);
        Product computerMonitor = new Product("Computer Monitor", 239.99);

        Customer karolyn = new Customer("Karolyn", new Address[]{}, "kmorrow@perscholas.com", new Product[]{computerMonitor});

        karolyn.buyItems(playStation5);
        karolyn.getCustomerInfo();



    }
}
