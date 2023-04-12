package OOP.pillars.polymorphism.practice;

public class Student extends Person implements IPerson{

    @Override
    public String getName(){
        return ("I am a student");
    }
}
