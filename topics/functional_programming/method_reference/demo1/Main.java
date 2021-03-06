package topics.functional_programming.method_reference.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// Call by value
// Call by method

@FunctionalInterface
interface Parser {
    String parse(String str);
}

class StringParser {

    // static
    public static String convert(String str) {
        if (str.length() <= 3)
            str = str.toUpperCase();
        else
            str = str.toLowerCase();

        return str;
    }

    // non-static
    public String convert2(String str) {
        if (str.length() <= 3)
            str = str.toUpperCase();
        else
            str = str.toLowerCase();

        return str;
    }
}

class MyPrinter {

    public void print(String str, Parser p) {

        str = p.parse(str);
        System.out.println(str);
    }
}

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin", "Manoj", "Priya", "Shiva");

        System.out.println("----------");

        // 1
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + ", ");
            }
        };

        names.forEach(con1);
        System.out.println();

        System.out.println("---");

        // 2
        //Consumer<String> con2 = (s) -> { System.out.print(s + ", "); };
        Consumer<String> con2 = s -> System.out.print(s + ", ");

        names.forEach(con2);
        System.out.println();

        System.out.println("---");

        // 3
        names.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        System.out.println("---");
        System.out.println("Java Higher Order Functions");
        System.out.println("Method Reference");

        // 4
        names.forEach(System.out::println);

        System.out.println("----------");
        System.out.println("with static method");

        //String str = "Wasin Sanguansuk";
        String str = "Dog";
        MyPrinter myPrinter = new MyPrinter();
        // 1
        //myPrinter.print(str, new Parser() {
        //            @Override
        //            public String parse(String str) {
        //                return StringParser.convert(str);
        //            }
        //        }
        //);
        // 2
        //myPrinter.print(str, (s -> StringParser.convert(s)));
        // 3
        myPrinter.print(str, (StringParser::convert));


        System.out.println("----------");
        System.out.println("with non-static method");

        String str2 = "Dog";
        MyPrinter myPrinter2 = new MyPrinter();
        StringParser strParser = new StringParser();
        myPrinter.print(str, (strParser::convert2));

        System.out.println("----------");
        System.out.println("Example with array");

        String[] nameArray = {"Barbara", "James", "Mary", "John", "Robert"};

        System.out.println(Arrays.asList(nameArray));

        System.out.println("---");
        System.out.println("using Stream.of()"); // a little overkill
        // forEach() on a stream differs slightly form
        // forEach() on a collection
        // e.g., forEach() ordering is undefined on a stream,
        // whereas it's defined for a collection.

        Stream.of(nameArray).forEach(System.out::print);
        System.out.println();

        System.out.println("---");
        System.out.println("using Arrays.asList()");

        Arrays.asList(nameArray).forEach(System.out::print);
        System.out.println();





        System.out.println("----------");
    }
}
