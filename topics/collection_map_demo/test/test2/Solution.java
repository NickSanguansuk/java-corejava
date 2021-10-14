package topics.collection_map_demo.test.test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Solution {

    static void superStack(String[] operations) {

        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < operations.length; i++) {
            //System.out.println(stack);
            //System.out.println(operations[i]);

            String[] currOperation = operations[i].split(" ");

            if (currOperation[0].equals("push")) {
                stack.push(Integer.parseInt(currOperation[1]));
            } else if (currOperation[0].equals("pop")) {
                stack.pop();
            } else if (currOperation[0].equals("inc")) {
                int count = Integer.parseInt(currOperation[1]);
                Integer value = Integer.parseInt(currOperation[2]);
                for (int j = 0; j < count; j++) {
                    int index = stack.size() - j - 1;
                    stack.set(index, stack.get(index) + value);
                }
            }

            if (stack.size() == 0) {
                System.out.println("EMPTY");
            } else {
                System.out.println(stack.getFirst());
            }

        }
    }

    public static void main(String[] args) {

        //String[] operations = {"push 4", "push 5", "inc 2 1", "pop", "pop"};
        String[] operations = {"push 4", "pop", "push 3", "push 5", "push 2", "inc 3 1", "pop", "push 1", "inc 2 2", "push 4", "pop", "pop"};
        superStack(operations);

    }
}
