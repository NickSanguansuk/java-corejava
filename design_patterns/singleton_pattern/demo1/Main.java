package design_patterns.singleton_pattern.demo1;

public class Main {

    public static void main(String[] args) {

        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        // Condition check
        if (x == y && y == z) {
            // Print statement
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            // Print statement
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
        System.out.println();
        System.out.println("----------");
        System.out.println();

        // Now  changing variable of instance x
        // via toUpperCase() method
        x.str = (x.str).toUpperCase();

        // Print and display commands
        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);
        System.out.println();

        // Now again changing variable of instance x
        z.str = (z.str).toLowerCase();

        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);

    }
}
