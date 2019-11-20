/**
 * @program: LeetCode *
 * @classname: T121 *
 * @author: lnback *
 * @create: 2019-11-20 16:53
 **/

public class T121 {
    /**
     * 记录最小价格和最大收益
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int max = 0,min = prices[0];
        for(int i = 1;i < prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }
}
