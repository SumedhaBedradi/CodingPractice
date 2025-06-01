import java.util.Scanner;

public class findNthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int res = findFibonacci(n);
		System.out.println("The " + n + "th Fibonacci number is: " + res);
	}

	public static int findFibonacci(int n) {
		int fib1 = 0;
		int fib2 = 1;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			for (int i = 0; i <= n; i++) {
				int fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
			}
		}
		return fib1;
	}
}