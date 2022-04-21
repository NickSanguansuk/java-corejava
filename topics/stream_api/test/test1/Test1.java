package topics.stream_api.test.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3, "Nick", 35));
        employeeList.add(new Employee(2, "Apple", 36));
        employeeList.add(new Employee(1, "Vincent", 26));
        employeeList.add(new Employee(6, "Ann", 32));
        employeeList.add(new Employee(5, "Bradly", 32));
        employeeList.add(new Employee(4, "Bob", 24));

        Map<Integer, Employee> employeeMap = employeeList.stream()
                .filter((e) -> e.getName().startsWith("A"))
                .collect(Collectors.toMap(Employee::getId, Function.identity()));

        System.out.println(employeeList);
        System.out.println(employeeMap);
    }
}
