package exercises.training_bfs.week1.day2;

public class Demo01 {

    public static void main(String[] args) {

        System.out.println("---------- ---------- ---------- ---------- ----------");
        {
            // Two types of variables in Java
            int simpleVariable = 1;
            //Sample objectVariable = new Sample();
        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
        {
            // Conversion and Casting
            // Conversion
            int integerVal = 6;
            double doubleIntegerVal = integerVal;
            System.out.println(integerVal);
            System.out.println(doubleIntegerVal);
            System.out.println("---");

            // Casting
            double doubleVal = 7.7;
            int integerDoubleVal = (int) doubleVal;
            System.out.println(doubleVal);
            System.out.println(doubleIntegerVal);
            System.out.println("---");

            int k1 = (int) 2147483648.0;
            int k2 = (int) 10000000000.0;
            System.out.println(k1);
            System.out.println(k2);
            System.out.println("---");

            char c1 = (char) 75;
            char c2 = (char) 74;
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("---");

            // Casting
            System.out.println((int) 5.0 / 2.0);
            System.out.println((int) (5.0 / 2.0));
            System.out.println("---");

            char varC = 14;
            //short varS1 = varC;
            short varS1 = (short) varC;
            long varL = varC;

            byte varB = 14;
            short varS2 = varB;

            System.out.println(varC);
            System.out.println(varS1);
            System.out.println(varL);
            System.out.println(varB);
            System.out.println(varS2);

        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
        {
            // Pre & Post, Increment & Decrement
            int x = 5;
            int y = x++ + 5;
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
        {
            // String Constant Pool
            String strA = "1";
            String strB = strA + "2";
            //String strB = strA.concat("2");
            String strC = "12";
            String strD = "1" + "2";

            final String strAA = "1";
            String strBB = strAA + "2";

            System.out.println(strB.equals("12"));
            System.out.println(strB == "12");
            System.out.println(strB.intern() == "12");
            System.out.println(strB == strC);
            System.out.println(strB == strD);
            System.out.println("---");
            System.out.println(strBB.equals("12"));
            System.out.println(strBB == "12");
            System.out.println(strBB.intern() == "12");
            System.out.println(strBB == strC);
            System.out.println(strBB == strD);
            System.out.println("---");
            System.out.println(strA == strAA);
            System.out.println(strC == strD);
        }
        System.out.println("---------- ---------- ---------- ---------- ----------");
        {
            // Main method argument ---> main(String[] args)
            if (args == null) {
                System.out.println("args is null");
            }
            System.out.println(args.length);
            //System.out.println(args[0]);
        }
        System.out.println("---------- ---------- ---------- ---------- ----------");

    }
}
