package offer;

/**
 * @program: LeetCode *
 * @classname: T56 *
 * @author: lnback *
 * @create: 2020-08-03 10:50
 **/

public class T56 {
    public int[] singleNumbers(int[] nums) {
        int x = 0;
        for(int num : nums){
            x ^= num;
        }
        int ans = 0;
        int flag = x &(-x);
        for(int num : nums){
            if((flag & num) != 0){
                ans ^= num;
            }
        }
        return new int[]{ans , x ^ ans};
    }
}
