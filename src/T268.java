/**
 * @program: LeetCode *
 * @classname: T268 *
 * @author: lnback *
 * @create: 2019-12-05 13:21
 **/

public class T268 {
    public int missingNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 0;i<nums.length;i++){
            ans ^= nums[i];
            ans ^= i;
        }
        return ans;
    }
}
