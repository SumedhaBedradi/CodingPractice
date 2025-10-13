import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) { 
        Map<String, List<String>> map = new HashMap<>(); 
    
        for (String str : strs) { 
            char[] chars = str.toCharArray(); 
            Arrays.sort(chars); 
            String key = new String(chars); 
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str); 
        } 
    
        return new ArrayList<>(map.values()); 
    } 

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ga.groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
