package topics.concurrency_programming.demo7;

public class ExtendsThread implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread()
                .getName();

        int time = (int) (Math.random() * 3) + 1;

        try {
            Thread.sleep(1000 * time);
        } catch (InterruptedException e) {
            System.out.println(name + " " + e.getMessage());
            e.printStackTrace();
            return;
        }

        System.out.println(name + " paused for " + time + " Hello I am running in a thread");

    }

}
