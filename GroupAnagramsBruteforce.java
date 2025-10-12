import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramsBruteforce {

    public static void main(String[] args) {
        GroupAnagramsBruteforce obj = new GroupAnagramsBruteforce();
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = obj.groupAnagramsBrute(input);

        // Print the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public List<List<String>> groupAnagramsBrute(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i])
                continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            res.add(group);
        }
        return res;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0)
                return false;
        }
        return true;
    }
}
