public class largestNumberInOneSwap {
    static String largestSwap(String s) {
        String ans = s;
        char[] arr = s.toCharArray();

        // try swapping every pair
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

                String curr = new String(arr);
                if (curr.compareTo(ans) > 0) ans = curr;

                // backtrack
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "768";
        System.out.println(largestSwap(s));
    }
}
