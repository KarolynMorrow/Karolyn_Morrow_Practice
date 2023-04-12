package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HRClient extends Deparment {
    public static void main(String[] args) {
        Employee squidward = new SalariedEmployee("Squidward Tentacles", LocalDate.of(2021, 05, 12), 3050.75);
        Employee spongeBob = new SalariedEmployee("SpongeBob Squarepants", LocalDate.of(2021, 10, 31), 3500.50);

        Employee patrick = new HourlyEmployee("Patrick", LocalDate.of(2023, 01, 01), 160, 26.00);

        System.out.println(squidward.getEmployeeInfo());
        System.out.println(spongeBob.getEmployeeInfo());
        System.out.println(spongeBob.computeNumberOfYearsWorkedSinceHired());


        Deparment deparment = new Deparment("Customer Service", "Charlotte");
        deparment.addEmployee(spongeBob);
        deparment.addEmployee(patrick);
        int departmentInfo = deparment.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.printf("We have %d employee(s) working in the %s department at our %s location.\n", departmentInfo, deparment.getName(), deparment.getLocation());

        deparment.computeDepartmentMonthlyTotalCompensation();

    }


}
