package topics.collection_map_demo.test.test4;

import java.util.*;

public class Solution {

    // The answer is wrong here
    // Need to learn more about PriorityQueue
    public static int maxPresentations(List<Integer> ss, List<Integer> se) {

        int n = ss.size();

        int[][] events = new int[n][2];

        for (int i = 0; i < n; i++) {
            events[i][0] = ss.get(i);
            events[i][1] = se.get(i);
        }

        //for (int i = 0; i < n; i++) {
        //    System.out.println(Arrays.toString(events[i]));
        //}

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        //for (int i = 0; i < n; i++) {
        //    System.out.println(Arrays.toString(events[i]));
        //}

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ei = 0;
        int sd = events[ei][0];
        int ret = 0;
        while(pq.isEmpty() == false || ei < events.length) {
            // put end days of events that start on sd.
            while (ei < events.length && events[ei][0] == sd) {
                pq.offer(events[ei][1]);
                ei++;
            }

            // attend an event on day sd.
            if (!pq.isEmpty()) {
                pq.poll();
                ret++;
                // remove events that ends on day sd.
                // also if earliest ed is found, assign it to sd.
                while(!pq.isEmpty()) {
                    if (pq.peek() == sd)
                        pq.poll();
                    else
                        break;
                }
            }
            sd++;
        }
        return ret;
    }

    public static void main(String[] args) {

        List<Integer> scheduleStart = new ArrayList<>(Arrays.asList(1, 1, 2, 3));
        List<Integer> scheduleEnd = new ArrayList<>(Arrays.asList(2, 3, 3, 4));

        System.out.println(maxPresentations(scheduleStart, scheduleEnd));

    }
}
