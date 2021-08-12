package topics.generic_demo.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        // The most commonly used type parameter names are:
        //
        //  E       - Element (used extensively by the Java Collections Framework)
        //  T       - Type
        //  S,U,V etc. - 2nd, 3rd, 4th types
        //  K       - Key
        //  V       - Value
        //  N       - Number

        System.out.println("---> generics methods");

        GenericsDemo generics = new GenericsDemo();

        generics.printValue(4.0);
        generics.printValue(4.0f);
        generics.printValue(4);
        generics.printValue("Four");
        generics.printValue(true);
        Integer[] intArray = {1, 2, 3, 4, 5};
        generics.printValue(intArray);
        String[] strArray = {"one", "two", "three"};
        generics.printValue(strArray);

        System.out.println("----------");

        GenericsDemo.staticPrintValue(4.0);
        GenericsDemo.staticPrintValue("static");

        System.out.println("----------");
        System.out.println("---> generics classes");

        GenericsClass obj = new GenericsClass();
        obj.setVarName("Per Scholas");
        System.out.println(obj.getVarName());

        obj.setVarName(20178);
        System.out.println( obj.getVarName());

        obj.setVarName(34.55);
        System.out.println( obj.getVarName());

        obj.setVarName(false);
        System.out.println( obj.getVarName());

        System.out.println("----------");
        System.out.println("specify the type (type safety)");

        GenericsClass<String> objStr = new GenericsClass<>();
        objStr.setVarName("Wasin is here");
        System.out.println(objStr.getVarName());

        GenericsClass<Integer> objInteger = new GenericsClass<>();
        objInteger.setVarName(1234);
        System.out.println(objInteger.getVarName());

        GenericsClass<StudentService> objService = new GenericsClass<>();
        StudentService service = new StudentService(123, "Wasin", "Java Dev");
        objService.setVarName(service);
        System.out.println(objService.getVarName());

        System.out.println("----------");
        System.out.println("generics bound type class");

        GenericsBoundType objB = new GenericsBoundType();
        objB.setVarName(225);
        //objB.setVarName(225.22); // error
        //objB.setVarName("Hello"); // error
        System.out.println(objB.getVarName());

        System.out.println("----------");
        System.out.println("generics multiple types");

        GenericsMultiPara objM1 = new GenericsMultiPara(111, "TEKsystems");
        objM1.printBothValue();
        objM1.setVarOne("Nick");
        objM1.setVarTwo("12.22");
        objM1.printBothValue();

        System.out.println("----------");
        System.out.println("generics multiple types (type safety)");

        GenericsMultiPara<Integer, String> objM2 = new GenericsMultiPara<>(20, "Twenty");
        objM2.printBothValue();
        objM2.setVarOne(30);
        objM2.setVarTwo("Thirty");
        objM2.printBothValue();

        System.out.println("----------");
        System.out.println("generics pair");

        GenericsPair<Integer, String> keyValueObj1 = new GenericsPair<>(44, "Forty-Four");
        GenericsPair<String, String> keyValueObj2 = new GenericsPair<>("A", "Forty-Four");

        System.out.println("----------");
        System.out.println("static generics with Wildcards method");

        System.out.println("Upper Bounded Wildcards");
        // Upper bounded Wildcards
        // Want to accept any List that extends Number class

        //List<Integer> list1 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(GenericsDemo.sumOfNumberList(list1));

        List<Double> list2 = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        System.out.println(GenericsDemo.sumOfNumberList(list2));

        List<Number> list3 = new ArrayList<>(Arrays.asList(1.5, 2, 3, 4.0));
        System.out.println(GenericsDemo.sumOfNumberList(list3));

        // Float, Long, ... will work too
        // But not String, Character, Object, ... (Error)
        List<String> list4 = new ArrayList<>();
        //System.out.println(GenericsDemo.sumOfNumberList(list4)); // Error

        List<Object> list5 = new ArrayList<>();
        //System.out.println(GenericsDemo.sumOfNumberList(list5)); // Error

        System.out.println("---");
        System.out.println("Lower Bounded Wildcards");
        // Lower bounded Wildcards
        // Want to accept any List that can hold Integer
        // List<Integer>, List<Number>, List<Object>

        List<Integer> list_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        GenericsDemo.add10NumbersToList(list_1);
        System.out.println(list_1);

        List<Number> list_2 = new ArrayList<>(Arrays.asList(1, 2.5, 3L, 4.8f));
        GenericsDemo.add10NumbersToList(list_2);
        System.out.println(list_2);

        List<Object> list_3 = new ArrayList<>(Arrays.asList(1, 2.5, "Hello", 4.8f));
        GenericsDemo.add10NumbersToList(list_3);
        System.out.println(list_3);

        // Double is not super class of Integer (Error)
        List<Double> list_4 = new ArrayList<>(Arrays.asList(1.0, 2.5, 2.6, 4.8));
        //GenericsDemo.add10NumbersToList(list_4); (Error)
        //System.out.println(list_4);

        System.out.println("----------");


    }
}
