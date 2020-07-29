package offer;

/**
 * @program: LeetCode *
 * @classname: T102 *
 * @author: lnback *
 * @create: 2020-07-15 11:18
 **/

public class T102 {
    public int numWays(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        //dp[2] = 2;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
