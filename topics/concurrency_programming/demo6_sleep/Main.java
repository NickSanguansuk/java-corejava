package topics.concurrency_programming.demo6_sleep;

public class Main {

    public static void main(String[] args) {
        System.out.println("main ---> Start");

        // Create and Start counterThread
        Thread t_0 = new Thread(new CounterThreadSecond(), "counter");
        t_0.start();

        MyThread mythread = new MyThread();

        try {
            System.out.println("A1");
            Thread.sleep(5000);
            System.out.println("A2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("B1");
            MyThread.sleep(5000); // main will sleep
            System.out.println("B2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mythread.start();

        try {
            System.out.println("C1");
            MyThread.sleep(5000); // main will sleep
            System.out.println("C2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main ---> End");
    }
}
