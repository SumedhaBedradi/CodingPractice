import java.util.Scanner;
public class singleDigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int res = sumOfNum(n);
		singleDigit(res);

	}

	static int sumOfNum(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		return sum;
	}

	static void singleDigit(int sum) {
		if (sum > 9) {
			int digitSum = 0;
			while (sum != 0) {
				int rem = sum % 10;
				digitSum += rem;
				sum = sum / 10;
			}
			System.out.println(digitSum);

		} else {
			System.out.println(sum);
		}
	}
}

