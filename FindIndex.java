public class FindIndex {

    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index of first occurrence
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int target = 30;
        int index = findIndex(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
