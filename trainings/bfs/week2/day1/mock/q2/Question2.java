package trainings.bfs.week2.day1.mock.q2;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public List<String> q2(String s, int k) {

        // Time complexity  = O(n)
        // Space complexity = O(n)

        List<String> result = new ArrayList<>();
        char c1 = s.charAt(0);
        char min = c1;
        char max = c1;
        String str = "" + c1;
        for (int i = 1; i < s.length(); i++) {
            char c2 = s.charAt(i);
            if ((c2 - min <= k) && (max - c2 <= k)) {
                str += c2;
                if (c2 < min) {
                    min = c2;
                }
                if (c2 > max) {
                    max = c2;
                }
            } else {
                result.add(str);
                c1 = s.charAt(i);
                min = c1;
                max = c1;
                str = "" + c1;
            }
        }
        result.add(str);
        return result;
    }

    public static void main(String[] args) {

        Question2 question2 = new Question2();

        String s = "zzzaazzazagdmzh";
        int k = 20;

        List<String> result = question2.q2(s, k); // [zzz, aa, zz, a, z, agdm, zh]
        System.out.println(result);
    }
}
