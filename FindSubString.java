import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        for(int i = 0;i <= str.length()-1;i++){
            String temp = "";
            for(int j = i;j <= str.length()-1;j++){
                temp = temp + str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}