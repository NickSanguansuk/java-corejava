package design_patterns.singleton_pattern.demo4_simple_lazy_threadsafe;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Methods
    public void doSomething() {
        // Do something
    }

}
