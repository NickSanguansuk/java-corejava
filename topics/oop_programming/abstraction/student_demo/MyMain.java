package topics.oop_programming.abstraction.student_demo;

import java.util.Arrays;

public class MyMain {

    public static void main(String[] args) {

        StudentService st_Service = new StudentService("Wasin", "Sanguansuk", 3.98f, 123456);

        st_Service.displayInformation();

        String[] name = st_Service.getFullName();
        System.out.println(Arrays.toString(name));

        System.out.println("----------");
        System.out.println("static method is interface");
        College.sayCollegeName();

        System.out.println("----------");

        College college = new StudentService("Nick", "Sang", 4.0f, 555555);

    }
}
