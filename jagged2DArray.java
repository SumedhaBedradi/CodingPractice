import java.util.Scanner;

public class jagged2DArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int[][] arr = new int[sc.nextInt()][];// specifying no. of rows

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter number of columns for row " + i);
			arr[i] = new int[sc.nextInt()];
		}
//		taking marks as user input
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.println("Enter marks for Class " + i + " Student " + j + ": ");
				arr[i][j] = sc.nextInt();
			}
		}

//		Retrieving data from array
		System.out.println("Marks of students are:");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				System.out.println("Class " + i + " Student " + j + " Marks: " + arr[i][j]);
			}
		}

	}
}
