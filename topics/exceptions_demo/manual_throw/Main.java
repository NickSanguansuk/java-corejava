package topics.exceptions_demo.manual_throw;

import topics.exceptions_demo.throws_handling.CheckEligibility;

public class Main {

    public static void main(String[] args) {

        ManualThrow chk = new ManualThrow();

        try {
            chk.checkStudentEligibility(16, 1);
        } catch (NullPointerException e) {
            System.out.println("-catch block-");
            System.out.println(e);
        } finally {
            System.out.println("-finally block-");
        }

    }
}
