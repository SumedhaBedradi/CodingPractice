import java.util.Scanner;

public class regular3DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of layers in 3D array:");
		int[][][] arr = new int[sc.nextInt()][][];
//		Taking no. of rows in each layer
		System.out.println("Enter number of rows in 3D array:");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = new int[sc.nextInt()][];
//		Taking no. of columns in each row in each layer
			System.out.println("Enter number of columns in 3D array:");
			for (int j = 0; j <= arr.length - 1; j++) {
				arr[i][j] = new int[sc.nextInt()];
			}
		}

//		Taking data from  the user to store it in 3D regular array
		System.out.println("Enter data:");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

		// Retrieving the data from regular 3D array
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.println("Layer " + (i + 1) + " Row " + (j + 1) + " Column " + (k + 1));
				}
			}
		}
	}
}