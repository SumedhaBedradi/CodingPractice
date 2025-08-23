class powerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        powerOfThree sol = new powerOfThree(); 

        // Test cases
        int[] testNumbers = {27, 9, 3, 1, 0, -3, 45};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " a power of three? " + sol.isPowerOfThree(num));
        }
    }
}