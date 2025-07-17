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
        return String.format("\n%s\t %s\t\nSocial Security Number:-%s", firstname, lastname, socialSecurityNumber);
    }
}