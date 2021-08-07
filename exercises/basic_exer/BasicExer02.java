package exercises.basic_exer;

public class BasicExer02 {
    // Core Java - Exercises - Operators and Numbers

    public static void main(String[] args) {

        {
            System.out.println("Problem 1: ");
            // Write the following integers in binary notation.
            // Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept.
            // However, you may check your answers using Java methods.

            //int dec = 10;           // no prefix   --> decimal literal
            //int bin = 0b10;         // '0b' prefix --> binary literal
            //int oct = 010;          // '0' prefix  --> octal literal
            //int hex = 0x10;         // '0x' prefix --> hexadecimal literal
            //System.out.println(dec);
            //System.out.println(bin);
            //System.out.println(oct);
            //System.out.println(hex);

            // Binary
            // 32768    16384   8192    4096
            // 2048     1024    512     256
            // 128      64      32      16
            // 8        4       2       1

            //  1
            int a = 0b01;
            System.out.println(a);

            //  8
            int b = 0b1000;
            System.out.println(b);

            //  33
            int c = 0b00100001;
            System.out.println(c);

            //  78
            int d = 0b01001110;
            System.out.println(d);

            //  787
            int e = 0b001100010011;
            System.out.println(e);

            //  33,987
            int f = 0b1000010011000011;
            System.out.println(f);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 2: ");
            // Convert the following binary numbers to decimal notation.
            // Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept.
            // However, you may check your answers using Java methods.

            //0010
            int a = 2;
            System.out.println(Integer.toBinaryString(a));

            //1001
            int b = 9;
            System.out.println(Integer.toBinaryString(b));

            //0011 0100
            int c = 52;
            System.out.println(Integer.toBinaryString(c));

            //0111 0010
            int d = 114;
            System.out.println(Integer.toBinaryString(d));

            //0010 0001 1111
            int e = 543;
            System.out.println(Integer.toBinaryString(e));

            //0010 1100 0110 0111
            int f = 11367;
            System.out.println(Integer.toBinaryString(f));
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 3: ");
            // Write a program that declares an integer a variable x and assigns the value 2 to it
            // and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
            // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
            // Before printing the results, write a comment with the predicted decimal value and binary string.
            // Now, print out x in decimal form and in binary notation.
            //Do the preceding exercise with the following values:

            //  2
            int x = 2;      // 0b0010
            System.out.println(x);
            System.out.println(Integer.toBinaryString(x));
            x = x << 1;     // 0b0100 ---> 4
            System.out.println(Integer.toBinaryString(x));
            System.out.println(x);
            System.out.println("----------");

            //  9
            int y = 9;      // 0b1001
            System.out.println(y);
            System.out.println(Integer.toBinaryString(y));
            y = y << 1;     // 0b00010010 ---> 18
            System.out.println(Integer.toBinaryString(y));
            System.out.println(y);
            System.out.println("----------");

            //  17
            int z = 17;      // 0b00010001
            System.out.println(z);
            System.out.println(Integer.toBinaryString(z));
            z = z << 1;     // 0b00100010 ---> 34
            System.out.println(Integer.toBinaryString(z));
            System.out.println(z);
            System.out.println("----------");

            //  88
            int w = 88;      // 0b01011000
            System.out.println(w);
            System.out.println(Integer.toBinaryString(w));
            w = w << 1;     // 0b10110000 ---> 176
            System.out.println(Integer.toBinaryString(w));
            System.out.println(w);
            System.out.println("----------");
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 4: ");
            // Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number.
            // Now use the right shift operator (>>) to shift by 2 and assign the result to x.
            // Write a comment indicating what you anticipate the decimal and binary values to be.
            // Now print the value of x and the binary string.
            //Do the preceding exercise with the following values:

            //  150
            int x = 150;    // 0b10010110
            System.out.println(x);
            System.out.println(Integer.toBinaryString(x));
            x = x >> 2;     // 0b00100101 ---> 37
            System.out.println(Integer.toBinaryString(x));
            System.out.println(x);
            System.out.println("----------");

            //  225
            int y = 225;    // 0b11100001
            System.out.println(y);
            System.out.println(Integer.toBinaryString(y));
            y = y >> 2;     // 0b00111000 ---> 56
            System.out.println(Integer.toBinaryString(y));
            System.out.println(y);
            System.out.println("----------");

            //  1555
            int z = 1555;    // 0b 0110 0001 0011
            System.out.println(z);
            System.out.println(Integer.toBinaryString(z));
            z = z >> 2;     // 0b 0001 1000 0100 ---> 388
            System.out.println(Integer.toBinaryString(z));
            System.out.println(z);
            System.out.println("----------");

            //  32456
            int w = 32456;    // 0b 0111 1110 1100 1000
            System.out.println(w);
            System.out.println(Integer.toBinaryString(w));
            w = w >> 2;     // 0b 0001 1111 1011 0010 ---> 8114
            System.out.println(Integer.toBinaryString(w));
            System.out.println(w);
            System.out.println("----------");
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 5: ");
            // Write a program that declares 3 int variables x, y, and z.
            // Assign 7 to x and 17 to y.
            // Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
            // Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
            // Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y.
            // As before, write a comment that indicates what you predict the values to be before printing them out.

            int x = 7;          // 0b 0000 0111
            int y = 17;         // 0b 0001 0001
            int z = x & y;      // 0b 0000 0001 ---> 1
            System.out.println(Integer.toBinaryString(z));
            System.out.println(z);
            System.out.println("----------");

            int z2 = x | y;      // 0b 0001 0111 ---> 23
            System.out.println(Integer.toBinaryString(z2));
            System.out.println(z2);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 6: ");
            // Write a program that declares an integer variable, assigns a number,
            // and uses a postfix increment operator to increase the value.
            // Print the value before and after the increment operator.

            int a = 5;
            System.out.println(a);
            System.out.println(a++);
            System.out.println(a);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 7: ");
            // Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
            // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.

            int a = 5;
            System.out.println(a);
            a++;
            System.out.println(a);
            ++a;
            System.out.println(a);
            a += 1;
            System.out.println(a);
            a = a + 1;
            System.out.println(a);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");

        {
            System.out.println("Problem 8: ");
            // Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
            // Create another variable sum and assign the value of ++x added to y and print the result.
            // Notice the value of the sum (should be 14).
            // Now change the increment operator to postfix (x++) and re-run the program.
            // Notice what the value of sum is 13.
            // The first configuration incremented x and then calculated the sum while the second configuration calculated the sum and then incremented x.

            int x = 5;
            int y = 8;
            int sum = ++x + y; // 14
            System.out.println(sum);

            System.out.println("----------");

            int a = 5;
            int b = 8;
            int sum2 = a++ + b; // 13
            System.out.println(sum2);
        }

        System.out.println("---------- ---------- ---------- ---------- ----------");
    }
}
