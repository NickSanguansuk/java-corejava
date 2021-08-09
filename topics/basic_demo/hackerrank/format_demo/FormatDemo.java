package topics.basic_demo.hackerrank.format_demo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatDemo {

    public static void main(String[] args) {

        // Sample Output

        // US: $12,324.13
        // India: Rs.12,324.13
        // China: ￥12,324.13
        // France: 12 324,13 €

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment amount: ");
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
