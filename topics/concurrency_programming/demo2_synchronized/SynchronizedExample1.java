package topics.concurrency_programming.demo2_synchronized;

public class SynchronizedExample1 extends Thread {

    private static int counter = 0;

    public SynchronizedExample1(String name) {
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
        SynchronizedExample1[] threads = new SynchronizedExample1[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new SynchronizedExample1("Thread" + (i + 1));
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
