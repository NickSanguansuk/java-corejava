package topics.mathstring_demo.hackerrank.inttostring_demo;

import java.security.Permission;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToStringDemo {

    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter a whole number: ");
            int n = in.nextInt();
            in.close();

            //String s=???; Complete this line below
            //Write your code here
            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        } catch (InputMismatchException e) {
            System.out.println(e + ": You have to enter a whole number");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

}

