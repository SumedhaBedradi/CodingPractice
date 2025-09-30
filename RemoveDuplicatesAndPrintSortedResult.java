import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicatesAndPrintSortedResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int x : arr) {
            hs.add(x); // Correct placement of adding to the set
        }

        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list); // Sort the list

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
