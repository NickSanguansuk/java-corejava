package topics.concurrency_programming.demo7;

public class MainSleep {

    public static void main(String[] args) {

        MyThread mythread = new MyThread();

        try {
            System.out.println("main before sleep");
            //Thread.sleep(1000);
            System.out.println("main after sleep");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main before runnable start");
        try {
            System.out.println("main before sleep and runnable start");
            MyThread.sleep(5000);
            System.out.println("main before sleep runnable end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mythread.start();

        try {
            System.out.println("main tell mythread to sleep start");
            Thread.sleep(3000);
            System.out.println("main  tell mythread to sleep start");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main after runnable start");

    }
}
