package trainings.bfs.week1.day4.hw.hw1;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxHeap {

    public static void main(String[] args) {

        MaxHeapComparator comparator = new MaxHeapComparator();
        Queue<Integer> pq = new PriorityQueue<>(11, comparator);

        pq.offer(5);
        pq.offer(2);
        pq.offer(3);
        pq.offer(6);
        pq.offer(1);
        pq.offer(4);

        System.out.println(pq);

        Integer val = pq.poll();
        while(val != null) {
            System.out.println(val);
            System.out.println(pq);
            val = pq.poll();
        }

    }
}
