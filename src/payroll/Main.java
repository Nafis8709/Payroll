package payroll;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Prottoy", "Paul", "123-45-6789", 100));
        employees.add(new SalariedEmployee("Roudro", "Borno", "987-65-4321", 500));
        employees.add(new HourlyEmployee("Surjo", "Khan", "11-22-33", 400, 20));
        employees.add(new HourlyEmployee("Tonmoy", "Shah", "9-88-000", 150, 50));
        employees.add(new CommissionEmployee("Ant", "Man", "40-12-333", 1000, 20));
        employees.add(new BasePlusCommissionEmployee("Priyan", "Paul", "444-55-6666",4000, 15, 200));


        for (Employee e : employees) {
            System.out.println(e.toString());
            System.out.printf("Earnings: %.2f\n", e.earnings());

            if (e instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee b = (BasePlusCommissionEmployee) e;
                System.out.printf("Base Salary: %.2f\n", b.getBaseSalary());
                b.increaseBaseSalary();
                System.out.printf("Increased Base Salary: %.2f\n", b.getBaseSalary());
            }

        }

    }
}