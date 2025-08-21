public class PowerOfTwo {

    // Method to check if a number is a power of two
    public boolean isPowerOfTwo(int n) {
        long num = 1;
        while (num < n) {
            num = num * 2;
        }
        return num == n;
    }

    // Main method for testing
    public static void main(String[] args) {
        PowerOfTwo checker = new PowerOfTwo();

        int[] testNumbers = {1, 2, 3, 4, 16, 18, 32, 64, 100};

        for (int n : testNumbers) {
            boolean result = checker.isPowerOfTwo(n);
            System.out.println(n + " is power of two? " + result);
        }
    }
}
// Output:
// 1 is power of two? true