package Arrays.practice;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String[] cloneColors = colors.clone();
        System.out.println(Arrays.toString(cloneColors));
    }
}
