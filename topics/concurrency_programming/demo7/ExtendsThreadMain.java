package topics.concurrency_programming.demo7;

public class ExtendsThreadMain {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);

        RunnableExample re = new RunnableExample();
        Thread thread1 = new Thread(re);
        thread1.start();
        System.out.println(thread1.getName() + " " + thread1.getState());

        RunnableExample re2 = new RunnableExample();
        Thread thread2 = new Thread(re2);
        //et.setName("TestThread1");
        thread2.start();


        thread1.interrupt();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getName() + " " + thread1.getState());


        System.out.println(thread2.getName() + " " + thread2.getState());
    }
}
