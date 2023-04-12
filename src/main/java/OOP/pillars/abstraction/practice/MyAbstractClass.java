package OOP.pillars.abstraction.practice;

public abstract class MyAbstractClass {

    public void myMethod1(){

    }

    public void myMethod2(){

    }

   public abstract void myMethod3();
   public abstract void myMethod4();
}

//abstract class can have zero or more abstract methods - bad practice to have an abstract class
//without abstract methods

//Cannot create an object instance of MyClass unless implemented from a concrete class that
//extends abstract class
//***   Are there any common implementation that every subclass should inherit: If so use Abstract if not use Interface ***




