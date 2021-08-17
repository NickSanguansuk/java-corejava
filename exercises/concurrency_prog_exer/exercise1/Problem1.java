package exercises.concurrency_prog_exer.exercise1;

public class Problem1 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Thread t_1 = new Thread(new Problem1(), "t_1");
        Thread t_2 = new Thread(new Problem1(), "t_2");

        t_1.start();
        t_2.start();
    }

}
