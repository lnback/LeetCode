import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode *
 * @classname: T299 *
 * @author: lnback *
 * @create: 2019-12-06 20:25
 **/

public class T299 {
    public String getHint(String secret, String guess) {
        int a = 0, b = 0;
        //map存数字和出现的次数
        Map<Character, Integer> map = new HashMap<>();
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        for (int i = 0; i < secret.length(); i++) {
            if (s[i] == g[i]) {
                a++;
                g[i] = 'A';
                continue;
            }
            if (map.get(s[i]) != null) {
                map.put(s[i], map.get(s[i]) + 1);
            } else {
                map.put(s[i], 1);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (map.containsKey(g[i]) && map.get(g[i]) - 1 >= 0) {
                b++;
                map.put(g[i], map.get(g[i]) - 1);
            }
        }
        return a + "A" + b + "B";
    }
}
