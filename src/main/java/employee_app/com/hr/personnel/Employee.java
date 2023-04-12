package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private LocalDate hireDate;

    //---Constructor---

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //---Methods---
    public String getEmployeeInfo(){
        return "Name= " + name + ", Hire date = " + hireDate;
    }

    public String work(){
        return name + " worked";
    }

    //If current year is 2022 and the year of hireDate is
    //2020, it returns 2
    public int computeNumberOfYearsWorkedSinceHired(){
        LocalDate local = LocalDate.now();
        int currentYear = local.getYear();
        int amountOfYears = currentYear - hireDate.getYear();
        return amountOfYears;

    }

    public double computeMonthlyCompensation(){
        return 0.0;
    }


    //---Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}