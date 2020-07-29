/**
 * @program: LeetCode *
 * @classname: T169 *
 * @author: lnback *
 * @create: 2019-11-24 19:44
 **/

public class T169 {
    /**
     * 摩尔投票法：
     * 抵消所有数字，剩下的就为众数
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == ans) {
                cnt++;
            } else {
                if (cnt == 0) {
                    ans = nums[i];
                    cnt = 1;
                    continue;
                }
                cnt--;
            }
        }
        return ans;
    }
}
