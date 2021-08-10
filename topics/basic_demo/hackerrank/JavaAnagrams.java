package topics.basic_demo.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        // Test for invalid input
        if (a == null || b == null || a.equals("") || b.equals(""))
            throw new IllegalArgumentException();

        // Initial quick test for non-anagrams
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        // Populate a map with letters and frequencies of String a
        for (int i = 0; i < a.length(); i++) {
            Character c = a.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer frequency = map.get(c);
                frequency++;
                map.put(c, frequency);
            }
        }

        // Test each letter in String b against data in the map.
        // Return false, if letter is absent in the map or its frequency is 0
        // Otherwise decrease the frequency by 1
        for (int i = 0; i < b.length(); i++) {
            Character c = b.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }

            Integer frequency = map.get(c);

            if (frequency == 0) {
                return false;
            } else {
                frequency--;
                map.put(c, frequency);
            }
        }

        // If the code got this far, it is an anagram
        return true;
    }

    static boolean isAnagram2(String a, String b) {
        // Complete the function

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() == b.length()) {
            int[] arrayA = new int[123]; // last index is 122, z is 122
            int[] arrayB = new int[123];
            for (int i = 0; i < a.length(); i++) {
                arrayA[(int)a.charAt(i)] += 1;
                arrayB[(int)b.charAt(i)] += 1;
            }

            for (int i = 0; i < 123; i++) {
                if (arrayA[i] != arrayB[i])
                    return false;
            }

            return true;
        } else {
            return false;
        }
    }

    static boolean isAnagram3(String a, String b) {
        // Complete the function

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        String aSorted = new String(aArr);
        String bSorted = new String(bArr);

        return aSorted.equals(bSorted);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //String a = scan.next();
        //String b = scan.next();
        String a = "anagrammza";
        String b = "marganaazm";
        scan.close();
        boolean ret = isAnagram3(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
