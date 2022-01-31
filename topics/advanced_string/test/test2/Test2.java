package topics.advanced_string.test.test2;

import java.util.Arrays;
import java.util.Objects;

public class Test2 {

    public String[] countOccurrence(String[] input) {

        String outLetter = "";
        int count = 0;
        int outIndex = -1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == null || input[i].equals(" ") || input[i].length() != 1) {
                //continue;
            } else {
                if (input[i].equals(outLetter)) {
                    count++;
                } else {
                    outIndex++;
                    outLetter = input[i];
                    count = 1;
                }

                input[outIndex] = outLetter + count;
            }
        }

        outIndex++;
        //input[outIndex] = "\0";
        for (int i = outIndex; i < input.length; i++) {
            input[i] = null;
        }

        return input;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        // [w2, c3, w1, a1, w2, a1, b2, a1, w2, a1]
        String[] input = {" ", "w", "w", null, "going", "c", "c", "c", "", "w", "a", "w", "w", "a", "b", "b", "a", "w", "w", "a", null};
        String[] output = test2.countOccurrence(input);
        System.out.println(Arrays.toString(output));
    }
}
