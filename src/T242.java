import java.util.Arrays;

/**
 * @program: LeetCode *
 * @classname: T242 *
 * @author: lnback *
 * @create: 2019-12-04 16:44
 **/

public class T242 {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        return  String.valueOf(cs).equals(String.valueOf(ts));
    }
}
