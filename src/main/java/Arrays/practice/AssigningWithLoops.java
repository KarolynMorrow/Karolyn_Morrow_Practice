package Arrays.practice;

public class AssigningWithLoops {
    public static void main(String[] args) {
        int[] emptyArr = new int[5];
        for (int i = 0; i < emptyArr.length; i++){
            emptyArr[i] = i;
            System.out.println(emptyArr[i]);
        }

    }
}
