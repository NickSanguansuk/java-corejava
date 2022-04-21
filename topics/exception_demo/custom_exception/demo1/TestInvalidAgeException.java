package topics.exception_demo.custom_exception.demo1;

public class TestInvalidAgeException {

    public void validate1(int age) throws InvalidAgeException {

        if(age < 18) {
            throw new InvalidAgeException("You are under Age");
        } else {
            System.out.println("Welcome to the Voting Management System");
        }
    }

    public void validate2(int age) {

        if(age < 18) {
            try {
                throw new InvalidAgeException("you are under Age");
            } catch (InvalidAgeException e) {
                System.out.println("-catch block-");
                System.out.println(e);
                //e.printStackTrace();
            } finally {
                System.out.println("-finally block-");
            }
        } else {
            System.out.println("Welcome to the Voting Management System");
        }

    }
}
