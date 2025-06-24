import java.util.Scanner;

public class transposeOfAmatrix {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column of a matrix:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		// Taking matrix elements from user
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.println("Enter element for row " + i + " and column " + j);
				arr[i][j] = sc.nextInt();
			}
		}
		// finding transpose of a matrix
		int transpose[][] = new int[col][row];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		// printing result
		System.out.println("Transpose of the matrix:");
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
