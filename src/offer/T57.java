package offer;

/**
 * @program: LeetCode *
 * @classname: T57 *
 * @author: lnback *
 * @create: 2020-08-03 11:37
 **/

public class T57 {
    public int[] twoSum(int[] nums, int target) {
        int low = 0,high = nums.length - 1;
        while (low < high){
            int sum = nums[low] + nums[high];
            if(sum < target){
                low ++;
            }else if(sum > target){
                high --;
            }else {
                return new int[]{nums[low],nums[high]};
            }
        }
        return new int[2];
    }
}
