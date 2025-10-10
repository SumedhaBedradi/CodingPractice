public class TrappingRainWaterusingBruteForce {

    public static int trapBrute(int[] height) {
        int n = height.length, water = 0;

        for (int i = 0; i < n; i++) {
            int leftMax = 0, rightMax = 0;

            // Find the maximum height to the left of current bar
            for (int j = i; j >= 0; j--)
                leftMax = Math.max(leftMax, height[j]);

            // Find the maximum height to the right of current bar
            for (int j = i; j < n; j++)
                rightMax = Math.max(rightMax, height[j]);

            // Water above the current bar is min(leftMax, rightMax) - height[i]
            water += Math.min(leftMax, rightMax) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int trappedWater = trapBrute(height);
        System.out.println("Total trapped rain water: " + trappedWater);
    }
}
