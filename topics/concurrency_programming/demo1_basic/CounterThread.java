package topics.concurrency_programming.demo1_basic;

public class CounterThread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(i / 10 + " - " + Thread.activeCount());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
