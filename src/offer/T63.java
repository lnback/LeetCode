package offer;

/**
 * @program: LeetCode *
 * @classname: T63 *
 * @author: lnback *
 * @create: 2020-08-04 15:24
 **/

public class T63 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1 ){
            return 0;
        }
        int ans = 0,min = prices[0];
        for(int i = 1; i < prices.length;i++){
            if(prices[i] <= min){
                min = prices[i];
            }else {
                ans = Math.max(ans,prices[i]-min);
            }
        }
        return ans;
    }
}
