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
        System.out.println("\n");
        System.out.println("----Testing the constructor of Item class-----");

        Item onigiri = new Item("Onigiri", "tuna rice ball", 5.00, 10);
        System.out.printf("%-20s%-20s%-10.2f%-10d%-10d\n", onigiri.getItemName(), onigiri.getItemDescription(), onigiri.getPrice(), onigiri.getQuantity(), onigiri.getAvailableQuantity());
        System.out.println("\n");

        System.out.println("----Testing in the constructor of MySystem class----");
        MySystem newSystem = new MySystem();
        //For each item stored in the "myItemHashMap"
        /*
         * for (String item : myItemsInHashMap.keySet()) {
         *       Item elementItem = myItemsHashMap.get(item);
         *       System.out.printf("%-20s%-20s%-10.2f%-10d\n", elementItem.getItemName(), elementItem.getItemDescription(), elementItem.getPrice(), elementItem.getAvailableQuantity());
         * */

        for (String keyName : newSystem.getMyItemsInHashMap().keySet()) {
            Item mapItem = newSystem.getMyItemsInHashMap().get(keyName);
            System.out.printf("%-20s%-20s%-10.2f%-10d\n",
                    mapItem.getItemName(), mapItem.getItemDescription(), mapItem.getPrice(),
                    mapItem.getAvailableQuantity());
        }

        System.out.println("\n");

        System.out.println("----Testing addItem() method----");
        System.out.println("Size before addItem method: " + newSystem.myItemsInHashMap.size());
        Item tamago = new Item("tamago", "egg omelette", 5.00, 40);
        newSystem.addItem(tamago);
        System.out.println("Size after addItem method: " + newSystem.myItemsInHashMap.size());
        newSystem.printHashMap();
        Item newSushi = new Item("sushi", "spicy california", 10.00, 5);
        newSystem.addItem(newSushi);

        System.out.println("Size after addItem method with same itemName: " + newSystem.myItemsInHashMap.size());

        System.out.println("\n");
        System.out.println("------Testing removeItem() method------");
        System.out.println("Size before removeItem method: " + newSystem.myItemsInHashMap.size());
        newSystem.removeItem("ramen");
        newSystem.printHashMap();
        System.out.println("Size after removeItem method: " + newSystem.myItemsInHashMap.size());
        System.out.println("\n");

        System.out.println("-----Testing reduceAvailableQuantity() method-----");

        newSystem.reduceAvailableQuantity("takoyaki");
        newSystem.printHashMap();
        System.out.println("----Testing 0 available items----");
        newSystem.reduceAvailableQuantity("takoyaki");
        newSystem.printHashMap();

    }
}