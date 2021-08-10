package topics.collection_map_demo.arraylist_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeInfo {

    // Hack
    int[] id = {101,102,103,104,105};
    String[] name = {"abc","xyz","efg","xyz","MNO"};
    int[] age = {25,36,26,21,54};

    // Data

    // Constructors

    // Getters and Setters

    // Methods
    public List<Employee> pullEmployeeInfo() {
        // Database connection come here
        // "select * from employee"

        List<Employee> empList = new ArrayList<>();

        for(int i = 0; i < id.length; i++) {
            Employee emp = new Employee();
            emp.setId(id[i]);
            emp.setEmpName(name[i]);
            emp.setAge(age[i]);
            empList.add(emp);
        }

        return empList;
    }

    public List<Employee> pullDataFromFile() throws FileNotFoundException {
        String fileName = "src\\topics\\collection_demo\\arraylist_demo\\employeeData.txt";

        File file = new File(fileName);

        Scanner scanner = new Scanner(file);

        List<Employee> empList = new ArrayList<>();
        String[] splitData = null;

        while(scanner.hasNext())
        {
            String data =  scanner.nextLine();
            splitData = data.split(",");

            Employee emp = new Employee();

            emp.setId(Integer.parseInt(splitData[0].trim()));
            emp.setEmpName(splitData[1]);
            emp.setAge(Integer.parseInt(splitData[2].trim()));

            empList.add(emp);
        }

        return empList;
    }

}
