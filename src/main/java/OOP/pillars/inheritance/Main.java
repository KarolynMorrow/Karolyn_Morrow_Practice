package OOP.pillars.inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("tracey", 20, "A");
        Teacher teacher = new Teacher("Sang", 30, "CS");

        teacher.walk();
        student.walk();

    }


}
