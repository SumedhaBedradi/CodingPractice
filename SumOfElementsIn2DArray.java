import java.util.Scanner;

public class SumOfElementsIn2DArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
//		Taking array data from user
		System.out.println("Enter values to be stored in an array");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		Finding sum of elements in array
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum: " + sum);
	}
}
