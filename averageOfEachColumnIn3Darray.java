import java.util.Scanner;

public interface averageOfEachColumnIn3Darray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking dimensions from user
		System.out.print("Enter number of layers (depth): ");
		int layers = sc.nextInt();

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][][] arr = new int[layers][rows][cols];

		// Taking input for the 3D array
		System.out.println("Enter elements of the 3D array:");
		for (int l = 0; l < layers; l++) {
			System.out.println("Layer " + (l + 1) + ":");
			for (int r = 0; r < rows; r++) {
				for (int c = 0; c < cols; c++) {
					System.out.printf("Element at [%d][%d][%d]: ", l, r, c);
					arr[l][r][c] = sc.nextInt();
				}
			}
		}

		// Calculate average of each column
		double[] colAverages = new double[cols];

		for (int c = 0; c < cols; c++) {
			int sum = 0;
			int count = 0;

			for (int l = 0; l < layers; l++) {
				for (int r = 0; r < rows; r++) {
					sum += arr[l][r][c];
					count++;
				}
			}

			colAverages[c] = (double) sum / count;
		}

		// Print column averages
		System.out.println("Average of each column:");
		for (int c = 0; c < cols; c++) {
			System.out.printf("Column %d average: %.2f%n", c, colAverages[c]);
		}

		sc.close();
	}
}
