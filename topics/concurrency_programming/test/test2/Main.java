package topics.concurrency_programming.test.test2;

public class Main extends Thread {

    public void run() {
        System.out.println("The run method was called");

    }

    public static void main(String[] args) {

        Main myThread = new Main();
        myThread.start();
        System.out.println(myThread.getState());
    }
}
