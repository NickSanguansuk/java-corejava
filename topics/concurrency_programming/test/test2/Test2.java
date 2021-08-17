package topics.concurrency_programming.test.test2;

public class Test2 extends Thread {

    public void run() {
        System.out.println("The run method was called");
    }

    public static void main(String[] args) {

        Test2 myThread = new Test2();
        myThread.start();
        System.out.println(myThread.getState());
    }
}
