package trainings.bfs.week6.day1.mock.q2;

public class Question2 {

    public int q2(int[] arr, int num1, int num2) {
        int index1 = -1;
        int index2 = -1;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == num2 && i != j) {
                        int diffTmp = Math.abs(i - j);
                        if (diffTmp < diff) {
                            index1 = i;
                            index2 = j;
                            diff = diffTmp;
                        }
                    }
                }
            }
        }
        return diff;
    }


    public static void main(String[] args) {

        Question2 question2 = new Question2();

        int[] arr = {2, 9, 4, 3, 5, 6, 2, 5, 9, 4};
        int num1 = 2;
        int num2 = 4;
        System.out.println(question2.q2(arr, num1, num2));

        int[] arr_2 = {2, 9, 4, 3, 6, 4, 4, 2, 5};
        int num1_2 = 4;
        int num2_2 = 4;
        System.out.println(question2.q2(arr_2, num1_2, num2_2));

        int[] arr_3 = {2, 9, 4, 3, 8, 6, 4, 9, 3, 5};
        int num1_3 = 9;
        int num2_3 = 3;
        System.out.println(question2.q2(arr_3, num1_3, num2_3));

    }
}
