package topics.exceptions_demo.custom_exceptions;

public class CustomException1 extends Exception {

    String str;

    public CustomException1(String message) {
        super(message);
        this.str = message;
    }

    @Override
    public String toString() {
        return "Custom Exception Occurred: " + this.str;
    }
}
