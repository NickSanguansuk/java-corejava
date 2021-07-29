package exercises;

public class IterationExer {
    // Core Java - Exercises - Iteration Statements (Loops)

    static void problem1() {
        System.out.println("Problem 1: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void problem2() {
        System.out.println("Problem 2: ");
        int num = 0;
        while (num <= 100) {
            System.out.println(num);
            num += 10;
        }
    }

    static void problem3() {
        System.out.println("Problem 3: ");
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }

    static void problem4() {
        System.out.println("Problem 4: ");
        for (int i = 1; i <= 100; i++) {
            if (i >= 25 && i <= 75) {
                continue;
            } else if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    static void problem5() {
        System.out.println("Problem 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i > 50) {
                break;
            } else if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    static void problem6() {
        System.out.println("Problem 6: ");
        for (int i = 1; i <= 2; i++) {
            System.out.println("Week " + i + ":");
            for (int j = 1; j <= 5; j++) {
                System.out.println("Day " + j);
            }
        }
    }

    static void problem7() {
        System.out.println("Problem 7: ");
        for (int i = 10; i <= 200; i++) {
            String str = Integer.toString(i);
            int len = str.length();
            boolean bPalindrome = true;

            for (int j = 0; j < len / 2; j++) {
                if (str.charAt(j) != str.charAt(len - j - 1)) {
                    bPalindrome = false;
                    break;
                }
            }

            if (bPalindrome == true) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
    }

    static void problem8() {
        System.out.println("Problem 8: ");
        int numLow = 0;
        int numHigh = 1;

        while (numLow <= 50) {
            System.out.print(numLow + ", ");
            int numTmp = numLow + numHigh;
            numLow = numHigh;
            numHigh = numTmp;
        }

        System.out.println();
    }

    static void problem9() {
        System.out.println("Problem 9: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }

    }

    public static void main(String[] args) {

        problem1();
        System.out.println("----------");
        problem2();
        System.out.println("----------");
        problem3();
        System.out.println("----------");
        problem4();
        System.out.println("----------");
        problem5();
        System.out.println("----------");
        problem6();
        System.out.println("----------");
        problem7();
        System.out.println("----------");
        problem8();
        System.out.println("----------");
        problem9();
        System.out.println("----------");

    }
}
