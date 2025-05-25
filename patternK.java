/* 

*  *
* * 
**  
*   
**  
* * 
*  *

*/
public class patternK {
    public static void main(String[] args) {
        int n = 7; // height of the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                // Vertical bar on the left
                if (j == 0) {
                    System.out.print("*");
                }
                // Diagonal bar
                else if (i + j == n / 2 || i - j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
