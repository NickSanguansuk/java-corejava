package topics.collection_map_demo.test.test3;

import java.util.HashSet;
import java.util.LinkedList;

public class Solution {

    public static long substringCalculator(String s) {

        HashSet<String> set = new HashSet<>();

        int len = s.length();

        if (len == 0) {
            return 0;
        }

        if (len == 1) {
            return 1;
        }

        for (int i = 0; i < len; i++) {
            for (int j = len; j > i; j--) {
                String sub1 = s.substring(i, j);
                set.add(sub1);
                //System.out.println(sub1);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {

        String s = "kincenvizh";
        System.out.println(substringCalculator(s));

    }
}
