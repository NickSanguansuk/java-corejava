package topics.concurrency_programming.demo7;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringBufferExample {

    public static void add(StringBuffer sb) {
        sb.append("123");
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println("1 " + sb);
        sb.append("ASDF");
        System.out.println("2 " + sb);
        add(sb);
        System.out.println("3 " + sb);

        // know this
        sb.replace(0, 4, "asdf");
        System.out.println("4 " + sb);

        // know this ( espeically the 0 based indexing )
        sb.insert(0, "front ");
        System.out.println("5 " + sb);

        sb.insert(6, "mid ");
        System.out.println("6 " + sb);

        sb.reverse();
        System.out.println("7 " + sb);

        sb.delete(0, 3);
        System.out.println("8 " + sb);

        StringBuffer sb1 = new StringBuffer("135");
        // 135
        sb1.replace(0, 5, "6789");
        sb1.insert(0, "12345");
        // 6789
        // 123456789
        System.out.println(sb1.reverse().delete(0, 5));
        // 987654321
        // 4321

        System.out.println("asdf".substring(1).toUpperCase());
        // String 1 : asdf
        // String 2 : sdf
        // String 3 : SDF

        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("field1");
        sj1.add("field2");
        sj1.add("field3");

        System.out.println(sj1);

        StringJoiner sj2 = new StringJoiner("|");
        sj2.add("field4");
        sj2.add("field5");
        sj2.add("field6");

        System.out.println(sj2);

        System.out.println("merged = " + new StringJoiner("-").merge(sj1).merge(sj2));
        System.out.println(sj1);

        // string joiner replaces this block of code
        List<String> list = new ArrayList<>();
        list.add("field1");
        list.add("field2");
        list.add("field3");

        StringBuffer output = new StringBuffer();
        for (int count = 0; count < list.size(); count++) {
            output.append(list.get(count));
            if (count < list.size() - 1) {
                output.append(",");
            }
        }
        System.out.println(output);
        // end string joiner replace code
        if (list.stream().sorted().collect(Collectors.toList()).equals(list.stream().collect(Collectors.toList()))) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        Stream<String> stream = list.stream();
        Collector collector = Collectors.joining(",");

        try {
            if (stream.sorted().collect(collector).equals(stream.collect(collector))) {
                System.out.println(stream.collect(collector) + " is sorted");
            } else {
                System.out.println(stream.collect(collector) + " is NOT sorted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // map example
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        collect.stream().forEach(s -> System.out.println(s));
    }

    // characters : ASDF
    // index : 0123
}
