package topics.concurrency_programming.demo3_atomic;

import static topics.concurrency_programming.demo3_atomic.AtomicDemo.readConfig;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        readConfig();

        System.out.println("I'm here: A");

        Thread configThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    readConfig();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "configuration-thread");

        System.out.println("I'm here: B");

        configThread.start();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new AtomicDemo(), "thread-" + (i + 1));
            threads[i].start();
        }

        System.out.println("I'm here: C");

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        configThread.join();

        System.out.println("[" + Thread.currentThread().getName() + "] All threads have finished.");

    }
}
