public class MaximumSubArrayUsingBruteForce {
    public static void main(String[] args) {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Call the method
        int maxSum = maxSubArrayBrute(nums);

        // Print the result
        System.out.println("Maximum Subarray Sum (Brute Force): " + maxSum);
    }

    public static int maxSubArrayBrute(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
