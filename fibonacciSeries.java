import java.util.Scanner;
public class fibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFibonacci(n);
	}
	static void printFibonacci(int n) {
		int fib1 = 0;
		int fib2 = 1;
		System.out.println("First " + n + " Fibonacci numbers are: ");
		System.out.println(fib1);
		System.out.println(fib2);
		int i = 3;
		while (i <= n) {
			int fib3 = fib1 + fib2;
			System.out.println(fib3);
			fib1 = fib2;
			fib2 = fib3;
			i++;
		}
	}
}
    
