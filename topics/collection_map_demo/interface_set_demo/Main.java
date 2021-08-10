package topics.collection_map_demo.interface_set_demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("Set (Interface)");

        // Set is a collection with no Duplicate Elements or Every element of set must be unique.
        // set is interface. we can not create object. we give implementation by HashSet, TreeSet and other

        Set<Integer> setInt = new HashSet<>();
        Set<String> setStr = new HashSet<>();
        Set<Integer> setInt2 = new TreeSet<>();
        Set<String> setStr2 = new TreeSet<>();

        System.out.println("----------");
        System.out.println(".add() and .addAll()");

        setInt.add(20);
        setInt.add(10);
        setInt.add(2);
        setInt.add(1);
        setInt.add(3);

        setInt.add(1);
        setInt.add(20);

        System.out.println(setInt);

        System.out.println("---");

        for (Integer i : setInt) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("---");

        Set<Integer> setInt3 = new HashSet<>();
        setInt3.add(3);
        setInt3.add(4);
        setInt3.add(5);

        setInt3.addAll(setInt);
        System.out.println(setInt3);

        // HashSet and TreeSet duplicate value not allow
        // HashSet does not maintain any order but order is base on hashing algorithm
        // TreeSet by default Values store in ASC Order

        // HashSet allow null value
        // TreeSet not allow null Value

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("HashSet");

        Set<String> set4 = new HashSet<>();

        set4.add("USA");
        set4.add("UK");
        set4.add("Australia");
        set4.add("UAE");
        set4.add("UAE");
        set4.add(null);

        System.out.println(set4);

        System.out.println("contains USA?: " + set4.contains("USA"));
        set4.remove("UK");
        System.out.println("After remove UK");
        System.out.println(set4);

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("TreeSet");

        //  TreeSet
        TreeSet<String> set5 = new TreeSet<>();

        set5.add("usa");
        set5.add("uk");
        set5.add("canada");
        set5.add("uae");
        //set5.add(null); // Run-time Error: add null value to TreeSet
        System.out.println(set5);
        System.out.println(set5.first());

        System.out.println("----------");

        Set<Employee> empSet = new TreeSet<>();

        empSet.add(new Employee(103, "Wasin", 85000.0));
        empSet.add(new Employee(101, "Nick", 72000.0));
        empSet.add(new Employee(104, "Conea", 68000.0));
        empSet.add(new Employee(102, "Pig", 84000.0));

        // The order of TreeSet is depended on the "compareTo()" method

        // After modified the "compareTo()" method
        // HashCode are the same
        // But the order changed

        System.out.println(empSet);

        System.out.println("---");

        for (Employee e : empSet) {
            System.out.println(e + ", " + e.getId());
        }


    }
}
