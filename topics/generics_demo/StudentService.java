package topics.generics_demo;

public class StudentService {

    private int rollNumber;
    private String studentName;
    private String program;

    public StudentService(int rollNumber, String studentName, String program) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.program = program;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "StudentService{" +
                "rollnumber=" + rollNumber +
                ", StudentName='" + studentName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
