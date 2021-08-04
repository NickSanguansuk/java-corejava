package topics.exceptions_demo.try_catch_handling;

public class Main {

    public static void main(String[] args) {

        // Exceptions that inherit from java.lang.RuntimeException or java.lang.Error are so-called "unchecked exceptions"
        // that can be caught by a try-catch construct, they don't have to be, though.

        System.out.println("Unchecked exceptions");

        try {
            System.out.println("-try block-");

            //System.out.println("---> ArithmeticException");
            //int i = 100 / 0;

            //System.out.println("---> ArrayIndexOutOfBoundsException");
            //int[] arr = new int[5];
            //for (int i = 0; i < 6; i++) {
            //    System.out.println(arr[i]);
            //}

            //System.out.println("---> NullPointerException");
            //String s = null;
            //s.length();

            System.out.println("---> ");
            String str = "abc";
            Integer num = Integer.parseInt(str);


        } catch (ArithmeticException e) {
            System.out.println("-catch block 1-");
            e.printStackTrace(); // good
            System.out.println(e); // good
            System.out.println(e.getMessage());
            System.out.println("This is a manual exception message");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-catch block 2-");
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("-catch block 3-");
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("-catch block 4-");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("-catch block last-");
            System.out.println(e);
        } finally {
            System.out.println("-finally block-");
            System.out.println("finally block is always executed");
        }


    }

}
