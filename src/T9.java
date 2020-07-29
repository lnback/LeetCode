/**
 * @program: LeetCode *
 * @classname: T4 *
 * @author: lnback *
 * @create: 2019-10-10 21:22
 **/

public class T9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int num = 0;
        int t = x;
        while (t != 0) {
            num = num * 10 + (t % 10);
            t /= 10;
        }
        return x == num;
    }
}
