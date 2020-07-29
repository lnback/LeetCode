package offer;

/**
 * @program: LeetCode *
 * @classname: T5 *
 * @author: lnback *
 * @create: 2020-07-15 09:03
 **/

public class T5 {
    public String replaceSpace(StringBuffer s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toString().toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
