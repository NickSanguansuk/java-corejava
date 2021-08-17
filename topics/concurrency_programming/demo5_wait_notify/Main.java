package topics.concurrency_programming.demo5_wait_notify;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Runnable runnable = () -> {
            synchronized (bank) {
                System.out.println(bank.getBalance());
            }
        };
        Thread tr = new Thread(runnable);
        tr.start();

        Withdraw w1 = new Withdraw(bank);
        Thread t1 = new Thread(w1, "Withdraw Thread");
        t1.start();

        Deposit c1 = new Deposit(bank);
        Thread t2 = new Thread(c1, "Deposit Thread 1");
        t2.start();

        Deposit c2 = new Deposit(bank);
        Thread t3 = new Thread(c2, "Deposit Thread 2");
        t3.start();

        System.out.println("main is done");
    }
}
