package exercises.oop_exer.manager_and_trainee;

public class Employee {
    // Data
    protected long employeeId;
    protected String employeeName;
    protected String employeeAddress;
    protected String employeePhone;
    protected double basicSalary;
    protected double specialAllowance = 250.80;
    protected double hra = 1000.50;

    // Constructors
    public Employee(long employeeId, String employeeName, String employeeAddress, String employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    // Methods
    public void calculateSalary() {
        double salary = this.basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println(salary);
    }


}
