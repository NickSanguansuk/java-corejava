package trainings.bfs.week3.day1.mock.q1;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

    public List<Integer> q1(String sentence, String prefix) {
        int len = prefix.length();
        int x = 0;

        List<Integer> result = new ArrayList<>();

        if (sentence.substring(x, len).equals(prefix)) {
            result.add(x);
        }

        x = len;
        char c = sentence.charAt(x);
        while (c != ' ') {
            x++;
            c = sentence.charAt(x);
        }

        for (int i = x + 1; i < sentence.length(); i++) {
            c = sentence.charAt(i);
            if (sentence.substring(i, i + len).equals(prefix)) {
                result.add(i);
            }
            while (c != ' ' && i + 1 < sentence.length()) {
                i++;
                c = sentence.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Question1 question1 = new Question1();

        String s1 = "aaa a aaba Aaa abca aabc bca";

        System.out.println(question1.q1(s1, "aa"));


    }
}
