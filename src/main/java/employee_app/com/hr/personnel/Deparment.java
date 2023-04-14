package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Deparment {
    private String name;
    private String location;
    static List<Employee> employees = new ArrayList<>();
    int currentIndex = 0;

    //--Constructor

    public Deparment() {
    }

    public Deparment(String name, String location) {
        this.name = name;
        this.location = location;
    }

    //--Methods
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        //If employee object contains work() method - "worked" string add to employees worked

        int employeesWorked = 0;
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i) != null){
                String worked = employees.get(i).work();
                if (worked.contains("worked")){
                    employeesWorked++;
                }
            }

        }
        return employeesWorked;
    }

   //Compute total compensation of all employees in the Department
    public double computeDepartmentMonthlyTotalCompensation(){
        double totalCompensation = 0;
        //Loop through the Employee[] until null, grab the compensation of each employee from the method computeMonthlyCompensation()
        //and add it to totalCompensation
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) != null) {
                totalCompensation += employees.get(i).computeMonthlyCompensation();
            }
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

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Employee> employees) {
        Deparment.employees = employees;
    }
}
