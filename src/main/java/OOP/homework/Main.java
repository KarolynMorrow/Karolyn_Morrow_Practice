package OOP.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product playStation5 = new Product("PlayStation 5", 599.99);
        Product computerMonitor = new Product("Computer Monitor", 239.99);

        Customer karolyn = new Customer("Karolyn", "1234 Yo Mammas house Charlotte, NC", "kmorrow@perscholas.com", new Product[]{playStation5, computerMonitor});

        karolyn.buyItems(playStation5);

        karolyn.getCustomerInfo();
        //playStation5.printProductInfo();

    }
}
