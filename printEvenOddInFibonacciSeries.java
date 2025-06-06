import java.util.Scanner;

//print all even and odd fibonacci numbers seperately until n
public class printEvenOddInFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		printEvenAndOdd(n);
	}
	public static void printEvenAndOdd(int n) {
		int fib1 = 0, fib2 = 1;

		System.out.println("Even Fibonacci numbers: ");
		while (fib1 <= n) {
			if (fib1 % 2 == 0) {
				System.out.print(fib1 + " ");
			}
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}

		fib1 = 0;
		fib2 = 1;
		System.out.println("Odd Fibonacci numbers: ");
		while (fib1 <= n) {
			if (fib1 % 2 != 0) {
				System.out.print(fib1 + " ");
			}
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
	}
}
