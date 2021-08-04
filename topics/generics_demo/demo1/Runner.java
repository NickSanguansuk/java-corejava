package topics.generics_demo.demo1;

public class Runner {

    public static void main(String[] args) {

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
    }
}
