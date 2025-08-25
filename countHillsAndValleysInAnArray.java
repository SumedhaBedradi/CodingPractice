import java.util.Scanner;
public class countHillsAndValleysInAnArray {
    public int countHillValley(int[] nums) {
        int cnt = 0;
        int j = 0;
        int n = nums.length;
        for (int i = 1; i < n - 1; i++) {
            if ((nums[j] < nums[i] && nums[i] > nums[i + 1]) ||
                (nums[j] > nums[i] && nums[i] < nums[i + 1])) {
                cnt++;
                j = i;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        countHillsAndValleysInAnArray solution = new countHillsAndValleysInAnArray();
        int[] nums = {2, 4, 1, 1, 6, 5};
        int result = solution.countHillValley(nums);
        System.out.println("Number of hills and valleys: " + result); // Output: 3
    }
}

