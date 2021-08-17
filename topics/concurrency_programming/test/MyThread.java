package topics.concurrency_programming.test;

public class MyThread extends Thread {

    public void run() {

        try {
            MyThread.sleep(2000);
            System.out.println("I took a long nap ");
        } catch (InterruptedException e) {

        }
    }


}
