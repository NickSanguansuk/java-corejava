package topics.exception_demo.custom_exception.demo2;

public class Main {

    public static void main(String[] args) {

        try {
            throw new InvalidAgeException("Your age is too young.");
        } catch (InvalidAgeException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
