import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		sumOfSquare(n);

	}

	public static void sumOfSquare(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		System.out.println("Sum of " + n + " natural number is " + sum + ".");
	}

}