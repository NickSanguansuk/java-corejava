package topics.conditional_demo;

import java.util.Scanner;

public class ConditionalDemo {
    // Core Java - Conditional Statements

    static double calculateSingleFiler(double income) {

        return 100;
    }

    public static void main(String[] args) {

        // Conditional Statements

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // switch

            // break statement is used to terminate the switch-case statement.
            // If break is not used, all the cases after the matching case are also executed.

            int number = 20;

            switch (number) {
                case 10:
                    System.out.println(10);
                    break;
                case 20:
                    System.out.println(20);
                    break;
                case 30:
                    System.out.println(30);
                    break;
                default:
                    System.out.println("Not in 10, 20, or 30");
            }

            // enhanced switch statement

            switch (number) {
                case 10 -> System.out.println(10);
                case 20 -> System.out.println(20);
                case 30 -> System.out.println(30);
                default -> System.out.println("Not in 10, 20, or 30");
            }

            System.out.println("----------");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter month in number: ");
            int numInput = scanner.nextInt();

            String resultMonth = "";

            switch (numInput) {
                case 1:
                    resultMonth = "1 - January";
                    break;
                case 2:
                    resultMonth = "2 - February";
                    break;

                case 3:
                    resultMonth = "3 - March";
                    break;

                default:System.out.println("Invalid number for month");

            }
            System.out.println(resultMonth);

            System.out.println("----------");

            // Problem: Computing Taxes

            System.out.print("Enter your filing status: \n" +
                    "\t1 - Single filers\n" +
                    "\t2 - Married filing jointly\n" +
                    "\t3 - Married filing separately\n" +
                    "\t4 - Head of household\n" +
                    "Your status (1-4): ");
            int filingStatus = scanner.nextInt();

            System.out.print("Enter your income: ");
            double income = scanner.nextDouble();

            //switch (filingStatus) {
            //    case 1:
            //        return
            //
            //}

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {


        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {


        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

    }
}
