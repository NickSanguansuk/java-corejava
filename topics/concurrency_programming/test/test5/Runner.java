package topics.concurrency_programming.test.test5;

class PrintNumber implements Runnable {

    public int n;
    static int number = 1; // Start printing from 1

    static Object lock = new Object();
    boolean isOdd = false;

    public PrintNumber(int n, boolean isOdd) {
        this.n = n;
        this.isOdd = isOdd;
    }

    @Override
    public void run() {
        while (number < n) {
            //synchronized (lock) {
            //    int r = isOdd ? 1 : 0;
            //    if (number % 2 != r) {
            //        try {
            //            lock.wait();
            //        } catch (InterruptedException e) {
            //            e.printStackTrace();
            //        }
            //    }
            //
            //    //try {
            //    //    Thread.sleep(1000);
            //    //} catch (InterruptedException e) {
            //    //    e.printStackTrace();
            //    //}
            //
            //    System.out.println(number);
            //    number++;
            //    lock.notifyAll();
            //}
            System.out.println(Thread.currentThread().getName() + " -");
            synchronized (lock) {
                int r = isOdd ? 1 : 0;
                if (number % 2 != r) {
                    System.out.println(number);
                    number++;
                }

                try {
                    System.out.println(Thread.currentThread().getName() + " sleep");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " --");
        }
    }
}

public class Runner {

    public void printNumbersMethod(int n) {
        Thread oddThread = new Thread(new PrintNumber(n, true));
        Thread evenThread = new Thread(new PrintNumber(n, false));
        oddThread.start();
        evenThread.start();
    }

    public static void main(String[] args) {
        // output = 1234567.....
        Runner runner = new Runner();
        runner.printNumbersMethod(1000);
    }
}
