package topics.basic_demo.test.test7_bfs;

public class Question1 {

    String revereTheString(String input) {

        if (input.length() < 2) {
            return input;
        }

        String output = "";
        int len = input.length();

        for (int i = 0; i < len; i++) {
            output += input.charAt(len - 1 - i);
        }

        return output;
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        String input = "abcdefgabc";
        System.out.println(q1.revereTheString(input));
    }
}
