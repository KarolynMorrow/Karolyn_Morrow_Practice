package collections.list.labs;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        System.out.println("----REMOVING ELEMENTS----");
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);
        //Remove element at index 5
        programmingLanguages.remove(5);
        System.out.println("After removing(5): " + programmingLanguages);

        //Remove the first occurrence of the given element (Returns false if element does not exist)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\" ): " + programmingLanguages);

        //Remove all elements using a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        //Remove all elements
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}
