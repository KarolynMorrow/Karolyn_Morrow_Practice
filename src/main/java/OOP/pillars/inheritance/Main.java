package OOP.pillars.inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("tracey", 20, "A");
        Teacher teacher = new Teacher("Sang", 30, "CS");

        teacher.walk();
        student.walk();

        Person person1 = new Student();
        Person person2 = new Teacher();
        Student student1 = (Student) person1; //Explicit type casting TRY TO AVOID USING TYPE CASTING
        //No compile error but runtime error type mismatch exception
        //because person2 refers to Teacher object
        //Student student2 = (Student) person2;

        //Use instanceOf operator to prevent runtime type mismatch error

        if(person2 instanceof Student){
            Student student2 = (Student) person2;
            student2.walk();
        } else {
            System.out.println("person2 is not a Student type");
        }


        //Usage of Generics is suggested to prevent runtime type mismatch error vs instanceOf

    }


}
