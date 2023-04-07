package OOP.pillars.inheritance;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;

    }
    public Teacher(){

    }
    @Override
    public void walk(){
        System.out.println(getName() + " walks like a teacher");
    }
    public void teach(){
        System.out.println(getName() + " teaches");
    }

}
