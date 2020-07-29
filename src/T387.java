import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode *
 * @classname: T387 *
 * @author: lnback *
 * @create: 2019-12-09 15:42
 **/

public class T387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
