import java.util.Scanner;

public class MaximumProductInAnSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Product in a SubArray is: " + findMaxProduct(arr));
    }

    public static int findMaxProduct(int[] arr) {
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i <= n - 2; i++) {
            int prod = 1;
            for (int j = i; j <= n - 1; j++) {
                prod *= arr[j];
                if (prod > maxProd) {
                    maxProd = prod;
                }
            }
        }

        return maxProd;
    }
}
