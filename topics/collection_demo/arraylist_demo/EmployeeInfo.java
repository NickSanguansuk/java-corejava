package topics.collection_demo.arraylist_demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {
    // Data
    List<Employee> empList = new ArrayList<>();

    // Constructors

    // Getters and Setters

    // Methods
    public void addEmployeeInfo(int id, String name, int age) {
        Employee emp = new Employee();
        emp.setId(id);
        emp.setEmpName(name);
        emp.setAge(age);

        this.empList.add(emp);
    }

    public void addEmployeeInfo(int[] id, String[] name, int[] age) {
        for (int i = 0; i < id.length; i++) {
            this.addEmployeeInfo(id[i], name[i], age[i]);
        }
    }

    public void displayEmployeeList() {
        for (Employee e : this.empList) {
            System.out.println(e.getId() + ", " + e.getEmpName() + ", " + e.getAge());
        }
    }

}
