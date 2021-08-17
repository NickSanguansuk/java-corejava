package topics.stream_api;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("Loop through the list");

        List<String> nameList = new ArrayList<>(Arrays.asList("Larry", "Steve", "James", "Conan", "Ellen", "Smith"));

        System.out.println("---> toString()");
        System.out.println(nameList);

        System.out.println("---");

        System.out.println("---> List forEach() with method reference (Shortest)");
        nameList.forEach(System.out::println);

        System.out.println("---");

        System.out.println("---> List forEach() (Best)");
        // Collection.forEach() uses the collection's iterator (if one is specified).
        // That means that the processing order of the items is defined.
        nameList.forEach(name -> System.out.print(name + ", "));
        System.out.println();

        System.out.println("---");

        System.out.println("---> Stream forEach()");
        // In contrast, the processing order of Collection.stream().forEach() is undefined.
        nameList.stream().forEach(name -> System.out.print(name + ", "));
        System.out.println();

        System.out.println("---");

        System.out.println("---> Enhanced for loop");
        for (String s : nameList) {
            System.out.print(s + ", ");
        }
        System.out.println();

        System.out.println("---");

        System.out.println("---> Simple for loop");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.print(nameList.get(i) + ", ");
        }
        System.out.println();

        System.out.println("---");

        System.out.println("---> while loop");
        int count = 0;
        while (count < nameList.size()) {
            System.out.print(nameList.get(count) + ", ");
            count++;
        }
        System.out.println();

        System.out.println("---");

        System.out.println("---> Iterator");
        Iterator<String> itr = nameList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();

        System.out.println("---");

        System.out.println("---> ListIterator");
        ListIterator<String> listItr = nameList.listIterator();
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + ", ");
        }
        System.out.println();

        System.out.println("----------");
        System.out.println("stream() and forEach()");

        // filter for names that start with "C" and "S"
        // Uppercase
        // Sorted
        // println
        nameList
                .stream()
                .filter(s -> s.startsWith("C") || s.startsWith("S"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("Some examples of Stream");
        System.out.println("using .ifPresent()");

        Stream.of("a1", "a2", "a3", "d2", "c")
                .findFirst()
                .ifPresent(s -> System.out.println(s));

        System.out.println("---");
        System.out.println("using orElse()");

        String str1 = Stream.of("a1", "a2", "a3", "d2", "c")
                .findFirst()
                .orElse("");
        System.out.println(str1);

        System.out.println("---");
        System.out.println("using Optional<String>");

        Optional<String> str2 = Stream.of("a1", "a2", "a3", "d2", "c")
                .findFirst();
        System.out.println(str2);

        System.out.println("----------");
        System.out.println("Nothing execute here");
        // The following code snippet returns nothing to the console
        // It isn't even executed
        // Intermediate ops only executed when terminal op is present
        Stream.of("a1", "a2", "a3", "d2", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });

        System.out.println("----------");

        Stream.of("a1", "a2", "a3", "d2", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));

        System.out.println("----------");

        // Example contains two intermediate ops and one terminal op
        // Bot map & filter are called once for each string
        // forEach is only called once
        Stream.of("a1", "a2", "a3", "d2", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));

        System.out.println("----------");

        // Moving filter to the start of the chain
        // Reduces number of executions
        // Map is only called once now
        Stream.of("a1", "a2", "a3", "d2", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("Creating Stream(s)");

        System.out.println("Create empty Stream");
        Stream<Integer> empStream1 = Stream.empty();
        Stream<String> empStream2 = Stream.empty();

        System.out.println(empStream1);
        empStream1.forEach(p -> System.out.print(p + ", "));
        System.out.println();

        System.out.println("---");
        System.out.println("Stream.of() method ---> return Stream<T>");

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<String> stream2 = Stream.of("Bat", "Cat", "Rat");
        Stream stream3 = Stream.of(1, 4L, 2.2, 3.5f, "Hello", 'A', true, null);

        stream1.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        stream2.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        stream3.forEach(p -> System.out.print(p + ", "));
        System.out.println();

        System.out.println("---");
        System.out.println("Create Stream from Array");

        int[] intArrPri = {1, 2, 3, 4, 5};
        Integer[] intArr = {4, 1, 3, 8, 5, 2, 7, 9, 6};     // Need to be Integer[] (not int[])
        String[] strArr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQR"};

        IntStream streamIntPri1 = IntStream.of(intArrPri); // return IntStream
        IntStream streamIntPri2 = Arrays.stream(intArrPri); // return IntStream

        Stream<Integer> streamInt1 = Stream.of(intArr); // return Stream<T>
        Stream<Integer> streamInt2 = Arrays.stream(intArr); // return Stream<T>

        Stream<String> streamStr1 = Stream.of(strArr);
        Stream<String> streamStr2 = Arrays.stream(strArr);

        streamInt1.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        streamInt2.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        streamStr1.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        streamStr2.forEach(p -> System.out.print(p + ", "));
        System.out.println();

        System.out.println("---");
        System.out.println("Create Stream from Collection");

        List<Integer> intList1 = new ArrayList<>(Arrays.asList(intArr));
        List<String> strList1 = new ArrayList<>(Arrays.asList(strArr));

        Stream<Integer> streamInt3 = intList1.stream();

        //Stream<Integer> streamInt4 = Stream.of(intList1);     // Compile Error

        Stream<String> streamStr3 = strList1.stream();

        //Stream<String> streamStr4 = Stream.of(strList1.toString());     // Logical Error

        streamInt3.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        //streamInt4.forEach(p -> System.out.print(p + ", "));
        //System.out.println();
        streamStr3.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        //streamStr4.forEach(p -> System.out.print(p + ", "));
        //System.out.println();

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("Old Imperative Style   VS   New Declarative Style");

        System.out.println(strList1);

        System.out.println("---");

        System.out.println("Old (External loop)");
        for (String s : strList1) {
            System.out.print(s + ", ");
        }
        System.out.println();

        System.out.println("New (Internal Loop)");
        strList1.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        strList1.forEach(System.out::println);

        System.out.println("----------");

        System.out.println(intList1);

        System.out.println("Old");
        int count1 = 0;
        for (Integer i : intList1) {
            if (i % 2 == 0) {
                count1++;
            }
        }
        System.out.println(count1);

        System.out.println("New");
        long count2 = intList1.stream()
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(count2);

        System.out.println("----------");
        // Finding whether all integers are less than 10 in the list

        System.out.println("Old");
        boolean b1 = true;
        for (Integer i : intList1) {
            if (i >= 10) {
                b1 = false;
                break;
            }
        }
        System.out.println(b1);

        System.out.println("New");
        boolean b2 = intList1.stream()
                .allMatch(i -> i < 10);
        System.out.println(b2);

        System.out.println("----------");
        // Finding all sub-directory names in a directory
        String dirName = "src\\topics\\functional_programming";

        System.out.println("Old");
        List<String> allDirNames1 = new ArrayList<>();
        for (File file : new File(dirName).listFiles()) {
            if (file.isDirectory()) {
                allDirNames1.add(file.getName());
            }
        }
        System.out.println(allDirNames1);

        System.out.println("New");
        List<String> allDirNames2 = Arrays.stream(new File(dirName).listFiles())
                .filter(File::isDirectory)
                .map(File::getName)
                .collect(Collectors.toList());
        System.out.println(allDirNames2);

        List<String> allDirNames3 = Arrays.stream(new File(dirName).listFiles())
                .filter(f -> f.isDirectory())
                .map(f -> {
                    return f.getName();
                })
                .collect(Collectors.toList());
        System.out.println(allDirNames3);

        System.out.println("---------- ---------- ---------- ---------- ----------");

        // Intermediate Operation or Non-Terminal Operation: (Intermediate Operations returns a new stream from the source or another stream)
        // •	filter()
        // •	map()  It returns a stream consisting of the results of applying a given function to every element of the Stream.
        // •	flatMap()
        // •	distinct()
        // •	limit()
        // •	peek()
        // •	Skip()
        // •	Sorted()

        // Terminal Operations
        // •	anyMatch()
        // •	allMatch()
        // •	noneMatch()
        // •	collect()  collects the elements in the stream in a collection list1
        // •	count()
        // •	findAny()
        // •	findFirst()
        // •	forEach()
        // •	forEachOrdered()
        // •	min()
        // •	max()
        // •	reduce()
        // •	toArray()

        // Optional
        // •	orElse()
        // •	ifPresent()

        System.out.println("Terminal Operations Examples – use forEach()");

        intList1.stream().forEach(x -> System.out.print(x + ", "));
        System.out.println();
        // Same as
        Stream<Integer> stream = intList1.stream();
        stream.forEach(x -> System.out.print(x + ", "));
        System.out.println();

        System.out.println("----------");
        System.out.println("---> .allMatch()");

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("OneTo killer a mucking bird");
        stringList.add("OneGone with the winder");

        boolean result = stringList.stream()
                .allMatch(p -> {
                    return p.startsWith("One");
                });
        System.out.println(result);

        boolean result2 = stringList.stream()
                .allMatch(p -> {
                    return p.contains("killer");
                });
        System.out.println(result2);

        System.out.println("----------");
        System.out.println("---> .anyMatch()");

        boolean result3 = stringList.stream()
                .anyMatch(p -> {
                    return p.contains("killer");
                });
        System.out.println(result3);

        System.out.println("----------");
        System.out.println("---> .collect()");
        // It returns result container such as List, Set or Map according to supplied Collectors.

        System.out.println("Stream ---> List");
        List<String> resultList1 = strList1.stream().collect(Collectors.toList());
        System.out.println(resultList1);

        System.out.println("List ---> Array");
        // Not recommended
        String[] resultArr1 = strList1.stream().toArray(size -> new String[size]);
        for (String s : resultArr1) {
            System.out.print(s + ", ");
        }
        System.out.println();

        // Good way
        String[] resultArr2 = strList1.toArray(size -> new String[size]);
        for (String s : resultArr2) {
            System.out.print(s + ", ");
        }
        System.out.println();

        // One of the best ways
        String[] resultArr3 = strList1.toArray(String[]::new);
        for (String s : resultArr3) {
            System.out.print(s + ", ");
        }
        System.out.println();

        // Better way
        String[] resultArr4 = strList1.toArray(new String[strList1.size()]);
        for (String s : resultArr4) {
            System.out.print(s + ", ");
        }
        System.out.println();

        // Best way?
        String[] resultArr5 = strList1.toArray(new String[0]);
        for (String s : resultArr5) {
            System.out.print(s + ", ");
        }
        System.out.println();

        System.out.println("----------");
        System.out.println("---> .collect(Collectors.joining(\", \")");

        String resultStr1 = strList1.stream()
                .map((x) -> {
                    return x.toString();
                })
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(resultStr1);

        // Better
        String resultStr2 = strList1.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(resultStr2);

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("Intermediate Operation (Non Terminal operation)");

        List<String> list1 = new ArrayList<>(Arrays.asList("C1", "A5", "A4", "B1", "A3", "A1", "C2", "B2", "A2"));

        System.out.println("Raw data");
        System.out.println(list1);

        System.out.println("---");
        System.out.println("Sorted");

        list1.stream()
                .sorted()
                .forEach(x -> System.out.print(x + ", "));
        System.out.println();

        System.out.println("---");
        System.out.println("Sorted reverse ordered");

        list1.stream()
                .sorted((x, y) -> y.compareTo(x))
                .forEach(x -> System.out.print(x + ", "));
        System.out.println();

        list1.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.print(x + ", "));
        System.out.println();

        System.out.println("----------");

        System.out.println(".filter() for \"A\" || \"C\"\t\t\t---> C1, A5, A4, A3, A1, C2, A2");
        System.out.println(".skip() the first 2 item        \t---> A4, A3, A1, C2, A2");
        System.out.println(".map() to toLowerCase()         \t---> a4, a3, a1, c2, a2");
        System.out.println(".sorted by reverseOrder()       \t---> c2, a4, a3, a2, a1");
        System.out.println(".collect the data into List     \t---> c2, a4, a3, a2, a1");

        List<String> filteredSorted = list1.stream()
                .filter(x -> x.startsWith("A") || x.startsWith("C"))
                .skip(2)
                //.map(x -> x.toLowerCase())
                .map(String::toLowerCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(filteredSorted);

        System.out.println("---");
        System.out.println("Look inside the implementations");

        list1.stream()
                .filter(x -> {
                    System.out.println("---> filter: " + x);
                    return x.startsWith("A") || x.startsWith("C");
                })
                .skip(2)
                .map(x -> {
                    System.out.println("---> map: " + x);
                    return x.toLowerCase();
                })
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println("forEach: " + x));

        System.out.println("----------");

        System.out.println("list1");
        System.out.println(list1);

        System.out.println("list2");
        List<String> list2 = new ArrayList<>(Arrays.asList("D2", "C2", "B3", "D1", "A2"));
        System.out.println(list2);

        System.out.println("Stream.concat(list1.stream(), list2.stream())");
        System.out.println("list3");
        List<String> list3 = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println(list3);

        System.out.println(".duplicate()");
        System.out.println("list4");
        List<String> list4 = list3.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list4);

        System.out.println(".sorted()");
        System.out.println("list5");
        List<String> list5 = list4.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list5);

        System.out.println("All in one");

        Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .sorted()
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        System.out.println("Do even more (Comment out the operations that want to test)");

        Stream.concat(list1.stream(), list2.stream())
                .filter(s -> s.compareTo("C1") < 0)
                .distinct()
                .map(s -> s.toLowerCase())
                .sorted()
                .skip(2)
                .limit(5)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        System.out.println("----------");
        System.out.println("little example from Integer[]");

        Integer[] arr = {10, 1, 3, 5, 11, 7, 9, 2, 4, 6, 8};
        Arrays.stream(arr)
                .skip(2)
                .sorted()
                .skip(2)
                .forEach(x -> System.out.print(x + ", "));
        System.out.println();

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("IntStreams can replace the regular for loop");
        // Use IntStream.range() to create a stream
        // Call the lambda forEach method

        String ex = "2456747";

        List<String> expression = Arrays.asList(ex.split(""));
        System.out.println(expression);

        // This seems overkill
        IntStream.range(0, expression.size()).forEach(i -> System.out.print(expression.get(i) + ", "));
        System.out.println();

        // Better?
        expression.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("User class");

        List<User> users = new ArrayList<>();
        users.add(new User(101, "Jeff", 34));
        users.add(new User(102, "Bob", 31));
        users.add(new User(103, "Nick", 38));
        users.add(new User(104, "Joe", 44));
        users.add(new User(105, "Brian", 28));

        System.out.println(users);

        System.out.println("---");

        users.stream()
                .sorted(Comparator.comparing(u -> u.getId()))
                .forEach(u -> System.out.println(u));

        System.out.println("---");

        users.stream()
                .sorted(Comparator.comparing(User::getName))
                .forEach(u -> System.out.println(u));

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("Aggregate functions");

        System.out.println(".reduce()");

        Double[] doubleArr = {4.0, 5.0, 2.0, 3.0, 5.0};

        double d1 = Stream.of(doubleArr)
                .reduce(2.0, (x, y) -> x * y);
        System.out.println(d1);

        double d2 = Stream.of(doubleArr)
                .reduce(2.0, (x, y) -> x + y);
        System.out.println(d2);

        System.out.println("----------");

        System.out.println(".average()");

        double d4 = Stream.of(doubleArr)
                .mapToDouble(x -> x)
                .average()
                .orElse(0.0);
        System.out.println(d4);

        System.out.println("---");

        OptionalDouble d5 = Stream.of(doubleArr)
                .mapToDouble(x -> x)
                .average();
        System.out.println(d5);

        System.out.println("----------");

        System.out.println("DoubleStream, IntStream");

        // java.util.stream.IntStream in Java 8, deals with primitive ints.
        // It helps to solve the old problems like finding maximum value in array,
        // finding minimum value in array, sum of all elements in array,
        // and average of all values in array in a new way.

        double[] doubles = {4.0, 5.0, 2.0, 3.0, 5.0};
        int[] ints = {5, 1, 3, 4, 3};

        // Creating DoubleStream
        DoubleStream doubleStream = DoubleStream.of(doubles);
        IntStream intStream = IntStream.of(ints);

        double d6 = DoubleStream.of(doubles)
                .average()
                .orElse(0.0);
        System.out.println(d6);

        System.out.println("---");

        OptionalDouble d7 = DoubleStream.of(doubles)
                .average();
        System.out.println(d7);

        System.out.println("---");

        OptionalDouble obj1 = IntStream.of(2, 3, 4, 5, 6, 7, 8)
                .average();
        System.out.println(obj1);

        double d8 = obj1.getAsDouble();
        System.out.println(d8);

        System.out.println("---");

        double d9 = IntStream.of(2, 3, 4, 5, 6, 7, 8)
                .average()
                .getAsDouble();
        System.out.println(d9);

        System.out.println("----------");

    }
}
