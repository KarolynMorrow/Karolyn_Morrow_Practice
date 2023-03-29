package Arrays.notes;

import java.util.Arrays;

public class ProcessingAndManipulation {
    public static void main(String[] args) {
        fillArray();
        sortArray();
        copyArrayWithEqual();
        copyArrayWithClone();




    }
    public static void fillArray(){
        int[] dValues = new int[10];
        Arrays.fill(dValues, 6); //sets all values to 6
        for(int i : dValues){
            System.out.println(dValues[i]);
        }

        int[] ar = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        //Fill in from index 1 - index 4
        Arrays.fill(ar, 1, 5, 10);
        System.out.println(Arrays.toString(ar)); //Print using toString()
    }

    public static void sortArray(){
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);
    }

    /* Copying arrays can be accomplished with several techniques: =, loops, clone() method, System.arraycopy() method, Arrays.copyOf method*/
    public static void copyArrayWithEqual(){
        //copying with = and loops


        int[] sourceArrays = {2, 3, 4, 5, 10};
        int[] targetArrays = new int[sourceArrays.length];
        for(int i = 0; i < sourceArrays.length; i++){
            targetArrays[i] = sourceArrays[i];
        }
        System.out.println(Arrays.toString(sourceArrays));
        System.out.println(Arrays.toString(targetArrays));
        if (targetArrays == sourceArrays){
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }
    }

    public static void copyArrayWithClone(){
        //clone() method
        int[] sourceArray = {1, 2, 3};
        int[] targetArray = sourceArray.clone();
        sourceArray[2] = 500;

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Copied Array: " + Arrays.toString(targetArray));
    }

    public static void systemArrayCopyMethod(){
        //syntax System.arraycopy(sourceArray, srcPos, dest, destPos, length);
/*srcArray = source array you want to copy
* srcPos = starting pos (index) in the src array
* dest = destination array where elements will be copied
* destPos = starting pos (index) in the dest array
* length = numbers of elements to copy
* */

    }
}
