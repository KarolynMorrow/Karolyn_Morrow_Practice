package collections.sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Integer> integers = new HashSet<>();
        integers.add(4);
        integers.add(6);
        integers.add(2);

        for (Integer integer : integers){
            System.out.println(integer);
        }

        System.out.println("---------");


        Set<Integer> ints = new LinkedHashSet<>();
        ints.add(10);
        ints.add(55);
        ints.add(2);

        for(Integer integer : ints){
            System.out.println(integer);
        }

        System.out.println("---------");



    }
}
