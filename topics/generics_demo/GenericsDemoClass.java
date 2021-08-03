package topics.generics_demo;

public class GenericsDemoClass {

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

    // generics static method
    public static <T> void staticPrintValue(T a) {
        System.out.println("-static- -generics-");
        System.out.println(a);
    }
}
