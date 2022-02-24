package trainings.bfs.week1.day3.hw.hw2;

public class Student extends Person {

    enum ClassStatus {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    ClassStatus status;

    public Student(String name, String address, String phone, String email, ClassStatus status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
