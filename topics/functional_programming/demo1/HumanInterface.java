package topics.functional_programming.demo1;

@FunctionalInterface
public interface HumanInterface {
    // public, static, final
    public static final int age = 0;

    // public abstract
    public abstract void say();

    //String sleep();

    default void doSomething() {
        System.out.println("default method: doSomething()");
    }

    static void doSomethingStatic() {
        System.out.println("static method: doSomethingStatic()");
    }

}
