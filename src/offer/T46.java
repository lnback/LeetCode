package offer;

/**
 * @program: LeetCode *
 * @classname: T46 *
 * @author: lnback *
 * @create: 2020-08-02 12:16
 **/

public class T46 {
    public int translateNum(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        int len = nums.length;
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<=len;i++){
            dp[i] = dp[i - 1];
            int t = (nums[i-2] - '0') *10 + nums[i - 1] - '0';
            if(t <= 25 && t >= 10 ){
                dp[i] = dp[i - 1] + dp[i-2];
            }
        }
        return dp[len];
    }
}
