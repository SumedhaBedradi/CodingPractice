import java.util.Scanner;
public class evenNumbersFromOneToN {
    public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		while (i <= n) {
			System.out.println(i);
			i += 2;
		}
	}
}
