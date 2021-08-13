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

    public static void main(String[] args) {

        printInfo(Info.START);

        // Create and Start counterThread
        Thread t_0 = new Thread(new CounterThread());
        t_0.start();

        // Create thread 1
        ExtendsThread t_1 = new ExtendsThread();
        t_1.setName("t_1");

        // Create thread 2
        Thread t_2 = new Thread(new ImplementsRunnable());
        t_2.setName("t_2");

        // Print status ---> @ 0 s
        System.out.println(tInfo() + "t_1 State: " + t_1.getState());
        System.out.println(tInfo() + "t_2 State: " + t_2.getState());

        // Start thread 1 & 2
        System.out.println(tInfo() + "Launch " + t_1.getName());
        t_1.start();
        System.out.println(tInfo() + "Launch " + t_2.getName());
        t_2.start();

        // Sleep 1 s
        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        // Print status ---> @ 1 s
        System.out.println(tInfo() + "t_1 State: " + t_1.getState());
        System.out.println(tInfo() + "t_2 State: " + t_2.getState());

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
            // main will wait for thread 1 to finish and join ---> @ 4 s
            t_1.join();
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        // Print status
        System.out.println(tInfo() + "t_1 State: " + t_1.getState());
        System.out.println(tInfo() + "t_2 State: " + t_2.getState());

        printInfo(Info.END);
    } // main will be waiting for thread 1 to join here
}
