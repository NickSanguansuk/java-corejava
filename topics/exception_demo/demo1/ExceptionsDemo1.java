package topics.exception_demo.demo1;

import java.util.Scanner;

public class ExceptionsDemo1 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a whole number: ");
            int x = scanner.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);

        } catch (ArithmeticException e) {
            System.out.println("-catch block-");
            System.out.println("You can't divide by zero!");
        } finally {
            System.out.println("-finally block-");
        }
    }
}
