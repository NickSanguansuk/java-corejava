package topics.oop_demo.abstraction_demo.student_demo;

public interface College {
    // data
    // "public static final" is the default
    //public static final String COLLEGE_NAME = "Per Scholas";
    String COLLEGE_NAME = "Per Scholas";
    String COLLEGE_ADDRESS = "23-66st";

    // methods
    // "public abstract" is the default
    //public abstract void getCourseName();
    void getDepartmentName();
    void getCourseName();
    void getInstructor();
    int getProgramDurationInWeek();

    default void myDefaultMethod() {
        System.out.println("This is a default method.");
    }

    static void sayCollegeName() {
        System.out.println("This is Per Scholas.");
    }
}
