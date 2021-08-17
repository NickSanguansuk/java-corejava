package exercises.concurrency_prog_exer.exercise1;

public class Problem3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t_1 = new Thread(new Problem3(), "My First Thread");
        System.out.println("Thread[" + t_1.getName() + "," + t_1.getPriority() + "," + t_1.getThreadGroup().getName() + "]");
        t_1.start();
        try {
            t_1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t_2 = new Thread(new Problem3(), "My Second Thread");
        Thread t_3 = new Thread(new Problem3(), "My Third Thread");
        System.out.println("Thread[" + t_2.getName() + "," + t_2.getPriority() + "," + t_2.getThreadGroup().getName() + "]");
        System.out.println("Thread[" + t_3.getName() + "," + t_3.getPriority() + "," + t_3.getThreadGroup().getName() + "]");

        t_2.start();
        t_3.start();
    }
}
