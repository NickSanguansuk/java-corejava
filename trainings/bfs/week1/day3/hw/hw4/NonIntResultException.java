package trainings.bfs.week1.day3.hw.hw4;

public class NonIntResultException extends RuntimeException {

    public NonIntResultException(int number, int denom) {
        super("Result " + number + " divided by " + denom + " is not an integer");
    }
}
