package topics.concurrency_programming.demo4_bad;

public class MyMain {
    public static void main(String[] args) {
        CustomThread a = new CustomThread();
        CustomThread b = new CustomThread();
        //OneThread c = new OneThread();
        //OneThread d = new OneThread();

        a.setName("Thread 1.");
        b.setName("Thread 2.");
        //c.setName("Thread 3.");
        //d.setName("Thread 4.");

        a.setPriority(4);
        b.setPriority(3);
        //c.setPriority(2);
        //d.setPriority(1);

        a.start();
        b.start();
        //c.start();
        //d.start();

        //try {
        //    Thread.sleep(3000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //DemoClass demoClass = new DemoClass();
        //try {
        //    demoClass.printNumbers();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
    }
}
