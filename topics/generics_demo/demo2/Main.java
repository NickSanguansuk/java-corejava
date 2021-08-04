package topics.generics_demo.demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    //public static void displayArray(Integer[] arr) {
    //    System.out.println("-Integer-");
    //    for (Integer x : arr) {
    //        System.out.print(x + ", ");
    //    }
    //    System.out.println();
    //}
    //
    //public static void displayArray(Double[] arr) {
    //    System.out.println("-Double-");
    //    for (Double x : arr) {
    //        System.out.print(x + ", ");
    //    }
    //    System.out.println();
    //}
    //
    //public static void displayArray(Character[] arr) {
    //    System.out.println("-Character-");
    //    for (Character x : arr) {
    //        System.out.print(x + ", ");
    //    }
    //    System.out.println();
    //}
    //
    //public static void displayArray(String[] arr) {
    //    System.out.println("-String-");
    //    for (String x : arr) {
    //        System.out.print(x + ", ");
    //    }
    //    System.out.println();
    //}

    public static <T> void displayArray(T[] arr) {
        System.out.println("-Generics-");
        for (T x : arr) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] arr) {
        return arr[0];
    }

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] characters = {'A', 'B', 'C', 'D', 'E'};
        String[] strings = {"Bat", "Cat", "Rat"};

        displayArray(integers);
        displayArray(doubles);
        displayArray(characters);
        displayArray(strings);

        System.out.println("----------");

        System.out.println(getFirst(integers));
        System.out.println(getFirst(doubles));
        System.out.println(getFirst(characters));
        System.out.println(getFirst(strings));

        System.out.println("----------");

        MyIntegerClass myInteger = new MyIntegerClass(5);
        MyDoubleClass myDouble = new MyDoubleClass(5.0);
        MyCharacterClass myCharacter = new MyCharacterClass('F');
        MyStringClass myString = new MyStringClass("Five");

        System.out.println(myInteger.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myCharacter.getValue());
        System.out.println(myString.getValue());

        System.out.println("----------");
        System.out.println("Generics classes");

        MyGenericsClass<Integer> myInteger2 = new MyGenericsClass<>(5);
        MyGenericsClass<Double> myDouble2 = new MyGenericsClass<>(5.0);
        MyGenericsClass<Character> myCharacter2 = new MyGenericsClass<>('F');
        MyGenericsClass<String> myString2 = new MyGenericsClass<>("Five");

        System.out.println(myInteger2.getValue());
        System.out.println(myDouble2.getValue());
        System.out.println(myCharacter2.getValue());
        System.out.println(myString2.getValue());

        System.out.println("----------");
        System.out.println("ArrayList");

        List<Integer> list = new ArrayList<>();

        System.out.println("----------");
        System.out.println("Generics multi parameters classes");

        MyGenericsMultiParaClass<Integer, String> myObj1 = new MyGenericsMultiParaClass<>(5, "Five");
        MyGenericsMultiParaClass<Double, Double> myObj2 = new MyGenericsMultiParaClass<>(5.5, 6.6);
        MyGenericsMultiParaClass<Character, String> myObj3 = new MyGenericsMultiParaClass<>('F', "Five");
        MyGenericsMultiParaClass<String, Character> myObj4 = new MyGenericsMultiParaClass<>("Five", 'F');

        System.out.println(myObj1.getValueTwo());
        System.out.println(myObj2.getValueTwo());
        System.out.println(myObj3.getValueTwo());
        System.out.println(myObj4.getValueTwo());

        System.out.println("----------");
        System.out.println("HashMap");

        Map<Integer, String> map = new HashMap<>();

        System.out.println("----------");
        System.out.println("Bounded types");

        //MyGenericsBoundedTypesClass<Integer, String> obj1 = new MyGenericsBoundedTypesClass<>(5, "Five");
        MyGenericsBoundedTypesClass<Double, Double> obj2 = new MyGenericsBoundedTypesClass<>(5.5, 6.6);
        //MyGenericsBoundedTypesClass<Character, String> obj3 = new MyGenericsBoundedTypesClass<>('F', "Five");
        //MyGenericsBoundedTypesClass<String, Character> obj4 = new MyGenericsBoundedTypesClass<>("Five", 'F');

        MyGenericsBoundedTypesClass<Integer, Double> obj5 = new MyGenericsBoundedTypesClass<>(7, 8.4);
        MyGenericsBoundedTypesClass<Long, Float> obj6 = new MyGenericsBoundedTypesClass<>(1L, 1.1f);
        //MyGenericsBoundedTypesClass<Byte, Short> obj7 = new MyGenericsBoundedTypesClass<>(3, 4);
        MyGenericsBoundedTypesClass<Byte, Short> obj7 = new MyGenericsBoundedTypesClass<>((byte)3, (short)4);

        Byte myByte = 3;
        Short myShort = 4;
        MyGenericsBoundedTypesClass<Byte, Short> obj8 = new MyGenericsBoundedTypesClass<>(myByte, myShort);

        System.out.println(obj2.getValueTwo());
        System.out.println(obj5.getValueTwo());
        System.out.println(obj6.getValueTwo());
        System.out.println(obj7.getValueTwo());
        System.out.println(obj8.getValueTwo());

    }
}
