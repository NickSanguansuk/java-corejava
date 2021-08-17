package topics.advanced_string.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {

    public static void add123(StringBuffer sb) {
        sb.append("123");
    }

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        System.out.println("1 " + sb);
        sb.append("ASDF");
        System.out.println("2 " + sb);
        add123(sb);
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

        System.out.println("----------");

        StringBuffer sb1 = new StringBuffer("135");
        // 135
        sb1.replace(0, 5, "6789");
        sb1.insert(0, "12345");
        // 6789
        // 123456789
        System.out.println(sb1.reverse().delete(0, 5));
        // 987654321
        // 4321

        System.out.println("----------");

        System.out.println("asdf".substring(1).toUpperCase());
        // String 1 : asdf
        // String 2 : sdf
        // String 3 : SDF

        System.out.println("----------");

        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("field1");
        sj1.add("field2");
        sj1.add("field3");

        System.out.println(sj1);

        StringJoiner sj2 = new StringJoiner("$");
        sj2.add("field4");
        sj2.add("field5");
        sj2.add("field6");

        System.out.println(sj2);

        StringJoiner sj3 = sj1;

        StringJoiner sj4 = new StringJoiner(",").merge(sj1);

        StringJoiner sj5 = sj1.merge(sj2);

        System.out.println(new StringJoiner("-").merge(sj1));

        System.out.println("---");
        System.out.println(sj1 + "\t" + sj1.length());
        System.out.println(sj2 + "\t" + sj2.length());
        System.out.println(sj3 + "\t" + sj3.length());
        System.out.println(sj4 + "\t" + sj4.length());
        System.out.println(sj5 + "\t" + sj4.length());
        System.out.println("---");

        // Convert StringJoiner to String
        String str1 = sj1.toString();
        String[] strArr1 = str1.split("[,$-]+");

        System.out.println(Arrays.toString(strArr1));

        System.out.println("----------");

        String result1 = String.join("-", "2015", "10", "31");
        System.out.println(result1);

        System.out.println("----------");
        System.out.println("1. StringJoiner");

        List<String> list = new ArrayList<>(Arrays.asList("A1", "B1", "C1", "D1", "E1"));

        StringJoiner sj6 = new StringJoiner(", ");
        list.forEach(x -> sj6.add(x));
        System.out.println(sj6.toString());

        System.out.println("----------");
        System.out.println("2. String.join");

        String result2 = String.join(", ", list);
        System.out.println(result2);

        System.out.println("----------");
        System.out.println("3. Collectors.joining");

        String result3 = list.stream().collect(Collectors.joining(", "));
        System.out.println(result3);

        System.out.println("----------");

        if (list.stream().sorted().collect(Collectors.toList()).equals(list)) {
            System.out.println("---> Equal");
        } else {
            System.out.println("---> Not Equal");
        }

    }
}
