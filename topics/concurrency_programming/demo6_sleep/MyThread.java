package topics.concurrency_programming.demo6_sleep;

public class MyThread extends Thread {

    public void run() {

        try {
            System.out.println("D1");
            Thread.sleep(5000);
            System.out.println("D2");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
