package topics.concurrency_programming.demo10_threadlocal;

public class LocalTest implements Runnable {
    // ThreadLocal type ---> stores a value only creating thread can read
    public static final ThreadLocal<Integer> localInt = new ThreadLocal<>();
    private final Integer val;

    public LocalTest(Integer val) {
        this.val = val;
    }

    @Override
    public void run() {
        localInt.set(this.val);
        Integer i = localInt.get();
        System.out.println(Thread.currentThread().getName() + ": " + i);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new LocalTest(i), "thread-" + i);
            threads[i].start();
        }
    }

}
