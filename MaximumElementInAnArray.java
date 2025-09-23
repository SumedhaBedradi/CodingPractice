public class MaximumElementInAnArray {
    public static void main(String[] args) {
    // Finding the maximum element in an array
    int[] arr = {1,6,67,465,33,2};
    int n = arr.length;
    int majorityElement = arr[0];
    for(int i=1; i<n; i++){
        if(arr[i]>majorityElement){
            majorityElement = arr[i];
        }
    }
    System.out.println("Maximum element in the array is: " + majorityElement);
    }
}
