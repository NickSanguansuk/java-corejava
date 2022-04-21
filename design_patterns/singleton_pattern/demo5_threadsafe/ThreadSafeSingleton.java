package design_patterns.singleton_pattern.demo5_threadsafe;

public final class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
        System.out.println("OnlyOne!");
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello World!");
    }
}
