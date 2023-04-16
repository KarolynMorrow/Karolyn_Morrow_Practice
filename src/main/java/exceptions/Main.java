package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       myMethodWithHandler();
    }


    public static void myMethodWithHandler() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by 0");
        }

        /*Put in main method:
        *
        * myMethodWithHandler();
        *
        * */
    }

    public static void myMethodNoHandlerWithThrows() throws FileNotFoundException {
        File file = new File("sample.txt");
        Scanner scanner = new Scanner(file);
    }

    private static void throwMyMethod(int divider) {
        File file = new File("sample.txt");
        try {
            if (divider == 0) {
                throw new MyOwnArithmeticException();
            }
            System.out.println(4 / divider);
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        /*Put in main method:
        * try {
            throwMyMethod(0);
        } catch (MyOwnArithmeticException e) {
            System.out.println(e.getLocalDate());
        }
        * */
    }


    private static void myMethodWithFinallyBlock(int divider) {
        File file = new File("sample.txt");
        try {
            System.out.println(4 / divider);
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This code needs to be executed");
        }
    }
}




