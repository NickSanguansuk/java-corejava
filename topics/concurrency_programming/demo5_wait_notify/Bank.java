package topics.concurrency_programming.demo5_wait_notify;

public class Bank {

    private Integer balance = 1000;
    public Integer getBalance() {
        return balance;
    }
    public void addAmount(Integer amount) {
        balance = balance + amount;
    }

    public void subtractAmount(Integer amount) {
        balance = balance - amount;
    }

}
