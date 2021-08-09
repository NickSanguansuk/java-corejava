package topics.basic_demo;

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

            int intCon = shortVar;
            System.out.println(intCon);

            float floatCon = shortVar;
            System.out.println(floatCon);

            float floatCon2 = longVar;
            System.out.println(floatCon2);

            System.out.println("Casting: Narrowing or Explicit Type Conversion");

            byte byteCon = (byte) doubleVar;
            System.out.println(byteCon);

            int intNum = 97;
            char charCon = (char) intNum;
            System.out.println(charCon);
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
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            int i1 = '\u0041';            // 'A', 65
            System.out.println(i1);
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
            //

            int i = 2;
            int j = 5;
            int min = ((i < j) ? i : j);
            System.out.println(min);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // \n, \t, \', \", \\, \b,

            System.out.println("Testing\btext");    // \b is Backspace
            System.out.println("Testing \b text");
            System.out.println("Testing  text");
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // A class is a blueprint for an object (basic building block).

            // In Java, when we create a class, that class inherits from Object class.

            // A wrapper class is a class whose object wraps or contains primitive data types.
            // When we create an object to wrapper class, it contains a field and in the field we can store primitive data types.
            // In other words, we can wrap a primitive value into wrapper class object.
            // Wrapper are also called non-primitive data type.

            // Autoboxing is: primitive value is automatically converted to its matching wrapper class object.
            // Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as auto boxing.

            // Unboxing is: the reverse process of autoboxing.

            byte b = 100;
            Byte bb = 100;

            short s = 100;
            Short ss = 100;

            int i = 100;
            Integer ii = 100;
            //Integer iii = new Integer(100);

            long l = 100L;
            Long ll = 100L;

            float f = 100.0f;
            Float ff = 100.0f;

            double d = 100.0;
            Double dd = 100.0;

            char c = 'a';
            Character cc = 'a';

            boolean bo = true;
            Boolean bobo = true;

            String stst = "This is String";
            String ststNew = new String("This is String");

            System.out.println("----------");

            int result1 = ii.compareTo(100);
            System.out.println(result1);

            //boolean result2 = ii.equals(iii);
            //System.out.println(result2);

            // Autoboxing (Conversion of int into Integer)
            Integer iWrapper = i;                       // autoboxing
            //Integer iWrapper2 = new Integer(i);         // bad
            Integer iWrapper3 = Integer.valueOf(i);     // explicit

            //Integer num = new Integer(null); // run-time error

            // Unboxing
            int inti = iWrapper;                        // unboxing
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // Convert String into Wrapper
            String str = "200";

            int intStr = Integer.parseInt(str); // Convert String into primitive data type.
            System.out.println(intStr);

            Integer integerStr = Integer.valueOf(str); // Convert String into wrapper
            System.out.println(integerStr);

            // Convert Wrapper into String
            String integerToStr = integerStr.toString();
            System.out.println(integerStr);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // Character data type

            char cL = 'a';
            char cU = 'A';

            Character cwL = cL;
            Character cwU = cU;

            char c1 = 97;           // decimal      97
            char c2 = 0x61;         // hex          61
            char c3 = 00141;        // octal        141
            char c4 = 'a';          // char         'a'

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);

            System.out.println("----------");

            char bCheck = '2';

            boolean result1 = Character.isLetter(bCheck);
            System.out.println(result1);

            boolean result2 = Character.isDigit(bCheck);
            System.out.println(result2);

            System.out.println("----------");

            System.out.println(cL);
            System.out.println(cwL);
            System.out.println(cwL.toString());
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // Creating Strings

            String s1 = "Welcome to Java";
            String s2 = new String("Welcome to Java");
            String s3 = new String();

            // String is immutable

            String s4 = s1.replace("Java", "Python");

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);     // null
            System.out.println(s4);

            s1 = "Welcome to C++";      // length = 14
            System.out.println(s1);

            System.out.println("----------");

            int lenStr = s1.length();
            System.out.println(lenStr);

            String concatStr1 = s1.concat(s2);
            String concatStr2 = s1 + s2;

            System.out.println(concatStr1);
            System.out.println(concatStr2);

            System.out.println(s1 + '\t' + s2);

            System.out.println("----------");

            char c1 = s1.charAt(0);
            System.out.println(c1);
            char c2 = s1.charAt(5);
            System.out.println(c2);

            System.out.println("----------");

            String sUpper = s1.toUpperCase();
            String sLower = s1.toLowerCase();

            System.out.println(s1);
            System.out.println(sUpper);
            System.out.println(sLower);

            System.out.println("----------");

            String sTmp = "Welcome to C++";

            int compareStr1 = s1.compareTo(sUpper);
            System.out.println(compareStr1); // return 32 because s1 is greater.
            int compareStr2 = s1.compareTo(sLower);
            System.out.println(compareStr2); // return -32 because s1 is less.
            int compareStr3 = s1.compareTo(sTmp);
            System.out.println(compareStr3); // return 0 because s1 and sTmp is equal.

            System.out.println(s1.equals(sTmp));
            System.out.println(s1 == sTmp);

            System.out.println("----------");

            System.out.println(s1.substring(5, 12)); // return index 5-11
            System.out.println(s1.indexOf('C')); // return 11

            System.out.println(s1.indexOf('e'));
            System.out.println(s1.lastIndexOf('e'));

            System.out.println("----------");

            String strNumber = "99";
            int int99 = Integer.parseInt(strNumber);
            System.out.println(int99);

            double double99 = Double.parseDouble(strNumber);
            System.out.println(double99);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // printf

            int i = 1024;
            byte b = 12;
            double d = 126.36;
            boolean bo = true;
            String str = "Hello Java";

            System.out.printf("String: %s, int: %d, byte: %d, double: %f, boolean: %b \n", str, i, b, d, bo);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            //Scanner scanner = new Scanner(System.in);
            //
            //System.out.print("Enter your name: ");
            //String input = scanner.nextLine();
            //
            //System.out.format("This is the output: %s \n", input);
            //System.out.printf("This is the output: %s \n", input);
            //System.out.println("This is the output: " + input);
            //
            //System.out.print("Enter your age: ");
            //int age = scanner.nextInt();
            //System.out.printf("Your age is: %d \n", age);
            //
            //System.out.print("Enter your salary: ");
            //double salary = scanner.nextDouble();
            //System.out.printf("Your salary is: %f \n", salary);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            int x = 10;
            int y = 4;

            System.out.println(Math.max(x, y));

            System.out.println(Math.sqrt(y));

            double pow = Math.pow(2, 3);
            System.out.println(pow);

            System.out.println(Math.abs(-8));
            System.out.println(Math.abs(-8.76));

            double d = 85.5;

            System.out.println(Math.ceil(d));
            System.out.println(Math.floor(d));
            System.out.println(Math.rint(d));
            System.out.println(Math.round(d));

            double rad = Math.toRadians(180);
            System.out.println(rad);

            System.out.println("sin():" + Math.sin(rad));
            System.out.println("cos():" + Math.cos(rad));
            System.out.println("tan():" + Math.tan(rad));
            double sin = Math.sin(rad);
            System.out.println( Math.rint(sin));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // e = 2.71828183
            double e = 2.71828183;

            System.out.println(Math.exp(0));    // 1
            System.out.println(Math.exp(1));    // e
            System.out.println(Math.exp(10));
            System.out.println();

            System.out.println("log(-1): " + Math.log(-1));     // Nan
            System.out.println("log(0): " + Math.log(0));       // -Infinity
            System.out.println("log(1): " + Math.log(1));       // 0.0
            System.out.println("log(2): " + Math.log(2));
            System.out.println("log(2.71828183): " + Math.log(e));  // 1.0
            System.out.println();

            System.out.println("log10(-1): " + Math.log10(-1));     // Nan
            System.out.println("log10(0): " + Math.log10(0));       // -Infinity
            System.out.println("log10(1): " + Math.log10(1));       // 0.0
            System.out.println("log10(2): " + Math.log10(2));
            System.out.println("log10(10): " + Math.log10(10));     // 1.0
            System.out.println("log10(100): " + Math.log10(100));   // 2.0
            System.out.println();

            // log2(N) = log10(N) / log10(2)
            // log2(8)
            System.out.println("log2(8): " + (Math.log10(8) / Math.log10(2)));      // 3

        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // Math.random()
            // 0.0 <= Math.random < 1.0

            double random = Math.random();
            System.out.println(random);

            // Generate random number between 0 - 59;
            double random0to59 = (int)(random * 60);
            System.out.println(random0to59);

            // Generate random number between 60 - 99;
            int random60to99 = (int)(Math.random() * 40) + 60;
            System.out.println("Random integer 60 - 99: " + random60to99);
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
