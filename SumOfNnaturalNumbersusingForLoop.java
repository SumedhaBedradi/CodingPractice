import java.util.Scanner;
public class SumOfNnaturalNumbersUsingForloop {
    
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
        System.out.println("Sum of " + n + " natuaral number is: " + sum);
	}

}

