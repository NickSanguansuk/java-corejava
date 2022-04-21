package trainings.bfs.week4.day1.mock.q1;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

    public int q1(String s, int k) {

        int result = 0;
        int count = -1;
        int j = 0;

        String[] strArray = s.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            int len = strArray[i].length();
            if (count + len + 1 <= k) {
                count += (len + 1);
            } else {
                if (j == i) {
                    return -1;
                }
                result++;
                count = -1;
                j = i;
                i--;
            }
        }

        if (j < strArray.length) {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {

        Question1 question1 = new Question1();

        String s = "SMS messages are really short";
        int k = 12;

        System.out.println(question1.q1(s, k));

        String s2 = "Hello world";
        int k2 = 3;

        System.out.println(question1.q1(s2, k2));

        String s3 = "Hello world";
        int k3 = 5;

        System.out.println(question1.q1(s3, k3));

    }
}
