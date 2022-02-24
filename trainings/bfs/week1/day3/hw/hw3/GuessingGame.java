package trainings.bfs.week1.day3.hw.hw3;

import java.util.Random;

public class GuessingGame {

    // Fields
    int answer;
    Random generator;
    boolean gameOver;
    int differential;
    int max;
    int maxGuessesAllowed;
    int numGuessesTaken;

    // Constructors
    public GuessingGame() {
        this.max = 0;
        this.generator = new Random();
    }

    public GuessingGame(int max) {
        this.max = max;
        this.generator = new Random();
    }

    // Getters and Setters
    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public Random getGenerator() {
        return generator;
    }

    public void setGenerator(Random generator) {
        this.generator = generator;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getDifferential() {
        return differential;
    }

    public void setDifferential(int differential) {
        this.differential = differential;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMaxGuessesAllowed() {
        return maxGuessesAllowed;
    }

    public void setMaxGuessesAllowed(int maxGuessesAllowed) {
        this.maxGuessesAllowed = maxGuessesAllowed;
    }

    public int getNumGuessesTaken() {
        return numGuessesTaken;
    }

    public void setNumGuessesTaken(int numGuessesTaken) {
        this.numGuessesTaken = numGuessesTaken;
    }

    // Methods
    void newGame(int maxNumberOfGuesses) {
        this.maxGuessesAllowed = maxNumberOfGuesses;
        this.answer = this.generator.nextInt(this.max + 1);
        this.gameOver = false;
        this.differential = this.max;
        this.numGuessesTaken = 0;
    }

    void guess(int num) {
        this.numGuessesTaken++;
        if (this.numGuessesTaken <= this.maxGuessesAllowed) {
            if (num >= 0 && num <= this.max) {
                int dif = Math.abs(num - this.answer);
                if (num > this.answer) {
                    System.out.println("Too High");
                    if (dif < this.differential) {
                        System.out.println("Getting Warmer");
                    } else {
                        System.out.println("Getting Colder");
                    }
                } else if (num < this.answer) {
                    System.out.println("Too Low");
                    if (dif < this.differential) {
                        System.out.println("Getting Warmer");
                    } else {
                        System.out.println("Getting Colder");
                    }
                } else {
                    System.out.println("Congratulation!");
                    this.gameOver = true;
                }
            } else {
                System.out.println("Guess out of range, The guess must be between 0 and " + this.max);
            }
        } else {
            System.out.println("Game Over!");
            this.gameOver = true;
        }
    }

    boolean isGameOver() {
        return this.gameOver;
    }

}
