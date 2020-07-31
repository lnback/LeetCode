package offer;

/**
 * @program: LeetCode *
 * @classname: T42 *
 * @author: lnback *
 * @create: 2020-07-31 13:48
 **/

public class T42 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(sum <= 0){
                sum = num;
            }else {
                sum += sum;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
