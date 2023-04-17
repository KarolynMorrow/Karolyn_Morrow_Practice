package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //Create file object passing file path
            File file = new File("sample.txt");
            //Create scanner object to read file
            Scanner input = new Scanner(file);
            System.out.println("--------Testing reading sample.txt----------");
            System.out.printf("%-20s%-20s%-10s%-10s\n", "Name", "Description", "Price", "Available Quantity");

            //Use while loop to read each line until no more content
            while (input.hasNextLine()) {
                //Read the next line
                String line = input.nextLine();
                //Split based on double space into array
                String[] data = line.split("  ");
                //Print using printf statement
                System.out.printf("%-20s %-20s %-10.2f %-10d\n", data[0], data[1], Double.parseDouble(data[2]), Integer.parseInt(data[3]));
            }
            //close scanner object after reading
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("----Testing the constructor of Item class-----");

        Item onigiri = new Item("Onigiri", "tuna rice ball", 5.00, 10);
        System.out.printf("%-20s%-20s%-10.2f%-10d%-10d\n", onigiri.getItemName(), onigiri.getItemDescription(), onigiri.getPrice(), onigiri.getQuantity(), onigiri.getAvailableQuantity());

        System.out.println("----Testing in the constructor of MySystem class----");
        MySystem newSystem = new MySystem();
        //For each item stored in the "myItemHashMap"
        /*
        * for (String item : myItemsInHashMap.keySet()) {
        *       Item elementItem = myItemsHashMap.get(item);
        *       System.out.printf("%-20s%-20s%-10.2f%-10d\n", elementItem.getItemName(), elementItem.getItemDescription(), elementItem.getPrice(), elementItem.getAvailableQuantity());
        * */

        for (String keyName: newSystem.getMyItemsInHashMap().keySet()) {
            Item mapItem = newSystem.getMyItemsInHashMap().get(keyName);
            System.out.printf("%-20s%-20s%-10.2f%-10d\n",
                    mapItem.getItemName(), mapItem.getItemDescription(), mapItem.getPrice(),
                    mapItem.getAvailableQuantity());
        }

    }
}