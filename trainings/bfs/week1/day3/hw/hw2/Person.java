package trainings.bfs.week1.day3.hw.hw2;

public class Person {

    String name;
    String address;
    String phone;
    String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
