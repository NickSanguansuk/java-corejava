package exercises.concurrency_prog_exer.exercise1;

public class Problem4 implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Integer priority = Thread.currentThread().getPriority();

        for (int i = 0; i < 3; i++) {
            //System.out.println("running thread name is: " + name + "\nrunning thread priority is: " + priority + "\n========================================");
            System.out.println("running thread name is: " + name);
            System.out.println("running thread priority is: " + priority);
            System.out.println("========================================");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Thread t_1 = new Thread(new Problem4());
        Thread t_2 = new Thread(new Problem4());
        Thread t_3 = new Thread(new Problem4());
        t_1.setPriority(Thread.MIN_PRIORITY);
        t_2.setPriority(Thread.NORM_PRIORITY);
        t_3.setPriority(Thread.MAX_PRIORITY);
        t_1.start();
        t_2.start();
        t_3.start();
    }
}
