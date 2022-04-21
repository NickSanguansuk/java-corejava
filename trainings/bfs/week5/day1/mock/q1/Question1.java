package trainings.bfs.week5.day1.mock.q1;

public class Question1 {

    public String q1(String s, int k) {

        if (k > 0) {
            for (int i = 0; i < k; i++) {
                char c = s.charAt(s.length() - 1);
                s = s.substring(0, s.length()-1);
                s = c + s;
            }
        } else if (k < 0) {
            k = Math.abs(k);
            for (int i = 0; i < k; i++) {
                char c = s.charAt(0);
                s = s.substring(1, s.length());
                s = s + c;
            }
        } else {
            // Do nothing
        }

        return s;
    }

    public static void main(String[] args) {

        Question1 question1 = new Question1();

        String str1 = "abc";
        int k1 = 1;
        System.out.println(question1.q1(str1, k1));

        String str2 = "abc";
        int k2 = -1;
        System.out.println(question1.q1(str2, k2));

        String str3 = "abcd";
        int k3 = -5;
        System.out.println(question1.q1(str3, k3)); // bcda

    }
}
