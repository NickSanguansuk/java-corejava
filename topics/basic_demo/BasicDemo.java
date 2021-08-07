package topics.basic_demo;

public class BasicDemo {
    // Core Java - Introduction to Java Basics
    // Core Java - Java Programming Fundamentals

    public static void main(String[] args) {

        System.out.println("----------");

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

        System.out.println("----------");
    }
}
