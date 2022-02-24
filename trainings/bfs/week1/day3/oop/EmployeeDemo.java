package trainings.bfs.week1.day3.oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Demo for "this"
 */
class Employee implements Cloneable {
    private int age;
    private String name;
    private HomeAddress homeAddress;

    public Employee() {
        this(0, "John Doe"); // calling another constructor
    }

    public Employee(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Employee getCurrentEmployee() {
        return this; // current class instance variable
    }

    @Override
    public String toString() {
        return "[Employee] " + name + ": " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee))
            return false;
        Employee e = (Employee) obj;
        return this.age == e.age && this.name.equals(e.name);
    }

    public boolean compare(Employee e) {
        return equals(e);
        //return this.equals(e); // calling current class method
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();

        Employee e = (Employee) super.clone(); //shallow copy
        //e.setHomeAddress((HomeAddress) getHomeAddress().clone());

        //new HomeAddress("123 Main Street", "CA")

        HomeAddress address = getHomeAddress(); // object address
        HomeAddress clonedAddress = new HomeAddress(address.getStreet(), address.getState()); // create a new object with exact the same field values
        e.setHomeAddress(clonedAddress);

        return e;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }

}

class HomeAddress implements Cloneable {
    String street;
    String state;

    public HomeAddress(String street, String state) {
        this.state = state;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "street='" + street + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

public class EmployeeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        // simple this demo
        Employee e1 = new Employee(21, "Bruce William");
        Employee e2 = new Employee(21, "Adam Levine");
        //System.out.println(e1.compare(e2));


        // cloneable demo - shallow copy vs deep copy
        e1.setHomeAddress(new HomeAddress("123 Main Street", "CA"));
        //
        Employee e4 = (Employee) e1.clone();
        e4.setName("Benji Geller");
        e4.setAge(200);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e4.getHomeAddress().getState());

        e4.getHomeAddress().setState("NJ");
        System.out.println("is e1 still lives in CA? " + "CA".equals(e1.getHomeAddress().getState()));

        // toString demo (memory address)
        //Employee e3 = e1;
        //System.out.println(e1);
        //System.out.println(e2);
        //System.out.println(e3);

    }
}