/* 
A
BB
CCC
DDDD
CCC
BB
A
 */

public class AlphabetPyramid {
    public static void main(String[] args) {
    int n = 4; // number of lines in the first half

    // Upper half (A to D)
    for (int i = 1; i <= n; i++) {
        char ch = (char) ('A' + i - 1);
        for (int j = 1; j <= i; j++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    // Lower half (C to A)
    for (int i = n - 1; i >= 1; i--) {
        char ch = (char) ('A' + i - 1);
        for (int j = 1; j <= i; j++) {
            System.out.print(ch);
        }
        System.out.println();
    }
   }
}