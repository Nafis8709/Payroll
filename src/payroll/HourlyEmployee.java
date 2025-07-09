package payroll;

public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double hoursWorked;
    public HourlyEmployee(String firstname, String lastname, String socialSecurityNumber, double hourlyWage, double hoursWorked) {
        super(firstname, lastname, socialSecurityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double earnings() {
        if (hoursWorked <= 40) {
            return hourlyWage * hoursWorked;
        } else {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * hourlyWage * 1.5;
            return (hourlyWage * 40) + overtimePay;
        }
    }
    @Override
    public String toString() {
        return String.format("Hourly Employee: %s\nHourly Wage: %.2f\nHours Worked: %.2f", super.toString(), hourlyWage, hoursWorked);
    }
}
