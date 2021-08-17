package topics.concurrency_programming.demo7;

import java.lang.Thread.State;

public class ThreadInfo {

    public static void main(String[] args) {

        long id = Thread.currentThread().getId();
        int priority = Thread.currentThread().getPriority();

        // this will be the "main" thread as it is executing in the main java processing thread.
        String name = Thread.currentThread().getName();

        // this tells what state the thread is in.  The main thread will always be "RUNNABLE"
        State state = Thread.currentThread().getState();

        String threadGroupName = Thread.currentThread().getThreadGroup().getName();

        System.out.println("id=" + id + "; name=" + name + "; priority=" + priority + "; state=" + state
                + "; threadGroupName=" + threadGroupName);

    }
}
