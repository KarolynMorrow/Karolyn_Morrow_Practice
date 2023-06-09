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


    @Override
    public String getEmployeeInfo() {
        return ("Name: " + getName() + " Hire Date(YYYY/MM/DD): " + getHireDate() + " Monthly Salary: " + monthlySalary);
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    //--Getter and Setter
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return SALARIED_TAX_RATE * computeMonthlyCompensation();
    }
}
