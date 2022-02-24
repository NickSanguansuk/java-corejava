package trainings.bfs.week1.day3.demo.customexception;

// class that uses custom exception MyCustomException
public class TestCustomException2 {

    // main method
    public static void main(String args[]) {
        try {
            // throw an object of user defined exception
            throw new MyCustomException();
        } catch (MyCustomException ex) {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

        System.out.println("rest of the code...");
    }
}

// class representing custom exception
class MyCustomException extends Exception {

}