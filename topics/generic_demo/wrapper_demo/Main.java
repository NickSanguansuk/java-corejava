package topics.generic_demo.wrapper_demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Wrapper<Integer> iW = new Wrapper<>(25);
        Wrapper<Double> dW = new Wrapper<>(12.5);
        Wrapper<String> strW = new Wrapper<>("Java");
        Wrapper<Scanner> scanW = new Wrapper<>(new Scanner(System.in));

        System.out.println(iW);
        System.out.println(dW);
        System.out.println(strW);
        System.out.println(scanW);

        System.out.println("----------");

        System.out.println(iW.getValue() + dW.getValue());

        // Arithmetic operation is Left ---> Right
        // Assignment operation is Right ---> Left
        System.out.println(iW.getValue() + dW.getValue() + strW.getValue());
        System.out.println(strW.getValue() + iW.getValue() + dW.getValue());

    }
}
