package offer;


/**
 * @program: LeetCode *
 * @classname: T532 *
 * @author: lnback *
 * @create: 2020-08-03 09:56
 **/

public class T532 {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + ((right - left) >>1);
            if(nums[mid] == mid){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
