package payroll;

public abstract class Employee {
    private String firstname;
    private String lastname;
    private String socialSecurityNumber;

    public Employee(String firstname, String lastname, String socialSecurityNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double earnings();

    public String toString() {
        return String.format("%s\t %s\t", firstname, lastname,"\nSocial Security Number:-%s\n",socialSecurityNumber);
    }
    public void increaseBaseSalary(){
    }
}
