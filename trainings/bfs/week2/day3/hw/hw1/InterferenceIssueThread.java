package trainings.bfs.week2.day3.hw.hw1;

class Counter {

    private int value = 0;

    public void increment() {
        for (int i = 0; i < 10000; i++) {
            value++;
        }
    }

    public void decrement() {
        for (int i = 0; i < 10000; i++) {
            value--;
        }
    }

    public int value() {
        return value;
    }
}

public class InterferenceIssueThread {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

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
