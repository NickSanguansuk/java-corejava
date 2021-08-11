package topics.functional_programming.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");

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

        System.out.println("----------");
        System.out.println("Stream.of() example");

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

        System.out.println("----------");
        System.out.println("IntStreams can replace the regular for loop");
        // Use IntStream.range() to create a stream
        // Call the lambda forEach method

        String ex = "2456747";

        List<String> expression = Arrays.asList(ex.split(""));
        System.out.println(expression);

        IntStream.range(0, expression.size()).forEach(i -> System.out.print(expression.get(i) + ", "));
        System.out.println();

        System.out.println("----------");









        System.out.println("----------");

    }
}
