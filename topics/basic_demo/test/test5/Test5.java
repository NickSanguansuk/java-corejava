package topics.basic_demo.test.test5;

public class Test5 {
    public int solution(String S) {
        // write your code in Java SE 11

        int len = S.length();
        int numRepaired = 0;
        int repairedIndex = -3;

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
