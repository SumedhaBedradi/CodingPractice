public class leftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array:");
        printArray(arr);

        leftRotateByOne(arr);

        System.out.println("Array after left rotation by one:");
        printArray(arr);
    }

    // Function to left rotate array by one
    public static void leftRotateByOne(int[] arr) {
        if (arr.length == 0)
            return;

        int first = arr[0]; // Store first element

        // Shift elements one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Put the first element at the end
        arr[arr.length - 1] = first;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
