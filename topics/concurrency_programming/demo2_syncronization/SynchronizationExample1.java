package topics.concurrency_programming.demo2_syncronization;

public class SynchronizationExample1 extends Thread {

    private static int counter = 0;

    public SynchronizationExample1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (counter < 20) {
            System.out.println(Thread.currentThread().getName() + " Before: " + counter);
            counter++;
            System.out.println(Thread.currentThread().getName() + " After: " + counter);
            //System.out.flush();
        }
    }

    public static void main(String[] args) {
        SynchronizationExample1[] threads = new SynchronizationExample1[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new SynchronizationExample1("Thread" + (i + 1));
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Final count: " + counter);
    }

}
