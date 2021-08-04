package topics.exception_demo.manual_throw;

public class ManualThrow {

    public void checkStudentEligibility(int stAge, int gpa) {

        // unchecked exception Example
        if(stAge < 18 && gpa < 2 ) {
            System.out.println("Age < 18 and GPA < 2");
            // Explicitly throw an exception using throw operator
            throw new NullPointerException("You are not Eligible for Registration");
        } else {
            System.out.println("You are Eligible for Registration");
        }
    }
}
