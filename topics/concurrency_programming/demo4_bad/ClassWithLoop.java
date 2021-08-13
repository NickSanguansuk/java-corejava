package topics.concurrency_programming.demo4_bad;

public class ClassWithLoop {

    public synchronized void printNumbers() throws InterruptedException {

        System.out.println("Starting to print Numbers for " + Thread.currentThread().getName());
        //for (int i = 0; i < 5; i++) {
        int start = ((int) (Math.random() * 10)) * 1000;
        int counter = start;
        while (counter < start + 5) {
            //System.out.println(Thread.currentThread().getName() + " " + i + i);
            System.out.println(Thread.currentThread().getName() + " before counter " + counter);
            Thread.sleep(500);
            counter++;
            System.out.println(Thread.currentThread().getName() + " after counter " + counter);
        }
        System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());
    }
}