/**
 * @program: LeetCode *
 * @classname: T344 *
 * @author: lnback *
 * @create: 2019-12-08 17:17
 **/

public class T344 {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
    }
}
