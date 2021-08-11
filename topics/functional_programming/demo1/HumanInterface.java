package topics.functional_programming.demo1;

// Functional Interface
// 1). Only 1 abstract method allowed
// 2). Any number of default methods allowed
// 3). Can declare an abstract method that overrides a method from java.lang.Object (doesn't count towards rule 1)
@FunctionalInterface
public interface HumanInterface {
    // public, static, final (by default)
    public static final int age = 0;

    // public abstract (by default)
    public abstract void say();

    //String sleep();

    // public (by default)
    public default void doSomething() {
        System.out.println("default method: doSomething()");
    }

    // public (by default)
    public static void doSomethingStatic() {
        System.out.println("static method: doSomethingStatic()");
    }

    // This is rule # 3
    // This will force the class that implements this interface
    // to override toString(), hashCode(), and equals(Object obj);
    @Override
    public String toString();

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

}
