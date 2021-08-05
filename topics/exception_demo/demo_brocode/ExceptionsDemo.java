package topics.exception_demo.demo_brocode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a whole number: ");
            int x = scanner.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);

        } catch (ArithmeticException e) {
            System.out.println("-catch block-");
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("-catch block-");
            System.out.println("You need to enter a whole number!");
        } catch (Exception e) {
            System.out.println("-catch block-");
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("-finally block-");
            System.out.println("The finally block is always executed");

            scanner.close();
        }
    }
}
