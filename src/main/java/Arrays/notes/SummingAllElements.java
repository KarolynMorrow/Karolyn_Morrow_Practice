package Arrays.notes;

public class SummingAllElements {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 0, 12, -5};
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }

    public static void findSmallestNumber(){
        int[] numbers = {3, 4, 5, 0, -5, 12, 18};
        int smallestNum = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < smallestNum){
                smallestNum = numbers[i];
            }
        }
    }

    public static void findBiggestNumber(){
        int[] arr = {25, 0, 2, 4, 6, 8, 10};
        int maxVal = Integer.MIN_VALUE; //or 0
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println("Max element= " + maxVal);
    }

    public static void reverseOrder(){
        Integer[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //------Print array from first starting element----
        System.out.println("Original Array: ");
        for (int i : intArray){
            System.out.println(i + " ");
        };
        System.out.println();
        //-------print array starting from last element------
        System.out.println("Original array printed in reverse order:");
        for(int i = intArray.length - 1; i >= 0; i-- ){
            System.out.println(intArray[i] + " ");
        }
    }



}
