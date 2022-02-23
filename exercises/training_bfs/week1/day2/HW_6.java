package exercises.training_bfs.week1.day2;

public class HW_6 {

    int findSingleOccurrence(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // XOR is associative and commutative
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

        HW_6 hw6 = new HW_6();

        int[] nums = { 4, 9, 1, 7, 2, 4, 1, 9, 2 };     // 7
        System.out.println(hw6.findSingleOccurrence(nums));
    }
}
