package Arrays.practice;

public class AssigningWithLoops {
    /*Write a program where you create an integer array with a length of 5.
    Loop through the array and assign the value of the loop control variable (e.g., i)
    to the corresponding index in the array.*/
    public static void main(String[] args) {
        int[] emptyArr = new int[5];
        for (int i = 0; i < emptyArr.length; i++){
            emptyArr[i] = i;
            System.out.println(emptyArr[i]);
        }

    }
}
