package trainings.bfs.week1.day2.hw;

import java.util.Stack;

public class HW_1b {

    int mathCalculator(int[] numbers, String[] operators) {

        Stack<Object> stack = new Stack<>();

        stack.push((double)numbers[0]);

        for (int i = 0; i < operators.length; i++) {
            if (operators[i].equals("Mul") || operators[i].equals("Div")) {
                if (operators[i].equals("Mul")) {
                    stack.push(((double) stack.pop()) * numbers[i + 1]);
                } else if (operators[i].equals("Div")) {
                    stack.push(((double) stack.pop()) / numbers[i + 1]);
                }
            } else {
                stack.push(operators[i]);
                stack.push((double)numbers[i + 1]);
            }
        }

        double result = (double) stack.pop();

        while (stack.size() != 0) {
            String op = (String) stack.pop();
            if (op.equals("Add")) {
                result = ((double) stack.pop()) + result;
            } else if (op.equals("Sub")) {
                result = ((double) stack.pop()) - result;
            }
        }

        return (int) result;
    }

    public static void main(String[] args) {

        HW_1b hw1 = new HW_1b();

        int[] numbers1 = {5, 6, 14, 7};         // 5 + 6 - 2 = 9
        String[] operators1 = {"Add", "Sub", "Div"};
        System.out.println(hw1.mathCalculator(numbers1, operators1));

        int[] numbers2 = {5, 6, 2, 14, 3};      // 5 + 12 - 4.66 = 12
        String[] operators2 = {"Add", "Mul", "Sub", "Div"};
        System.out.println(hw1.mathCalculator(numbers2, operators2));
    }
}
