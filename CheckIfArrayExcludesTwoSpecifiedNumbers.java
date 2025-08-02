import java.util.*;
public class CheckIfArrayExcludesTwoSpecifiedNumbers {
    public static void main(String[] args) {
        // Declare and initialize an array of integers.
        int[] array_nums = {50, 77, 12, 54, -11};

        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Call the test method with the array as an argument and print the result.
        System.out.println("Result: " + test(array_nums));
    }

    // Define a method named test that takes an array of integers as input.
    public static boolean test(int[] numbers) {
        // Use an enhanced for loop to iterate through the array elements.
        for (int number : numbers) {
            // Check if the current number is 0 or -1.
            if (number == 0 || number == -1) {
                // If any number is 0 or -1, return false.
                return false;
            }
        }
        // If no number is 0 or -1, return true.
        return true;
    }
}
