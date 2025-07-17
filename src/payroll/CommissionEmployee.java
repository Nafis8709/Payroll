package payroll;

public abstract class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstname, String lastname, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstname, lastname, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s\nGross Sales: %.2f\nCommission Rate: %.2f\n Total earning:", super.toString(), grossSales, commissionRate);
    }

    public abstract void increaseBaseSalary();
}
