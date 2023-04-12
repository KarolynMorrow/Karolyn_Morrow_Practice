package OOP.pillars.abstraction.practice;

public interface IMyComputer {
    int HUNDRED = 100;

    void myMethod3();
    void myMethod4();

    default void myMethod5(){
        System.out.println();
    }

    default void myMethod6(){
        System.out.println("Howdy Folks, this is in the interface");
    }

    static void myMethod7(){
        System.out.println("I am a static method");
    }
}
//All methods HAVE TO BE abstract
//Purpose to use interface
// Defines a contract between "client" (user of the interface) and "provider" (implementation) of some task
//To have unrelated classes implement methods
//To model multiple inheritance(multi-parent) because multiple interfaces can be added to class



