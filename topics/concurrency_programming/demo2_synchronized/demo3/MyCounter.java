package topics.concurrency_programming.demo2_synchronized.demo3;

public class MyCounter {

    private int count = 0;
    private static int staticCount = 0;

    public synchronized void add(int value) {
        System.out.println("--->" + Thread.currentThread().getName());
        this.count += value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<---" + Thread.currentThread().getName());
    }

    public synchronized void subtract(int value) {
        System.out.println("--->" + Thread.currentThread().getName());
        this.count -= value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<---" + Thread.currentThread().getName());
    }

    public static synchronized void staticAdd(int value) {
        System.out.println("--->" + Thread.currentThread().getName());
        staticCount += value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<---" + Thread.currentThread().getName());
    }

    public static synchronized void staticSubtract(int value) {
        System.out.println("--->" + Thread.currentThread().getName());
        staticCount -= value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<---" + Thread.currentThread().getName());
    }

    public int getCount() {
        return count;
    }

    public static int getStaticCount() {
        return staticCount;
    }
}
