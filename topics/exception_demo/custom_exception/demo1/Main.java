package topics.exception_demo.custom_exception.demo1;

public class Main {

    public static void main(String[] args) {

        System.out.println("CustomException1");

        try {
            System.out.println("Starting...");
            throw new CustomException1("This is a message for CustomExceptions1");
        } catch (Exception e) {
            System.out.println("-catch block-");
            System.out.println(e);
        } finally {
            System.out.println("-finally block-");
        }

        System.out.println("----------");
        System.out.println("InvalidAgeException");

        TestInvalidAgeException test1 = new TestInvalidAgeException();

        try {
            test1.validate1(17);
        } catch (InvalidAgeException e) {
            System.out.println("-catch block-");
            System.out.println(e);
        } finally {
            System.out.println("-finally block-");
        }

        System.out.println("----------");

        test1.validate2(17);

    }
}
