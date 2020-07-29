import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode *
 * @classname: T290 *
 * @author: lnback *
 * @create: 2019-12-06 16:38
 **/

public class T290 {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), words[i]);
                }
            }
        }
        return true;
    }
}
