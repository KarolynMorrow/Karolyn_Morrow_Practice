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

}
