package offer;

/**
 * @program: LeetCode *
 * @classname: t47 *
 * @author: lnback *
 * @create: 2020-08-02 14:49
 **/

public class T47 {
    public int maxValue(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int[] dp = new int[n+1];
        for(int i = 1; i <= m ;i++){
            for(int j = 1;j<=n;j++){
                dp[j] = Math.max(dp[j],dp[j-1]) + grid[i-1][j-1];
            }
        }
        return dp[n];
    }
}
