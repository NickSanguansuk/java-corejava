package trainings.bfs.week1.day3.hw.hw2;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {

    String office;
    int salary;
    //Date dateHired;
    LocalDate dateHired;

    public Employee(String name, String address, String phone, String email, String office, int salary, LocalDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    //@Override
    //public String toString() {
    //    return "Employee{" +
    //            "office='" + office + '\'' +
    //            ", salary=" + salary +
    //            ", dateHired=" + dateHired +
    //            ", name='" + name + '\'' +
    //            ", address='" + address + '\'' +
    //            ", phone='" + phone + '\'' +
    //            ", email='" + email + '\'' +
    //            '}';
    //}
}
