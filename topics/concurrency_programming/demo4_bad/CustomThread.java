package topics.concurrency_programming.demo4_bad;

public class CustomThread extends Thread {
    ClassWithLoop d = new ClassWithLoop();

    public CustomThread() {
        super();
    }

    @Override
    public void run() {

        //d.displayloop_two();
        //d.printNumber();
        try {
            d.printNumbers();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}