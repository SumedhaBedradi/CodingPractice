public class checkIfAStringIsSubsequenceOfOther {
     public boolean isSubSeq(String s1, String s2) {
        // code here
        int n = s1.length(), m = s2.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }
        return i == n;
    }

    public static void main(String[] args) {
        checkIfAStringIsSubsequenceOfOther obj = new checkIfAStringIsSubsequenceOfOther();
        String s1 = "abc", s2 = "ahbgdc";
        System.out.println(obj.isSubSeq(s1, s2)); // Output: true
    }

}
