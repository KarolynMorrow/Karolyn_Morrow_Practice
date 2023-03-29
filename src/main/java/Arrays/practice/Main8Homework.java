package Arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main8Homework {

    /*Read a line of text such as “I love Java.  You love Java. She loves Java.”
    Split them into words
    Count number of times each word (excluding dot .) occurs*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What sentence would you like to count?");

        String sentence = input.nextLine(); //Assigning the input to sentence
        int sentenceLength = sentence.length(); //taking the length of the input

        String[] words = new String[sentenceLength]; //making an array based on the length of input
        //System.out.println(Arrays.toString(words)); //Print array words as a string


        for (int i = 0; i < sentenceLength; i++) { //start at int = 0 , if index is less than the length of sentence then continue
           words = sentence.split(" ,"); //split sentence and place into array words
        }
        System.out.println(Arrays.toString(words)); //print array words as a string

    }

}
