package topics.basic_demo.test.test5;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Test5 {
    public int solution(String S) {
        // write your code in Java SE 11

        int len = S.length();
        int repairedIndex = -3;
        int numRepaired = 0;

        for (int i = 0; i < len; i++) {
            if ((S.charAt(i) == 'X') && (i - repairedIndex > 2)) {
                repairedIndex = i;
                numRepaired++;
            }
        }

        return numRepaired;
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();

        String s1 = ".X..X"; // 2
        int numRepaired1 = test5.solution(s1);
        System.out.println(numRepaired1);

        String s2 = "X.XXXXX.X."; // 3
        int numRepaired2 = test5.solution(s2);
        System.out.println(numRepaired2);
    }
}
