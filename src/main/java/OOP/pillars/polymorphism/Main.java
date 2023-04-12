package OOP.pillars.polymorphism;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.walk();

        Boy boy = new Boy();
        boy.walk();

        Person person1 = boy;
        person1.walk();
        //Same as ((Person)boy).walk();


    }
}

class Person{
    public void walk(){
        System.out.println("Person walks");
    }
}

class Boy extends Person{
    @Override
    public void walk(){
        System.out.println("Boy walks");
    }
}

class Girl extends Person{
    @Override
    public void walk() {
        System.out.println("Girl walks");
    }
}
