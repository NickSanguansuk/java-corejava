package topics.concurrency_programming.demo1_basic;

public class Main {

    enum Info {
        START,
        END
    }

    public static String tInfo() {
        String tName = Thread.currentThread().getName();

        return String.format("%-4s ---> ", tName);
    }

    public static void printInfo(Info infoLocation) {
        long tId = Thread.currentThread().getId();
        String tName = Thread.currentThread().getName();
        int tPriority = Thread.currentThread().getPriority();
        Thread.State tState = Thread.currentThread().getState();
        String tGroupName = Thread.currentThread().getThreadGroup().getName();

        if (infoLocation == Info.START) {
            System.out.println(tInfo() + "Start " + tId + ", " + tName + ", " + tPriority + ", " + tState + ", " + tGroupName);
        } else {
            System.out.println(tInfo() + "End " + tId + ", " + tName + ", " + tPriority + ", " + tState + ", " + tGroupName);
        }
    }

    public static void printStatus(Thread main, Thread t_1, Thread t_2, Thread t_3, Thread t_4) {
        System.out.println(tInfo() + "Print mainState: " + main.getState() + ", " + main.isAlive());
        System.out.println(tInfo() + "Print t_1 State: " + t_1.getState() + ", " + t_1.isAlive());
        System.out.println(tInfo() + "Print t_2 State: " + t_2.getState() + ", " + t_2.isAlive());
        System.out.println(tInfo() + "Print t_3 State: " + t_3.getState() + ", " + t_3.isAlive());
        System.out.println(tInfo() + "Print t_4 State: " + t_4.getState() + ", " + t_4.isAlive());
    }

    public static void main(String[] args) {

        printInfo(Info.START);
        Thread main = Thread.currentThread();

        System.out.println(tInfo() + Thread.activeCount());

        // Create and Start counterThread
        Thread t_c = new Thread(new CounterThread(), "t_c");
        System.out.println(tInfo() + t_c.isDaemon());
        t_c.setDaemon(true);
        System.out.println(tInfo() + t_c.isDaemon());
        t_c.start();

        // Create thread 1
        ExtendsThread t_1 = new ExtendsThread();
        t_1.setPriority(Thread.MAX_PRIORITY); // 10
        t_1.setName("t_1");

        // Create thread 2
        Thread t_2 = new Thread(new ImplementsRunnable(), "t_2");
        t_2.setPriority(Thread.MIN_PRIORITY); // 1
        //t_2.setName("t_2");

        // Create thread 3
        Thread t_3 = new Thread(new SecretRoomThread(), "t_3");

        // Create thread 4
        Thread t_4 = new Thread(new SecretRoomThread(), "t_4");

        // Print status ---> @ 0 s
        printStatus(main, t_1, t_2, t_3, t_4);

        // Start thread 1 & 2
        System.out.println(tInfo() + "Launch " + t_1.getName());
        t_1.start();
        System.out.println(tInfo() + "Launch " + t_2.getName());
        t_2.start();
        System.out.println(tInfo() + "Launch " + t_3.getName());
        t_3.start();
        System.out.println(tInfo() + "Launch " + t_4.getName());
        t_4.start();

        //System.out.println(1 / 0);

        // Sleep 1 s
        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        // Print status ---> @ 1 s
        printStatus(main, t_1, t_2, t_3, t_4);

        // Sleep 1 s
        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        // Interrupt thread 2 sleeping ---> @ 2 s
        t_2.interrupt();

        try {
            // main will wait for thread 2 to finish and join ---> @ 3 s
            t_2.join();
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        // Print status ---> @ 3 s
        printStatus(main, t_1, t_2, t_3, t_4);

        printInfo(Info.END);
    } // main will be waiting for thread 1 to join here ---> @ 4 s
}
