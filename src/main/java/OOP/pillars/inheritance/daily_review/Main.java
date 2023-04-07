package OOP.pillars.inheritance.daily_review;

public class Main {


    Employee employee = new SalariedEmployee();
    String name = employee.getName();
    //double salary = employee.getMonthlySalary(); //Cannot access SalariedEmployee methods from Employee due to Employee being parent class
    double salary1 = ((SalariedEmployee) employee).getMonthlySalary();
    //Is the same as ----> double sal = SalariedEmployee.getMonthlySalary();

}
