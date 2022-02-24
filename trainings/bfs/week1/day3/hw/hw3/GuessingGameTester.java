package trainings.bfs.week1.day3.hw.hw3;

import java.util.Scanner;

public class GuessingGameTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playAgain = "Y";

        while (playAgain.equals("Y") || playAgain.equals("y")) {

            System.out.println();
            System.out.println("Welcome to the Guessing Game.");
            System.out.print("Enter the maximum number: ");
            GuessingGame game = new GuessingGame(scanner.nextInt());
            System.out.print("Enter the number of guess allowed: ");
            game.newGame(scanner.nextInt());

            while (!game.isGameOver()) {

                System.out.println();
                System.out.println("Enter your guess, remember it must be between 0 and " + game.getMax());
                game.guess(scanner.nextInt());
            }

            System.out.println();
            System.out.println("Would you like to play again, enter Y for yes, N for no.");
            playAgain = scanner.next();
        }

    }
}
