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

        String sentence = input.nextLine().replace(".", ""); //Assigning the input to sentence and taking out the period
        int sentenceLength = sentence.length(); //taking the length of the input


        String[] words = sentence.split(" "); // Split the string into an array
        //String[] words = new String[sentenceLength]; //making an array based on the length of input
        int wordsArrayLength = words.length;
        String[] uniqueWords;
        uniqueWords = words.clone(); //Clones array words
        Arrays.sort(uniqueWords); //sorted uniqueWords array so duplicates are beside one another
        //find a way to only take words that are duplicated and put only one instance of them into array uniqueWords


        System.out.println(Arrays.toString(uniqueWords)); //print array uniqueWords as a string


        System.out.println(" ");


        for (int i = 0; i < sentenceLength; i++) { //Moving through the array start at int = 0 , if index is less than the length of sentence then continue
            int counter = 0;
            //System.out.println();
            for (int j = 0; j < wordsArrayLength; j++) { //loop through array and add counting each occurrence
                if (words[i].equals(uniqueWords[j])) { //if index in words array equals index in uniqueWords array

                    counter++; //add how many times it shows

                    //System.out.println();
                    //uniqueWords[i] = words[i];
                    //System.out.println(Arrays.toString(uniqueWords)); //Make sure uniqueWords isn't showing values of null

                }
                //System.out.println();

            }

            System.out.println(uniqueWords[i] + " shows up: " + counter + " times.");

        }


    }




}
/*https://www.hackerrank.com/challenges/java-negative-subarray/problem*/



