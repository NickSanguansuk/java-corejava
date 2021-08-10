package topics.functional_programming.function_class_demo1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionClassDemo {

    private static<T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return  result;
    }

    public static void main(String[] args) {

        // example 1
        //Function<String, Integer> function1 = new Function<String, Integer>() {
        //    @Override
        //    public Integer apply(String str) {
        //        return str.length();
        //    }
        //};
        //
        //System.out.println(function1.apply("Wasin Sanguansuk"));

        // example 1
        //Function<String, Integer> function1 = (String str) -> {
        //    return str.length();
        //};
        //System.out.println(function1.apply("Wasin Sanguansuk"));

        // example 1
        Function<String, Integer> function1 = (str) -> str.length();
        System.out.println(function1.apply("Wasin Sanguansuk"));

        // example 2
        Function<Integer, String> function2 = (number) -> {
            if (number % 2 == 0) {
                return "Number " + number + " is even";
            } else {
                return "Number " + number + " is odd";
            }
        };
        System.out.println(function2.apply(11));

        // example 3
        Function<String, Integer> function3 = (t) -> t.length();
        Function<Integer, Integer> function4 = (number) -> number * 2;
        // 1. Find the length of the str "ConeaSang"
        // 2. Multiply it (the length) to 2
        Integer integer = function3.andThen(function4).apply("ConeaSang");
        System.out.println(integer);

        // example 4
        List<String> list = Arrays.asList("Java", "C++", "Python", "JavaScript");
        // lambda
        Map<String, Integer> map = convertListToMap(list, x -> x.length());
        System.out.println(map);

    }
}
