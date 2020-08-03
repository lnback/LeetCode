package offer;

/**
 * @program: LeetCode *
 * @classname: T53 *
 * @author: lnback *
 * @create: 2020-08-03 09:29
 **/

public class T53 {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int low = 0, high = nums.length - 1;
        int mid = (low + high) / 2;
        int count = 0;
        while(low <= high) {
            if(nums[mid] == target) {
                count++;
                break;
            }
            if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if(nums[mid] == target) {
            int k = mid - 1;
            while(k >= 0 && nums[k] == target) {
                k--;
                count++;
            }
            k = mid + 1;
            while(k < nums.length && nums[k] == target) {
                k++;
                count++;
            }
        }
        return count;
    }
}
