package trainings.bfs.week1.day3.hw.hw2;

import java.time.LocalDate;
import java.util.Date;

public class Faculty extends Employee {

    String officeHours;
    String rank;

    public Faculty(String name, String address, String phone, String email, String office, int salary, LocalDate dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }
}
