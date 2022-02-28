package trainings.bfs.week2.day1.mock.q3;

import java.util.Arrays;

public class Question3 {

    // Input:
    //         [[9,     7,      4,      5],
    //         [1,      6,      2,      -6],
    //         [12,     20,     2,      0],
    //         [-5,     -6,     7,      -2]]
    // Output: [26, 30]
    // Explanation:
    // We have two border here:
    //         [9,7,4,5,-6,0,-2,7,-6,-5,12,1] as the first border, the sum of this border is 26
    //         [6,2,2,20] as the second border, the sum of this border is 30
    // Thus, the result is [26, 30]

    public int[] q3(int[][] matrix) {

        // Time complexity  = O(n)
        // Space complexity = O(n)

        int len = matrix[0].length;
        int numberOfResults = len / 2;
        int[] result = new int[numberOfResults];

        for (int i = 0; i < numberOfResults; i++) {
            for (int j = i; j < len - i; j++) {
                result[i] += matrix[i][j];
                result[i] += matrix[len - 1 - i][j];
            }
            for (int k = i + 1; k < len - i - 1; k++) {
                result[i] += matrix[k][i];
                result[i] += matrix[k][len - 1 - i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();

        int input[][] = {
                {9, 7, 4, 5},
                {1, 6, 2, -6},
                {12, 20, 2, 0},
                {-5, -6, 7, -2}};

        int[] result = question3.q3(input);
        System.out.println(Arrays.toString(result));

        // Input:
        //         [[9,     7,      4,      5,      12,     -2],
        //         [1,      6,      2,      -6,     -6,     9],
        //         [-11,    16,     4,      17,     -2,     8],
        //         [12,     20,     2,      0,      4,      11],
        //         [-2,     10,     21,     -9,     14,     1],
        //         [-5,     -6,     7,      -2,     -7,     -1]]
        // Output: [50, 70, 23]

        int input2[][] = {
                {9, 7, 4, 5, 12, -2},
                {1, 6, 2, -6, -6, 9},
                {-11, 16, 4, 17, -2, 8},
                {12, 20, 2, 0, 4, 11},
                {-2, 10, 21, -9, 14, 1},
                {-5, -6, 7, -2, -7, -1}};

        int[] result2 = question3.q3(input2);
        System.out.println(Arrays.toString(result2));
    }
}
