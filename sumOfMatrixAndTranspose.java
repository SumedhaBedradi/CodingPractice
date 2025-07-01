import java.util.Scanner;

public class sumOfMatrixAndTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column of a matrix:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		// Taking matrix elements from user
		for (int i = 0; i <= mat.length - 1; i++) {
			for (int j = 0; j <= mat[i].length - 1; j++) {
				System.out.println("Enter element for row " + i + " and column " + j);
				mat[i][j] = sc.nextInt();
			}
		}
		// finding transpose of a matrix
		int transpose[][] = new int[col][row];
		for (int i = 0; i <= mat.length - 1; i++) {
			for (int j = 0; j <= mat[i].length - 1; j++) {
				transpose[j][i] = mat[i][j];
			}
		}
		// Finding sum
		int[][] sumMatrix = new int[row][col];
		for (int i = 0; i <= mat.length - 1; i++) {
			for (int j = 0; j <= mat[i].length - 1; j++) {
				sumMatrix[i][j] = mat[i][j] + transpose[i][j];
			}
		}

		// printing transpose
		System.out.println("Transpose of the matrix:");
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[i].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		// Printing sum
		System.out.println("Sum of matrix and it's transpose:");
		for (int i = 0; i < sumMatrix.length; i++) {
			for (int j = 0; j < sumMatrix[i].length; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}