package topics.exception_demo.custom_exception.demo1;

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
