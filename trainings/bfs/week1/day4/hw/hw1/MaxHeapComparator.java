package trainings.bfs.week1.day4.hw.hw1;

import java.util.Comparator;

public class MaxHeapComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
