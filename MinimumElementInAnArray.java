public class MinimumElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, -2, 7};
        int minElement = findMinimum(arr);
        System.out.println("The minimum element in the array is: " + minElement);
    }
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
