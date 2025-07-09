package payroll;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("Sinha", "Hasibur", "111-11-1111", 800.00);
        employees[1] = new CommissionEmployee("Rashik", "Rayhan", "222-22-2222", 5000.00, 0.06);
        employees[2] = new BasePlusCommissionEmployee("Ashis", "Roy", "333-33-3333", 3000.00, 0.04, 1000.00);
        employees[3] = new HourlyEmployee("Ratul", "Rubaiyat", "444-44-4444", 15.00, 45.00);
        for (Employee employee : employees){
            employee.increaseBaseSalary();
        }
        for (Employee employee : employees){
            System.out.println(employee.toString());
            System.out.printf("weekly earnings:%.2f\n\n ", employee.earnings());
        }
    }
}
