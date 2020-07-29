import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode *
 * @classname: T1 *
 * @author: lnback *
 * @create: 2019-10-09 20:51
 **/

public class T1 {

    /**
     * Easy 用map标记差是否存在即可
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
