import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 2, 4, 1, 5 };

        // Convert array to Set (removes duplicates)
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(numbers));

        // Convert back to array if needed
        Integer[] uniqueArray = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(uniqueArray));
    }

}
