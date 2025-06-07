import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reverseNumber(n);
	}

	public static void reverseNumber(int n) {
		int reversedNumber = 0;
		while (n > 0) {
			int rem = n % 10;
			reversedNumber = (reversedNumber * 10) + rem;
			n = n / 10;
		}
		System.out.println(reversedNumber);
	}

}