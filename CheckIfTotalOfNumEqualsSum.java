import java.util.*;
public class CheckIfTotalOfNumEqualsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0;i <= arr.length-1;i++) {
            arr[i] = sc.nextInt();
        }

        int search_num = sc.nextInt();
        int fixed_sum = sc.nextInt();

        System.out.println("Result: " + result(arr, search_num, fixed_sum));
    }	

    // Define a method named result that takes an array of integers, a search number, and a fixed sum as inputs.
    public static boolean result(int[] numbers, int search_num, int fixed_sum) {
        // Initialize a temporary sum.
        int temp_sum = 0;

        // Use an enhanced for loop to iterate through the array elements.
        for (int number : numbers) {
            // Check if the current number is equal to the search number.
            if (number == search_num) {
                // Add the search number to the temporary sum.
                temp_sum += search_num;
            }

            // Check if the temporary sum exceeds the fixed sum.
            if (temp_sum > fixed_sum) {
                // If the sum exceeds the fixed sum, exit the loop.
                break;
            }
        }

        // Check if the temporary sum is equal to the fixed sum and return the result.
        return temp_sum == fixed_sum;
    }
}
