package topics.iteration_demo;

import java.util.Scanner;

public class IterationDemo {
    // Core Java - Iteration Statements (Loops)

    public static void main(String[] args) {

        // for loop, while loop, do-while loop, for each loop,

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // for loop

            for (int i = 5; i < 10; i++) {
                System.out.println(i + " Wasin");
            }

            // nested loop

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(i + " " + j);
                }
            }

            // *
            // * *
            // * * *
            // * * * *
            // * * * * *
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            String star = "*";
            for(int i = 0; i < 5; i++) {
                System.out.println(star);
                star += " *";
            }

            // 5 4 3 2 1
            //   5 4 3 2
            //     5 4 3
            //       5 4
            //         5
            for (int i = 0; i < 5; i++) {

            }

            Scanner scanner = new Scanner(System.in);

            // Check Prime
            //System.out.print("Enter a number: ");
            //int num = scanner.nextInt();
            int num = 17;
            boolean bPrime = true;

            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    bPrime = false;
                    break;
                }
            }
            System.out.println(num + " is " + (bPrime ? "Prime" : "not Prime"));

            // Check Palindrome
            //System.out.print("Enter a String: ");
            //String inputOriginal = scanner.next();
            String inputOriginal = "Civic";
            String inputStr = inputOriginal.toLowerCase();

            boolean bPalindrome = true;

            int len = inputStr.length();
            int halfLen = len / 2;

            for (int i = 0; i < halfLen; i++) {
                if (inputStr.charAt(i) != inputStr.charAt(len - i - 1)) {
                    bPalindrome = false;
                    break;
                }
            }
            System.out.println(inputStr + " is " + (bPalindrome ? "Palindrome" : "not Palindrome"));

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");
        
    }
}
