public class powerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        
        while (n % 4 == 0) n /= 4;
        return n == 1;
    }
    
    public static void main(String[] args) {
        powerOfFour obj = new powerOfFour();

        // Test cases
        int[] testCases = {1, 4, 16, 64, 256, 1024, 5, 0, -4, 218};

        for (int n : testCases) {
            System.out.println("Is " + n + " a power of four? " + obj.isPowerOfFour(n));
        }
    }
}
