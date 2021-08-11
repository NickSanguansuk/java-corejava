package topics.functional_programming.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("forEach loop (internal loop)");

        List<String> nameList = new ArrayList<>(Arrays.asList("Larry", "Steve", "James", "Conan", "Ellen", "Smith"));

        nameList.forEach(name -> System.out.print(name + ", "));
        System.out.println();

        System.out.println("---");

        nameList.forEach(System.out::println);

        System.out.println("---");
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

        Stream.of("a1", "a2", "a3", "d2", "c")
                .findFirst()
                .ifPresent(s -> System.out.println(s));

        System.out.println("---");

        // The following code snippet returns nothing to the console
        // It isn't even executed
        // Intermediate ops only executed when terminal op is present
        Stream.of("a1", "a2", "a3", "d2", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });

        System.out.println("---");

        Stream.of("a1", "a2", "a3", "d2", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));

        System.out.println("---");

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

        System.out.println("---");

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

        Stream<Integer> empStream1 = Stream.empty();
        Stream<String> empStream2 = Stream.empty();

        System.out.println(empStream1);
        empStream1.forEach(p -> System.out.print(p + ", "));
        System.out.println();

        System.out.println("---");

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

        Integer[] intArr = {1, 3, 5, 7, 9};
        Stream<Integer> stream4 = Stream.of(intArr);
        Stream<Integer> stream5 = Arrays.stream(intArr);

        stream4.forEach(p -> System.out.print(p + ", "));
        System.out.println();
        stream5.forEach(p -> System.out.print(p + ", "));
        System.out.println();

        System.out.println("---");
        System.out.println("Create Stream from Collection");

        List<String> list6 = new ArrayList<>(Arrays.asList("ABC", "DEF", "GHI", "JKL"));

        // normal forEach with List
        list6.forEach(p -> System.out.print(p + ", "));
        System.out.println();

        // convert List to Stream, then forEach
        Stream<String> stream6 = list6.stream();
        stream6.forEach(p -> System.out.print(p + ", "));
        System.out.println();

        Stream<String> stream7 = list6.stream();
        stream7.filter(p -> p.compareTo("GHI") >= 0)
                .forEach(p -> System.out.print(p + ", "));
        System.out.println();








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
        // •	collect()  collects the elements in the stream in a collection list
        // •	count()
        // •	findAny()
        // •	findFirst()
        // •	forEach()
        // •	min()
        // •	max()
        // •	reduce()
        // •	toArray()







        System.out.println("----------");
        System.out.println("allMatch()");

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("OneTo killer a mucking bird");
        stringList.add("OneGone with the winder");

        boolean result = stringList.stream().allMatch(p -> { return p.startsWith("One"); });
        System.out.println(result);

        boolean result2 = stringList.stream().allMatch(p -> { return p.contains("killer"); });
        System.out.println(result2);

        System.out.println("----------");
        System.out.println("anyMatch()");

        boolean result3 = stringList.stream().anyMatch(p -> { return p.contains("killer"); });
        System.out.println(result3);







        System.out.println("----------");
        System.out.println("Terminal Op: .collect() ---> To convert Stream to Collection");









        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("IntStreams can replace the regular for loop");
        // Use IntStream.range() to create a stream
        // Call the lambda forEach method

        String ex = "2456747";

        List<String> expression = Arrays.asList(ex.split(""));
        System.out.println(expression);

        IntStream.range(0, expression.size()).forEach(i -> System.out.print(expression.get(i) + ", "));
        System.out.println();

        System.out.println("----------");

    }
}
