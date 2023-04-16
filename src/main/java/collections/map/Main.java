package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<String, Item> itemCollection = new HashMap<>();


        Item ramen = new Item("ramen", "A nice bowl of ramen", 10.00, 5);
        Item sushi = new Item("sushi", "6 rolls sushi of choice", 12.00, 10);
        itemCollection.put("ramen", ramen);
        itemCollection.put("sushi", sushi);

        int size = itemCollection.size();
        System.out.println(size);

        Item getSushi = itemCollection.get("sushi");

        itemCollection.remove("ramen");

        System.out.println(size);

    }

}
