package Arrays.practice;

public class MiddleElement {
    /*Write a program that returns the middle element in an array.
     Give the following values to the integer array: {13, 5, 7, 68, 2} and produce
     the following output: 7 */
    public static void main(String[] args) {
        int[] intArray = {13, 5, 7, 68, 2};
        int half = intArray.length/2;
        System.out.println(intArray[half]);

    }
}
