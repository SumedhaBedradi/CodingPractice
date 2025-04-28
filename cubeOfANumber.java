
import java.util.Scanner;

public class cubeOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int cubeRes = cube(num);
		System.out.println("Cube of "+num+ " is: "+cubeRes);
	}
	
	static int cube(int a) {
		int res = a * a * a;
		return res;
	}

}
