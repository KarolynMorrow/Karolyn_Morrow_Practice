package sba_core_java.exercise1;

public class MyOwnException extends Exception {

    public MyOwnException() {

    }

    public String getMessage(){
        return "Invalid Input";
    }
}
