package exercises.oop_exer.manager_and_trainee;

public class Manager extends Employee {
    // Data

    // Constructors
    public Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        super.basicSalary = salary;
    }

    // Methods
    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 15.0 / 100.0 * this.basicSalary;
        System.out.println("Transport Allowance (15%): " + String.format("%.2f", transportAllowance));
    }

}
