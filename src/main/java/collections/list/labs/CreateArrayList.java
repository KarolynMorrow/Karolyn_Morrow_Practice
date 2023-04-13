package collections.list.labs;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        System.out.println("----Creating an ArrayList and Adding Elements----");
        //creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        //Placing elephant at index 2
        animals.add(2, "Elephant");
        System.out.println(animals);
    }
}
