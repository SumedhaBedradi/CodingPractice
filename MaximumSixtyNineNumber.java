public class MaximumSixtyNineNumber {

    public int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        MaximumSixtyNineNumber obj = new MaximumSixtyNineNumber();
        
        int input = 9669;
        int result = obj.maximum69Number(input);

        System.out.println("Original number: " + input);
        System.out.println("Maximum 69 number: " + result);
    }
}
