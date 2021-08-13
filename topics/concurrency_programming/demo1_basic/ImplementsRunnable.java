package topics.concurrency_programming.demo1_basic;

public class ImplementsRunnable implements Runnable {

    @Override
    public void run() {

        Main.printInfo(Main.Info.START);

        // Thread 2

        // random [1-3]
        //int time = (int)(Math.random() * 3) + 1;
        //System.out.println(time);

        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            System.out.println(Main.tInfo() + e);
            //return;
        }

        System.out.println(Main.tInfo() + "do.....");
        System.out.println(Main.tInfo() + "do.....");
        System.out.println(Main.tInfo() + "do.....");

        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
            System.out.println(Main.tInfo() + e);
            //return;
        }

        Main.printInfo(Main.Info.END);
    }
}
