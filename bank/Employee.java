package bank;

public class Employee extends Person {
    private int employeeNumber = getId();
    private float totalSalary;


    public Employee(ContactInfo contactInfo, int employeeNumber, float totalSalary) {
        super(contactInfo);
        this.employeeNumber = employeeNumber;
        this.totalSalary = totalSalary;

    }

}
