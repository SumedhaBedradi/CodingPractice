public class MajorityElementInAnArray {
       static int majorityElement(int[] arr) {
        int n = arr.length; 

        // Traverse through each element of the array
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Inner loop to count the frequency of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if count of arr[i] is more
            // than half the size of the array
            if (count > n / 2) {
                return arr[i];
            }
        }

        // If no majority element found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};

        System.out.println(majorityElement(arr));
    }
}
