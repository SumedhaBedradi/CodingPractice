import java.util.Scanner;

public class gcdOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("GCD of " + num1 + " and " + num2 + " is:" + findGcd(num1, num2));
	}

	// Euclidean Algorithm
	public static int findGcd(int num1, int num2) {
		while (num2 != 0) {
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		return num1;
	}

}

