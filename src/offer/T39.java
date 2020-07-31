package offer;

import java.util.Arrays;

/**
 * @program: LeetCode *
 * @classname: T39 *
 * @author: lnback *
 * @create: 2020-07-31 13:13
 **/

public class T39 {
    public int majorityElement(int[] nums) {
//        int cnt = 0;
//        int ans = 0;
//        for(int num : nums){
//            if(cnt == 0){
//                ans = num;
//            }
//            cnt += (ans == num) ? 1 : -1;
//        }
//        return ans;
        Arrays.sort(nums);
        return nums[(0+nums.length)/2];
    }
}
