package topics.concurrency_programming.demo8_wait_notify;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running...");
            Thread.sleep(3000);
            System.out.println("Producer thread waiting...");
            wait();
            System.out.println("Resumed");
        }
    }

    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Thread.sleep(1000);

        synchronized (this) {
            System.out.println("Waiting for return key: ");
            scanner.nextLine();
            System.out.println("Return key pressed.");
            notify();
            Thread.sleep(2000);
        }
    }
}
