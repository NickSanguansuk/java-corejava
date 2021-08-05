package topics.time_demo.date_demo;

import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();

        // Return: number of milliseconds since 00:00:00 January 1, 1970
        System.out.println(date.getTime());

        double seconds = date.getTime() / 1000.0;
        double minutes = seconds / 60.0;
        double hours = minutes / 60.0;
        double days = hours / 24.0;
        double months = days / 30.0;
        double years = days / 365.0;

        System.out.println("Since 00:00:00 of Jan. 1, 1970, it's been...");
        System.out.println(seconds + " seconds OR");
        System.out.println(minutes + " minutes OR");
        System.out.println(hours + " hours OR");
        System.out.println(days + " days OR");
        System.out.println(months + " months OR");
        System.out.println(years + " years OR");

    }
}
