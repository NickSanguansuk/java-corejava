package temp;

class B {}
class B1 extends B {}
class B2 extends B {}

public class Question3 {

    public static void main(String[] args) {
        B b = new B();
        B1 b1 = new B1();
        B2 b2 = new B2();

        //b1 = (B) b1;    // Compile Error

        //b1 = (B1) b;    // Runtime Error

        b = b1;

        //b2 = b;         // Compile Error

        //b2 = (B2) b1;   // Compile Error
    }
}
