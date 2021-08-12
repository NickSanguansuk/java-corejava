package topics.collection_map_demo.interface_queue_demo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("Queue (Interface)");
        // Queue: a Queue is designed to hold elements for future processing.
        //      Queues are first-in-first-out (FIFO).
        //      Some Java “queues” are last-in-first-out (LIFO), though these are more properly called Stacks.
        //      Deque is a double-ended queue that support insertion/removal at both ends.

        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue q4 = new LinkedList();
        Queue<String> p5 = new PriorityQueue<String>();

        System.out.println("----------");
        System.out.println(".add()");
        // insert specific element into queue. by using add() method. throws an exception if element do not insert successfully

        q2.add(100);
        q2.add(10);
        q2.add(55);
        q2.add(94);
        q2.add(47);

        System.out.println(q2);

        System.out.println("----------");
        System.out.println(".offer()");
        // insert specific element into queue by using offer() return true if element insert successfully other return false

        q2.offer(2);
        q2.offer(3);
        q2.offer(1);

        System.out.println(q2);

        System.out.println("----------");
        System.out.println(".size()");

        System.out.println(q2.size());

        System.out.println("----------");
        System.out.println(".peek()");

        System.out.println(q2.peek());
        System.out.println(q2);

        System.out.println("----------");
        System.out.println(".poll()");
        // poll() return and removes the head of the queue, return null if queue is empty

        System.out.println(q2.poll());
        System.out.println(q2);

        System.out.println("----------");
        System.out.println(".remove()");
        // remove(): this method returns and removes the head of the queue, Throw an exception if queue is empty

        System.out.println(q2.remove());
        System.out.println(q2);

        System.out.println("---------- ---------- ---------- ---------- ----------");

        System.out.println("PriorityQueue");

        Queue<Integer> q6 = new PriorityQueue<>();
        q6.add(11);
        q6.add(2);
        q6.add(10);
        q6.add(9);
        q6.add(4);
        q6.add(9);

        System.out.println("This is not the order for poll() or peek()");
        System.out.println(q6);

        System.out.println("Head ---> " + q6.peek());

        System.out.println("----------");
        System.out.println("Print out");

        // ConcurrentModificationException
        //for (Integer i : q6) {
        //    System.out.println(q6.poll());
        //}

        for (int i = 0; i < 6; i++) {
            System.out.println("peek(): " + q6.peek() + ", poll(): " + q6.poll());
        }
        System.out.println();


        System.out.println("----------");
        System.out.println("");


    }
}
