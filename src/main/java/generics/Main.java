package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("sang");
       // strings.add(Integer.valueOf(10)); NOT ALLOWED


        //Will throw a class cast exception due to trying to change an Integer to a String
        /*
        List arrayList = new ArrayList();
        arrayList.add("string");
        arrayList.add(Integer.valueOf(10));
        String x = (String) arrayList.get(1);
        */
    }
}
