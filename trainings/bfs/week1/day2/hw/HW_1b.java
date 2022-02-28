package trainings.bfs.week1.day2.hw;

import java.util.Stack;

public class HW_1b {

    int mathCalculator(int[] numbers, String[] operators) {

        Stack<Double> numsStack = new Stack<>();
        Stack<String> opsStack = new Stack<>();

        numsStack.push((double) numbers[0]);

        for (int i = 0; i < operators.length; i++) {
            if (operators[i].equals("Mul") || operators[i].equals("Div")) {
                if (operators[i].equals("Mul")) {
                    numsStack.push(numsStack.pop() * numbers[i + 1]);
                } else if (operators[i].equals("Div")) {
                    numsStack.push(numsStack.pop() / numbers[i + 1]);
                }
            } else {
                numsStack.push((double) numbers[i + 1]);
                opsStack.push(operators[i]);
            }
        }

        Double result = numsStack.pop();

        while (numsStack.size() != 0) {
            String op = opsStack.pop();
            if (op.equals("Add")) {
                result = numsStack.pop() + result;
            } else if (op.equals("Sub")) {
                result = numsStack.pop() - result;
            }
        }

        return (int) ((double) result);
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
