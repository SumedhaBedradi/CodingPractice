import java.util.*;

public class dailyTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read number of temperatures
        int[] temperatures = new int[n];

        // Read temperature values
        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextInt();
        }

        int[] result = dailyTemperatures(temperatures);

        // Print result
        for (int r : result) {
            System.out.print(r + " ");
        }

        scanner.close();
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}
