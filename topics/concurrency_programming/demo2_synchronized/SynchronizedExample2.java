package topics.concurrency_programming.demo2_synchronized;

public class SynchronizedExample2 extends Thread {

    private static Integer counter = 0;

    public SynchronizedExample2(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (counter < 20) {
            System.out.println("---> [");
            synchronized (SynchronizedExample2.class) {
                if (counter < 20) {
                    System.out.println(Thread.currentThread().getName() + " Before: " + counter);
                    counter++;
                    System.out.println(Thread.currentThread().getName() + " After: " + counter);

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("---> ]");
        }
    }

    public static void main(String[] args) {
        SynchronizedExample2[] threads = new SynchronizedExample2[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new SynchronizedExample2("Thread-" + (i + 1));
            threads[i].start();
        }
        for (SynchronizedExample2 thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Final count: " + counter);
    }

}
