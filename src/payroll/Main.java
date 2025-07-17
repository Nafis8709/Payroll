package payroll;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Prottoy", "Paul", "123-45-6789", 1000));
        employees.add(new SalariedEmployee("Roudro", "Borno", "987-65-4321", 1500));
        employees.add(new HourlyEmployee("Surjo", "Khan", "111-22-3333", 900, 23));
        employees.add(new HourlyEmployee("Tonmoy", "Shah", "999-88-7777", 750, 45));
        employees.add(new CommissionEmployee("Ant", "Man", "000-12-3456", 2000, 20) {
            @Override
            public void increaseBaseSalary() {

            }
        });
        employees.add(new BasePlusCommissionEmployee("Priyan", "Paul", "444-55-6666",3000, 15, 200));


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