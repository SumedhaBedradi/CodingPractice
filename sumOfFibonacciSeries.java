import java.util.Scanner;

public class sumOfFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		printKfromFibonacciSeries(n);

	}

	public static void printKfromFibonacciSeries(int n) {
		int fib1 = 0;
		int fib2 = 1;
		int sum = fib1 + fib2;
		if (n == 1) {
			sum = fib1;
		} else if (n == 2) {
			sum = fib1 + fib2;
		} else {

			for (int i = 3; i <= n; i++) {
				int fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
				sum += fib3;
			}
		}
		System.out.println("Sum is : " + sum);

	}

}