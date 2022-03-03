package trainings.bfs.week2.day3.hw.hw2;

import java.util.concurrent.atomic.AtomicInteger;

class Counter2 {

    //private int value = 0;
    AtomicInteger value = new AtomicInteger();

    public void increment() {
        for (int i = 0; i < 10000; i++) {
            value.getAndIncrement();
        }
    }

    public void decrement() {
        for (int i = 0; i < 10000; i++) {
            value.getAndDecrement();
        }
    }

    public int value() {
        return value.intValue();
    }
}

public class AtomicVariableThread {

    public static void main(String[] args) throws InterruptedException {

        Counter2 counter = new Counter2();

        Thread t0 = new Thread(() -> {
            counter.increment();
        });

        Thread t1 = new Thread(() -> {
            counter.increment();
        });

        Thread t2 = new Thread(() -> {
            counter.decrement();
        });

        Thread t3 = new Thread(() -> {
            counter.decrement();
        });

        t0.start();
        t1.start();
        t2.start();
        t3.start();

        t0.join();
        t1.join();
        t2.join();
        t3.join();

        // The total value should be 0, but it is not.
        System.out.println(counter.value());
    }
}
