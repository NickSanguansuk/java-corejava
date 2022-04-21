package topics.exception_demo.try_catch_finally;

public class Main {

    public static int x;

    public static int someFunction() {
        try {
            //return 10;
            return x = 10;
        } catch (Exception e) {

        } finally {
            //return 20;
            return x = 20;
        }
    }

    public static void main(String[] args) {

        System.out.println(someFunction());
        System.out.println(x);
    }
}
