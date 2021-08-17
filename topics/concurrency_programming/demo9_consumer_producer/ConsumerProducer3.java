package topics.concurrency_programming.demo9_consumer_producer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConsumerProducer3 {
    private static final Queue queue = new ConcurrentLinkedQueue();
    private static final long startMillis = System.currentTimeMillis();

    public static class Consumer implements Runnable {

        @Override
        public void run() {
            while (System.currentTimeMillis() < (startMillis + 10000)) {
                synchronized (queue) {
                    try {
                        if (queue.isEmpty()) {
                            System.out.println("[" + Thread.currentThread().getName() + "]: waiting...");
                            queue.wait();
                            System.out.println("[" + Thread.currentThread().getName() + "]: ...resumed");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (!queue.isEmpty()) {
                    Integer integer = (Integer)queue.poll();
                    System.out.println("[" + Thread.currentThread().getName() + "]: " + integer);
                }
            }
        }
    }

    public static class Producer implements Runnable {

        @Override
        public void run() {
            int i = 10;
            while (System.currentTimeMillis() < (startMillis + 10000)) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.add(i++);
                synchronized (queue) {
                    System.out.println("[" + Thread.currentThread().getName() + "]: notify");
                    queue.notify();
                }
            }
            synchronized (queue) {
                System.out.println("[" + Thread.currentThread().getName() + "]: notify all");
                queue.notifyAll();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);

        Thread[] consumerThreads = new Thread[5];
        for (int i = 0; i < consumerThreads.length; i++) {
            consumerThreads[i] = new Thread(new Consumer(), "consumer-" + i);
            consumerThreads[i].start();
        }
        Thread producerThread = new Thread(new Producer(), "producer");
        producerThread.start();
        for (int i = 0; i < consumerThreads.length; i++) {
            consumerThreads[i].join();
        }
        producerThread.join();
    }
}
