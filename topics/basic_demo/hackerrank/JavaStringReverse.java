package topics.basic_demo.hackerrank;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        //Scanner sc=new Scanner(System.in);
        //String A=sc.next();
        String A = "madam";
        /* Enter your code here. Print output to STDOUT. */

        //String result = "Yes";
        //
        //for (int i = 0; i < A.length() / 2; i++) {
        //    Character front = A.charAt(i);
        //    Character back = A.charAt(A.length() - 1 - i);
        //    if (front.equals(back)) {
        //        continue;
        //    } else {
        //        result = "No";
        //        break;
        //    }
        //}

        int count = 0;

        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) == A.charAt(A.length()-1-i)) {
                count++;
            }
        }

        System.out.println(count == A.length() / 2 ? "Yes" : "No");

    }
}
