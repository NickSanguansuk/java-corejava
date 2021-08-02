package topics.oop_demo.static_demo;

public class StaticDemo {
    static int var1 = 20;
    static String var2 = "Per Scholas";

    int var3 = 10;

    // Should be non-static (each student has their own rollNum)
    int rollNum = 0;
    // Should be static (all students share the collegeName)
    static String collegeName = "Per Scholas Org";

    void abc() {
        // Cannot create static variable inside method
        //static int var4 = 100;

        int var4 = 100;
    }

    // static method
    public static void addingNumber(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

}
