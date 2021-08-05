package topics.time_demo.calendar_demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));

        System.out.println(c.getTime());

        System.out.println("----------");

        // Careful: month starts from 0-11
        c.set(2020, 8, 15);

        System.out.println(c.getTime());

        System.out.println("----------");

        // January 1, 2020
        c.set(2020, 0, 1);
        System.out.println(c.getTime());

        // .add() will add 555 days
        c.add(Calendar.DATE, 555);
        System.out.println(c.getTime());

        // .roll() will only modify the Calendar.DATE
        c.roll(Calendar.DATE, 555);
        System.out.println(c.getTime());

    }
}
