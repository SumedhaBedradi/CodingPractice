package JAVA_Practice;

import java.util.Scanner;

public class SeasonIdentifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number");
		int month = sc.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
		}

	}

}
