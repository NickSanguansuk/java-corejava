package topics.concurrency_programming.demo1_basic;

public class SecretRoom implements Runnable {

    public static void doSomethingInSecretRoom() {
        System.out.println(Main.tInfo() + "SecretRoom [");
        synchronized (SecretRoom.class) {

            System.out.println(Main.tInfo() + "do.....(secret)");
            System.out.println(Main.tInfo() + "do.....(secret)");

            try {
                Thread.sleep(1000 * 2);
            } catch (InterruptedException e) {
                System.out.println(Main.tInfo() + e);
                //return;
            }

            System.out.println(Main.tInfo() + "do.....(secret)");
            System.out.println(Main.tInfo() + "do.....(secret)");

        }
        System.out.println(Main.tInfo() + "SecretRoom ]");
    }

    @Override
    public void run() {
        Main.printInfo(Main.Info.START);

        doSomethingInSecretRoom();

        Main.printInfo(Main.Info.END);
    }
}
