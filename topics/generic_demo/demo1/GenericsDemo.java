package topics.generic_demo.demo1;

import java.util.List;

public class GenericsDemo {

    public void printValue(int a) {
        System.out.println("-int-");
        System.out.println(a);
    }

    public void printValue(double a) {
        System.out.println("-double-");
        System.out.println(a);
    }

    // generics method
    public <T> void printValue(T a) {
        System.out.println("-generics-");
        System.out.println(a);
    }

    //public <T> void printValue(T[] a) {
    //    System.out.println("-generics[]-");
    //    for (T item : a) {
    //        System.out.println(item);
    //    }
    //}

    public <T> void printValue(T[] a) {
        System.out.println("-generics[]-");
        for (T item : a) {
            System.out.println(item);
        }
    }

    // static generics method
    public static <T> void staticPrintValue(T a) {
        System.out.println("-static- -generics-");
        System.out.println(a);
    }

    // static generics with Wildcards method
    // Upper bounded Wildcards
    // Want to accept any List that extends Number class
    public static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Lower bounded Wildcards
    // Want to accept any List that can hold Integer
    // List<Integer>, List<Number>, List<Object>
    public static void add10NumbersToList(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

}
