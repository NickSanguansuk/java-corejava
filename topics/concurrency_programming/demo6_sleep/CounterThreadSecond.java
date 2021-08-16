package topics.concurrency_programming.demo6_sleep;

public class CounterThreadSecond implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            System.out.println("-");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
