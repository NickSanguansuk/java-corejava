package topics.class_demo.package_1;

import topics.class_demo.package_2.publicClass;
//import topics.class_demo.package_2.ClassTwo;

public class MyMain {

    public static void main(String[] args) {

        // instance of a class
        publicClass classOne = new publicClass(); // ClassOne is public
        //ClassTwo classTwo = new ClassTwo(); // ClassTwo is default (not public)

        int result = classOne.addingNumber(3, 5);
        System.out.println(result);

        classOne.methodWithVoidReturn(7);

        classOne.fun(12, 2, 8, 6, 12);
        classOne.fun();
        classOne.fun(12);
    }
}
