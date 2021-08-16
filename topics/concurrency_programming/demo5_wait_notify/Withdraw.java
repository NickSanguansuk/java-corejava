package topics.concurrency_programming.demo5_wait_notify;

public class Withdraw implements Runnable {

    private Bank bank;
    public Withdraw(Bank bank) {
        this.bank = bank;
    }

    public void withdrawalAmount(int amount) {
        System.out.println("trying to withdraw " + amount + " from balance " + bank.getBalance());
        synchronized (bank) {
            if (bank.getBalance() < amount) {
                try {
                    while (bank.getBalance() < amount) {
                        String message = "Account overdrawn.  Balance " + bank.getBalance() + " < Withdraw amount " + amount + "; waiting for deposit...";
                        System.out.println(message);
                        bank.wait();
                    }
                } catch (Exception e) {
                }
            }
            bank.subtractAmount(amount);
            System.out.println("withdraw completed: Balance: " + bank.getBalance());
        }
    }

    @Override
    public void run() {
        withdrawalAmount(2000);
    }
}
