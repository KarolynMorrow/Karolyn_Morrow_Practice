package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class Deparment {
    private String name;
    private String location;
    static Employee[] employees = new Employee[100];
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
        employees[currentIndex++] = employee;
    }
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        //If employee object contains work() method - "worked" string add to employees worked

        int employeesWorked = 0;
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                String worked = employees[i].work();
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
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalCompensation++ ;
                break;
            } else {
                break;
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

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
