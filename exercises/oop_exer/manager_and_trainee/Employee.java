package exercises.oop_exer.manager_and_trainee;

public class Employee {
    // Data
    protected long employeeId;
    protected String employeeName;
    protected String employeeAddress;
    protected long employeePhone;
    protected double basicSalary;
    protected double specialAllowance = 250.80;
    protected double hra = 1000.50;

    // Constructors
    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    // Methods
    public void calculateSalary() {
        // The given default values might be incorrect.
        // Is 250.80% specialAllowance too high?
        // Is 1000.50% hra too high?
        double salary = this.basicSalary + (basicSalary * specialAllowance / 100.0) + (basicSalary * hra / 100.0);
        System.out.println("Salary: " + String.format("%.2f", salary));
    }

    public void calculateTransportAllowance() {
        double transportAllowance = 10.0 / 100.0 * this.basicSalary;
        System.out.println("Transport Allowance (10%): " + String.format("%.2f", transportAllowance));
    }

}
