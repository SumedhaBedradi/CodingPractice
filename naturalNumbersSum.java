import java.util.Scanner;

public class naturalNumbersSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		naturalNumsSum(n);
	}
	public static void naturalNumsSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of " + n + " natural numbers: " + sum);
	}
}
