package exceptions.checked_unchecked;


public class Main2 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1(){
        method2();
    }

    private static void method2(){
        method3();
    }

    private static void method3(){
        throw new MyOwnException();
    }
}

class MyOwnException extends RuntimeException{
    //Prefer unchecked - due to smaller amounts of code and no throws needed
}
