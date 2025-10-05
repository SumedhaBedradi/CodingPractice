import java.util.HashMap;
import java.util.Map;

public class FindRepeatedCharactersOfTheString {
    public static void main(String[] args) {
        String s = "programming"; // Example input string

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, cnt + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println("Repeated characters:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

