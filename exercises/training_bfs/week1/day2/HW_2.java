package exercises.training_bfs.week1.day2;

import java.util.Stack;

public class HW_2 {

    void convertMinutesToYearsDays(int minutes) {
        int days = minutes / 1440; // 60 * 24 = 1440 minutes in a day

        int years = days / 365;
        int daysRemaining = days % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + daysRemaining + " days.");
    }

    public static void main(String[] args) {

        HW_2 hw2 = new HW_2();

        int minutes = 3456789;
        hw2.convertMinutesToYearsDays(minutes);
    }
}
