package topics.time_demo.time_demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeDemo {

    public static void main(String[] args) {

        // Legacy API
        //      Date class          JDK 1.0 (1996)
        //      Calendar class      JDK 1.1 (1997)
        // Current (Better)
        //      Time class          JDK 8 (2014)

        System.out.println("----------");
        System.out.println("---> Current date (now)");

        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println("----------");
        System.out.println("---> Setting date");

        LocalDate date2 = LocalDate.of(2020, 1, 1);
        System.out.println(date2);

        System.out.println("----------");
        System.out.println("---> Getting values from date");

        LocalDate date3 = LocalDate.of(2020, 8, 24);
        System.out.println(date3);                  // 2020-08-24

        System.out.println(date3.getYear());        // 2020
        System.out.println(date3.getMonth());       // AUGUST
        System.out.println(date3.getMonthValue());  // 8
        System.out.println(date3.getDayOfWeek());   // MONDAY
        System.out.println(date3.getDayOfMonth());  // 24
        System.out.println(date3.getDayOfYear());   // 237

        System.out.println("----------");
        System.out.println("---> Modifying date");

        LocalDate date4 = LocalDate.of(2020, 1, 1);
        System.out.println(date4);
        System.out.println(date4.plusMonths(50));
        System.out.println(date4.plusDays(25));
        System.out.println(date4.minusMonths(5));
        System.out.println(date4.minusWeeks(2));

        System.out.println("The value of date4 is still the same");
        System.out.println(date4);

        System.out.println("----------");
        System.out.println("---> LocalDateTime");

        LocalDate date5 = LocalDate.of(2020, 1, 1);
        LocalDateTime dt = date5.atTime(15, 38, 55);
        System.out.println(dt);

        System.out.println("----------");

    }
}
