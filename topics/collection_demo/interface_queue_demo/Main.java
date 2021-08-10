package topics.collection_demo.interface_queue_demo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------");
        System.out.println("Queue (Interface)");

        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue q4 = new LinkedList();
        Queue<String> Pq = new PriorityQueue<String>();

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
        System.out.println(".peek()");



        System.out.println("----------");
        System.out.println(".poll()");



        System.out.println("----------");
        System.out.println(".remove()");



        System.out.println("----------");
        System.out.println("Creating Queue");



        System.out.println("----------");
        System.out.println("Creating Queue");


    }
}
