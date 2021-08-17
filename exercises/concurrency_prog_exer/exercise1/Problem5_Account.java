package exercises.concurrency_prog_exer.exercise1;

public class Problem5_Account implements Runnable {
    private static Integer balance = 50;

    public void withdrawMoney() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (Problem5_Account.class) {
            String name = Thread.currentThread().getName();

            if (balance <= 0) {
                System.out.println("Not enough in account for " + name + " to withdraw " + balance);
            } else {
                System.out.println(name + " is going to withdraw");
                balance -= 10;
                System.out.println(name + " completes the withdrawal " + balance);
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawMoney();
        }
    }

    public static void main(String[] args) {

        Thread t_1 = new Thread(new Problem5_Account(), "Reema");
        Thread t_2 = new Thread(new Problem5_Account(), "Ranjeet");

        t_1.start();
        t_2.start();
    }
}
