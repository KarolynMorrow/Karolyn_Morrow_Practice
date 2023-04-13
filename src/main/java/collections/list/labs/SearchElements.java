package collections.list.labs;

import testing_review.A;

import java.util.ArrayList;
import java.util.List;

public class SearchElements {
    public static void main(String[] args) {
        System.out.println("----Search----");
        List<String> names = new ArrayList<>();
        names.add("Ichigo");
        names.add("Naruto");
        names.add("Nanachi");
        names.add("Orihime");
        names.add("Hyakimaru");
        names.add("Naruto");
        names.add("KK");

        //Check if given element is in list
        System.out.println("Does names array contain \"Naruto\" ? : " + names.contains("Naruto"));

        //Find index of the first occurrence of an element
        System.out.println("index of \" Orihime\": " + names.indexOf("Orihime"));
        System.out.println("index of \" Eren\": " + names.indexOf("Eren"));

        //Find index of the last occurrence
        System.out.println("Last index of \"Naruto\" : " + names.lastIndexOf("Naruto"));
        System.out.println("Last index of \"Boruto\" : " + names.lastIndexOf("Boruto"));

    }
}
