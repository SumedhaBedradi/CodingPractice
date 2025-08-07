import java.util.Scanner;

public class countingConsecutiveCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
         String str = sc.nextLine();
         char currentChar = str.charAt(0);
        int count = 1;
        String newStr = "";
        for (int i = 0;i <= str.length() - 1;i++) {
            if(currentChar == str.charAt(i)){
                count++;
            } else {
                newStr = newStr + currentChar + count;
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        // Append the last counted character and its count to the new string.
            newStr = newStr + currentChar + count;
            System.out.println(newStr);
        
    }
}
