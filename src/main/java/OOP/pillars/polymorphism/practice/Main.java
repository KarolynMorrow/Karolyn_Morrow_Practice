package OOP.pillars.polymorphism.practice;

public class Main {
    //Polymorphism - the ability to appear in many forms
    //The ability of a reference variable to change behavior according to what object instance
    //is referring to
    public static void main(String[] args) {
        Student studentObj = new Student();
        Employee employeeObj = new Employee();
        IPerson refPerson = studentObj;
        String temp = refPerson.getName();
        System.out.println(temp);

        refPerson = employeeObj;
        String temp2 = refPerson.getName();
        System.out.println(temp2);
    }


}
