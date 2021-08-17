package topics.concurrency_programming.demo1_basic;

public class ExtendsThread extends Thread {

    @Override
    public void run() {

        Main.printInfo(Main.Info.START);

        // Thread 1

        // random [1-3]
        //int time = (int)(Math.random() * 3) + 1;
        //System.out.println(time);

        System.out.println(Main.tInfo() + "do.....");
        System.out.println(Main.tInfo() + "do.....");

        try {
            Thread.sleep(1000 * 4);
        } catch (InterruptedException e) {
            System.out.println(Main.tInfo() + e);
            //return;
        }

        System.out.println(Main.tInfo() + "do.....");
        System.out.println(Main.tInfo() + "do.....");

        Main.printInfo(Main.Info.END);
    }
}
