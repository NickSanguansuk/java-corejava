package topics.basic_demo.test.test7_bfs;

public class Question2 {

    String revereTheString(String input) {

        if (input.length() < 2) {
            return input;
        }

        int halfLen = input.length() / 2;

        return revereTheString(input.substring(halfLen, input.length())) + revereTheString(input.substring(0, halfLen));
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        String input = "abcdefgabc";
        System.out.println(q2.revereTheString(input));
    }
}
