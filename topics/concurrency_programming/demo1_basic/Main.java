package topics.concurrency_programming.demo1_basic;

public class Main {

    enum Info {
        START,
        END
    }

    public static String tInfo() {
        String tName = Thread.currentThread().getName();

        return tName + " ---> ";
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

        CounterThread counterThread = new CounterThread();
        Thread t0 = new Thread(counterThread);
        t0.start();

        ExtendsThread t1 = new ExtendsThread();
        t1.setName("t1");
        System.out.println(tInfo() + "Launch " + t1.getName());
        t1.start();

        ImplementsRunnable implementsRunnable2 = new ImplementsRunnable();
        Thread t2 = new Thread(implementsRunnable2);
        t2.setName("t2");
        System.out.println(tInfo() + "Launch " + t2.getName());
        t2.start();

        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        System.out.println(tInfo() + "t1 State: " + t1.getState());
        System.out.println(tInfo() + "t2 State: " + t2.getState());

        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        t2.interrupt();

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(tInfo() + e);
        }

        System.out.println(tInfo() + "t1 State: " + t1.getState());
        System.out.println(tInfo() + "t2 State: " + t2.getState());

        printInfo(Info.END);
    } // main will be waiting for t1 to join here
}
