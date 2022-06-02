package topics.concurrency_programming.demo2_synchronized.demo3;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyCounter counter1 = new MyCounter();
        Thread t0 = new Thread(() -> {
            counter1.add(1);
        });
        Thread t1 = new Thread(() -> {
            counter1.subtract(1);
        });

        MyCounter counter2 = new MyCounter();
        Thread t2 = new Thread(() -> {
            counter2.add(1);
        });
        Thread t3 = new Thread(() -> {
            counter2.subtract(1);
        });

        Thread t4 = new Thread(() -> {
            MyCounter.staticAdd(1);
        });
        Thread t5 = new Thread(() -> {
            MyCounter.staticSubtract(1);
        });

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t0.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println(counter1.getCount());
        System.out.println(MyCounter.getStaticCount());
    }
}
