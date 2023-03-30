package Arrays.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main8Homework {

    /*Read a line of text such as “I love Java.  You love Java. She loves Java.”
    Split them into words
    Count number of times each word (excluding dot .) occurs*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What sentence would you like to count?");

        String sentence = input.nextLine().replace(".", " "); //Assigning the input to sentence and taking out the period
        int sentenceLength = sentence.length(); //taking the length of the input


        String[] words = sentence.split(" "); // Split the string into an array
        //String[] words = new String[sentenceLength]; //making an array based on the length of input
        int arrayLength = words.length;
        String[] cloneWords = new String[arrayLength]; //makes length of cloneWords array

        System.out.println(" ");


        System.out.println(Arrays.toString(words)); //print array words as a string
        System.out.println(Arrays.toString(cloneWords));

        System.out.println(" ");



        for (int i = 0; i < sentenceLength; i++) { //Moving through the array start at int = 0 , if index is less than the length of sentence then continue
            int counter = 0;
             for (int j = 0; j < arrayLength; j++) { //loop through array and add counting each occurrence
                 cloneWords = words.clone();
                if (words[i].equals(cloneWords[j])) { //if index in words array equals index in cloneWords array
                    counter++; //add how many times it shows
                    cloneWords[i] = words[i];
                    System.out.println(Arrays.toString(cloneWords));

                }

                }
            System.out.println(cloneWords[i] + " shows up: " + counter + " times.");
        }


    }


    public static void marchTwentyNinthHW(){


        /*https://www.hackerrank.com/challenges/java-negative-subarray/problem*/
    }

}
