package topics.basic_demo.math_string;

public class MathStringDemo {
    // Core Java - Math, Character, String

    public static void main(String[] args) {

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
            System.out.println("Arithmetic operation is Left ---> Right");

            System.out.println(25 + 12.5 + "Nick");
            System.out.println("Nick" + 25 + 12.5);

            System.out.println("Assignment operation is Right ---> Left");
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
            System.out.println("Unicode");

            // Hex      0x0041
            // Decimal  65
            // Octal    0101
            // char     'A'
            char c1 = '\u0041'; // Unicode uses hexadecimal digits
            System.out.println(c1);
            int i1 = '\u0041';
            System.out.println(i1);

            System.out.println("----------");

            char a = 0101; // 0101 (Octal) == 65 (Decimal)
            char nine = 57;
            char plus = 0x2b; // 0x2b (Hex) = 43 (Decimal)
            char tilde = 126;

            System.out.println(a);
            System.out.println(nine);
            System.out.println(plus);
            System.out.println(tilde);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            // Character data type
            System.out.println("Character data type");

            char letter = 'A';      // ASCII
            char num_char = '4';    // ASCII
            System.out.println(letter);
            System.out.println(num_char);

            letter = '\u0041';      // Unicode
            num_char = '\u0034';    // Unicode
            System.out.println(letter);
            System.out.println(num_char);

            System.out.println("----------");

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
            System.out.println("Creating Strings");

            String s1 = "Welcome to Java";
            String s2 = new String("Welcome to Java"); // creates two objects and one reference variable
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
            System.out.println("printf");

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

            System.out.println("----------");

            double d = 85.5;

            System.out.println(Math.ceil(d));
            System.out.println(Math.floor(d));
            System.out.println(Math.rint(d));
            System.out.println(Math.round(d));

            System.out.println("----------");

            double rad = Math.toRadians(180);
            System.out.println(rad); // 3.14159265

            System.out.println("sin():" + Math.sin(rad));   // 0
            System.out.println("cos():" + Math.cos(rad));   // -1
            System.out.println("tan():" + Math.tan(rad));   // 0

            System.out.println("----------");

            double sin = Math.sin(rad);
            System.out.println(sin);
            System.out.println(Math.rint(sin));

            System.out.println("----------");

            System.out.println("sin(30 degree) == 0.5");
            // 180 / 6 == 30
            System.out.println(Math.sin(Math.PI / 6)); // 0.5
            System.out.println(Math.sin(Math.toRadians(30)));
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
}
