package design_patterns.singleton_pattern.demo3_simple_eager;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    // Methods
    public void doSomething() {
        // Do something
    }

}
