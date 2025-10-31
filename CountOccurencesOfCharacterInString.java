import java.util.Scanner;
public class CountOccurencesOfCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Input character
        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);

        // Convert both to lowercase for case-insensitive comparison (optional)
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        int count = 0;

        // Count occurrences
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.printf("Character '%c' occurs %d time(s) in the string \"%s\".%n", ch, count, str);
        scanner.close();
    }
}
