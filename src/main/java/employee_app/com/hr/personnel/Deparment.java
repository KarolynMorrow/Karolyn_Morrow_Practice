package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Deparment {
    private String name;
    private String location;
    private List<Employee> employees = new ArrayList<>();
    int currentIndex = 0;

    //--Constructor

    public Deparment() {
    }

    public Deparment(String name, String location) {
        this.name = name;
        this.location = location;
    }

    //--Methods
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        //If employee object contains work() method - "worked" string add to employees worked

        int employeesWorked = 0;
        for (Employee employee : employees) {
            String worked = employee.work();
            if (worked.contains("worked")) {
                employeesWorked++;
            }

        }
        return employeesWorked;
    }

    //Compute total compensation of all employees in the Department
    public double computeDepartmentMonthlyTotalCompensation() {
        double totalCompensation = 0;
        //Loop through the Employee[] until null, grab the compensation of each employee from the method computeMonthlyCompensation()
        //and add it to totalCompensation
        for (Employee employee : employees) {

            totalCompensation += employee.computeMonthlyCompensation();

        }
        return totalCompensation;
    }
    //--Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
