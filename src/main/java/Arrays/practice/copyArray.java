package Arrays.practice;

public class copyArray {
    public static void main(String[] args) {
        int[] sourceArr = {2, 7, 10, 5, 26};
        int[] copyArr = new int[sourceArr.length];

        for (int i = 0; i < sourceArr.length; i++ ){
            copyArr[i] = sourceArr[i];
        }


    }


}
