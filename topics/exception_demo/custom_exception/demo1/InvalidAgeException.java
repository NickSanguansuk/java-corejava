package topics.exception_demo.custom_exception.demo1;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
