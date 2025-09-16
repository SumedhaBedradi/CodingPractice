
import java.util.Scanner;

public class FirstPeakElementInAnArray {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of an array: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstPeakElement(arr));
    }

    public static int firstPeakElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            boolean left = (i == 0) || (arr[i] > arr[i - 1]);
            boolean right = (i == n - 1) || (arr[i] > arr[i + 1]);
            if (left && right) {
                return i;
            }
        }
        return -1;
    }
}
