package topics.collection_demo.arraylist_demo;

import java.io.FileNotFoundException;
import java.util.List;

public class EmployeeDisplayInfo {

    public void displayEmployee() {

        EmployeeInfo empInfo = new EmployeeInfo();
        List<Employee> empList = empInfo.pullEmployeeInfo();

        for (Employee e : empList) {
            System.out.println(e.getId() + ", " + e.getEmpName() + ", " + e.getAge());
        }
    }

    public void displayEmployeeFromFile() throws FileNotFoundException {

        EmployeeInfo empInfo = new EmployeeInfo();
        List<Employee> empList = empInfo.pullDataFromFile();

        for (Employee e : empList) {
            System.out.println(e.getId() + ", " + e.getEmpName() + ", " + e.getAge());
        }
    }

}
