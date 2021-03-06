package offer;

/**
 * @program: LeetCode *
 * @classname: T49 *
 * @author: lnback *
 * @create: 2020-08-02 15:31
 **/

public class T49 {
    public int nthUglyNumber(int n) {
        if(n <= 0){
            return -1;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        int id2 = 0,id3 = 0,id5 = 0;
        for(int i = 1;i<n;i++){
            dp[i] = Math.min(dp[id2] * 2 , Math.min(dp[id3] * 3, dp[id5] * 5));
            if(dp[i] == dp[id2] * 2){
                id2 ++;
            }
            if(dp[i] == dp[id3] * 3){
                id3 ++;
            }
            if(dp[i] == dp[id5] * 5){
                id5 ++;
            }
        }
        return dp[n-1];
    }
}
