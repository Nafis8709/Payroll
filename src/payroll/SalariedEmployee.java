package payroll;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstname, String lastname, String socialSecurityNumber, double weeklySalary) {
        super(firstname, lastname, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s\n Weekly Salary: %.2f", super.toString(), weeklySalary);
    }
}
