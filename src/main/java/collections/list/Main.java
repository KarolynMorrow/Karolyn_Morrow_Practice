package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection objects = new ArrayList();
        objects.add(new String("joe"));
        boolean empty = objects.isEmpty();
        System.out.println(empty);


        Collection<String> strings = new ArrayList<>();
        strings.add("SpongeBob");
        strings.add("Peter");
        strings.add("Sandy");

        //for-each loop
        for (String name : strings){
            System.out.println(name);
        }

        System.out.println("------------");


        Collection<String> strings2 = new ArrayList<>();
        strings2.add("Sandy");
        strings2.add("Peter");

        boolean containsAll = strings.containsAll(strings2);
        System.out.println(containsAll);

        System.out.println("--------------");

        boolean addAll = strings.addAll(strings2);
        System.out.println(addAll);

        System.out.println("---------");


        List<Integer> integers = new ArrayList<>();

        integers.add(10);
        integers.add(50);
        integers.add(55);
        integers.add(67);

        System.out.println(integers.size());
        System.out.println(integers.get(2));
        integers.add(1, 8);
        System.out.println(integers.get(1));
    }
}
