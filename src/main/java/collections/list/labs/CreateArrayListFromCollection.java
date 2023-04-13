package collections.list.labs;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {
    public static void main(String[] args) {
        System.out.println("----Creating from another Collection-----");

        List<Integer> firstFivePrimeNumbs = new ArrayList<>();
        firstFivePrimeNumbs.add(2);
        firstFivePrimeNumbs.add(3);
        firstFivePrimeNumbs.add(5);
        firstFivePrimeNumbs.add(7);
        firstFivePrimeNumbs.add(11);

        //Creating another arraylist from another collection
        List<Integer> firstTenPrimeNumbs = new ArrayList<>(firstFivePrimeNumbs);

        List<Integer> nextFivePrimeNumbs = new ArrayList<>();
        nextFivePrimeNumbs.add(13);
        nextFivePrimeNumbs.add(17);
        nextFivePrimeNumbs.add(19);
        nextFivePrimeNumbs.add(23);
        nextFivePrimeNumbs.add(29);

        //Adding

        firstTenPrimeNumbs.addAll(nextFivePrimeNumbs);

        System.out.println(firstTenPrimeNumbs);

    }
}
