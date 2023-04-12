package OOP.pillars.polymorphism.practice;

public class Employee extends Person implements IPerson{
    @Override
    public String getName(){
        return ("I am an employee");
    }
}
