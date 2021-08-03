package topics.class_demo.access_specifier_demo.package_2;

// Class can be default or public
public class publicClass {
    // Data
    // class-level variable (fields)
    private int num;
    private String str;
    private double value;

    // Constructors
    //// default constructor (automatically generate) look like this
    //public ClassOne() {
    //
    //}

    // Methods
    public int addingNumber(int a, int b) {
        int num; // method-level variable
        num = a + b;
        return num;
    }

    public void methodWithVoidReturn(int x) {
        int num = x;
        System.out.println(num);
    }

    // Overloading
    public void doubleNumber(int num) {
        System.out.println(num * 2);
    }

    public void doubleNumber(double num) {
        System.out.println(num * 2);
    }

    // Variable Arguments (Varargs ---> variable-length arguments) in Java
    public void fun(int ...a) {
        System.out.println("Number of int arguments is: " + a.length);

        // Using for each loop to display contents of a
        for (int i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void fun2(String str, int ...a) {
        System.out.println("String: " + str);
        System.out.println("Number of int arguments is: " + a.length);

        // Using for each loop to display contents of a
        for (int i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
