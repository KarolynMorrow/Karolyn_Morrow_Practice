package Arrays.practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

            /*Binary search method*/
            int[] myIntArray = {5, 6, 2, 10, 20, 40};
            boolean searchResult = binarySearch(myIntArray, 40);
            System.out.println(searchResult);
        }

        private static boolean binarySearch(int[] myIntArray, int targetNumber) {
            // TODO - write your code here


            Arrays.sort(myIntArray); //sort the array first

            int startIndex = 0; //i = 0
            int endIndex = myIntArray.length - 1; //i = last index



            while (startIndex < endIndex) { //while the starting point is less than the end point
                int middleIndex = (endIndex - startIndex) / 2 + startIndex; //middle index equals end minus start divided by 2.....add start index to adjust recurring loops
                int middleValue = myIntArray[middleIndex];

                if (targetNumber == middleValue) {
                    return true;
                } else if (targetNumber > middleValue) {
                    startIndex = middleIndex + 1;  //changing the sorted array to the upper portion
                } else {
                    startIndex = middleIndex - 1; //changing the sorted array to the lower portion
                }
            }
            return false;

        }
    }

