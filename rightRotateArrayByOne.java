public class rightRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Right rotate by one
        rightRotateByOne(arr);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rightRotateByOne(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;

        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
}
