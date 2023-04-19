package sba_core_java.exercise1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] myStringArr = {"life", "is", "worth", "living", "with", "passion"};

        MyOperation myListArr = new MyOperation();

        System.out.println("---Converting an Array to an ArrayList---");
        myListArr.convertStringArrayIntoArrayList(myStringArr);

        System.out.println("ArrayList: " + myListArr.myArrayList);
        System.out.println("");

        System.out.println("---Replacing an Element in the Array---");

        myListArr.replaceAnElementInTheStringArrayListGiven(1);
        System.out.println("Replaced index 1: " + myListArr.myArrayList);
        System.out.println("");


        System.out.println("---Creating a New ArrayList from an Existing one---");

        myListArr.createANewArrayListFromExistingArray();
        System.out.println(myListArr.myArrayList);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        if (!scanner.hasNextInt()) {
            try {
                throw new MyOwnException();
            } catch (MyOwnException e) {
                System.out.println(e.getMessage());
            }
        } else {
            int enteredInt = scanner.nextInt();
            System.out.println("Valid Int: " + enteredInt);
        }
    }
}
