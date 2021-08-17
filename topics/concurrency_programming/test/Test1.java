package topics.concurrency_programming.test;

public class Test1 {

    public static void main(String[] args) {

        System.out.println("I am awake");
        new MyThread().start();
        System.out.println("And I feel alive");
    }
}
