package sba_exercises;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MySystem {
    Map<String, Item> myItemsInHashMap = new HashMap<>();
    //key is "itemName" Value is Item

    File foodFile = new File("sample.txt");





    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}
