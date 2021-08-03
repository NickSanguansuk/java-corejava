package topics.oop_demo.abstraction_demo.student_demo;

public abstract class StudentAbstract {
    // data
    private String firstName;
    private String lastName;
    private float gpa;
    private int rollNumber;

    // constructors
    public StudentAbstract() {
    }

    public StudentAbstract(String firstName, String lastName, float gpa, int rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.rollNumber = rollNumber;
    }

    // abstract methods
    public abstract void displayInformation();
    public abstract String getStudentAddress();
    public abstract String[] getFullName();

    // normal methods

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
