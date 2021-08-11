package topics.basic_demo.demo1;

public class BasicDemo {
    // Core Java - Introduction to Java Basics
    // Core Java - Java Programming Fundamentals

    public static void main(String[] args) {
        // main method is an entry point in your project. All Java program must have at least 1 main method.
        // By default, main method is a thread in Java.

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // byte (-128 to 127)

            // 0        0000 0000
            // 1        0000 0001
            // 2        0000 0010
            // 127      0111 1111
            // (MAX == 127)
            // 128      1000 0000   ---> -128   (for byte,    128 = -128)
            // 129      1000 0001   ---> -127

            // ~Num ---> (flip bit)
            // Convert by (-Num - 1)

            // -1       1111 1111
            // -2       1111 1110
            // -128     1000 0000
            // (MIN == -128)
            // -129     0111 1111   ---> 127    (for byte,    -129 = 127)
            // -129     0111 1110   ---> 126

            System.out.println(Integer.toBinaryString(0));
            System.out.println(Integer.toBinaryString(1));
            System.out.println(Integer.toBinaryString(2));
            System.out.println(Integer.toBinaryString(127));
            System.out.println(Integer.toBinaryString(128));
            System.out.println(Integer.toBinaryString(129));
            System.out.println(Integer.toBinaryString(-1));
            System.out.println(Integer.toBinaryString(-2));
            System.out.println(Integer.toBinaryString(-128));
            System.out.println(Integer.toBinaryString(-129));
            System.out.println(Integer.toBinaryString(-130));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            byte byteVar = 5;
            short shortVar = 20;
            int intVar = 333333333;
            long longVar = 3333333333333333333L;

            float floatVar = 10 / 4f;
            float floatVar2 = 121.36f;

            double doubleVar = 2365.256552;

            char charVar = 'D';
            boolean boolVar = false;

            System.out.println(byteVar);
            System.out.println(shortVar);
            System.out.println(intVar);
            System.out.println(longVar);

            System.out.println(floatVar);
            System.out.println(floatVar2);

            System.out.println(doubleVar);

            System.out.println(charVar);
            System.out.println(boolVar);

            System.out.println("----------");

            System.out.println("Casting: Widening or Automatic Type Conversion");

            // int ---> long
            // long ---> float
            // float ---> double

            System.out.println("byte ---> short ---> int ---> long ---> float ---> double");

            int intCon = shortVar;
            System.out.println(intCon);

            float floatCon = shortVar;
            System.out.println(floatCon);

            float floatCon2 = longVar;  // long (8 bytes) can automatically convert to float (4 bytes)
            System.out.println(floatCon2);

            System.out.println("Casting: Narrowing or Explicit Type Conversion");

            byte byteCon = (byte) doubleVar;
            System.out.println(byteCon);

            int intNum = 97;
            char charCon = (char) intNum;
            System.out.println(charCon);

            System.out.println("----------");

            System.out.println("Type-promotion");

            byte b = 5;
            //b = b * 2; // Error! Cannot assign an int to a byte!
                         // b * 2 ---> got promoted to int

            b = (byte)(b * 2); // need to cast back to byte
            System.out.println(b);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Size of char: " + (Character.SIZE / 8) + " bytes.");
            System.out.println("Size of byte: " + (Byte.SIZE / 8) + " bytes.");
            System.out.println("Size of short: " + (Short.SIZE / 8) + " bytes.");
            System.out.println("Size of int: " + (Integer.SIZE / 8) + " bytes.");
            System.out.println("Size of long: " + (Long.SIZE / 8) + " bytes.");
            System.out.println("Size of float: " + (Float.SIZE / 8) + " bytes.");
            System.out.println("Size of double: " + (Double.SIZE / 8) + " bytes.");
            System.out.println("Size of boolean: 1 bytes.");
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            boolean c = (1 < 2);
            System.out.println(c);

            int radius = 2;
            float area = radius * radius * 3.14f;
            System.out.println(area);

            int score = 10;
            int temp = 200;

            boolean rs = (score >= 10) && (temp >= 300);
            System.out.println(rs);

            boolean rs2 = (score >= 10) || (temp >= 300);
            System.out.println(rs2);

            // XOR
            System.out.println("XOR");
            boolean result1 = false ^ false;    // false
            System.out.println(result1);
            boolean result2 = false ^ true;        // true
            System.out.println(result2);

            int np5 = 5;                // 0000 0101
            int nn0 = 0;
            int nn1 = -1;
            int nn2 = -2;
            int nn3 = -3;
            System.out.println(~np5);    // 1111 1010		// -6
            System.out.println(~nn0);
            System.out.println(~nn1);
            System.out.println(~nn2);
            System.out.println(~nn3);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // To determine whether a year is a leap year, follow these steps:

            // 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
            // 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
            // 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
            // 4. The year is a leap year (it has 366 days).
            // 5. The year is not a leap year (it has 365 days).

            // Leap year
            int year = 2000;

            boolean bLeapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
            System.out.println("Leap Year: " + bLeapYear);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // pre/post increment/decrement

            int x = 10;
            System.out.println(x++ + ++x);        // 10 + 12 = 22
            System.out.println(x);                // 12
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // The Ternary Operator

            int i = 2;
            int j = 5;
            int min = ((i < j) ? i : j);
            System.out.println(min);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // \n, \t, \', \", \\, \b, \r, \f,

            // \r ---> Carriage-return character
            // \f ---> Formfeed character

            System.out.println("Testing\btext");    // \b is Backspace
            System.out.println("Testing \b text");
            System.out.println("Testing  text");
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");
    }

    public static void entryPoint(String[] args) {

        System.out.println("Method: entryPoint()");
    }

    public static void entryPoint2(String[] args) {

        System.out.println("Method: entryPoint2()");
    }
}
