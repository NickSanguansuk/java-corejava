package topics.conditional_demo;

import java.time.DayOfWeek;
import java.util.Scanner;

public class ConditionalDemo {
    // Core Java - Conditional Statements

    static double calculateSingleFiler(double income) {

        return income * 11;
    }

    static double calculateMarriedJointly(double income) {

        return income * 12;
    }

    static double calculateMarriedSeparate(double income) {

        return income * 13;
    }

    static double calculateHeadOfHousehold(double income) {

        return income * 14;
    }

    public static void main(String[] args) {

        // Conditional Statements

        // 1. Parentheses (always first!)
        // 2. Postfix, prefix and unary operators
        // 3. Multiplication and division
        // 4. Addition and subtraction
        // 5. Bitwise operators
        // 6. Logical operators
        // 7. Ternary operator
        // 8. Assignment operators

        // All binary operators except assignment operators are left-associative.
        // a – b + c – d is equivalent to ((a – b) + c) – d
        // Assignment operators are right-associative.
        // a = b += c = 5 is equivalent to a = (b += (c = 5))

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("exclusive or (xor) ---> ^");

            System.out.println("false ^ false = \t" + (false ^ false));     // false
            System.out.println("false ^ true = \t\t" + (false ^ true));       // true
            System.out.println("true ^ false = \t\t" + (true ^ false));       // true
            System.out.println("true ^ true = \t\t" + (true ^ true));         // false

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // switch

            // break statement is used to terminate the switch-case statement.
            // If break is not used, all the cases after the matching case are also executed.

            int number = 20;

            switch (number) {
                case 10:
                    System.out.println(10);
                    break; // if no break; the code will fall through
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
            //int numInput = scanner.nextInt();
            System.out.println();
            int numInput = 2;

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
                default:
                    System.out.println("Invalid number for month");
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
            //int filingStatus = scanner.nextInt();
            System.out.println();
            int filingStatus = 2;

            System.out.print("Enter your income: ");
            //double income = scanner.nextDouble();
            System.out.println();
            double income = 10000;

            double tax;

            switch (filingStatus) {
                case 1:
                    System.out.println("case 1");
                    tax = calculateSingleFiler(income);
                    break;
                case 2:
                    System.out.println("case 2");
                    tax = calculateMarriedJointly(income);
                    break;
                case 3:
                    System.out.println("case 3");
                    tax = calculateMarriedSeparate(income);
                    break;
                case 4:
                    System.out.println("case 4");
                    tax = calculateHeadOfHousehold(income);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid status");
            }

            System.out.println("----------");

            System.out.println("switch with Enum");

            System.out.print("Enter day of the week: ");
            //String dayOfWeek = scanner.nextLine(); // Have to type "MONDAY"
            //int dayOfWeek = scanner.nextInt();
            System.out.println();
            int dayOfWeek = 1;

            String response;

            //switch (DayOfWeek.valueOf(dayOfWeek)) {
            switch (DayOfWeek.of(dayOfWeek)) {
                case MONDAY:        // 1
                    response = "Monday is Yellow";
                    break;
                case TUESDAY:       // 2
                    response = "Tuesday is Pink";
                    break;
                case WEDNESDAY:     // 3
                    response = "Wednesday is Green";
                    break;
                case THURSDAY:      // 4
                    response = "Thursday is Orange";
                    break;
                case FRIDAY:        // 5
                    response = "Friday is Blue";
                    break;
                case SATURDAY:      // 6
                    response = "Saturday is Purple";
                    break;
                case SUNDAY:        // 7
                    response = "Sunday is Red";
                    break;
                default:
                    response = "What???";
            }

            System.out.println(response);

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {


        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

    }
}
