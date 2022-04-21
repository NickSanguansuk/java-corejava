package topics.exception_demo.custom_exception.demo2;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
