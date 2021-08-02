package exercises;

public class BasicsExer01 {
    // Core Java - Exercises - Variables

    public static void main(String[] args) {

        {
            System.out.println("Problem 1: ");
            // Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
            // Assign the sum to a variable. Print out the result.

            int a = 5;
            int b = 8;
            int sum = a + b;
            System.out.println("The sum value is: " + sum);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 2: ");
            // Write a program that declares 2 double variables, assigns a number to each, and adds them together.
            // Assign the sum to a variable. Print out the result.

            double a = 6.0;
            double b = 7.0;
            double sum = a + b;
            System.out.println("The sum value is: " + sum);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 3: ");
            // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
            // Assign the sum to a variable. Print out the result. What variable type must the sum be?

            int a = 12;
            double b = 5.5;
            double sum = a + b;
            System.out.println("The sum value is: " + sum);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 4: ");
            // Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
            // Assign the result to a variable. Print out the result.
            // Now change the larger number to a decimal. What happens? What corrections are needed?

            //int a = 4;
            double a = 4.0;
            int b = 3;
            double result = a / b;
            System.out.println("The result value is: " + result);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 5: ");
            // Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
            // Assign the result to a variable. Print out the result.
            // Now, cast the result to an integer. Print out the result again.

            double a = 5.0;
            double b = 2.0;
            double result = a / b;
            System.out.println("The result value is: " + result);
            int resultInt = (int)result;
            System.out.println("The result (casting to int) value is: " + resultInt);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 6: ");
            // Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
            // Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.

            int x = 5;
            int y = 6;
            double q = y / x;
            System.out.println("q value is: " + q);

            q = ((double)y) / x;
            System.out.println("q value is: " + q);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 7: ");
            // Write a program that declares a named constant and uses it in a calculation. Print the result.
            final double PI = 3.14159;

            double radius = 10;

            double area = PI * radius * radius;
            System.out.println("Area of the circle is " + area);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 8: ");
            // Write a program where you create 3 variables that represent products at a cafe.
            // The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
            // Create 2 more variables called subtotal and totalSale and complete an “order” for
            // 3 items of the first product, 4 items of the second product, and 2 items of the third product.
            // Add them all together to calculate the subtotal.
            // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
            // Be sure to format the results to 2 decimal places.

            double coffee = 3.49;
            double bubbleTea = 5.99;
            double water = 1.25;
            double subtotal = (coffee * 3) + (bubbleTea * 4) + (water * 2);
            double SALES_TAX = 10.80;
            double totalSale = subtotal + (subtotal * SALES_TAX / 100);

            System.out.printf("subtotal is: %.2f, totalSale is: %.2f\n", subtotal, totalSale);

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

    }
}
