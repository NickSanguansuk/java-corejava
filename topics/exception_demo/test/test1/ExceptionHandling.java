package topics.exception_demo.test.test1;

// - A
// - Runtime error
// - Compile time error
// - B

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int a, b;
            b = 0;
            a = 5 / b;
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        }
    }
}
