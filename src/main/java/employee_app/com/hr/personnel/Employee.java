package employee_app.com.hr.personnel;

import employee_app.gov.irs.TaxPayer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Employee implements TaxPayer {

    private String name;
    private LocalDate hireDate;

    //---Constructor---

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //---Methods---
    public abstract String getEmployeeInfo();

    public String work(){
        return name + " worked";
    }
    public abstract double computeMonthlyCompensation();

    //If current year is 2022 and the year of hireDate is 2020, it returns 2
    public int computeNumberOfYearsWorkedSinceHired(){
        LocalDate local = LocalDate.now();
        int currentYear = local.getYear();
        return currentYear - hireDate.getYear();

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
