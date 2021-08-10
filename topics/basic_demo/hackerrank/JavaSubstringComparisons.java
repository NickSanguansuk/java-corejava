package topics.basic_demo.hackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        SortedSet<String> set = new TreeSet<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            set.add(s.substring(i, i+k));
        }

        System.out.println(set);

        smallest = set.first();
        largest = set.last();

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargest2(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        smallest = s;

        for (int i = 0; i < s.length() - k + 1; i++) {
            String str = s.substring(i, i+k);
            System.out.print(str + ", ");
            if (str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if (str.compareTo(largest) > 0) {
                largest = str;
            }
        }
        System.out.println();

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        //int k = scan.nextInt();
        String s = "welcometojava";
        int k = 3;
        //scan.close();

        System.out.println(getSmallestAndLargest2(s, k));
    }
}
