/**
 * @program: LeetCode *
 * @classname: T70 *
 * @author: lnback *
 * @create: 2019-11-18 19:26
 **/

public class T70 {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int i1 = 1, i2 = 2;
        int ans = 0;
        for (int i = 3; i <= n; i++) {
            ans = i1 + i2;
            i1 = i2;
            i2 = ans;
        }
        return ans;
    }
}
