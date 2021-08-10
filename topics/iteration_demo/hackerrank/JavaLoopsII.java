package topics.iteration_demo.hackerrank;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {

        // (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ..., (a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)

        // Input
        //      2
        //      0 2 10
        //      5 3 5

        // Output
        //      2 6 14 30 62 126 254 510 1022 2046
        //      8 14 26 50 98

        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many series do you want?: ");
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter a, b, and n: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int num = a;

            for (int j = 0; j < n; j++) {
                num += Math.pow(2, j) * b;

                System.out.print(num + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
