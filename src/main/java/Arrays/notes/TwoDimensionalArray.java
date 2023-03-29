package Arrays.notes;

import java.util.Arrays;

public class TwoDimensionalArray {
    //datatype[][] arrayName = new datatype[row][column];

    public static void main(String[] args) {
        int[][] myIntTable = new int[6][5];

        myIntTable[1][1] = 45;
        System.out.println(Arrays.deepToString(myIntTable));

        iterateOverMultiArray();
    }

    public static void iterateOverMultiArray(){
        //Suppose an array matrix is declared as follows:
        int[][] matrix = new int[3][2];
        //assign random values to the array using the following loop
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int) (Math.random() * 1000);

                System.out.println(matrix[row][column] + " ");
            }

        }
    }

    public static void fillIn(){

    }
}
