package topics.concurrency_programming.demo7;

public class RunnableExample implements Runnable {

    /*Runnable is an interface that is to be implemented by a
     * class whose instances are intended to be executed by a thread
     */
    @Override
    public void run() {
        String name = Thread.currentThread()
                .getName();

        System.out.println(name + " started ");

        int time = (int) (Math.random() * 3) + 1;

        try {
            Thread.sleep(1000 * time);
        } catch (InterruptedException e) {
            System.out.println(name + " " + e.getMessage());
            //e.printStackTrace();
            return;
        }

        System.out.println(name + " paused for " + time + " Hello I am running in a thread");

    }

}
