/**
 * @program: LeetCode *
 * @classname: T122 *
 * @author: lnback *
 * @create: 2019-11-25 19:02
 **/

public class T122 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            ans += prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0;
        }
        return ans;
    }
}
