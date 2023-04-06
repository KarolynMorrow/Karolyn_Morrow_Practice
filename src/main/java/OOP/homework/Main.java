package OOP.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product playStation5 = new Product("PlayStation 5", 599.99);
        Product computerMonitor = new Product("Computer Monitor", 239.99);

        Address address1 = new Address(true, 0123, "Yo Mommas House", "Lancaster", "SC");


        Customer karolyn = new Customer("Karolyn", new Address[]{address1}, "kmorrow@perscholas.com", new Product[]{playStation5, computerMonitor});

        karolyn.buyItems(playStation5);


        /*karolyn.addAddress(address1);*/


        karolyn.getCustomerInfo();

        System.out.println(address1);
    }
}
