package trainings.bfs.week1.day3.hw.hw2;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("David", "123 N Ashland", "7738882222", "david2022@gmail.com");
        Student s = new Student("Bob", "1000 S Roscoe", "3125553333", "bobza@gmail.com", Student.ClassStatus.JUNIOR);
        Employee e = new Employee("Judy", "25 S Ridge", "3124445555", "judy.maria@gmail.com", "Business", 85000, LocalDate.of(2012, 3, 10));
        Faculty f = new Faculty("Nick", "555 S Wood", "7732225555", "nick.sang@gmail.com", "CS", 115000, LocalDate.of(2011, 5, 12), "Mon 5pm-8pm", "Professor");
        Staff st = new Staff("Lita", "1122 N Wolcott", "3126665555", "litalita@gmail.com", "Law", 78000, LocalDate.of(2015, 2, 25), "Advisor");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}
