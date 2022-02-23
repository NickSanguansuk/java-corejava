package exercises.training_bfs.week1.day2;

public class HW_5 {

    void countOccurrenceOfMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        int index = 0;
        while (nums[index] != 0) {
            int num = nums[index];
            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }

            index++;
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }

    public static void main(String[] args) {

        HW_5 hw5 = new HW_5();

        int[] nums = { 3, 5, 2, 5, 5, 5, 0};
        hw5.countOccurrenceOfMax(nums);
    }
}
