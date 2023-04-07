package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    //--Constructors

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    //--Methods
    //--Getter and Setter
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
