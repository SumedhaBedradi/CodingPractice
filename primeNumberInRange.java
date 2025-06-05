import java.util.Scanner;

public class primeNumberInRange {

	public static void main(String[] args) {
		System.out.println("Enter start number:");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.println("Enter end numnber:");
		int end = sc.nextInt();
		primeNumberChecker(start, end);

	}

	public static void primeNumberChecker(int start, int end) {
		System.out.println("Prime numbers between " + start + " and " + end + " are:");
		for (int i = start; i <= end; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println(i);
			}
		}
	}
}