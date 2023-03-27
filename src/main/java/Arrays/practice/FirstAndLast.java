package Arrays.practice;

public class FirstAndLast {
    /*Write a program that creates an integer array with 5 elements (i.e., numbers).
    The numbers can be any integers.  Print out the value at the first index and the
    last index using length - 1 as the index. Now try printing the value at
    index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception
    which is produced. Now try to assign a value to the array index 5. You should get
    the same type of exception.*/
    public static void main(String[] args) {
       int[] arrayInt = {55, 27, 32, 56, 88};
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[4]);

        for(int i = arrayInt.length - 1; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

        for (int i = 0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

    }
}
