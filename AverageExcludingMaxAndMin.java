import java.util.*;
import java.io.*;

public class AverageExcludingMaxAndMin {
     public static void main(String[] args) {
        // Declare and initialize an array of integers.
        int[] array_nums = {5, 7, 2, 4, 9};

        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Initialize variables for maximum, minimum, and sum.
        int max = array_nums[0];
        int min = array_nums[0];
        float sum = array_nums[0];

        // Use a loop to find the maximum, minimum, and calculate the sum of the array elements.
        for (int i = 1; i < array_nums.length; i++) {
            sum += array_nums[i];
            if (array_nums[i] > max)
                max = array_nums[i];
            else if (array_nums[i] < min)
                min = array_nums[i];
        }

        // Calculate the average value of the array except for the largest and smallest values.
        float x = ((sum - max - min) / (array_nums.length - 2));

        // Print the calculated average value with two decimal places.
        System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %.2f", x);

        // Print a new line.
        System.out.println();
    }
}
