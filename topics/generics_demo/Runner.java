package topics.generics_demo;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---> generics methods");

        GenericsDemoClass generics = new GenericsDemoClass();

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

        GenericsDemoClass.staticPrintValue(4.0);
        GenericsDemoClass.staticPrintValue("static");

        System.out.println("----------");
        System.out.println("---> generics classes");

        GenericClass obj = new GenericClass();
        obj.setVarName("Per Scholas");
        System.out.println(obj.getVarName());

        obj.setVarName(20178);
        System.out.println( obj.getVarName());

        obj.setVarName(34.55);
        System.out.println( obj.getVarName());

        obj.setVarName(false);
        System.out.println( obj.getVarName());

        System.out.println("----------");
        System.out.println("specify the type");

        GenericClass<String> objStr = new GenericClass<>();
        objStr.setVarName("Wasin is here");
        System.out.println(objStr.getVarName());

        GenericClass<Integer> objInteger = new GenericClass<>();
        objInteger.setVarName(1234);
        System.out.println(objInteger.getVarName());

        GenericClass<StudentService> objService = new GenericClass<>();
        StudentService service = new StudentService(123, "Wasin", "Java Dev");
        objService.setVarName(service);
        System.out.println(objService.getVarName());

    }
}
