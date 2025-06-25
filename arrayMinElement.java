import java.util.Scanner;
public class arrayMinElement {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int[] arr = new int[sc.nextInt()];

		// Taking array values as user input
		System.out.println("Enter values:");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		// Fijd max elemnet present in an array
		int min = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element in an array is: " + min);

	}
    
}
