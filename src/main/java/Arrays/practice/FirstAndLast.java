package Arrays.practice;

public class FirstAndLast {
    public static void main(String[] args) {
       int[] arrayInt = {55, 27, 32, 56, 88};
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[4]);

        for(int i = arrayInt.length - 1; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

        for(int i = 0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

    }
}
