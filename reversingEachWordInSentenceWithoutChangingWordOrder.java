import java.util.*;
class reversingEachWordInSentenceWithoutChangingWordOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
            // Read the entire line as input
        String[] str = sc.nextLine().split(" ");
        String revStr = "";
        for (int i = 0; i <= str.length- 1; i++) {
            String reversedWord = "";
            for (int j = 0;j <= str[i].length() - 1; j++) {
                reversedWord = str[i].charAt(j) + reversedWord;
            }
            revStr += reversedWord;
            if (i < str.length - 1) {
                revStr += " "; // Add space between words
            }
        }
        System.out.println(revStr);
    }
}