package Arrays.practice;

import java.util.Arrays;

public class MultiplyByTwo {
    public static void main(String[] args) {
        int[] multByTwo = new int[5];

        for(int i = 0; i < multByTwo.length; i++) {
            multByTwo[i] = i * 2;
            System.out.println(multByTwo[i]);
        }
        System.out.println(Arrays.toString(multByTwo)); //gives the items in the array
        System.out.println(multByTwo); //gives the location of the array

    }
}
