/**
 * @program: LeetCode *
 * @classname: T392 *
 * @author: lnback *
 * @create: 2019-12-09 16:04
 **/

public class T392 {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}
