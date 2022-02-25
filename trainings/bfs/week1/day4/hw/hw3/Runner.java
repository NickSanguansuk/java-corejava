package trainings.bfs.week1.day4.hw.hw3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Brandon", "Smith"),
                new Employee(2, "Will", "Smith"),
                new Employee(3, "Mike", "Tyson"),
                new Employee(4, "Walt", "Disney"),
                new Employee(5, "Tony", "Stark"),
                new Employee(6, "Peter", "Porker"),
                new Employee(7, "Harry", "Potter")
        );
        //employees.forEach(System.out::println);

        System.out.println("---");

        System.out.println("Print out each employee of the list in this format: \"firstName lastName - id\".");
        employees.stream().forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " - " + emp.getId()));

        System.out.println("---");

        System.out.println("Return a list of employees whose last name start with \"S\".");
        List<Employee> startWithSList = employees.stream().filter(emp -> emp.getLastName().startsWith("S")).collect(Collectors.toList());
        //startWithSList.forEach(System.out::println);
        startWithSList.forEach(emp -> System.out.println(emp.getLastName()));

        System.out.println("---");

        System.out.println("Convert the list into a map, where key is the id of the employee and value is the employee object itself.");
        //Map<Integer, Employee> employeeMap = employees.stream().collect(Collectors.toMap(emp -> emp.getId(), emp -> emp));
        Map<Integer, Employee> employeeMap = employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        employeeMap.forEach((key, value) -> System.out.println(key + " - " + value.getId() + "," + value.getFirstName() + "," + value.getLastName()));

        System.out.println("---");

    }
}
