package topics.basic_demo.test.test4;

import java.time.LocalTime;

public class Test4 {

    static int num1 = getValue();
    static int num2 = 10;

    static int getValue() {
        return num2;
    }

    public static void main(String[] args) {

        System.out.println(String.format("Local time: %tH:%tM:%tS", LocalTime.now(), LocalTime.now(), LocalTime.now()));
    }
}
