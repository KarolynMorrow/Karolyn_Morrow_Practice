package OOP.pillars.inheritance;

public class Student extends Person{

    private String grade;

   public Student(String name, int age, String grade){
       super(name, age);
       this.grade = grade;
   }
   public Student(){

   }
   @Override
    public void walk(){
        System.out.println(getName() + " walks like a student");
    }

    public void learn(){
        System.out.println(getName() + " learns");
    }


}
