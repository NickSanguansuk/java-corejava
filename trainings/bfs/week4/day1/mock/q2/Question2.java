package trainings.bfs.week4.day1.mock.q2;

public class Question2 {

    public int q2(int[] arr) {

        int indexRemove = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i];
            int xNext = arr[i + 1];
            if (x < xNext) {
                continue;
            } else {
                if (indexRemove == -1) {
                    indexRemove = i;
                    if (i > 0) {
                        if (arr[i-1] >= arr[i+1]) {
                            return -1;
                        }
                    }
                } else {
                    return -1;
                }
            }
        }

        return indexRemove;
    }

    public static void main(String[] args) {

        Question2 question2 = new Question2();

        int[] arr = {2, 3, 6, 4, 5, 9};
        System.out.println(question2.q2(arr));

        int[] arr2 = {1, 999, 998, 997};
        System.out.println(question2.q2(arr2));

        int[] arr3 = {2, 2, 2};
        System.out.println(question2.q2(arr3));

        int[] arr4 = {2, 2};
        System.out.println(question2.q2(arr4));

        int[] arr5 = {5, 2};
        System.out.println(question2.q2(arr5));

    }
}
