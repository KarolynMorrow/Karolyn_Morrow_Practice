package collections.list.labs;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
    public static void main(String[] args) {
        System.out.println("----ACCESSING ELEMENTS----");
        //Check if empty
        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //Size of array
        System.out.println("Here are the top " + topCompanies.size() + "companies in the world!");
        System.out.println(topCompanies);

        //Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()- 1);

        //Modify element at given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
