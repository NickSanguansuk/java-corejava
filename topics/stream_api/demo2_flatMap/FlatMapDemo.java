package topics.stream_api.demo2_flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");
        {

            String[][] arr2D = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

            String[] arr1D = Stream.of(arr2D)
                    .flatMap(Stream::of)
                    .toArray(String[]::new);

            //String[] arr1D = Stream.of(arr2D)
            //        .flatMap((x) -> Stream.of(x))
            //        .toArray((x) -> new String[x]);

            //String[] arr1D = Stream.of(arr2D)
            //        .flatMap((x) -> {
            //            System.out.println("---> " + Arrays.toString(x));
            //            return Stream.of(x);
            //        })
            //        .toArray((x) -> {
            //            System.out.println("---> " + x);
            //            return new String[x];
            //        });

            for (String s : arr1D) {
                System.out.println(s);
            }

        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
        {

            String[][] arr2D = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

            List<String> strList = Stream.of(arr2D)     // Stream<String[]>
                    .flatMap(Stream::of)                // Stream<String>
                    .filter(x -> !"a".equals(x))        // filter out the a
                    .collect(Collectors.toList());      // return a list

            strList.forEach(System.out::println);
            //strList.forEach(x -> System.out.println(x));

        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
    }
}
