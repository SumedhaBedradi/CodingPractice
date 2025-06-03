import java.util.Scanner;

public class NthTerm_SumOfNNaturalNumber {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}

	public static void print(int n) {
		int sum = n * (n + 1) / 2;
		System.out.println("The " + n + "natural number is: " + sum);
	}

}