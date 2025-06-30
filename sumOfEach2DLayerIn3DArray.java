import java.util.Scanner;

public class sumOfEach2DLayerIn3DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter layer,row and column of a matrix:");
		int layer = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][][] arr = new int[layer][row][col];
		// Taking matrix elements from user
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.println("Enter element for layer " + i + " row " + j + "  column " + k);
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		int sumArr = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					sumArr += arr[i][j][k];
				}
			}
			System.out.println("Sum of layer " + i + ": " + sumArr);
		}
	}

}