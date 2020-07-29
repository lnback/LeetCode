/**
 * @program: LeetCode *
 * @classname: T171 *
 * @author: lnback *
 * @create: 2019-11-21 15:24
 **/

public class T171 {

    public static int titleToNumber(String s) {
        int sum = 0;
        int n = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sum += (c - 64) * n;
            n *= 26;
        }
        return sum;
    }
}
