package topics.oop_programming.abstraction.student_demo;

public class StudentService extends StudentAbstract implements College, School {

    // constructors
    public StudentService() {
    }

    public StudentService(String firstName, String lastName, float gpa, int rollNumber) {
        super(firstName, lastName, gpa, rollNumber);
    }

    // methods
    @Override
    public void displayInformation() {
        System.out.println("Name: " + getFirstName() + " " + getLastName() +
                ", GPA: " + getGpa() + ", Roll Number: " + getRollNumber());
    }

    @Override
    public String getStudentAddress() {
        return null;
    }

    @Override
    public String[] getFullName() {
        //String[] fullname = {super.getFirstName(), super.getLastName()};
        //return fullname;
        return new String[]{super.getFirstName(), super.getLastName()};
    }

    @Override
    public void getDepartmentName() {
        System.out.println("Computer Science");
    }

    @Override
    public void getCourseName() {
        System.out.println("Java Development");
    }

    @Override
    public void getInstructor() {
        System.out.println("Haseeb");
    }

    @Override
    public int getProgramDurationInWeek() {
        return 15;
    }

    @Override
    public String getSchoolCity() {
        return "Chicago";
    }
}
