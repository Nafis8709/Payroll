package payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstname, String lastname, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstname, lastname, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {

        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("Base Plus Commission Employee: %s\nBase Salary: %.2f", super.toString(), baseSalary);
    }
    public double getBaseSalary() {

        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {

        this.baseSalary = baseSalary;
    }
    @Override
    public void increaseBaseSalary() {

        setBaseSalary(getBaseSalary() *1.10);
    }

}
