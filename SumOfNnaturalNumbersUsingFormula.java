import java.util.Scanner;
public class SumOfNnaturalNumbersUsingFormula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int res = (n * (n + 1) / 2);
		System.out.println(res);
		sc.close();
	}

}


