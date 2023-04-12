package OOP.pillars.abstraction.practice;

public class Main {
    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        MyComputerImpl myComputer = new MyComputerImpl();
        myComputer.myMethod3();
        myComputer.myMethod3();
        IMyComputer myComputer2 = new MyComputerImpl();
        IMyComputer.myMethod7();
    }

}
