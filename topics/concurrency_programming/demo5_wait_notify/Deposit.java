package topics.concurrency_programming.demo5_wait_notify;

public class Deposit implements Runnable {

    private Bank bank;
    public Deposit(Bank bank) {
        this.bank = bank;
    }
    public void deposit(int amount) {
        synchronized (bank) {

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Trying to deposit " + amount);
            bank.addAmount(amount);

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Deposit completed balance is " + bank.getBalance());
            bank.notify();
        }
    }

    @Override
    public void run() {
        for (int count = 1; count < 2; count++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            deposit(3000);
        }
    }

}
