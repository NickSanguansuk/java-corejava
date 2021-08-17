package topics.concurrency_programming.demo7;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncronizationExample extends Thread {

    public static Integer counter = 0;

    public SyncronizationExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //System.out.println(Thread.currentThread().getName() + " counter start " + counter);

                if (counter < 10) {
                    System.out.println(Thread.currentThread().getName() + " counter before " + counter);
                    System.out.flush();

                    // ++count; the same as counter.incrementAndGet()
                    // count++; the same as counter.getAndIncrement()
                    counter = counter + 1;

                    // Thread 1 thinks counter = 4
                    // thread 2 thinks counter = 6
                    // thread 2 increments and sets count = 7
                    // Thread 1 increments and sets count to 5

                    System.out.println(Thread.currentThread().getName() + " counter after " + counter);
                    System.out.flush();
                } else {
                    System.out.println(Thread.currentThread().getName() + " exit ");
                    return;
                }
                mySleep();
            }
        }
    }

    private void mySleep() {
        int time = (int) (Math.random() * 3) + 1;

        try {
            Thread.sleep(1 * time);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        try {
            SyncronizationExample[] threads = new SyncronizationExample[5];
            for (int i = 0; i < threads.length; i++) {
                threads[i] = new SyncronizationExample("Thread" + (i + 1));
                threads[i].start();
            }
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
            System.out.println("Final count " + counter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
