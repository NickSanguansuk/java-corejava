package topics.basic_demo.hackerrank;

import java.util.Scanner;

public class JavaStringsTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        String s = "  He is a very very good boy, isn't he?  ";
        // Write your code here.
        //scan.close();

        s = s.trim();

        if (s.length() > 0) {
            String delimiters = "[ !,?._'@]+";
            //String[] tokens = s.split(delimiters);
            String[] tokens = s.split(delimiters);

            System.out.println(tokens.length);
            for (String str : tokens) {
                System.out.println(str);
            }
        } else {
            System.out.println(0);
        }

    }
}
