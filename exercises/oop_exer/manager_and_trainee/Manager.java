package exercises.oop_exer.manager_and_trainee;

public class Manager extends Employee {
    // Data

    // Constructors
    public Manager(long id, String name, String address, String phone, double salary) {
        super(id, name, address, phone);
        super.basicSalary = salary;
    }

    // Methods

}
