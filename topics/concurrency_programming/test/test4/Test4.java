package topics.concurrency_programming.test.test4;

public class Test4 {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hi");

        new Thread(r).start();
    }
}
