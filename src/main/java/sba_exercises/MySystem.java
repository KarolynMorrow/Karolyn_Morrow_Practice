package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class MySystem {

    Map<String, Item> myItemsInHashMap;
    //key is "itemName", Value is Item

    public MySystem() throws FileNotFoundException {

        //Initialize myItemHash to a new Hash
        myItemsInHashMap = new HashMap<>();
        //Read file sample.txt
        File foodFile = new File("sample.txt");
        Scanner readFile = new Scanner(foodFile);

        //and for each line
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            //4 string parts are held in an array
            String[] data = line.split("  ");
            String itemName = data[0];
            String itemDescription = data[1];
            Double price = Double.parseDouble(data[2]);
            int availableQuantity = Integer.parseInt(data[3]);
            //create a new Item object
            Item item = new Item(itemName, itemDescription, price, availableQuantity);
            //then add it to myItemHash
            myItemsInHashMap.put(item.getItemName(), item);
        }
    }

    public Map<String, Item> printHashMap(){
        for(String keyName : getMyItemsInHashMap().keySet()){
            Item item = getMyItemsInHashMap().get(keyName);
            System.out.printf("%-20s%-20s%-10.2f%-10d\n",item.getItemName(), item.getItemDescription(), item.getPrice(), item.getAvailableQuantity() );
        }
        return null;
    }


    public Item addItem(Item item) {
        //If it is a new item, add to the hashMap return item, if not print "already in hashmap" and return null
        if (getMyItemsInHashMap().containsKey(item.getItemName())) {
            System.out.println("Item already in HashMap");
            return null;
        } else {
            myItemsInHashMap.put(item.getItemName(), item);
            return item;
        }
    }


    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}
