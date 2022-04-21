package design_patterns.singleton_pattern.demo2_simple_lazy;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Methods
    public void doSomething() {
        // Do something
    }

}
