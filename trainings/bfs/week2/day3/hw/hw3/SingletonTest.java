package trainings.bfs.week2.day3.hw.hw3;

import java.util.ArrayList;
import java.util.List;

public class SingletonTest {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Thread t = new Thread(() -> {
                ThreadSafeSingleton obj = ThreadSafeSingleton.getInstance();
            });
            list.add(t);
        }

        for (int i = 0; i < 50; i++) {
            list.get(i).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(list.get(i).getName());
            list.get(i).join();
        }
    }
}
