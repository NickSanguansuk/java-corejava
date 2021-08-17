package topics.concurrency_programming.demo9_consumer_producer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConsumerProducer_Original {
    private static final Queue queue = new ConcurrentLinkedQueue();
    private static final long startMillis = System.currentTimeMillis();

    public static class Consumer implements Runnable {

        @Override
        public void run() {
            while (System.currentTimeMillis() < (startMillis + 10000)) {
                synchronized (queue) {
                    try {
                        //System.out.println("[" + Thread.currentThread().getName() + "]: waiting...");
                        queue.wait();
                        //System.out.println("[" + Thread.currentThread().getName() + "]: ...resumed");
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
            int i = 0;
            while (System.currentTimeMillis() < (startMillis + 10000)) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.add(i++);
                synchronized (queue) {
                    //System.out.println("[" + Thread.currentThread().getName() + "]: notify");
                    queue.notify();
                }
            }
            synchronized (queue) {
                //System.out.println("[" + Thread.currentThread().getName() + "]: notify all");
                queue.notifyAll();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

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
