package topics.collection_map_demo.arraylist_demo;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("ArrayList");
        System.out.println("---> ArrayList of Object");

        List<Object> list1 = new ArrayList<>();
        list1.add("Wasin");
        list1.add(2);
        list1.add(20.35);
        list1.add(true);

        System.out.println(list1);

        System.out.println("----------");
        System.out.println("---> ArrayList of specific types");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        System.out.println(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Haseeb");
        stringList.add("Teacher");
        System.out.println(stringList);

        System.out.println("----------");
        System.out.println("---> Arrays.asList()");

        System.out.println("List");
        List<Object> list2 = Arrays.asList(1, "Dog", 2,35); // List (not ArrayList)
        List<Integer> list3 = Arrays.asList(2, 4, 6, 8); // List (not ArrayList)
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> list4 = Arrays.asList(intArray); // List (not ArrayList)

        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

        System.out.println("ArrayList");
        List<Integer> list3_new = new ArrayList<>(list3);
        System.out.println(list3_new);

        List<Integer> list4_new = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list4_new);

        System.out.println("----------");
        System.out.println("---> Loop through Lists");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // 1 .toString()
        System.out.println(list5);

        // 2 for loop (External loop)
        for (int i = 0; i < list5.size(); i++) {
            System.out.print(list5.get(i) + ", ");
        }
        System.out.println();

        // 3 enhance for loop (External loop)
        for (Integer i : list5) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Internal loops is faster than External loops

        // 4 forEach loop (Internal loop)
        list5.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // 4.5 forEach loop with method referencing (Internal loop)
        list5.forEach(System.out::println);

        // 5
        Iterator<Integer> itr = list5.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();



        System.out.println("----------");

        System.out.println("---> .addAll()");
        System.out.println(list5.addAll(list4));
        System.out.println(list5);

        System.out.println("---> .removeAll()");
        System.out.println(list5.removeAll(list4));
        System.out.println(list5);

        System.out.println("----------");

        List<String> list6 = new ArrayList<>(Arrays.asList("Joseph", "Ferhat", "Brian", "Erik", "Keith"));
        System.out.println(list6);

        System.out.println("---> .size()");
        System.out.println(list6.size());

        System.out.println("---> .contains(\"Ferhat\")");
        System.out.println(list6.contains("Ferhat"));

        System.out.println("---> .indexOf(\"Brian\")");
        System.out.println(list6.indexOf("Brian"));

        System.out.println("---> .get(3)");
        System.out.println(list6.get(3));

        System.out.println("---> .remove(2)");
        System.out.println(list6.remove(2));

        System.out.println("---> .add(\"David\")");
        System.out.println(list6.add("David"));

        System.out.println("---> Collections.sort(list6)");
        Collections.sort(list6);
        System.out.println(list6);

        System.out.println("----------");

        List<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee(101, "Haseeb", 60);
        Employee e2 = new Employee(102, "Joseph", 35);
        Employee e3 = new Employee(103, "Keith", 20);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        System.out.println(empList);

        Iterator<Employee> itr2 = empList.iterator();
        while (itr2.hasNext()) {
            Employee e = itr2.next();
            System.out.println(e.getAge() + " " + e.getEmpName() + " " + e.getId());
        }

        System.out.println("----------");
        System.out.println("EmployeeInfo class");

        EmployeeDisplayInfo empDisplayInfo = new EmployeeDisplayInfo();

        empDisplayInfo.displayEmployee();

        System.out.println();

        try {
            empDisplayInfo.displayEmployeeFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("----------");



    }
}
