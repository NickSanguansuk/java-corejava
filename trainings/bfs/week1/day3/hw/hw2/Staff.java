package trainings.bfs.week1.day3.hw.hw2;

import java.time.LocalDate;
import java.util.Date;

public class Staff extends Employee {

    String title;

    public Staff(String name, String address, String phone, String email, String office, int salary, LocalDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                '}';
    }
}
