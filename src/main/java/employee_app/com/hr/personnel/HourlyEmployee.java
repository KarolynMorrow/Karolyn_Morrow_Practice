package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    int hoursWorkedPerMonth;
    double hourlyRate;
    //--Constructor

    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }



    //--Methods

    @Override
    public String getEmployeeInfo() {
        return ("Name: " + getName() + " Hire Date(YYYY/MM/DD): " + getHireDate() + " Hourly Pay Rate: " + getHourlyRate());
    }

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    //--Getter and Setter
    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * HOURLY_TAX_RATE;
    }
}
