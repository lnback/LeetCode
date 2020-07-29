/**
 * @program: LeetCode *
 * @classname: T168 *
 * @author: lnback *
 * @create: 2019-11-21 14:54
 **/

public class T168 {
    public static String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) ((n % 26) + 'A'));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
