import java.util.Scanner;

public class findKeyInFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Fibonacci terms to generate:");
		int n = sc.nextInt();

		System.out.println("Enter key value to search:");
		int k = sc.nextInt();

		findKInFibonacciSeries(n, k);

	}

	public static void findKInFibonacciSeries(int n, int k) {
		int fib1 = 0;
		int fib2 = 1;

		System.out.println("Fibonacci Series:");
		System.out.print(fib1 + " ");
		if (k == fib1) {
			System.out.println("\n" + k + " is a Fibonacci Number.");
			return;
		}

		if (n > 1) {
			System.out.print(fib2 + " ");
			if (k == fib2) {
				System.out.println("\n" + k + " is a Fibonacci Number.");
				return;
			}
		}

		for (int i = 3; i <= n; i++) {
			int fib3 = fib1 + fib2;
			System.out.print(fib3 + " ");
			if (k == fib3) {
				System.out.println("\n" + k + " is a Fibonacci Number.");
				return;
			}
			fib1 = fib2;
			fib2 = fib3;
		}

		System.out.println("\n" + k + " is NOT a Fibonacci Number.");
	}
}