package OOP.homework;

import OOP.pillars.inheritance.daily_review.Employee;
import OOP.pillars.inheritance.daily_review.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        Product playStation5 = new Product("PlayStation 5", 599.99);
        Product computerMonitor = new Product("Computer Monitor", 239.99);

        Address address1 = new Address(true, 7745, "Yo Mommas House", "Lancaster", "SC");

        CustomerName firstCustomer = new CustomerName("Karolyn", "B", "Morrow");


        Customer karolyn = new Customer(firstCustomer, new Address[]
                {address1}, "kmorrow@perscholas.com",
                new Product[]{playStation5, computerMonitor});



        System.out.println(karolyn.getCustomerInfo());


    }
}
