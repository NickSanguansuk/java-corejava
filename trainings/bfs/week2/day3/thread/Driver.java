package trainings.bfs.week2.day3.thread;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

class TestThreadClass1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class TestThreadClass2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Driver {

    public static void main(String[] args) throws InterruptedException {
		System.out.println("----------");
        // Two ways to create new Thread
		System.out.println(Thread.currentThread().getName());

        Thread t0 = new TestThreadClass1();
		t0.start(); // Thread-0
		//t0.start(); // Cannot call start() twice

		Thread t1 = new Thread(new TestThreadClass2());
		t1.start(); // Thread-1

		Thread t2 = new Thread( () -> {
			System.out.println(Thread.currentThread().getName());
			});
		t2.start(); // Thread-2

		t0.run();
		t0.run();
		t1.run();
		t2.run();

		System.out.println("----------");
        //// Main thread
		//System.out.println(Thread.currentThread().getName());
		//
        //// Sleep
		//Thread t3 = new Thread(() -> {
		//	try {
		//		Thread.sleep(5000);
		//		System.out.println(Thread.currentThread().getName() + " slept for 5 sec.");
		//	} catch (InterruptedException e) {
		//		e.printStackTrace();
		//	}
		//});
		//
		//Thread t4 = new Thread(() -> {
		//	System.out.println(Thread.currentThread().getName());
		//});
		//
		//t3.start();
		//t4.start();

		System.out.println("----------");
        //// Join
		//Thread t5 = new Thread(() -> {
		//	try {
		//		Thread.sleep(5000);
		//		System.out.println(Thread.currentThread().getName() + " slept for 5 sec.");
		//	} catch (InterruptedException e) {
		//		e.printStackTrace();
		//	}
		//});
		//
		//Thread t6 = new Thread(() -> {
		//	try {
		//		t5.join();
		//		System.out.println(Thread.currentThread().getName());
		//	} catch (InterruptedException e) {
		//		e.printStackTrace();
		//	}
		//});
		//
		//t5.start();
		//t6.start();

		System.out.println("----------");
        // Daemon Thread
        Thread daemonThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("In daemon thread.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();

        //Thread.sleep(5000);

        System.out.println(Thread.currentThread().getName());

		System.out.println("----------");
        // Counter example ---> Thread Interference
		Counter counter = new Counter();

		Thread t7 = new Thread(() -> {
			counter.increment();
		});

		Thread t8 = new Thread(() -> {
			counter.decrement();
		});


		t7.start();
		t8.start();

		t7.join();
		t8.join();

		System.out.println(counter.value());

		System.out.println("----------");
        // ConcurrentHashMap
		Map<Integer, String> map = new HashMap<>();
		Map<Integer, String> syncMap = Collections.synchronizedMap(map);
		ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
		Thread t9 = new Thread( () -> {
            for (int i = 0; i < 10000; i++){
				map.put(i, i+"");
                concurrentMap.put(i, i+"");
            }
		});

		Thread t10 = new Thread( () -> {
            for (int i = 0; i < 10000; i++){
				map.put(i, i+"");
                concurrentMap.put(i, i+"");
            }
		});

		t9.start();
		t10.start();

		t9.join();
		t10.join();

		System.out.println(map.size());
		System.out.println(concurrentMap.size());

		System.out.println("----------");
        //// Deadlock
		//Object key1 = new Object();
		//Object key2 = new Object();
		//
		//Thread t8 = new Thread( () -> {
		//	synchronized (key1) {
		//		System.out.println("t8 has key 1.");
		//		try {
		//			Thread.sleep(5000);
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
		//		synchronized (key2) {
		//			System.out.println("t8 has key 2.");
		//		}
		//	}
		//});
		//
		//Thread t9 = new Thread( () -> {
		//	synchronized (key2) {
		//		System.out.println("t9 has key 2.");
		//		synchronized (key1) {
		//			System.out.println("t9 has key 1.");
		//		}
		//	}
		//});
		//
		//t8.start();
		//t9.start();

    }
}

class Counter {
    private int c = 0;

	public void increment() {
		for (int i = 0; i < 10000; i++) {
			c++;
		}
	}
    //public synchronized void increment() {
    //    for (int i = 0; i < 10000; i++) {
    //        c++;
    //    }
    //}

    public void decrement() {
        for (int i = 0; i < 10000; i++) {
            c--;
        }
    }
	//public synchronized void decrement() {
	//	for (int i = 0; i < 10000; i++) {
	//		c--;
	//	}
	//}

    public int value() {
        return c;
    }
}

