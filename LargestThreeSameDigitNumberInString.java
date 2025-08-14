class LargestThreeSameDigitNumberInString {
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num)); // Output: "777"
    }

    public static String largestGoodInteger(String num) {
        String max = "";
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i + 1) &&
                num.charAt(i + 1) == num.charAt(i + 2)) {
                String triplet = num.substring(i, i + 3);
                if (triplet.compareTo(max) > 0) {
                    max = triplet;
                }
            }
        }
        return max;
    }
}
