package exercises;

import java.util.Scanner;

public class ConditionalExer {
    // Core Java - Exercise - Control Flow (Conditional) Statements

    static void problem1() {
        System.out.println("Problem 1: ");
        //int x = 7;
        int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        }
    }

    static void problem2() {
        System.out.println("Problem 2: ");
        //int x = 7;
        int x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    static void problem3() {
        System.out.println("Problem 3: ");
        //int x = 15;
        int x = 50;

        if (x < 10) {
            System.out.println("Less than 10");
        } if (x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal 20");
        }
    }

    static void problem4() {
        System.out.println("Problem 4: ");
        //int x = 15;
        int x = 5;

        if (x >= 10 && x <= 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }

    static void problem5() {
        System.out.println("Problem 5: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the score (0-100): ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else if (score >= 0) {
            System.out.println("Grade: F");
        }
    }

    static void problem6() {
        System.out.println("Problem 6: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");
        }
    }
    public static void main(String[] args) {

        problem1();
        System.out.println(" ---------- ");
        problem2();
        System.out.println(" ---------- ");
        problem3();
        System.out.println(" ---------- ");
        problem4();
        System.out.println(" ---------- ");
        problem5();
        System.out.println(" ---------- ");
        problem6();
        System.out.println(" ---------- ");
    }
}
